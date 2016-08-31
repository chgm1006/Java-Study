package annotation;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015-04-17.
 */
public class MyAnnoTest {
    @MyAnno
    public void printDefaultAnnotation(MyAnnoTest myAnnoTest) {
        MyAnnoTest myAnnoTest1 = new MyAnnoTest();

        try {
            Class c = myAnnoTest.getClass();
            Method method = c.getMethod("printDefaultAnnotation", c);
            MyAnno anno = method.getAnnotation(MyAnno.class);

            System.out.println(anno.greeting() + anno.name());
            System.out.println("Your age is " + anno.age());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyAnnoTest myAnnoTest = new MyAnnoTest();
        myAnnoTest.printDefaultAnnotation(myAnnoTest);
    }
}
