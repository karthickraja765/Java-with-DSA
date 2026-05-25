import java.util.ArrayList;
import java.util.LinkedList;

// creating a custom Hashmap using LinkedList with generics <K, V>
public class HashMapFinal<K, V> {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    // private float loadFactor = 0.5f; // load factor is the number of values divided by total size.

    public HashMapFinal() { // this is chaining using linkedList
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size()); // division method: h(k) = k % m, where k is key's hash value and m is the size of the table
        LinkedList<Entity> entities = list.get(hash); // Entity class contains a key-value pair
        for (Entity buckets : entities) { // for searching inside the LinkedList for collision handling. Tc: o(n)
            if (buckets.key.equals(key)) {
                buckets.value = value; // update the value for the key and exit immediately. This ensures: No duplicate keys and Correct overwrite behavior (like standard HashMap)
                return;
            }
        }
        // At this point, there is no collision in the buckets in the LinkedList. So check the Lf and add the new entity into new bucket in the LinkedList
        float loadFactor = 0.5f;
        if ((float)(size) / list.size() > loadFactor) { // if it is greater than Lf, then double the size of array, put all items in the new array
            reHash();
        }
        entities.add(new Entity(key, value)); // before adding the entity, check the load factor
        size++;
    }

    private void reHash() {
        /*
        Why reHashing is triggered?
        * Too many elements per bucket → longer LinkedLists → degraded performance (approaches O(n))
        * Rehashing maintains near O(1) average complexity
        */
        System.out.println("ReHashing...");
        ArrayList<LinkedList<Entity>> old = list;
        // copy the old one and creating a new list with double the size
        list =  new ArrayList<>(); // reassigning it as new ArrayList
        size = 0;
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>()); // Each slot is initialized with a new empty LinkedList. size is reset to 0 because you will reinsert elements again
        }
        for (LinkedList<Entity> entries : old) { // for every LinkedList in the old list and every entry in that list. Put the Key-value pair.
            for (Entity entry : entries) {
                put(entry.key, entry.value);
                /*
                Using put() ensures:
                * Correct bucket placement (new hash computation)
                * Collision handling remains consistent
                * No duplicate logic is needed
                */
            }
        }
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity buckets : entities) { // if there is a buckets in the LinkedList, searching inside the buckets and returning its value
            if (buckets.key.equals(key)) {
                return buckets.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        Entity target = null;
        for (Entity buckets : entities) { // inside the buckets in the LinkedList
            if (buckets.key.equals(key)) { // check the key and update the target to it
                target = buckets;
                break;
            }
        }
        entities.remove(target); // now the target is updated, remove it and reduce its size
        size--;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{ ");
        for (LinkedList<Entity> entities : list) {
            for (Entity buckets : entities) {
                builder.append(buckets.key);
                builder.append(" = ");
                builder.append(buckets.value);
                builder.append(", ");
            }
        }
        builder.append(" }");
        return builder.toString();
    }

    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}