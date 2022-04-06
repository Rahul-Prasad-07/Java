package Array;
import java.util.*;

public class SearchanunsortedArray {


        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            int k = s.nextInt();
            search(arr, k);
        }

        // Method to search for k in an unsorted array
        static void search(int[] arr, int k) {
            boolean flag = false;
            // Traverse the array and check if the current element is equal to k
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == k) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag);
        }
    }


