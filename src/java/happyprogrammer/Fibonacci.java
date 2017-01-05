package happyprogrammer;

/**
 * Created by Forrest on 2017. 1. 4.
 */
public class Fibonacci {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        int inputNumber = Integer.parseInt(args[0]);


        StringBuffer buffer = new StringBuffer();

        for (int i = 1; i <= inputNumber; i++) {
            buffer.delete(0, buffer.length());
            buffer.append("F(");
            buffer.append(i);
            buffer.append(") :: ");

            buffer.append(fibonacci(i));
            System.out.println(buffer);
        }
    }

    private static int fibonacci(int number) {
        if (number <= 2) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
