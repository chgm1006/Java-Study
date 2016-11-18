package pattern.templateMethodPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class Driver {
    public static void main(String[] args) {
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        bolt.playWithOwner();

        System.out.println();
        System.out.println();

        kitty.playWithOwner();
    }
}
