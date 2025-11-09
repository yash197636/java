
    import java.util.*; // Import utility package for Arrays class
public class Array {

    public static void main(String[] args) {

        // --- 1) Array of Integers ---
        int[] numbers = {5, 2, 9, 1, 6}; // declare and initialize integer array
        Arrays.sort(numbers);            // sort array in ascending order
        System.out.println("Sorted Integers: " + Arrays.toString(numbers)); // print array

        // --- 2) Array of Names ---
        String[] names = {"Ravi", "Amit", "Sita", "Kiran"}; // declare and initialize string array
        Arrays.sort(names);                                 // sort string array alphabetically
        System.out.println("Sorted Names: " + Arrays.toString(names)); // print array
    }
}


