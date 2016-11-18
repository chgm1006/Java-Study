package pattern.templateCallbackPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext("탕! 탕! 탕!");
        System.out.println();

        rambo.runContext("챙! 챙! 챙!");
        System.out.println();

        rambo.runContext("슉~ 슉~ 슉~");
    }
}
