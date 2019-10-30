package wk5;
/*

 */

public class RentalProperty implements ProvidesMonthlyIncome {

  private String address;
  private int rent;

  public RentalProperty(String address, int rent) {
    this.address = address;
    this.rent = rent;
  }

  @Override
  public double getMonthlyIncome() {
    return rent;
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
