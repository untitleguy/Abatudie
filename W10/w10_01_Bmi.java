package W10;
import java.util.Scanner;

public class w10_01_Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ป้อนน้ำหนักของคุณ (kg): ");
        double weightKG = scanner.nextDouble();
        
        System.out.print("ป้อนส่วนสูงของคุณ (cm): ");
        double heightCM = scanner.nextDouble();
        
        double heightM = heightCM/100;

        // คำนวณค่า BMI
        double bmi = weightKG / (heightM * heightM);
        
        System.out.println("ค่า BMI ของคุณคือ: " + bmi);
        
        // ตรวจสอบสถานะ BMI
        if (bmi < 18.5 )  {
            System.out.println("คุณมีน้ำหนักน้อยกว่าเกณฑ์ : อยู่ในสถานะผอม");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("คุณมีน้ำหนักน้อยปกติ : อยู่ในสถานะปกติ");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("คุณมีน้ำหนักเกิน : อยู่ในสถานะท้วม");
        } else {
            System.out.println("คุณมีน้ำหนักเกินกว่าปกติมาก : อยู่ในสถานะอ้วน");
        }
        scanner.close();
    }
}