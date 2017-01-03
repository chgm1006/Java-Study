package pattern.singletonPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class Singleton {
    // 정적 참조 변수
    static Singleton singletonObject;

    // private 생성자
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singletonObject == null) {
            singletonObject = new Singleton();
        }

        return singletonObject;
    }
}
