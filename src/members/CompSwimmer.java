package members;



public class CompSwimmer extends Member {


    public CompSwimmer(int birthYear, String fName, String lName, String discipline) {
        setBirthYear(birthYear);
        setfName(fName);
        setlName(lName);
        setDiscipline(discipline);
        setPersonalRecord(0);
    }
    public CompSwimmer(int birthYear, String fName, String lName, String discipline, int personalRecord) {
        setBirthYear(birthYear);
        setfName(fName);
        setlName(lName);
        setDiscipline(discipline);
        setPersonalRecord(personalRecord);
    }


}
