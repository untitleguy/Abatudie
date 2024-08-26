
package W11;

import java.util.Scanner;

public class W11_01_exLoopFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("พิมพ์ข้อคำสั่งที่ต้องการ [1-7]  : ");
        int question = sc.nextInt();

        switch (question) {
            case 1:
            for(int i=1 ; i<=5 ; i++ ){
                System.out.println("รอบที่ "+i+" Hello World");
            }
            break;
        
            case 2:
            for(int j=1;j<=10;j++){
                System.out.print(j+" ");
            }

            System.out.println();
            int sum = 0;
             for(int j=1;j<=10;j++){
             System.out.print(j+" ");
             sum = sum+j;
             }
             System.out.println("= "+sum);

             System.out.println();
             sum = 0;
             for(int j=1;j<=10;j++){
            System.out.print(j);
            if(j<10){
            System.out.print("+");
            }
            sum = sum+j;
            }
            System.out.println(" = "+sum);
            break;

            case 3:

            for(int i = 10 ; i>=1 ; i-- ){
                System.out.print(i+" ");
            }
            
            break;
            case 4:
            
            for(int i = 1; i<=19 ;i+=2){ 
                System.out.print(i+" ");
            }

            break;
            case 5:

            for(int i = 1; i<=10 ;i++){
                
                int a = i+i;
                System.out.print(a+" ");
            }
            
            break;    
            case 6:

            for(int i = 1; i<=10 ;i++){
                
                System.out.print(i*i + " ");
            }
            
            break;
            case 7:
            
            System.out.println();
            for(int i=1; i<=5; i++){
                if(i%2==0){
                    System.out.println("รอบที่ "+ i + "เลขคู่");
                }else{
                    System.out.println("รอบที่ "+ i + "เลขคี่");
                }      
            }

            break;
        }

        sc.close();

    }
}