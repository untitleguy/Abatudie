package W12;

public class W12_01_WhileTrue {
    public static void main(String[] args) {

        int i = 1;
        boolean kb = true;

        if (i >= 10){
            kb = false;
        }

        while (kb) { 
            System.out.println(i+" ");
            if (i >= 1000){
                kb = false;
            }

            i++;
            
        }

    }
}