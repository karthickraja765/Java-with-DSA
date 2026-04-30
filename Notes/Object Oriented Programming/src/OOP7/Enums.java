package OOP7;

public class Enums {
    enum Week implements EnumDemo { // you have to implement it here. Not above! :')
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are Enum constants.
        // By default, they are public, static and final
        // Since its final, you can create child enums
        // type is Week

        Week() { // constructor for week
            System.out.println("This constructor is called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello, My name is Week!");
        }

        // "this" is not public or protected, only private or default
        // why? We don't want to create new objects
        // This is not for the enum concept, that's why.

        //Internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week; // declaring the variable of type Week
        week = Week.Saturday;
        System.out.println(week);
        System.out.println("------------------------------------------------------------------");
        week.hello();
        System.out.println("------------------------------------------------------------------");
        System.out.println(Week.valueOf("Monday"));  // prints the enum constant itself
        System.out.println("------------------------------------------------------------------");
        // we can also iterate over it and print it
        for (Week days : Week.values()){ // values: All the values that week contains
            System.out.println(days);
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println(week.ordinal()); // ordinal means the position of the enum "saturday" in declaration. (Basically index of it)
        System.out.println("------------------------------------------------------------------");
    }
}