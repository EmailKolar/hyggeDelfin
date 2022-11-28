

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


    private void run(){
        Menu m1 = new Menu("Hvem er du?", "Vælg mulighed",
                new String[]{"1. Formand", "2. Træner", "3. Kasserer"});
        m1.printMenu();
//        m1.readChoice();

        Chairman c = new Chairman();
        Trainer t = new Trainer();

        t.registerTime();

//        c.registerMember();




    }

    public static void main(String[] args) {


        new Main().run();
    }
}
