/*
*Paraskevakos G.
*/
package simple_java_application_1;
import java.util.Scanner;

public class Simple_java_application_1_main {

    public static void main(String[] args) {
        
        //User input from Standard input
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("Hello " + firstName);
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.println("What is your father's name?");
        String fatherName = input.nextLine();
        System.out.println("What is your year of Birth?");
        int yearBirth = input.nextInt();
        
        //create object personA
        Person personA = new Person(firstName, lastName, fatherName, yearBirth);
     
        //print messages
        System.out.println("------------------------------------");
        personA.writeString();
        System.out.println("------------------------------------");
        
    }
    
}
