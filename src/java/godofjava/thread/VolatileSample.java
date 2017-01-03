package godofjava.thread;

/**
 * Created by chgm1006 on 2015. 4. 23..
 */
public class VolatileSample extends Thread {
    private volatile double instanceVariable = 0;

    void setDouble(double value) {
        this.instanceVariable = value;

    }

    public void run() {
        while (instanceVariable == 0) {
        }
        System.out.println(instanceVariable);
    }
}
