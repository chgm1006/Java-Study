package pattern.strategyPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class Soldier {
    void runContext(Strategy strategy) {
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 종료");
    }
}
