

import members.Member;
import members.PassiveMember;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final String PASSIVE_MEMBERS_FILENAME = "passivemembers.txt";

    private ArrayList<Member> passiveMembers = new ArrayList<>();
    private ArrayList<Member> compSwimmmers = new ArrayList<>();
    private ArrayList<Member> FitnessSwimmers = new ArrayList<>();


    Scanner in = new Scanner(System.in);
    Ui ui = new Ui();

    public void registerMember(){
        int apc = -1;
        boolean valid = false;
        ui.println("AKTIVT ELLER PASSIVT MEDLEMSKAB? TAST 1 FOR AKTIVT ELLER TAST 2 FOR PASSIVT");
        while (!valid){
            apc = ui.readInt();
            if (apc == 1){

            } else if (apc == 2) {
                registerPassiveMember();
                valid = true;
            }
        }


    }

    public void registerPassiveMember(){
        int yr = -1;
        String fName;
        String lName;
        ui.println("SKRIV FOEDSELSAAR: ");
        yr = ui.readInt();
        ui.println("SKRIV FORNAVN");
        fName = ui.readString();
        ui.println("SKRIV EFTERNAVN");
        lName = ui.readString();

        PassiveMember p = new PassiveMember(yr, fName, lName);
        passiveMembers.add(p);
        saveFile(passiveMembers,PASSIVE_MEMBERS_FILENAME);
    }


    void saveFile(ArrayList<Member> listName, String filename){
        try{
            PrintStream ps = new PrintStream(filename);
            for (int i = 0; i < listName.size(); i++) {
                ps.println(listName.get(i));
            }
            ps.close();
        } catch (IOException e) {
            System.out.println("I/O exception: " + e.getMessage());
        }
    }

    private void run(){
        Menu m1 = new Menu("Hvem er du?", "Vælg mulighed",
                new String[]{"1. Formand", "2. Træner", "3. Kasserer"});
        m1.printMenu();
//        m1.readChoice();

        registerMember();



    }

    public static void main(String[] args) {


        new Main().run();
    }
}
