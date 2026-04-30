package OOP6.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student Alex = new Student(30, 80.20f);
        Student Thomas = new Student(32, 85.86f);
        Student Daisy = new Student(17, 99.00f);
        Student Josh = new Student(12, 97.52f);
        Student Ava = new Student(22, 77.72f);

        Student[] list = {Alex, Thomas, Daisy, Josh, Ava}; // making them as list.
        System.out.println(Arrays.toString(list)); // prints the marks as it is.

        System.out.println("------------------------------------------------------------------");

        Arrays.sort(list); //This will sort based on marks.

//        //Or you can directly use comparator method here
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student x1, Student x2) {
//                return (int)(x1.marks - x2.marks);
//            }
//        });

//        //Lambda expression for the above one
//        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));

//        System.out.println(Arrays.toString(list)); // This is sort the marks and prints it.

        // comparing the marks of any two students
        if (Alex.compareTo(Thomas) < 0) {
            System.out.println("Alex has more marks");
        } else {
            System.out.println("Thomas has more marks");
        }
    }
}