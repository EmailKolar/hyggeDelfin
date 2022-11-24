package members;

import java.util.ArrayList;

public class Member {
    private int birthYear;
    private String fName;
    private String lName;
    private String discipline;
    private double personalRecord;
    private String membershipStatus;




    public Member(){

    }

    public Member(int birthYear, String fName, String lName){
        setBirthYear(birthYear);
        setfName(fName);
        setlName(lName);
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlName() {
        return lName;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public void setPersonalRecord(double personalRecord) {
        this.personalRecord = personalRecord;
    }

    public double getPersonalRecord() {
        return personalRecord;
    }
}
