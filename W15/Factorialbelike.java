public class Factorialbelike {

    static int factorialexecutecommand(int a){
        int i,factorialmaltiplyer = 1;

        
        for (i = 1; i <= a; i++) {
            factorialmaltiplyer = factorialmaltiplyer*i;
        }

        System.out.println("factorial of " + a + " is "+factorialmaltiplyer);
        
    
        return 0;

    }
    
    
    public static void main(String[] args) {
        factorialexecutecommand(10);
    }

}
