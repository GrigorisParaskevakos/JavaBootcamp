package factorial;

import java.util.Scanner;

public class Factorial {

    
    public static void main(String[] args) {
                    
            Scanner in = new Scanner(System.in);
            System.out.println("Give integer to find Factorial: ");
            int num = in.nextInt();
             
            int factorial = 1;
            do
            {
                factorial *= num;
                num--;
            } while (num > 0);
            System.out.println("n! = " + factorial);
    }
    
}
