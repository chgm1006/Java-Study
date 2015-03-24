package JavaTutorial;

import java.util.function.BiConsumer;

/**
 * @author Forrest G. Choi
 * @version 1.0
 * @date 2014-09-16
 */
public class Main {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept("java2s.com", "tutorials");

    }
}
