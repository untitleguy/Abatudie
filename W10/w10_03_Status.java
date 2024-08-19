package W10;

import java.util.Scanner;

public class w10_03_Status {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("กรุณาป้อนเพศ (male/female): ");
        String gender = scanner.nextLine();

        System.out.print("กรุณาป้อนอายุ: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // อ่านบรรทัดที่ค้างจาก nextInt()

        System.out.print("กรุณาป้อนสถานะสมรส (single/married): ");
        String maritalStatus = scanner.nextLine();

        System.out.print("กรุณาป้อนสถานะ... (D/A): ");
        String Livingornot = scanner.nextLine();

        // ตรวจสอบและแนะนำคำหน้าชื่อ
        String title = "";
        String Statusnow = "";

        if (gender.equalsIgnoreCase("male")) {
            if (age < 15) {
                title = "เด็กชาย";
            } else {
                title = "นาย";
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age < 15) {
                title = "เด็กหญิง";
            } else if (maritalStatus.equalsIgnoreCase("single")) {
                title = "นางสาว";
            } else if (maritalStatus.equalsIgnoreCase("married")) {
                title = "นาง";
            }
        }

        if (Livingornot.equalsIgnoreCase("D")){
        Statusnow = "ตายห่า";}else if
         (Livingornot.equalsIgnoreCase("A")){
        Statusnow = "ยังรอด";}


        if (!title.isEmpty()) {
            System.out.println("คำหน้าชื่อที่เหมาะสมคือ: " + title);
            System.out.println("สถาน:" + Statusnow);
        } else {
            System.out.println("ข้อมูลที่ป้อนไม่ถูกต้อง");
        }
    

        if ((age >= 100) && (age <= 150) && (Statusnow == "A")){
            System.out.println("ไอ้แก่");
        }else if ((age >= 200) && (Statusnow == "A") && (age <= 250)){
            System.out.println("ยังอยู่อีกอ่อ ได้ไง");
        }else if ((age > 250) && (Statusnow == "A"))
            System.out.println("คิดว่ามึงเป็นพระเจ้าอ่อ");
            

        scanner.close();
    }
}