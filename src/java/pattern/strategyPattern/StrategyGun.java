package pattern.strategyPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class StrategyGun implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("탕, 타당, 타다당");
    }
}
