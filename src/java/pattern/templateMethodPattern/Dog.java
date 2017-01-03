package pattern.templateMethodPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class Dog extends Animal {
    @Override
    protected void play() {
        System.out.println("멍! 멍!");

    }

    @Override
    public void runSomething() {
        System.out.println("멍! 멍! 꼬리 살랑~ 살랑~");

    }
}
