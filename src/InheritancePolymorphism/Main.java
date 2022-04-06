package InheritancePolymorphism;


    class A {
        public void display() {
            double i = 99.99;
            System.out.println(i);
        }
    }
    class B extends A {
        public void display() {
            double i = 100;
            super.display();
        }
    }
    public class Main {
        public static void main(String[] args) {
            B object = new B();
            object.display();
        }
    }

