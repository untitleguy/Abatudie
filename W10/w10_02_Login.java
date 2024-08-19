package W10;

import java.util.Scanner;

public class w10_02_Login {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String db_Username = "admin";
        String db_Password = "FuckYou";


        System.out.print("Enter username : ");  
        String inputusername = kb.nextLine();
        System.out.print("Enter password : ");
        String inputpassword = kb.nextLine();

        if (db_Username.equals(inputusername) && db_Password.equals(inputpassword)) {
            System.out.println("You're logged in.");
        }else{

        if (!db_Username.equals(inputusername) && db_Password.equals(inputpassword)) {
            System.out.println("Wrong Name geuss again");
        }else if (db_Username.equals(inputusername) && !db_Password.equals(inputpassword)) {
            System.out.println("Wrong Password geuss again");
        }else{
for (int i = 0; i < 100; i++) {
  System.out.println("You're Fucked");
}}

        kb.close();

    }
}

}