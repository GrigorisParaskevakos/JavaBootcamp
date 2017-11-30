package catalog;

import java.io.FileNotFoundException;

/**
 *
 * @author AsusGL702Vm
 */
public class Catalog {

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException, FileNotFoundException {
        DataBaseAccess myConnection = new DataBaseAccess();
        myConnection.dbConnect();
    }

}
