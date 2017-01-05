package algorithms.swapExam;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * Created by Forrest on 2017. 1. 5..
 */
public class Swap {
    public static void main(String[] args) {
        int[] numbers = new int[2];

        numbers[0] = 10;
        numbers[1] = 20;

        System.out.println("============== Before Swap ==============");
        System.out.println("numbers[0] :: " + numbers[0]);
        System.out.println("numbers[1] :: " + numbers[1]);
        System.out.println();

        numbers = swapWithTemp(numbers);
        System.out.println("============== After swapWithTemp ==============");
        System.out.println("numbers[0] :: " + numbers[0]);
        System.out.println("numbers[1] :: " + numbers[1]);

        numbers = swapWithoutTemp(numbers);
        System.out.println("============== After swapWithoutTemp ==============");
        System.out.println("numbers[0] :: " + numbers[0]);
        System.out.println("numbers[1] :: " + numbers[1]);
    }

    public static int[] swapWithoutTemp(int[] numbers) {
        numbers[0] = numbers[0] + numbers[1];
        numbers[1] = numbers[0] - numbers[1];
        numbers[0] = numbers[0] - numbers[1];
        return numbers;
    }

    public static int[] swapWithTemp(int[] numbers) {
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
        return numbers;
    }


}
