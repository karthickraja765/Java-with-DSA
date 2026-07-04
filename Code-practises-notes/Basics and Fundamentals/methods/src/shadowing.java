public class shadowing {

    //Shadowing is the pratice of using 2 variables with the same name within the scope that overlaps.

    static int x = 100; //this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); //op: 100
        int x = 50;

        //suppose:
        //int x;
        //  System.out.println(x);  this will give u error. Because you cannnot print the value of x in-between the intialsing and declaration line.
        //int = 40;
        //  System.out.println(x);

        System.out.println(x); //op: 50
        dosmthg();
    }
    static void dosmthg(){
        System.out.println(x); //op: 100
    }
}
