package OOP4;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) { // constructor
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
//        return num; //If u modify the return of the hash code Then it will print the value as it is
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { // It basically gives the Exception error when there is a duplicate and return it
        return super.clone();
    }

    @Override
    public String toString() { // returns the toString method when there is a class returned with object.
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num; // overriding and print our equal's method.
    }

    public static void main(String[] args) {
        ObjectDemo objDemo = new ObjectDemo(34);
        ObjectDemo objD2 = new ObjectDemo(34);
        ObjectDemo objD3 = objDemo; //So now, objD3 and objDemo will have the same hashcode because they both point to each other(Same object).

        if(objDemo == objD2) { // one way to compare
            System.out.println("Equal Comparision"); //
        }
        if (objDemo.equals(objD2)) { // to check the content of them are equal are not.
            System.out.println("Both contents are equal");
        }
        System.out.println("------------------------------------------------------------------");

        System.out.println(objDemo.hashCode());// prints some random value
        System.out.println(objD3.hashCode()); // for same input it gives different value

        System.out.println("------------------------------------------------------------------");

        boolean ans = objDemo instanceof ObjectDemo;
        System.out.println(ans); // checks if objDemo is an instance of ObjectDemo?

        System.out.println("------------------------------------------------------------------");

        System.out.println(objDemo.getClass()); // returns the path of the class file
        // Note: You cant override the getClass method.
        // getClass information will be stored in the heap memory

        System.out.println("------------------------------------------------------------------");
    }
}