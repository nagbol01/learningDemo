package one;

public class Wallet {

  private String card1;
  private String card2;

  public void addCard(String name, int cardNumber, int pin) {
    CallingCard cardToAdd = new CallingCard(name,cardNumber,pin);

    if (card1 == null) {
      card1 = cardToAdd.format();
    } else if (card2 == null) {
      card2 = cardToAdd.format();
    }
  }

  public void addCard(String name, int idNumber) {
    IDCard cardToAdd = new IDCard(name, idNumber);

    if (card1 == null) {
      card1 = cardToAdd.format();
    } else if (card2 == null) {
      card2 = cardToAdd.format();
    }
  }

  public void addCard(String name, int idNumber, String expYear) {
    DriverLicense cardToAdd = new DriverLicense(name, idNumber, expYear);

    if (card1 == null) {
      card1 = cardToAdd.format();
    } else if (card2 == null) {
      card2 = cardToAdd.format();
    }
  }


  public String formatCards() {
    String formattedString;
    if (card1 != null && card2 != null) {
      formattedString =
          "[" + card1 + "|" + card2 + "]";
      return formattedString;
    } else if (card1 != null && card2 == null) {
      formattedString =
          "[" + card1 + "]";
      return formattedString;
    } else if (card1 == null && card2 != null) {
      formattedString =
          "[" + card2 + "]";
      return formattedString;
    } else {
      return "[No card has been added]";
    }
  }


  }
