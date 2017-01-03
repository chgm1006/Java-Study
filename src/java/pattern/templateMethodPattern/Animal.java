package pattern.templateMethodPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public abstract class Animal {
    public void playWithOwner() {
        System.out.println("귀염둥이 이리온...");
        play();
        runSomething();

        System.out.println("잘했어");
    }

    public void runSomething() {
        System.out.println("꼬리 살랑 살랑~");

    }

    protected abstract void play();
}
