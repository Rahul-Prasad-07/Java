package ArraysArrayListsLinkedLists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class WithListIterator3 {

    public static void main(String[] args) {

        List<Student> studentList1 = new ArrayList<Student>();
        Student s1 = new Student("Sujit",1);
        Student s2 = new Student("Siddharth",2);
        Student s3 = new Student("Karanpreet",3);
        Student s4 = new Student("Hari",5);
        Student s5 = new Student("Tricha",4);

        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);
        studentList1.add(s4);
        studentList1.add(s5);

        //iterateFwd(studentList1);
        //iterateBkwd(studentList1);
        iterateFwdBkwd(studentList1);
    }

    private static void iterateFwd(List<Student> students) {
        java.util.ListIterator<Student> it = students.listIterator();
        System.out.println("Printing student list...");
        while(it.hasNext()) {
            System.out.println(it.next().getDetails());
        }
    }
    private static void iterateBkwd(List<Student> students) {
        java.util.ListIterator<Student> it = students.listIterator(students.size());
        System.out.println("Printing student list...");
        while(it.hasPrevious()) {
            System.out.println(it.previous().getDetails());
        }
    }
    private static void iterateFwdBkwd(List<Student> students) {
        ListIterator<Student> it = students.listIterator();
        System.out.println("Printing student list...");
        while(it.hasNext()) {
            System.out.println(it.next().getDetails());
        }
        System.out.println("Printing student list...");
        while(it.hasPrevious()) {
            System.out.println(it.previous().getDetails());
        }
    }
}
class Student05 {
    private final String name;
    private final int rollNumber;

    public Student05(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}

