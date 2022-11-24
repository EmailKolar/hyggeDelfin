package members;

import java.util.ArrayList;

public class Member {
    private int age;
    private boolean isJunior = false;
    private String name;

    private boolean isContestSwimmer;
    public boolean isPassive;


    public Member(int age, String name, boolean isContestSwimmer, boolean isPassive){
        this.age = age;
        this.name = name;
        if(age < 18) this.isJunior = true;
        this.isContestSwimmer = isContestSwimmer;
        this.isPassive = isPassive;
    }



    public boolean isJunior(){
        return isJunior;
    }

    public int getAge() {
        return age;
    }

    public boolean isContestSwimmer() {
        return isContestSwimmer;
    }

    public boolean isPassive() {
        return isPassive;
    }

    @Override
    public String toString() {
        return "Member{" +
                "age=" + age +
                ", isJunior=" + isJunior +
                ", name='" + name + '\'' +
                ", isContestSwimmer=" + isContestSwimmer +
                ", isPassive=" + isPassive +
                '}';
    }
}
