package pattern.decoratorPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class Service implements IService {
    @Override
    public String runSomething() {
        return "서비스 짱!!!";
    }

}
