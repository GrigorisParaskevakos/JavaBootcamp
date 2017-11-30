package simple_java_application_1_procedural;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class simple_java_application_1_Procedural {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println("Hello " + name);
        System.out.println("What is your surname?");
        String surname = stdin.nextLine();
        System.out.println("Whats your favorite color?");
        String color = stdin.nextLine();
        System.out.println(color);
        System.out.println("How old are you?");
        System.out.println("(input: <age>)");
        int age = stdin.nextInt();

        stdin.close();
        // Print whats gathered to a file
        System.out.println("printing........");
        if ((age > 18 && age < 66) || color.startsWith("b")) {
            try {
                // file location, C:\Java_NetBeans\simple_java_application_1_Procedural
                PrintWriter writer = new PrintWriter("thefile.txt", "UTF-8");
                writer.println("Your name is " + name );
                writer.println("Your surname is " + surname);
                writer.println("You are " + age + " years old ");
                writer.println("Your favorite color is " + color);
                writer.close();
                System.out.println("file is ready");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Exercise6.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Exercise6.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Wrong input");
        }

    }

}