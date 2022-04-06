package AbstractionEncapsulation;


    class Display {
        public Display(int i) {
            System.out.println("ONE");
        }

        public Display() {
            this(1);

            System.out.println("TWO");
        }

        void Display() {
            Display(1);

            System.out.println("THREE");
        }

        void Display(int i) {
            System.out.println("FOUR");
        }
    }

    public class Display01{
        public static void main(String[] args) {
            Display obj = new Display();
            obj.Display();
        }
    }
    /*
    Feedback:
    In the given code, you create an object of the class Display in the ‘main’ method and when you create it,
    the constructor of the class Display is automatically invoked.
    Since no argument is passed, the constructor public Display() will be invoked with no arguments.
    The constructor will pass an integer argument to another overloaded constructor which will display ‘ONE’ and then ‘TWO’.
    Another statement in the main method calls the Display method with an object of the class Display.
    The first statement of the method ‘void Method’ passes an integer 1 in the method and calls another overloaded method which displays ‘FOUR’ and then ‘THREE’.
     */

