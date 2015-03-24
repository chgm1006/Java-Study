package junitstudy.chap1;

/**
 * Created by Administrator on 2014-09-10.
 */
public class Account {

  private int balance;

  /**
   * Instantiates a new Account.
   *
   * @param money the money
   */
  public Account(int money) {
    this.balance = money;
  }


  /**
   * Gets balance.
   *
   * @return the balance
   */
  public int getBalance() {
    return this.balance;
  }

  /**
   * Withdraw void.
   *
   * @param money the money
   */
  public void withdraw(int money) {
    this.balance -= money;
  }

  /**
   * Deposit void.
   *
   * @param money the money
   */
  public void deposit(int money) {
    this.balance += money;
  }
}
