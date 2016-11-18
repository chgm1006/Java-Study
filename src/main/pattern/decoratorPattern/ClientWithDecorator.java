package pattern.decoratorPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class ClientWithDecorator {
    public static void main(String[] args) {
        IService decorator = new Decorator();
        System.out.println(decorator.runSomething());

    }
}
