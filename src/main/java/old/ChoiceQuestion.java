package old;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {

  private ArrayList<String> choices;

  public ChoiceQuestion() { // Calls superclass constructor implicitly
    choices = new ArrayList<String>();
  }

  public ChoiceQuestion(String text, String answer) {
    super(text, answer); // Calls superclass constructor explicitly
    choices = new ArrayList<String>();
  }

  public void addChoice(String choice, boolean correct) {
    choices.add(choice);
    if (correct) { // The current choices.size() is shown to the player
      String choiceString = "" + choices.size(); // as choice’s number
      setAnswer(choiceString);
    }
  }

  public void display() {
    super.display(); // Display the question text
    for (int i = 0; i < choices.size(); i++) { // Display the answer choices
      int choiceNumber = i + 1;
      System.out.println(choiceNumber + ": " + choices.get(i));
    }
  }
}