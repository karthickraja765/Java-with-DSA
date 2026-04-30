package OOP4;

public class A {
    private int num;
    String name;
    int[] arr;

    // getter method
    public int getNum() {
        return num;
    }

    // setter method
    public void setNum(int num) {
        this.num = num;
    }

    public A (int num, String name){ // constructor
        this.num = num;
        this.name = name;
        this.arr = new int[5];
    }
}
