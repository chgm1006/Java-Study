package pattern.proxyPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class ClientWithProxy {
    public static void main(String[] args) {
        IService proxy = new Proxy();

        System.out.println(proxy.runSomething());
    }
}
