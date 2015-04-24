package com.forrest.godofjava.thread;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by chgm1006 on 2015. 4. 23..
 */
public class InfiniteThread extends Thread {
  public void run() {
    while (true) {
      String str = "String";
      new HashMap<>(10000);
      new Hashtable<>(10000);
      if (Thread.interrupted()) {
        return;
      }
    }
  }
}
