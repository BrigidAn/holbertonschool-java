import java.util.*;

public class DuplicatedNumbers {

    public static TreeSet<Integer> isFind(int[] numbers) {

        HashSet<Integer> seen = new HashSet<>();
        TreeSet<Integer> duplicates = new TreeSet<>();

        for (int num : numbers) {
            // If already seen, it's a duplicate
            if (seen.contains(num)) {
                duplicates.add(num); // TreeSet ensures no repeats + sorted
            } else {
                seen.add(num);
            }
        }

        return duplicates;
    }
}
