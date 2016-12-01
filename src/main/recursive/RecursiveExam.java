package recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Forrest on 2016. 11. 30..
 */
public class RecursiveExam {
    List l = new ArrayList();
    private void run(long cnt) {
        if (cnt < 1) {
            return;
        }

        l.add(cnt);

//        System.out.println("cnt :: " + cnt);
        cnt--;
        run(cnt);

    }

    private void runFor(long count) {
        List list = new ArrayList<>();
        for (long i = count; i > 0; i--) {
            list.add(i);
        }

        System.out.println("list.size :: " + list.size());
    }

    public static void main(String[] args) {
        RecursiveExam recursiveExam = new RecursiveExam();
        long startTime = System.nanoTime();
        long count = 10000L;

        recursiveExam.run(count);
        System.out.println("l.size :: " + recursiveExam.l.size());
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);

        startTime = System.nanoTime();

        recursiveExam.runFor(count);

        endTime = System.nanoTime();
        System.out.println(endTime-startTime);
    }
}
