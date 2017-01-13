package exam.functionalinterfaceexam;

/**
 * Created by Forrest on 2016. 12. 19..
 */
public class FunctionalInterfaceExamTest {
    public static void main(String[] args) {
        FunctionalInterfaceExam sum = (a, b, c) -> a + b + c;


        System.out.println("1+2+3 :: " + sum.apply(1, 2, 3));
    }
}
