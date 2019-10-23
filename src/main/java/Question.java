public class Question {

  private String text;
  private String answer;

  public Question(String text, String answer) {
    this.text = text;
    this.answer = answer;
  }

  public Question() {
    this("", "");
  }

  public void setText(String questionText) {
    text = questionText;
  }

  public void setAnswer(String correctResponse) {
    answer = correctResponse;
  }

  public boolean checkAnswer(String response) {
    return response.equals(answer);
  }

  public void display() {
    System.out.println(text);
  }
}