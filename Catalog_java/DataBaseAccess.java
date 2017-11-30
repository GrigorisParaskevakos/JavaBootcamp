package catalog;

/**
 *
 * @author AsusGL702Vm
 */
import java.io.FileNotFoundException;
import java.sql.*;
import java.sql.DriverManager;
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

                //ResultSet user1 = stmt4.executeQuery("select testdb.users.username from  testdb.users where testdb.users.username = 'admin'");
//                System.out.println("View: users ammount");
//                System.out.println("ID| USER | AMMOUNT");
//                System.out.println("----------------------------");
//                while (user_ammount.next()) {
//                    System.out.printf(user_ammount.getInt(1) + " | " + user_ammount.getString(2) + "|" + user_ammount.getDouble(3) + "\n");
//                    System.out.println("----------------------------");
//                }
                while (rs.next()) {
                    //Retrieve by column name
//                    int userid = rs.getInt("user_id");
//                    String firstname = rs.getString("first_name");
//                    String lastname = rs.getString("last_name");
//                    String phone1 = rs.getString("phone1");
//                    String phone2 = rs.getString("phone2");

                    //Display Values
                    System.out.println("USER ID| FIRST NAME  | LAST NAME       | PHONE1    | PHONE2");
                    System.out.printf(rs.getInt(1) + "      | " + rs.getString(2) + "       | " + rs.getString(3) + " | " + rs.getString(4) + "| " + rs.getString(5) + "\n");
                    System.out.println("----------------------------");
                }
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
