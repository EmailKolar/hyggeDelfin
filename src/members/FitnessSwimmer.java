package members;

public class FitnessSwimmer extends Member {

    public FitnessSwimmer(int birthYear, String fName, String lName) {
        setBirthYear(birthYear);
        setfName(fName);
        setlName(lName);

    }
    @Override
    public String toString() {
        return getfName() + "\n" + getlName() + "\n" + getBirthYear();
    }

}
