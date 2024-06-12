// Collection and Generic Framework:
// Write a method removeEvenLength that takes an ArrayList of Strings as a
// parameter and that removesall the strings of even length from the list.
// (Use ArrayList)



import java.util.ArrayList;

public class p42 {
    public static void main(String[] args) {
        // Example usage
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grapes");
        list.add("kiwi");
        list.add("pear");

        System.out.println("Original List: " + list);
        removeEvenLength(list);
        System.out.println("List after removing even length strings: " + list);
    }

    public static void removeEvenLength(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() % 2 == 0) {
                list.remove(i);
                i--; // Adjust the index after removing an element
            }
        }
    }
}
