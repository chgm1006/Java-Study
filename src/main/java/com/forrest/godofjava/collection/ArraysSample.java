package com.forrest.godofjava.collection;

import java.util.Arrays;

/**
 * Created by chgm1006 on 2015. 4. 10..
 */
public class ArraysSample {
  public static void main(String[] args) {
    ArraysSample sample = new ArraysSample();
//    sample.checkSort();
    sample.checkFill();
  }

  private void checkFill() {
    int[] emptyArray = new int[10];
    Arrays.fill(emptyArray, 1);
    Arrays.fill(emptyArray, 0, 5, 9);
    String stringValues = Arrays.toString(emptyArray);
    System.out.println("stringValues = " + stringValues);
  }

  private void checkSort() {
    int[] values = new int[]{1, 4, 3, 6, 7, 8, 9, 7, 2, 5, 10};
    Arrays.sort(values);
    String stringValues = Arrays.toString(values);
    System.out.println("stringValues = " + stringValues);
  }
}
