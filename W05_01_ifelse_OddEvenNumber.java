import java.util.Scanner;

public class W05_01_ifelse_OddEvenNumber {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.thinker();
    }

}

    class Calculate{
        void thinker(){
            Scanner Typeme = new Scanner(System.in);
            System.out.println("I can tell you what number you have is odd or even");
            System.out.print("Type here ! :");
        int num = Typeme.nextInt();
        String choice = Typeme.nextLine();
        int dvineder = 2;
        Calculate calculate = new Calculate();

        if (num % dvineder == 0){

            System.out.println("This Number " + num + " is Even");
            System.out.println("Press Enter To Continue Or Type e to End");
            choice = Typeme.nextLine();
            if(choice == ("e")){
                System.exit(0);
            }
            if (choice.isEmpty()) {

                calculate.thinker();

            }
        }else{
            System.out.println("This Number " + num + " is Odd");
            System.out.println("Press Enter To Continue Or Type e to End");
            choice = Typeme.nextLine();
            if (choice == ("e")) {
                System.exit(0);
            
        }if(choice.isEmpty()){

            calculate.thinker();

        }

        


    }

        

    
    
}}
