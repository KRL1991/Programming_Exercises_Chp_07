package Exercise_7_3;

import java.util.Scanner;

public class Calculations {

    public static void occurringNumbers () {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[0];
        int number;
        System.out.println("Please enter integers between 1 and 50: ");

        while ((number = input.nextInt()) != 0) {
            numbers = add2Array(numbers, number);
        }


        int searchNumber = 0, searchCount = 0;

        // going through the array
        for (int j = 0; j < numbers.length; j++) {
            // Define new search term if needed
            if (searchNumber != numbers[j] && numbers[j] != 0) {
                searchNumber = numbers[j];

                // Search the array for the new terms starting from position of
                // the new term to the end
                for (int i = j; i < numbers.length; i++) {
                    if (searchNumber == numbers[i]) {
                        searchCount++;
                        numbers[i] = 0; // reset the found counted item to zero
                        // so it would not be seen again in the
                        // outer loop
                    }
                }

                System.out.print(searchNumber + " occurs " + searchCount
                        + " time");
                if (searchCount > 1) {
                    System.out.println("s");
                } else {
                    System.out.println();
                }

                searchCount = 0;
            }

        }

    }

    // Copy array numbers1 to array numbers2
    // If the length of array numbers2 is less then array numbers2, return false
    public static boolean copyArray(int[] source, int[] dest) {
        if (source.length > dest.length)
            return false;

        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }
        return true;
    }

    // Increase array size by one and add integer to the end of array
    // Return new array
    public static int[] add2Array(int[] source, int data) {

        int[] dest = new int[source.length + 1];
        copyArray(source, dest);
        dest[source.length] = data;
        return dest;

    }


}
