package OOP6.Comparing;

public class Student implements Comparable<Student> { // comparable of student generics
    int rollno;
    float marks;

    public Student(int rollno, float marks) { // constructor
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " ";
    }

    @Override
    public int compareTo(Student x) {
        int diff = (int) (this.marks - x.marks);
        // If diff == 0: Both are equal
        // If diff < 0: Means x is bigger. Else, x is smaller.
        return diff;
    }
}