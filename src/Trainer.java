import members.Member;

import java.util.ArrayList;

public class Trainer extends Staff{

    Chairman c = new Chairman();

ArrayList<Member> a = c.getCompSwimmers();
    Ui ui = new Ui();

    public void registerTime(){

        ui.println("Hvilken konkurrencesvømmer vil du registrere en ny tid for?");

        for (int i = 0; i < a.size(); i++) {
            ui.println(i+1 + ": " + a.get(i).getfName() + " " + a.get(i).getlName() + " " + a.get(i).getDiscipline() + " " +
                    a.get(i).getPersonalRecord());
        }
        ui.println("Tast tal tilsvarende til svømmer du vil registrere tid for");

        int choice = ui.readInt();
//


    }




}
