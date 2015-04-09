package com.forrest.godofjava.collection;

import java.util.Date;

public class DateCalendarSample {
  public static void main(String[] args) {
    DateCalendarSample sample = new DateCalendarSample();
    sample.checkDate();
  }

  private void checkDate() {
    Date date = new Date();
    System.out.println(date);

    long time = date.getTime();
    System.out.println("time = " + time);

    date.setTime(0);
    System.out.println("time = " + time);

  }
}
