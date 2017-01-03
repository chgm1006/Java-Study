package javaexam.exceptionexam;

import java.io.FileInputStream;

/**
 * Created by Forrest on 2016. 12. 16..
 */
public class StackTraceExam {
    public static void main(String[] args) throws InterruptedException {
        try (FileInputStream in = new FileInputStream("test.txt")) {

        } catch (Exception e) {
            e.printStackTrace();
            Thread.sleep(300);

            // getStackTrace() 메소드를 이용해 스택트레이스의 정보를 구할 수 있다.
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println("ClassName   :: " + element.getClassName());
                System.out.println("MethodName  :: " + element.getMethodName());
                System.out.println("FileName    :: " + element.getFileName());
                System.out.println("LineNumber  :: " + element.getLineNumber());
                System.out.println();
            }
        }
    }
}
