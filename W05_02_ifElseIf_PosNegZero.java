import java.util.Scanner;

public class W05_02_ifElseIf_PosNegZero {

    public static void main(String[] args) {

        Checker checker = new Checker();
        checker.checking();
        
    }
    
}

class Checker {
    void checking() {
        Option pick = new Option();

        Scanner taker = new Scanner(System.in);
        System.out.print("Enter Number :");
        int number = taker.nextInt();

        if (number>0) {

            System.out.println("This Number Is Positive");
            pick.choose();
            
            
        } else {

            if (number<0) {

                System.out.println("This Number Is Negative");
                pick.choose();
                
                
            } else {
                    System.out.println("This Number Is Zero");
                    pick.choose();

                
            }
        }
            
        }

    

    }

    class Option {
        void choose() {

            System.out.println("Press Enter To Continue Or Type e to End");

            Checker checker = new Checker();
            Scanner taker = new Scanner(System.in);
            String choice = taker.nextLine();
            if (choice == ("e")) {
                System.exit(0);
            }
            if (choice.isEmpty()) {

                checker.checking();

            }

        }
    }

