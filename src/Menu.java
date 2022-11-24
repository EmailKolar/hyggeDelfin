import java.util.Scanner;

public class Menu {
    private String menuHeader;
    private String leadText;
    private String[] menuItems;

    public Menu(String menuHeader, String leadText, String[] menuItems){
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuItems = menuItems;
    }

    public void printMenu(){
        String printString = menuHeader + "\n";
        for(int i = 0; i < menuItems.length; i++)
            printString += menuItems[i] + "\n";
        System.out.println("\n" + printString);

    }

    public int readChoice(){
        Scanner in = new Scanner(System.in);
        boolean validChoice = false;
        int choice = -1;

        while(!validChoice){
            System.out.println(leadText);

            if(in.hasNextInt()){
                choice = in.nextInt();
                validChoice = true;
            }else{
                in.nextLine();
            }
        }
        return choice;
    }



}


