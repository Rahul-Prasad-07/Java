package ArraysArrayListsLinkedLists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class RandomBwd {

    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);
        //iterateBkwd(random);
        //iterateFwd(random);
       // printList(random);
        int temp_val = 0;

        // using a for-each loop to
        // iterate through the list
       // System.out.print("Elements at odd position are : ");
        for (Float numbers : random) {
            if (temp_val % 2 != 0) {
                System.out.println(numbers + " ");
            }
            temp_val += 1;
        }

    }

    private static void iterateBkwd(List<Float> random) {
        ListIterator<Float> it = random.listIterator(random.size());
       // System.out.println("Printing student list...");

        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
    private static void iterateFwd(List<Float> random) {
        ListIterator<Float> it = random.listIterator();
        System.out.println("Printing student list...");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void printList(List<Float> arr) {
        for(Float num : arr) {
            System.out.println(num);
        }
    }
}
