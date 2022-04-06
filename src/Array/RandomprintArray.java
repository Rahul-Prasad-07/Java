package Array;

public class RandomprintArray {


        public static void main(String[] args) {
            int random[ ] = {2, 4, 5, 10};
            printArray(random);
        }

        public static void printArray(int[] arr) {
            for(int num : arr) {
                System.out.println(num);
            }
        }
    }


