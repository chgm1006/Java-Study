package junitstudy.chap4;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Forrest G. Choi on 2014-09-24.
 */
public class SimpleMockTest {
  @Test
  public void testMockList() throws Exception {
    List mockedList = mock(List.class);

//    mockedList.size();
    callSize(mockedList);
    verify(mockedList, times(5)).size();
  }

  private void callSize(List mockedList) {

    for (int i = 0; i < 5; i++) {
      mockedList.size();
      System.out.println(i);
    }
  }
}
