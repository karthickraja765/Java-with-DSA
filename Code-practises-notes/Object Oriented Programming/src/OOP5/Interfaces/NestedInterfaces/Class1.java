package OOP5.Interfaces.NestedInterfaces;

public class Class1 {
    //Nested interfaces
    public interface nested {
        boolean isOdd(int num);
    }
}

class Class2 implements Class1.nested {
    @Override
    public boolean isOdd(int num) {
        return (num % 2) != 0;
    }
}