package OOP6.Cloning;

// If you want to clone something you can use the Clonable. Java provides this inbuilt interface internally.
// Even though u didn't have abstract classes inside, you can implement clonable

public class Human implements Cloneable { // Cloneable is an inbuilt method.
    int age;
    String name;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{2, 4, 6, 8};
    }

    public Human(Human other) {
         this.age = other.age;
         this.name = other.name;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{ //This is an inbuilt overriding method
//        //This is shallow copying!
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // This is deep copying!
        Human twin = (Human) super.clone();
        // make a deep copy
        twin.arr = new int[twin.arr.length]; // create a new array and copy the elements.
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
