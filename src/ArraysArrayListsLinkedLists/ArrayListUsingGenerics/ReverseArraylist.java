package ArraysArrayListsLinkedLists.ArrayListUsingGenerics;
import java.util.*;

    public class ReverseArraylist {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            int n = s.nextInt();
            for (int i = 0; i < n; i++)
                list.add(s.nextInt());
            reverseArrayList(list);
            for (int i = 0; i < list.size(); i++)
                System.out.print(list.get(i) + " ");
        }

        // Method to reverse the ArrayList
        static void reverseArrayList(ArrayList<Integer> list) {
            // Write your code here
            List<Integer> reverse = new ArrayList<Integer>(list.size());
            for(int i=0; i<list.size(); i++)
                reverse.add(0,list.get(i));
            Collections.reverse(list); // for printing int type reverse array

        }
    }

