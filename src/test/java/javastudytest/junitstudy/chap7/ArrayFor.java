package javastudytest.junitstudy.chap7;

/**
 * Created by Forrest G. Choi on 2014-10-21.
 */
public class ArrayFor {
  public static void main(String []args){
    String []strs = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};

    for (String s : strs) {
      System.out.println(s);
    }
  }
}
