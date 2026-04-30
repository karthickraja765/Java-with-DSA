package OOP2.StaticExample;

public class Static {
    public static void main(String[] args) {
        Human Alex = new Human(28, "Alex", 10000, false);
        Human Thomas = new Human(27, "Thomas", 15000, true);
        Human William = new Human(29, "William", 5000, false);
        Human Josh = new Human(); // Default constructor Called last, But prints first.

        System.out.println(Human.population);
        System.out.println(Human.population);

        // greeting(); // So you cannot use Non-static function in a static member
        // Because, static member can access only static data, it cannot access non-static

        // Example of accessing a non-static member in a static context by specifying the object reference explicitly.
        Static friends = new Static(); // new object friends is created.
        friends.forfun(); // friends calls a non-static member inside static.

    }

    static void forever() { // Anything that is static, Belongs to that instance (Object Independent)
        //greeting();

        /*
        * you can't use this. Because it requires instance. But the function you are using it in does not depend on the instances.
        * You cannot access non-static stuff without referencing their instances in a static context.
        * In simple terms, forever() does not depend on instances. Then how can you use something inside it that depend on instances. So, you can't.
        * InLine 22, Internally: forever() will be like: hey! greeting() you depend on object right!? Where is your object? greeting() says: I don't have any object!
        * Then forever() says: you can run unless you create an object or make yourself static
        */

        Static objectforgreet = new Static();
        objectforgreet.greeting(); // now you can explicitly call greeting() method
    }

    void forfun(){ // we know that Non-static belongs to the object. (Object dependent)
        greeting();;
    }

    void greeting(){
        forever(); // static function inside a non-static one. you are allowed to do this.
        System.out.println("Hello");
    }
}
/*
InLine: 37, 38
* Here greeting() will be like hey forfun()! I need a object to run and I don't have an object because I'm non-static.
* forfun() says: I'm also not static and I don't have any objects too. You can come with me. Because obviously, I need an object to run. That way you can use my object.
* greeting will be like: Okay. So, u take care of the objects and i will stay here until u get the object
*/