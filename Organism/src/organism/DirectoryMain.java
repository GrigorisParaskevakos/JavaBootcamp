package organism;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DirectoryMain {

    public static void main(String[] args) throws FileNotFoundException {
        new Thread(
                () -> {//lambda expression

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
                    String path = "C:\\tmp\\";
                    String path2 = "User_" + lastName + "_temp1\\";
                    String fileName = lastName + ".txt";
                    File f = new File(path + path2);
                    boolean check = f.isDirectory();
                    if (check) {
                        System.out.println("folder exists...But we replaced it!");
                    } else {
                        System.out.println("Folder path not exists");
                        if (f.mkdirs()) {
                            System.out.println("Created user folder");
                        }
                    }
                    // Write to a file
                    PrintWriter writer;
                    try {
                        writer = new PrintWriter(path + path2 + fileName, "UTF-8");
                        writer.println("Person First Name: " + personA.getfiN());
                        writer.println("Person Last Name: " + personA.getlN());
                        writer.println("Person Father's Name: " + personA.getfaN());
                        writer.println("Person year of Birth: " + personA.getyB());
                        writer.println("Person Age: " + personA.getage());
                        writer.println("Alive: " + personA.alive());
                        writer.close();
                    } catch (UnsupportedEncodingException ex) {
                        Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(DirectoryMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        ).start();//here stops the reference

    }//end main  
}
