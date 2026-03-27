import java.util.*;

public class ManipulateArrayNumbers {

    // Find position of number
    public static int findNumberPosition(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                return i;
            }
        }
        return -1;
    }

    // Add number (no duplicates allowed)
    public static void addNumber(List<Integer> list, int number) throws Exception {
        int position = findNumberPosition(list, number);
        if (position != -1) {
            throw new Exception("Number already in the list");
        }
        list.add(number);
    }

    // Remove number
    public static void removeNumber(List<Integer> list, int number) throws Exception {
        int position = findNumberPosition(list, number);
        if (position == -1) {
            throw new Exception("Number not found in the list");
        }
        list.remove(position);
    }

    // Replace number
    public static void replaceNumber(List<Integer> list, int numberToReplace, int replacementNumber) {
        int position = findNumberPosition(list, numberToReplace);
        if (position == -1) {
            list.add(replacementNumber);
        } else {
            list.set(position, replacementNumber);
        }
    }
}
