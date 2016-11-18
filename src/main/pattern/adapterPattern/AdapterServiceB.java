package pattern.adapterPattern;

import pattern.adapterPattern.ServiceB;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class AdapterServiceB {
    ServiceB sb1 = new ServiceB();

    void runService() {
        sb1.runServiceB();
    }
}
