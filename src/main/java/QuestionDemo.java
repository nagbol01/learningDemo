import java.util.Scanner;

public class QuestionDemo {

  public static void main(String[] args) {
    Question first = new Question();
    first.setText("Who was the inventor of Java?");
    first.setAnswer("James Gosling");

    ChoiceQuestion second = new ChoiceQuestion();
    second.setText("In which country was the inventor of Java born?");
    second.addChoice("Australia", false);

    second.addChoice("Canada", true);
    second.addChoice("Denmark", false);
    second.addChoice("United States", false);

    presentQuestion(first);
    presentQuestion(second);
  }

  public static void presentQuestion(Question q) {
    q.display();
    System.out.print("Your answer: ");
    Scanner in = new Scanner(System.in);
    String response = in.nextLine();
    System.out.println(q.checkAnswer(response));
  }
}