package com.forrest.godofjava.thread;

/**
 * Created by chgm1006 on 2015. 4. 14..
 */
public class RunThreads {
  public static void main(String[] args) {
    RunThreads thread = new RunThreads();
    thread.checkThreadState1();

  }

  private void runBasic() {
    RunnableSample runnableSample = new RunnableSample();
    ThreadSample thread = new ThreadSample();
    new Thread(runnableSample).start();
    thread.start();
    System.out.println("RunThreads.runBasic() method is ended");
  }

  public void checkThreadState1() {
    SleepThread thread = new SleepThread(2000);
    try {
      System.out.println("thread state = " + thread.getState());
      thread.start();
      System.out.println("thread state(after start) = " + thread.getState());

      Thread.sleep(1000);
      System.out.println("thread state(after 1sec) = " + thread.getState());

      thread.join();
      thread.interrupt();

      System.out.println("thread state(after join) = " + thread.getState());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
