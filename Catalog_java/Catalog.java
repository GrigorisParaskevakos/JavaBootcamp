package catalog;

/**
 *
 * @author AsusGL702Vm
 */
public class Catalog {

    public static void main(String[] args)  {
        DataBaseAccess myConnection = new DataBaseAccess();
        myConnection.dbConnect();
    }

}
