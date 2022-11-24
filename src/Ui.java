import java.util.Scanner;

public class Ui {

    Scanner in = new Scanner(System.in);

    public void println(String msg){
        System.out.println(msg);
    }

    public void print(String msg){
        System.out.print(msg);
    }

    public String readString(){
        return in.nextLine();
    }

    public String readString(String msg){
        print(msg);
        return readString();
    }

    public int readInt(){
        int number = in.nextInt();
        in.nextLine();//scanner bug
        return number;
    }



}