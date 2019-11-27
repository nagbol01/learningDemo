package wk9;

/**
 * This program checks whether a word is a palindrome (disregarding non-letter symbols and letter
 * case). Based on material from "Java for Everyone" by Cay Horstmann.
 */
public class Palindromes {

  /**
   * Tests whether a text is a palindrome (disregarding non-letter symbols and letter case). See
   * also "Java for Everyone", web chapter 13.2.
   *
   * @param text a string that is being checked
   * @return true if text is a palindrome, false otherwise
   * @throws NullPointerException if text is null
   */
  public static boolean isPalindromeTextbook(String text) {
    int length = text.length();
    // Separate case for shortest strings.
    if (length <= 1) {
      return true;
    } else {
      // Get first and last characters, converted to lowercase.
      char first = Character.toLowerCase(text.charAt(0));
      char last = Character.toLowerCase(text.charAt(length - 1));
      if (Character.isLetter(first) && Character.isLetter(last)) {
        // Both are letters.
        if (first == last) {
          // Remove both first and last character.
          String shorter = text.substring(1, length - 1);
          return isPalindromeTextbook(shorter);
        } else {
          return false;
        }
      } else if (!Character.isLetter(last)) {
        // Remove last character.
        String shorter = text.substring(0, length - 1);
        return isPalindromeTextbook(shorter);
      } else {
        // Remove first character.
        String shorter = text.substring(1);
        return isPalindromeTextbook(shorter);
      }
    }
  }

  /**
   * Tests whether a text is a palindrome.
   *
   * @param text a string that is being checked
   * @return true if text is a palindrome, false otherwise
   * @throws NullPointerException if text is null
   */
  public static boolean isPalindrome(String text) {
    int length = text.length();
    // Separate case for shortest strings.
    if (length <= 1) {
      return true;
    } else {
      // Get first and last characters, converted to lowercase.
      char first = text.charAt(0);
      char last = text.charAt(length - 1);
      if (first == last) {
        // Remove both first and last character.
        String shorter = text.substring(1, length - 1);
        return isPalindrome(shorter);
      } else {
        return false;
      }
    }
  }

  /**
   * Converts text to lower case and removes non-letter characters.
   *
   * @param text Text to be preprocessed.
   * @return a version of text in lower case with non-letter characters removed
   * @throws NullPointerException if text is null
   */
  public static String preprocess(String text) {
    // When we build Strings in several steps (using loops or recursion),
    // StringBuilders let us build Strings more efficiently than
    // by creating new String objects over and over in the loop
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (Character.isLetter(c)) {
        sb.append(Character.toLowerCase(c));
      }
    }
    return sb.toString();
  }


  public static void main(String[] args) {
    String sentence1 = "Madam, I'm Adam!";
    System.out.println(sentence1);
    //System.out.println("Palindrome: " + isPalindromeTextbook(sentence1));
    String s1preprocessed = preprocess(sentence1);
    System.out.println(s1preprocessed);
    System.out.println("Palindrome: " + isPalindrome(s1preprocessed));
    String sentence2 = "Sir, I'm Eve!";
    System.out.println(sentence2);
    //System.out.println("Palindrome: " + isPalindromeTextbook(sentence2));
    String s2preprocessed = preprocess(sentence2);
    System.out.println(s2preprocessed);
    System.out.println("Palindrome: " + isPalindrome(s2preprocessed));
  }
}
