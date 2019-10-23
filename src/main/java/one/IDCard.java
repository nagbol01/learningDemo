package one;

public class IDCard extends Card {

  private int idNumber;

  public IDCard(String name, int idNumber) {
    super(name);
    this.idNumber = idNumber;
  }

  @Override
  public String format() {
    String formattedString;
    formattedString =
        super.format() + ", ID Number: " + this.idNumber;
    return formattedString;
  }

}
