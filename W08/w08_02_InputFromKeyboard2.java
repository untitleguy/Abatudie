package W08;

import java.util.Scanner;

public class w08_02_InputFromKeyboard2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your ID : ");
        long id = kb.nextLong();
        kb.nextLine();

        System.out.print("Enter your name : ");
        String name = kb.next();
        kb.nextLine();

        System.out.print("Enter your surname : ");
        String named = kb.next();
        kb.nextLine();

        // System.out.print("Enter your name and surname : ");
        // String name = kb.next();

        System.out.print("Enter your age : ");
        int age = kb.nextInt();

        System.out.print("Enter your GPA : ");
        double gpa = kb.nextDouble();

        System.out.println(id + " " + name +" "+ named + " " + age + " " + gpa);
        kb.close();
    }
}
