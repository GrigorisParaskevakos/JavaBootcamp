package catalog;

/**
 *
 * @author AsusGL702Vm
 */
import java.io.FileNotFoundException;
import static java.lang.System.exit;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseAccess {

    public void dbConnect() throws FileNotFoundException {
        //private int delay;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //here testdb is database name, root is username and password
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/catalog", "root", "12345")) {

                Statement stmt = con.createStatement();
                Statement stmt2 = con.createStatement();
                Statement stmt4 = con.createStatement();
                Statement stmt5 = con.createStatement();

                ResultSet rs = stmt.executeQuery("select * from catalog.users");

                //ask user
                Scanner input = new Scanner(System.in);
                int i = 0;
                while (rs.next()) {
                    System.out.println("FirstName: ");
                    String userName = input.nextLine();
                    System.out.println("Lastname: ");
                    String lastName = input.nextLine();
                    ResultSet rs2 = stmt2.executeQuery("SELECT * FROM catalog.users where first_name = '" + userName + "' AND Last_name = '" + lastName + "'" );
                    System.out.println();
                    if ((userName.equals(rs.getString(2))) && (lastName.equals(rs.getString(3)))) {
                        System.out.println("Hello" + userName + " \n");
                        while (rs2.next()) {
                            //Display Values
                            System.out.println("USER ID| FIRST NAME  | LAST NAME       | PHONE1    | PHONE2");
                            System.out.printf(rs.getInt(1) + "      | " + rs.getString(2) + "       | " + rs.getString(3) + " | " + rs.getString(4) + "| " + rs.getString(5) + "\n");
                            System.out.println("----------------------------");
                        }
                    } else {
                        i++;
                        System.out.println("You don't Exist, sorry!\n");
                    }
                    input.close();
                    //exit(1);
                }

                //returns all users names
                //ResultSet us = stmt.executeQuery("select 'first_name', 'last_name' from catalog.users");
//                while (rs.next()) {
//                    //Display Values
//                    System.out.println("USER ID| FIRST NAME  | LAST NAME       | PHONE1    | PHONE2");
//                    System.out.printf(rs.getInt(1) + "      | " + rs.getString(2) + "       | " + rs.getString(3) + " | " + rs.getString(4) + "| " + rs.getString(5) + "\n");
//                    System.out.println("----------------------------");
//                }
//                con.close();
                con.close();

                /*while (user1.next()) {
                    //System.out.println("user me ID 1: " + user1.getString(1));
                    if ("admin".equals(user1.getString(1))) {
                        System.out.println("admin connected");
                        //more code here
                    }
                }*/
            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
