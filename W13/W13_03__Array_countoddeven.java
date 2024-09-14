public class W13_03__Array_countoddeven {
    public static void main(String[] args) {

        int [] number = {5,9,6,3,24,22,45,27,98,26,36,31,21,14,11,231};
        int countodd = 0;
        int countEven = 0;

        for (int i = 0; i < number.length ; i++) {

            if (number[i]% 2== 0 ) {
               System.out.println("  number  "+number[i]+"  is odd"); 
               countodd++;
               
            }else {
                System.out.println("  number  "+number[i]+ " is even");
               countEven++;
               
            }


        }
        System.out.println("\namount of all number : "+number.length);
             System.out.println("\namount of odd number : "+countodd);
              System.out.println("\namount of Even number : "+countEven);
              System.out.println(number.length+countodd+countEven);
              
    }
}