package organism;

import java.util.Date;

public class Person extends Organism implements SetPersonable, GetPersonable {

    private String firstName;
    private String lastName;
    private String fatherName;
    private int yearBirth;
    private int age;
    private int years;

    public Person(String fiN, String lN, String faN, int yB) {
        this.firstName = fiN;
        this.lastName = lN;
        this.fatherName = faN;
        this.yearBirth = yB;
        Date date = new Date();
    }

    @Override
    public Date alive() {
        super.alive(); //To change body of generated methods, choose Tools | Templates.
        return date;

    }

    @Override
    public void setfiN(String fiN) {
        this.firstName = fiN;
        //To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setlN(String lN) {
        this.lastName = lN;
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setfaN(String faN) {
        this.fatherName = faN;
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setyB(int yB) {
        this.yearBirth = yB;
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getfiN() {
        return firstName;

    }

    @Override
    public String getlN() {
        return lastName;
    }

    @Override
    public String getfaN() {
        return fatherName;
    }

    @Override
    public int getyB() {
        return yearBirth;
    }

    @Override
    public int getage() {
        age = 2017 - yearBirth;
        return age;
    }

    @Override
    public void writeString() {
        System.out.printf("Line 1: %s %s %s\n", getlN(), getfiN(), getfaN());
        System.out.printf("Line 2: %d\n", getyB());
        System.out.printf("Line 3: %d\n", getage());
    }

}
