package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double input;
        
    // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
        do {
            System.out.println("input number between 1 and 100");
            input = kb.nextDouble();
            if (input < 0 || input > 100) {
                System.out.println("wrong value enter again");
            }else{
                break;
            }
        } while (true);{
            System.out.println("student score is" + input);
            
        }

        // ตรวจสอบเกรด

        kb.close(); // ปิด Scanner object
    }
}