import java.io.*;
public class BMI {

   public static void main(String[] args) {
       int ht = Integer.parseInt(args[0]);
       System.out.println("you have entered: " + ht);
        float ht = 0;
        float wg = 0;
        float BMI = 0;
        
       Scanner scanner = new Scanner(System.in);
        System.out.println("Give a Height: ");
        ht = scanner.nextFloat();
        System.out.println("Give a Weight: ");
        wg = scanner.nextFloat();
        BMI = (wg / (ht*ht));
        System.out.println("Your BMI is: " + BMI);
    }
    
}
