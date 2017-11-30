package checknum;

import java.util.*;

public class CheckNum {
    
    public static void main(String args[]) {
        //Declare numbers
        int num1, num2, num3;
        //boolean flag to control the loop
        boolean check = false;
        //Initialize Scanner for user input 
        Scanner input = new Scanner(System.in);
        //Iteration to check the user input 
        while (check == false) {
            //demonstrate to the user program requirements
            System.out.println("Give 3 integers,\n2nd must be 3 times 1st\nand the 3rd should be bigger than the other's two addition : \n");
            //user can press enter after giving each number
            num1 = input.nextInt();
            num2 = input.nextInt();
            num3 = input.nextInt();
                //checking the condition
                if((num2 >= 3*num1)&&(num3 > (num1 + num2))){
                    System.out.println("Congratulations! The following numbers meet the program requirements");
                    System.out.println("1st Number: " + num1 + "\n2nd Number: " + num2 + "\n3rd Number: " + num3);
                    //stops the iteration
                    check = true;
                    input.close();
                }
            }
        }//end main
}//end checkNum
