package W13;

public class W13_01_lntroArray{
    public static void main(String[] args) {
       String [] colors  = {"purple","cyan","blue","geen","yellow","orange","red"}; 
       int [] Bank  = {20,50,100,500,1000};
       char [] alphabet = {'a','b','c','d','e'};
       //แสดงผลรับโดยใช้ index ของ Array
       System.out.println("the first color is "+colors[0]);
       System.out.println("the third alphabet"+alphabet[3]);
       //แสดงผลโดยใช้ loop
       System.out.println("Colors in the array are: ");
       for ( int i=0; i<=6; i++) {
           System.out.print(colors[i]+" ");
       }
       System.out.println();

        for ( int i=6; i>=0; i--) {
           System.out.print(colors[i]+" ");
       } 
        System.out.println();
       System.out.print("Bank the array are:");
        for ( int p=0; p< Bank.length; p++) {
           System.out.print(" "+Bank[p]);
       }


    }
}