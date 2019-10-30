package one;

public class DriverLicense extends IDCard {

  private String expYear;

  public DriverLicense(String name, int idNumber, String expYear) {
    super(name, idNumber);
    this.expYear = expYear;
  }

  @Override
  public String format() {
    String formattedString;
    formattedString =
        super.format() + ", Expiration Year: " + this.expYear;
    return formattedString;
  }
}
