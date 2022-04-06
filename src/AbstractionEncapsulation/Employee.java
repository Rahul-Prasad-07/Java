package AbstractionEncapsulation;


    public class Employee {
        Integer salary;
        int EmpId;
        String EmpName;

        void display() {
            System.out.println(EmpId);
            System.out.println(EmpName);
            System.out.println(salary);
        }

        public static void main(String args[]) {
            Employee object = new Employee();
            object.display();
        }
    }

