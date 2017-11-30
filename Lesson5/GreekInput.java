/** 
 * Reference: https://stackoverflow.com/questions/44160808/how-to-read-greek-input-from-keyboard-using-the-scanner-class
 */

package greekinput;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class GreekInput {

  static public void main(String[] args) throws UnsupportedEncodingException 
  {  
    Scanner keyboard = new Scanner(System.in, "utf-8");
    System.out.println("enter greek letters, ελληνικά: ");
    String myStr = keyboard.next();
    System.out.println("Το αλφαριθμιτικό είναι: " + myStr);
  }// end main
}
