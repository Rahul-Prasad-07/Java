package ArraysArrayListsLinkedLists;

import java.util.Scanner;

public class ReverseArray {

        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            reverseArray(arr);
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        }

        // Method to reverse the array
        static void reverseArray(int[] arr) {
            // Write your code here
            for (int i = 0; i < arr.length/2; i++)
            {
                int temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }



        }
    }


