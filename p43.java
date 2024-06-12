// Write a method swapPairs that switches the order of values in an ArrayList of
// Strings in a pairwise fashion. Your method should switch the order of the first
// two values, then switch the order of the next two, switch the order of the next
// two, and so on.
// For example, if the list initially stores these values: {"four", "score", "and",
// "seven", "years",
// "ago"} your method should switch the first pair, "four", "score", the second
// pair, "and", "seven", and the third pair, "years", "ago", to yield this list:
// {"score", "four", "seven", "and", "ago", "years"}
// If there are an odd number of values in the list, the final element is not moved.
// For example, if the original list had been: {"to", "be", "or", "not", "to", "be",
// "hamlet"} It would again switch pairs of values, but the final value, "hamlet"
// would not be moved, yielding this list: {"be", "to", "not", "or", "be", "to",
// "hamlet"}




import java.util.ArrayList;

public class p43 {
    public static void main(String[] args) {
        // Example usage
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("four");
        list1.add("score");
        list1.add("and");
        list1.add("seven");
        list1.add("years");
        list1.add("ago");
        System.out.println("Original List 1: " + list1);
        swapPairs(list1);
        System.out.println("List 1 after swapPairs: " + list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("to");
        list2.add("be");
        list2.add("or");
        list2.add("not");
        list2.add("to");
        list2.add("be");
        list2.add("hamlet");
        System.out.println("\nOriginal List 2: " + list2);
        swapPairs(list2);
        System.out.println("List 2 after swapPairs: " + list2);
    }

    public static void swapPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }
}
