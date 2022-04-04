package ArraysArrayListsLinkedLists;

import java.util.ArrayList;

public class mix {
    public static void main(String[] args) {
        ArrayList mix = new ArrayList();
        mix.add("Hari");
        mix.add(2);
        printMixList(mix);
    }

    public static void printMixList(ArrayList elements) {
        for(Object o : elements) {
            System.out.println(o);
        }
    }
}

/*
Summary;
There’s no issue in the code. It will run perfectly well.

✓ Correct
Feedback:
In this code, you’re creating ArrayList with two elements, a String type and an Integer type.
Then, you’re directly printing these elements by assigning them to a variable ‘0’ of the ‘Object’ type.
Typecasting is not required here, so the code should work perfectly well.
 */
