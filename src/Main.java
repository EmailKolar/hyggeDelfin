

import members.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    Scanner in = new Scanner(System.in);



    private void run(){
        Menu m1 = new Menu("Hvad vil du?", "Vælg mulighed", new String[]{"1. Opret medlem"});
        m1.printMenu();
        m1.readChoice();




    }

    public static void main(String[] args) {


        new Main().run();
    }
}
