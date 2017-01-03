package annotation.stringinjector;

/**
 * Created by Forrest on 2016. 12. 2..
 */
public class AnnotationDemo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MyContextContainer demo = new MyContextContainer();

        MyObject obj = demo.get(MyObject.class);

        System.out.println(obj.getName());
        System.out.println(obj.getDefaultValue());
        System.out.println(obj.getInvalidType());
    }
}
