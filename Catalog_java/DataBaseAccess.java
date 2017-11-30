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

            //here catalog is database name, root is username and password
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/catalog", "root", "12345")) {

                Statement stmt = con.createStatement();
                Statement stmt2 = con.createStatement();

                ResultSet rs = stmt.executeQuery("select * from catalog.users");

                //ask user
                Scanner input = new Scanner(System.in);
                while (rs.next()) {
                    System.out.println("FirstName: ");
                    String userName = input.nextLine();
                    System.out.println("Lastname: ");
                    String lastName = input.nextLine();
                    ResultSet rs2 = stmt2.executeQuery("SELECT * FROM catalog.users where first_name = '" + userName + "' AND Last_name = '" + lastName + "'");
                    System.out.println();
                    if ((userName.equals(rs.getString(2))) && (lastName.equals(rs.getString(3)))) {
                        System.out.println("***Hello " + userName + "!!!*** \n");
                        while (rs2.next()) {
                            //Display Values
                            System.out.println("USER ID| FIRST NAME  | LAST NAME  | PHONE1    | PHONE2");
                            System.out.printf(rs.getInt(1) + "      | " + rs.getString(2) + "      | " + rs.getString(3) + "   | " + rs.getString(4) + "| " + rs.getString(5) + "\n");
                            System.out.println("----------------------------");
                        }
                    } else {
                        System.out.println("You don't Exist, sorry!\n");
                    }
                    input.close();
                    exit(0);
                }
                con.close();

            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
