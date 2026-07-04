public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Karthik";
        {
            a = 2000; // int a = 20; is wrong because a is already initialised outside the inner block of the same block, hence u cant initialse it again. But u can change the value by doing so.
            int c = 40;
            name = "KarthikRaja";
            // values initislisated in this block, will remain in the block and also accessed in the block only.
            System.out.println(a); // so if i print this the value of a is 2000.
            System.out.println(name);
        }
        int c = 900;
        System.out.println(a); // if i print the value of a, now as the OG value is changed inside thw block in line 7, the new value is 2000.
        // this below error is because of it.
        System.out.println(name);

        //Scoping for loop
        for (int i = 0; i < 5; i++){
                System.out.println("this is a for loop!");
            int num = 90;
            a = 10000;
        }
    }
        static void random(int marks){
            int c = 30;
            int f = 40;
            System.out.println(marks);
        }
    }

    //NOTE:
    // anything initialised outside the block can be of use inside the block
    // but anything that is used or initalised inside the block cannot be used outside the block.
    // int a = something is creating a new referance variable and pointing to a value or object.
    // a = some value is the updating the referance variable with new value.
    // anything that is intialised outside the block cannot be re intialised again inside the block.
    // anything that is intialised inside the block can be reintialsed again outisde the block.