import java.util.HashMap;
import java.util.HashSet;

class MapsUsingHash {
    private Entity[] entities;

    public MapsUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length); // getting the hashcode
        entities[hash] = new Entity(key, value); // obviously if the hash value is same it will override it
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length); // getting the hashcode of the key
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length); // getting the hashcode of the key
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null; // instead of removing, mark it as null
        }
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

class Main {
    public static void main(String[] args) {
        // hashMap Implementation:
        MapsUsingHash maps = new MapsUsingHash();
        maps.put("Satoru", "The Strongest");
        maps.put("Suguru", "Best friend of satoru");
        maps.put("Sukuna", "King of curses");

        System.out.println(maps.get("Satoru"));

        // Custom implementation: HashMapFinal
        HashMapFinal<String, String> mapFinal = new HashMapFinal<>();
        mapFinal.put("Satoru", "The Strongest");
        mapFinal.put("Suguru", "Best friend of satoru");
        mapFinal.put("Sukuna", "King of curses");

        System.out.println(mapFinal.get("Sukuna"));

        System.out.println(mapFinal);
    }

    public static void hashDemo() {
        // hashcode concept:
        String name = "Alex";
        Integer num = 765;
        int nameCode = name.hashCode();
        int code = num.hashCode();
        System.out.println(nameCode);
        System.out.println(code);

        // Inbuilt hashMap usage:
        // So there are more methods, Explore it in: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("satoru", 79);
        map.put("suguru", 97);
        map.put("shoko", 96);
        System.out.println(map.get("suguru")); // prints: 97
        System.out.println(map.remove("suguru"));
        System.out.println(map.getOrDefault("nanami", 89)); // Prints: 89 // Either it gets the key's value if present or if not present prints the default value
        System.out.println(map.containsKey("suguru")); // Checks the key is present or not // prints: true

        // Inbuilt hashSet usage:
        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(12); // do not include it twice
        set.add(23);
        set.add(34);
        set.add(45);
        set.add(56);
        System.out.println(set); // Prints: [34, 23, 56, 12, 45] // Prints without any duplicates.
    }
}