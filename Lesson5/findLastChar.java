package findlastchar;

/**
 * @author Paraskevakos G.
 */
public class FindLastChar {

    public static void main(String[] args) {
       String s = "10hel10lo10";
       //call method
       findL(s);
    }
    //method to find the last String value in a sequence
    public static String findL(String s){
        System.out.println("last l is in position: " + s.lastIndexOf("l",s.length()));
        return s;
    }
    
}
