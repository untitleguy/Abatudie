package W14;

import java.util.Scanner;

public class W14_01_Array_sumNumber {

// โจทย์
// 1. สร้างโปรแกรมเพื่อแสดงข้อมูลทั้งหมดใน Array
// 2. หาผลรวมของข้อมูลทั้งหมดใน Array
// 3. สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข ผ่านคีย์บอร์ด 5 ตัว
// 4. แสดงข้อมูลทั้งหมดใน Array ใหม่
// 5. หาผลรวมของข้อมูลทั้งหมดใน Array ใหม่

public static void main(String[] args) {
        // ประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จำนวนข้อมูลล่วงหน้า
        int numbers [ ] = { 10, 30 , 17, 9, 31, 225, 64, 89, 5, 120} ; 
        int sum = 0;

        // 1. แสดงรายการข้อมูลใน Array ทั้งหมด
        System.out.println("Data in Array are:");

        for (int abatukam : numbers){

            System.out.print(abatukam + " ");

        }
  

        System.out.println("\n====================================");

        for (int i : numbers)
        sum += i;
        System.out.println(sum);
        
        // 2. หาผลรวมของข้อมูลทั้งหมด

        System.out.println("====================================");

        Scanner sc = new Scanner(System.in);
        int newnumber[] = new int[5];

        for (int i = 0; i <= 4; i++){
            System.out.print("Enter number" +(i+1)+": ");
            
            newnumber[i] = sc.nextInt();
            sum = 0;

        }
        
        // 3. สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข ผ่านคีย์บอร์ด 5 ตัว
                
        System.out.println("====================================");

        System.out.println(java.util.Arrays.toString(newnumber));
        for (int a : newnumber)
        sum += a;
        System.out.println(sum);



        // 4. แสดงข้อมูลทั้งหมดใน Array ใหม่
        // 5. หาผลรวมของข้อมูลทั้งหมดใน Array ใหม่


        System.out.println("====================================");

        int[] mergeNumber = new int[numbers.length + newnumber.length];
        for (int i = 0; i < numbers.length ;i++){
            mergeNumber[i] = numbers[i];
        }
        for (int i = 0; i < newnumber.length ;i++){
            mergeNumber[numbers.length + i] = newnumber[i];
        }
        System.out.println(java.util.Arrays.toString(mergeNumber));
        sum = 0;

        for (int a : mergeNumber)
        sum += a;
        System.out.println(sum);

        System.out.println("====================================");


    }
}