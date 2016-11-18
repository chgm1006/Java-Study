package pattern.templateMethodPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class Cat extends Animal {
    @Override
    public void runSomething() {
        System.out.println("야옹~ 야옹~ 꼬리 살랑~ 살랑~");

    }

    @Override
    protected void play() {
        System.out.println("야옹~ 야옹~");
    }
}
