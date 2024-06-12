// Write a method called alternate that accepts two Listsof integers as its
// parameters and returns a
// new List containing alternating elements from the twolists, in the
// following order:
// • First element from first list
// • First element from second list
// • Second element from first list
// • Second element from second list
// • Third element from first list
// • Third element from second list
// If the lists do not contain the same number of elements, the remaining elements
// from the longer list should be placed consecutively at the end. For example,
// for a first list of (1, 2, 3, 4, 5) and a second
// list of (6, 7, 8, 9, 10, 11, 12), a call of alternate (list1,
// list2) should return a list containing (1, 6, 2, 7, 3, 8, 4,
// 9, 5, 10, 11, 12). Do not modify the parameter lists passed in.





import java.util.ArrayList;
import java.util.List;

public class p44 {
    public static void main(String[] args) {
        // Example usage
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(11);
        list2.add(12);

        List<Integer> result = alternate(list1, list2);
        System.out.println("Result: " + result);
    }

    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);

        for (int i = 0; i < maxSize; i++) {
            if (i < size1)
                result.add(list1.get(i));
            if (i < size2)
                result.add(list2.get(i));
        }

        return result;
    }
}

