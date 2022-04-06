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

    static void partitionNegativeAndPositive(int n, int arr[]) {
        // Write your code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        //push first element
        a.add(arr[0]);

        // Now put all elements of same sign
        for(int i=1; i<n; i++){
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

    }
}
