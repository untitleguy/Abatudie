package W12;

import java.util.Scanner;   // นำเข้าคลาส Scanner

public class W12_04_doWhile_selectMenu {
    public static void main(String[] args) {
        // ประกาศ Scanner object
        Scanner sc = new Scanner(System.in);
        // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้เลือก
        int choice;
        // ให้ผู้ใช้เลือกเมนูซ้ำจนกว่าจะเลือกออก ใช้ do-while
            // เงื่อนไขคือ วนลูปไปเรื่อยๆ จนกว่าผู้ใช้จะเลือก 3
        

do { break;
} while (choice == 3);

 System.out.println("====================================");
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.println("====================================");
            
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            System.out.println("------------------------------------");

        // ตรวจสอบเมนูที่ผู้ใช้เลือก
        switch (choice) {
            case 1:     // ถ้าผู้ใช้เลือก 1
                System.out.print("Enter the first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = sc.nextInt();
                int y = num1 + num2;
                System.out.println(num1 +"+"+ num2+ "=" + y );
                break;
            case 2:
            System.out.print("Enter the first number: ");
                int nnum1 = sc.nextInt();
                System.out.print("Enter the second number: ");
                int nnum2 = sc.nextInt();
                int ny = nnum1 - nnum2;
                System.out.println(nnum1 +"-"+ nnum2+ "=" + ny );
                break;
            
            case 3:
            break;
            
            default: System.out.println("wrong choice");
        }

        // ปิด Scanner object
    }  
}