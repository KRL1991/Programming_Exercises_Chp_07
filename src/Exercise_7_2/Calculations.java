package Exercise_7_2;

import java.util.Random;

public class Calculations {

    public static void comparingNumbers(){

        Random random = new Random();
        int[] array = new int[11];

        for (int i = 0; i <array.length ; i++) {
            array[i] = random.nextInt();

            if(array[11] < array.length)
                System.out.println("11 is greater than the integer ");
            else if(array[11] > array.length)
                System.out.println("11 is smaller than the integer");
            else {
                array[11] = array.length;
                System.out.println("11 is equal to the integer");
            }
        }

    }
}
