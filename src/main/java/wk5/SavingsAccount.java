package wk5;

/**
 * A SavingsAccount is an Account which accumulates monthly interest based on the minimum balance
 * over the course of the month.
 */
public class SavingsAccount extends Account implements ProvidesMonthlyIncome {

  /**
   * Interest rate in per cent.
   */
  private double interestRate;
  private double interestAccumulated;

  /**
   * Minimum balance over the course of this month.
   */
  private double minimumMonthlyBalance;

  /**
   * Withdraws a certain amount from this SavingsAccount and adjusts the minimum monthly balance if
   * needed.
   */
  @Override
  public void withdraw(double amount) {
    super.withdraw(amount);
    if (getBalance() < minimumMonthlyBalance) {
      minimumMonthlyBalance = getBalance();
    }
  }

  /**
   * Accumulates interest at the end of the month.
   */
  @Override
  public void monthEnd() {
    minimumMonthlyBalance = getBalance();
    deposit(getMonthlyIncome());
  }

  /**
   * Calculates the interest that is generated this month based on the minimum balance since the
   * last month end (if any).
   *
   * @return the interest that is generated this month
   */
  private double calculateInterest() {
    return minimumMonthlyBalance * interestRate / 100;
  }

  /**
   * Sets the interest rate in per cent for this SavingsAccount.
   *
   * @param interestRate the interest rate in per cent to set
   */
  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public double getMonthlyIncome() {
    interestAccumulated = calculateInterest();
    return interestAccumulated;
  }

  @Override
  public boolean isIncomeAboveThreshold(double threshold) {
    if (getMonthlyIncome() > threshold) {
      return true;
    } else {
      return false;
    }
  }
}
