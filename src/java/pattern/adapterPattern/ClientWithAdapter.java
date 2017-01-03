package pattern.adapterPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb1 = new AdapterServiceB();

        asa1.runService();
        asb1.runService();
    }
}
