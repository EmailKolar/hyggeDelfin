

import members.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Member> passiveMembers = new ArrayList<>();

    ArrayList<Member> contestSwimmers = new ArrayList<>();
    ArrayList<Member> exerciseSwimmers = new ArrayList<>();

    Scanner in = new Scanner(System.in);


    public void createMember(){
        boolean isContestSwimmer = false;
        boolean isPassive = false;
        System.out.println("SKRIV NAVN: ");
        String name = in.nextLine();
        System.out.println("SKRIV ALDER: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("PASSIVT ELLER AKTIVT MEDLEMSKAB? SKRIV \"P\" ELLER \"A\"");
        String pOrA = in.nextLine();
        if(pOrA.equalsIgnoreCase("P")) isPassive = true;
        System.out.println("MOTIONIST ELLER KONKURRENCESVØMMER? SKRIV \"M\" ELLER \"K\"");
        String type = in.nextLine();
        if(type.equalsIgnoreCase("K")) isContestSwimmer = true;

        Member m = new Member(age, name, isContestSwimmer, isPassive);
        addMemberToList(m);
    }


    public void addMemberToList(Member m){
        if(m.isPassive){
            passiveMembers.add(m);
        } else if (m.isContestSwimmer()) {
            contestSwimmers.add(m);
        }else{
            exerciseSwimmers.add(m);
        }
//        savefile()
    }
    private void run(){
        Menu m1 = new Menu("Hvad vil du?", "Vælg mulighed", new String[]{"1. Opret medlem"});
        m1.printMenu();
        m1.readChoice();



        Member  m = new Member(22,"emil",true, false  );

        System.out.println(m.getAge());
        

        createMember();

        System.out.println(exerciseSwimmers);

    }

    public static void main(String[] args) {


        new Main().run();
    }
}
