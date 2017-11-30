/*
*Paraskevakos G.
*/
package simple_java_application_1;

public class Person {
    
    private String firstName;
    private String lastName;
    private String fatherName;
    private int yearBirth;
    private int age;
    
    //constructor
    public Person(String fiN, String lN, String faN, int yB)
	{
		this.firstName = fiN;
                this.lastName = lN;
                this.fatherName = faN;
                this.yearBirth = yB;
	}
    //seters
    public void setfiN(String fiN){
        this.firstName = fiN;
    }
    public void setlN(String lN){
        this.lastName = lN;
    }
    public void setfaN(String faN){
        this.fatherName = faN;
    }
    public void setfyB(int yB){
        this.yearBirth = yB;
    }
    //getters
    public String getfiN(){
        return firstName;
    }
    public String getlN(){
        return lastName;
    }
    public String getfaN(){
        return fatherName;
    }
    public int getyB(){
        return yearBirth;
    }
    public int getage(){
        age = 2017 - yearBirth;
        return age;
    }
    
    public void writeString(){
        
      System.out.printf("Line 1: %s %s %s\n",getlN(),getfiN(),getfaN());
      System.out.printf("Line 2: %d\n",getyB());
      System.out.printf("Line 3: %d\n",getage());
        
    }
    
    
}
