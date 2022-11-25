

import members.CompSwimmer;
import members.FitnessSwimmer;
import members.Member;
import members.PassiveMember;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final String PASSIVE_MEMBERS_FILENAME = "passivemembers.txt";
    private final String FITNESS_SWIMMERS_FILENAME = "fitnessswimmmers.txt";
    private final String COMP_SWIMMERS_FILENAME = "compswimmmers.txt";

    private ArrayList<Member> passiveMembers = new ArrayList<>();
    private ArrayList<Member> compSwimmmers = new ArrayList<>();
    private ArrayList<Member> fitnessSwimmers = new ArrayList<>();


    Scanner in = new Scanner(System.in);
    Ui ui = new Ui();



    Main(){
        passiveMembers = new ArrayList<>();
        fitnessSwimmers = new ArrayList<>();
        compSwimmmers = new ArrayList<>();
        readBasicMembers(passiveMembers,PASSIVE_MEMBERS_FILENAME,1);
        readBasicMembers(fitnessSwimmers,FITNESS_SWIMMERS_FILENAME,2);
        readBasicMembers(compSwimmmers,COMP_SWIMMERS_FILENAME,3);
    }

    public void registerMember(){
        int choice = -1;
        boolean valid = false;
        ui.println("AKTIVT ELLER PASSIVT MEDLEMSKAB? TAST 1 FOR AKTIVT ELLER TAST 2 FOR PASSIVT");
        while (!valid){
            choice = ui.readInt();
            if (choice == 1){
                int choice2 = ui.readInt("MOTIONIST ELLER KONKURRENCESVØMMER? " +
                        "TAST 1 FOR MOTIONIST ELLER TAST 2 FOR KONKURRENCESVØMMER");
                if (choice2 == 1){
                    registerInfo(2);
                    valid = true;
                } else if (choice2 == 2) {
                    registerInfo(3);
                    valid = true;
                }
            } else if (choice == 2) {
                registerInfo(1);
                valid = true;
            }
        }

    }

    public void registerInfo(int choice){
        int yr = -1;
        String fName;
        String lName;


        yr = ui.readInt("SKRIV FOEDSELSAAR: ");
        ui.println("SKRIV FORNAVN");
        fName = ui.readString();
        ui.println("SKRIV EFTERNAVN");
        lName = ui.readString();
        switch (choice){
            case 1-> registerPassiveMember(yr,fName,lName);
            case 2 -> registerFitnessSwimmer(yr,fName,lName);
            case 3 -> registerCompSwimmer(yr,fName,lName);
        }


    }

    public void registerCompSwimmer(int yr, String fName, String lName){
        String discipline;
        ui.println("SKRIV DISCIPLIN");
        discipline = ui.readString();


        CompSwimmer c = new CompSwimmer(yr, fName, lName, discipline);
        compSwimmmers.add(c);
        saveFile(compSwimmmers,COMP_SWIMMERS_FILENAME);
    }


    public void registerFitnessSwimmer(int yr, String fName, String lName){

        FitnessSwimmer f = new FitnessSwimmer(yr, fName, lName);
        fitnessSwimmers.add(f);
        saveFile(fitnessSwimmers,FITNESS_SWIMMERS_FILENAME);
    }


    public void registerPassiveMember(int yr, String fName, String lName){

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
    public void readBasicMembers(ArrayList<Member> listName, String filename, int choice){
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (fileScanner.hasNextLine()) {
            String fName = fileScanner.nextLine();
            String lName = fileScanner.nextLine();
            int yr = Integer.parseInt(fileScanner.nextLine());

            if(choice == 3){
                String discipline = fileScanner.nextLine();
                int pr = Integer.parseInt(fileScanner.nextLine());

                CompSwimmer c = new CompSwimmer(yr,fName,lName,discipline,pr);
                compSwimmmers.add(c);

            }

            if(choice == 1){
                PassiveMember p = new PassiveMember(yr, fName, lName);
                listName.add(p);

            } else if (choice == 2) {
                FitnessSwimmer f = new FitnessSwimmer(yr,fName, lName);
                listName.add(f);

            }

        }
        fileScanner.close();
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
