package ArraysArrayListsLinkedLists;
import java.util.*;

public class PartitionNegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        partitionNegativeAndPositive(n, arr);
    }

    // Method to partition negative and positive numbers without comparing with 0
   static boolean oppositeSign(int x, int y){
        return ((x^y)<0);
   }
   static void printList(ArrayList<Integer> list){
        String result="";
        for(int i=0; i< list.size(); i++){
            result +=list.get(i)+" ";
        }
       System.out.println(result);
   }

    //static void partitionNegativeAndPositive(int n, int arr[]) {
        // Write your code here
       /// ArrayList<Integer> a = new ArrayList<Integer>();
        //ArrayList<Integer> b = new ArrayList<Integer>();
        //push first element
       // a.add(arr[0]);

        // Now put all elements of same sign
        /*for(int i=1; i<n; i++){
            if(oppositeSign(a.get(0),arr[i])){
                b.add(arr[i]);
            }else {
                a.add(arr[i]);
            }
        }
        if(arr[0]>0){
            if(a.size()>0){
                printList(a);
            }else {
                System.out.println("Array doesn't have positive numbers");
            }
            if(b.size()>0){
                printList(b);
            }else {
                System.out.println("Array doesn't have negative numbers");
            }
        }else{
            if(b.size()>0){
                printList(b);
            }else{
                System.out.println("Array doesn't have negative numbers");
            }
            if(b.size()<0){
                printList(a);
            }else {
                System.out.println("Array doesn't have positive numbers");
            }
        }

         */
        /*for(int i=1;i<n;i++) {
            if(oppositeSign( a.get(0), arr[i])) {
                b.add(arr[i]);
            }else {
                a.add(arr[i]);
            }
        }

        if(a.size()>=0) {
            printList(a);
        }
        if(b.size()>=0) {
            printList(b);
        }

        if(a.size() == 0) {
            System.out.println();
            System.out.print("Array doesn't have positive numbers");
        }

        if(b.size() == 0) {
            System.out.println();
            System.out.print("Array doesn't have positive numbers");
        }

       */

            // Method to partition negative and positive numbers without comparing with 0
            static void partitionNegativeAndPositive(int n, int[] arr) {
                ArrayList<Integer> list1 = new ArrayList<>();
                ArrayList<Integer> list2 = new ArrayList<>();
                // arr[0] is stored in list1
                list1.add(arr[0]);
                for (int i = 1; i < n; i++) {
                    // If arr[i] and arr[0] has opposite signs store arr[i] in list2
                    if ((arr[0] ^ arr[i]) < 0) {
                        list2.add(arr[i]);
                    }
                    // If arr[i] and arr[0] has same signs store arr[i] in list1
                    else {
                        list1.add(arr[i]);
                    }
                }
                // Printing elements in list1
                for (int i = 0; i < list1.size(); i++){
                    System.out.print(list1.get(i)+" ");
                }
                System.out.println();

                // Printing elements in list2
                if (list2.size() > 0) {
                    for (int i = 0; i < list2.size(); i++) {
                        System.out.print(list2.get(i) + " ");
                    }
                } else {
                    if (arr[0] > -1) {
                        System.out.println("Array doesn't have negative numbers");
                    } else
                        System.out.println("Array doesn't have positive numbers");
                }
            }
        }


