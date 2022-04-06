package AbstractionEncapsulation;


    public class ClassesAndObjects {
        public static void main(String[] args) {
            //Ball.spinAndBounce();
            Ball b = new Ball();
            b.spinAndBounce();

        }
    }

    class Ball {
        public String state;


        public  void bounce() {
            state = "bouncing";
            System.out.println("Ball is bouncing");
        }

        public  void spin() {
            state = "spinning";
            System.out.println("Ball is spinning");
        }

        public void spinAndBounce() {
            spin();
            bounce();
        }
    }

