package javastudytest.junitstudy.chap7;

/**
 * Created by Forrest G. Choi on 2014-10-21.
 */
public class ManageHeight {
  /**
   * The Grade heights.
   */
  int gradeHeights[][] = new int[5][];

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    ManageHeight mh = new ManageHeight();
    mh.setData();

//    Scanner sc = new Scanner(System.in);
//    int classNo = sc.nextInt();
//    System.out.println(classNo);
    for (int i = 1; i <= 5; i++) {
      mh.printHeight(i);
    }

  }

  /**
   * Sets data.
   */
  public void setData() {
    gradeHeights[0] = new int[]{170, 180, 173, 175, 177};
    gradeHeights[1] = new int[]{160, 165, 167, 186};
    gradeHeights[2] = new int[]{158, 177, 187, 176};
    gradeHeights[3] = new int[]{173, 182, 181};
    gradeHeights[4] = new int[]{170, 180, 165, 177, 172};
  }

  /**
   * Print height.
   *
   * @param classNo the class no
   */
  public void printHeight(int classNo) {
    System.out.println("Class No :: " + classNo);

//    System.out.println(gradeHeights[classNo]);
    for (int height : gradeHeights[classNo-1]) {
      System.out.println(height);
    }
  }
}
