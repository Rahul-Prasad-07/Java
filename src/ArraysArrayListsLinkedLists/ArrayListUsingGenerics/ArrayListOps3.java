package ArraysArrayListsLinkedLists.ArrayListUsingGenerics;

import java.util.ArrayList;

public class ArrayListOps3 {
    public static void main(String[] args) {
        ArrayList<Student03> studentList = new ArrayList<Student03>();
        Student03 s1 = new Student03("Sujit",1);
        Student03 s2 = new Student03("Siddharth",2);
        Student03 s3 = new Student03("Karanpreet",3);
        Student03 s4 = new Student03("Hari",5);
        Student03 s5 = new Student03("Tricha",4);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        System.out.println("s1 contained?"+ studentList.contains(s1));
        System.out.println("s5 contained?"+ studentList.contains(s5));
        printStudentList(studentList);

    }

    public static void printStudentList(ArrayList<Student03> students) {
        for(Student03 s : students) {
            System.out.println(s.getDetails());
        }
    }
}

class Student03 {
    private final String name;
    private final int rollNumber;

    public Student03(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}

/*
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
  2. This is a type-safe approach of creating containers. Any attempt to add an element which is
      type-incompatible with the declared contained type will fail at the static type checking stage,
      resulting in a compile error.

*/

