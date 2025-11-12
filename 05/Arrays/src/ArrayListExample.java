import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        // arraylist of arraylist
//        ArrayList<ArrayList<Integer>> list  = new ArrayList<>()
//        list.add(78);
//        list.add(234);
//        list.add(99);
//        list.add(78);
//        list.add(69);
//        System.out.println(list);
//        System.out.println(list.contains(55555)); // checks if list contains this elements or not
//        list.set(0,99); // replaces the element at the specified position in this list with specified element
//
//        list.remove(2); // remove the element at the specified position and the index is shifted to left.
//        System.out.println(list);

        // input
        for(int i=0; i<5; i++){

            list.add(input.nextInt());
        }

        // get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i)); // pass index here , list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
