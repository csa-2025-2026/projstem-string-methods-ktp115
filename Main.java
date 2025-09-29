import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //prob 1
    System.out.println("Input first word: ");
    String word1 = sc.nextLine();
    System.out.println("Input second word: ");
    String word2 = sc.nextLine();
    System.out.println("Input number: ");
    int num = sc.nextInt();

    lastFirstN(word1, word2,num);
    stringManip(word1,word2);

  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output;
    String firstN;
    String lastN;

    lastN = s1.substring(s1.length()-n);
    firstN = s2.substring(0,n);

    output = lastN + firstN;
    System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    System.out.println(s1.toUpperCase());
    String upperLetter = s2.substring(0,1);
    upperLetter = upperLetter.toUpperCase();
    
    System.out.println(upperLetter + s2.substring(1));
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
