package pattern.adapterPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class AdapterServiceA {
    ServiceA sa1 = new ServiceA();

    void runService() {
        sa1.runServiceA();
    }

}
