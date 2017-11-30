
package fibonnaciapp;

import java.util.Scanner;

public class FibonnaciApp {

    
    public static void main(String[] args) {
        //καθορίζουμε μεχρι ποιον
        //αριθμό θέλουμε να μας εμφανιστεί η ακολουθία fibonacci
        Scanner in = new Scanner(System.in);
        System.out.println("Give integer to find Fibonacci: ");
        int num = in.nextInt();
         for (int i = 1; i <= num; i++)  
             
            {
                System.out.printf("\n%d",Fibonacci(i));
            }
    }
    public static int Fibonacci(int n)
        {
            int fib;
            if (n > 2) 
            fib = Fibonacci(n - 1) + Fibonacci(n - 2);
            else fib = 1;

            return fib;
        }
      
}
