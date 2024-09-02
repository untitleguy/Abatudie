package W12;

import java.util.Scanner;

public class W12_01_exLoopWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("พิมพ์ข้อคำสั่งที่ต้องการ [1-7]  : ");
        int question = sc.nextInt();
        int i = 1;
        


        switch (question) {
            case 1:
                
                while (i <= 5) {
                    System.out.println("รอบที่ " + i + " Hello World");
                    i++;
                }
                break;

            case 2:
                while (i <= 5) {
                    System.out.print(i + " ");
                    i++;
                }

                System.out.println();
                int sum = 0;
                for (int j = 1; j <= 10; j++) {
                    System.out.print(j + " ");
                    sum = sum + j;
                }
                System.out.println("= " + sum);

                System.out.println();
                sum = 0;
                for (int j = 1; j <= 10; j++) {
                    System.out.print(j);
                    if (j < 10) {
                        System.out.print("+");
                    }
                    sum = sum + j;
                }
                System.out.println(" = " + sum);
                break;

            case 3:

                for (int k = 10; k >= 1; k--) {
                    System.out.print(k + " ");
                }

                break;
            case 4:

                for (int l = 1; l <= 19; l += 2) {
                    System.out.print(l + " ");
                }

                break;
            case 5:

                for (int r = 1; r <= 10; r++) {

                    int a = r + r;
                    System.out.print(a + " ");
                }

                break;
            case 6:
 
                for (int j = 1 ; j <= 10 ; j++) {

                    System.out.print(j * j + " ");

                }

                while (i <= 10) {

                    System.out.print(i * i + " ");
                    i++;

                    
                }

                break;
            case 7:

                System.out.println();
                while (i <= 5) {
                    if (i % 2 == 0) {
                        System.out.println("รอบที่ " + i + "เลขคู่");
                    } else {
                        System.out.println("รอบที่ " + i + "เลขคี่");
                    }
                    i++;
                }

                break;
         
        }
    

        sc.close();

    }
}
