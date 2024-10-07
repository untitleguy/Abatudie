package W15;

import java.util.Scanner;

public class W15_03_method_calculator_kb {

 static int add(int a ,int b){
System.out.print(a + " + " + b + " = ");
        return a + b ;}

    // 2) Method สำหรับลบเลข
static int minus(int a ,int b){
System.out.print(a + " - " + b + " = ");
        return a - b ;}

    // 3) Method สำหรับคูณเลข
static int maltiply(int a ,int b){
System.out.print(a + " x " + b + " = ");
        return a * b ;}

    // 4) Method สำหรับหารเลข
    static int divise (int a ,int b){
System.out.print(a + " ÷ " + b + " = ");
        return a / b ;}



    public static void main(String[] args) {

        //  รับค่าจากคีย์บอร์ดก่อนส่งไปยัง method อื่น
Scanner sc = new Scanner(System.in);
System.out.println("input num1 : ");
int a = sc.nextInt();
System.out.println("input num2 : ");
int b = sc.nextInt();


        // 1) Method สำหรับบวกเลข
        System.out.println(add(a, b));

        // 2) Method สำหรับลบเลข
        System.out.println(minus(a, b));

        // 3) Method สำหรับคูณเลข
        System.out.println(maltiply(a, b));

        // 4) Method สำหรับหารเลข
        System.out.println(divise(a, b));
        
        
    }
}
