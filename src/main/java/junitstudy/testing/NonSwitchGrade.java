package junitstudy.testing;

import java.util.Scanner;

public class NonSwitchGrade {
    public static void main(String[] args) throws Exception {
        NonSwitchGrade nonSwitchGrade = new NonSwitchGrade();
        System.out.print("점수는? ");
        int num = new Scanner(System.in).nextInt();
        nonSwitchGrade.printGrade(num);
    }

    public void printGrade(int score) {

        char[] result = {'F', 'F', 'F', 'F', 'F', 'E', 'D', 'C', 'B', 'A', 'A'};
//        for (int i = 0; i < result.length; i++) {
//            System.out.println("[" + i + "] = " + "[" + result[i] + "]");
//        }
        char ch = result[score / (result.length)];
        System.out.println(ch);
    }
}
