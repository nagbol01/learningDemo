package one;

public class CallingCard extends Card {

  private int cardNumber;
  private int pin;

  public CallingCard(String name, int cardNumber, int pin) {
    super(name);
    this.cardNumber = cardNumber;
    this.pin = pin;
  }


  @Override
  public String format() {
    String formattedString;
    formattedString =
        super.format() + ", Card Number: " + this.cardNumber + ", PIN: " + this.pin;
    return formattedString;
  }


}
