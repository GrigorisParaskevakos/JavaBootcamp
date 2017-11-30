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

    public void dbConnect() {
        //private int delay;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //here catalog is database name, root is username and password
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/catalog", "root", "12345")) {

                Statement stmt = con.createStatement();
                Statement stmt2 = con.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT first_name, last_name from catalog.users");

                //ask user
                Scanner input = new Scanner(System.in);
                System.out.println("FirstName: ");
                String userName = input.nextLine();
                System.out.println("Lastname: ");
                String lastName = input.nextLine();
                System.out.println();
                ResultSet rs2 = stmt2.executeQuery("SELECT * FROM catalog.users where first_name = '" + userName + "' AND Last_name = '" + lastName + "'");
                boolean flag = false;
                boolean flag2 = false;
                while (rs.next()) {
                    if ((userName.equals(rs.getString(1))) && (lastName.equals(rs.getString(2)))) {
                        flag = true;
                        flag2 = true;
                    }
                }
                if (flag2 == false && flag == false) {
                    System.out.println("You don't Exist, sorry!\n");
                }
                if (flag == true) {
                    System.out.println("***Hello " + userName + "*** \n");
                    while (rs2.next()) {
                        //Display Values
                        System.out.println("USER ID| FIRST NAME  | LAST NAME  | PHONE1    | PHONE2");
                        System.out.printf(rs2.getInt(1) + "       | " + rs2.getString(2) + "      | " + rs2.getString(3) + "   | " + rs2.getString(4) + "| " + rs2.getString(5) + "\n");
                        System.out.println("----------------------------");
                    }
                }

                input.close();
                exit(0);
                con.close();
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }
}
