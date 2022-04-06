package InheritancePolymorphism;

public class person1 {
    class Person {
        private String eyeColor;
        protected String name;
        Car myCar;

        public Person(String name) {
            this.name = name;
        }

        public void setMyCar(Car car){
            this.myCar = car;
        }
    }

    class Adult extends Person {
        protected int age;

        public Adult(String name, int age) {
            super(name);
            this.age = age;
        }
    }

    class Car {
        String brand;
        String model;
        int year;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
    }

}
