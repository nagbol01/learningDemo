package wk9;

/**
 * This program checks whether a word is a palindrome (disregarding non-letter symbols and letter
 * case) without constructing intermediate String objects. Based on material from "Java for
 * Everyone" by Cay Horstmann.
 */
public class Palindromes2 {

  /**
   * Tests whether a text is a palindrome (disregarding non-letter symbols and letter case). See
   * also "Java for Everyone", web chapter 13.2.
   *
   * @param text a string that is being checked
   * @return true if text is a palindrome, false otherwise
   * @throws NullPointerException if text is null
   */
  public static boolean isPalindromeTextbook(String text) {
    return isPalindromeTextbook(text, 0, text.length() - 1);
  }

  /**
   * Tests whether a substring is a palindrome (disregarding non-letter symbols and letter case).
   * See also "Java for Everyone", web chapter 13.2.
   *
   * @param text a string that is being checked
   * @param start the index of the first character of the substring (inclusive)
   * @param end the index of the last character of the substring (inclusive)
   * @return true if the substring is a palindrome, false otherwise
   * @throws NullPointerException if text is null
   */
  public static boolean isPalindromeTextbook(String text, int start, int end) {
    // Separate case for substrings of length 0 and 1.
    if (start >= end) {
      return true;
    } else {
      // Get first and last characters, converted to lowercase.
      char first = Character.toLowerCase(text.charAt(start));
      char last = Character.toLowerCase(text.charAt(end));
      if (Character.isLetter(first) && Character.isLetter(last)) {
        if (first == last) {
          return isPalindromeTextbook(text, start + 1, end - 1);
        } else {
          return false;
        }
      } else if (!Character.isLetter(last)) {
        return isPalindromeTextbook(text, start, end - 1);
      } else {
        return isPalindromeTextbook(text, start + 1, end);
      }
    }
  }

  /**
   * Tests whether a text is a palindrome (disregarding non-letter symbols and letter case)
   *
   * @param text a string that is being checked
   * @return true if text is a palindrome, false otherwise
   * @throws NullPointerException if text is null
   */
  public static boolean isPalindrome(String text) {
    return isPalindrome(text, 0, text.length() - 1);
  }

  /**
   * Tests whether a substring is a palindrome (disregarding non-letter symbols and letter case).
   *
   * @param text a string that is being checked
   * @param start the index of the first character of the substring (inclusive)
   * @param end the index of the last character of the substring (inclusive)
   * @return true if the substring is a palindrome, false otherwise
   * @throws NullPointerException if text is null and start is less than end
   */
  public static boolean isPalindrome(String text, int start, int end) {
    // Separate case for substrings of length 0 and 1.
    if (start >= end) {
      return true;
    } else {
      // Get first and last characters.
      char first = text.charAt(start);
      char last = text.charAt(end);
      if (first == last) {
        return isPalindrome(text, start + 1, end - 1);
      } else {
        return false;
      }
    }
  }

  public static void main(String[] args) {
    String sentence1 = "Madam, I'm Adam!";
    System.out.println(sentence1);
    //System.out.println("Palindrome: " + isPalindromeTextbook(sentence1));
    System.out.println("Palindrome: " + isPalindrome(sentence1));
    String sentence2 = "Sir, I'm Eve!";
    System.out.println(sentence2);
    //System.out.println("Palindrome: " + isPalindromeTextbook(sentence2));
    System.out.println("Palindrome: " + isPalindrome(sentence2));

    // Java: limitations of recursion in practice
    // build a large string ...
    final int STRING_SIZE = 100000;
    final char LETTER = 'a';
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < STRING_SIZE; i++) {
      sb.append(LETTER);
    }
    String longString = sb.toString();

    // ... and ask our recursive method to check if it's a palindrome
    System.out.println("Palindrome: " + isPalindrome(longString));
    // Boom!

    // Exception in thread "main" java.lang.StackOverflowError
    // [...]

    // This means that the Java Virtual Machine has run "out of stack".
    // Here the "stack" is the call stack for the method calls.
    // Since our function isPalindrome is "tail-recursive" (the
    // recursive call is the very last thing the method does before it
    // returns, an optimising compiler could generate code that does not
    // have this stack usage overhead. However, Java compilers usually
    // do not apply this optimisation.
  }
}
