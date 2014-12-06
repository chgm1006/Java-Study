package junitstudy.chap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2014-09-10.
 * TDD Study Chapter 1
 * Test Case
 */
public class AccountTest {

    private Account account;


    @Test
    public void testGetBalance() throws Exception {
        assertEquals("10000원으로 계좌 생성 후 잔고 조회", 10000, account.getBalance());

        account = new Account(1000);
        assertEquals("1000원으로 계좌 생성 후 잔고 조회", 1000, account.getBalance());

        account = new Account(0);
        assertEquals("0원으로 계좌 생성 후 잔고 조회", 0, account.getBalance());
    }

    @Test
    public void testDeposit() throws Exception {
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    @Test
    public void testWithdraw() throws Exception {
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());

    }

    @Before
    public void setUp() {
        account = new Account(10000);
    }


}
