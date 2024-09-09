package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {

        int [] kay = {1,3,5,7,9,8,4,6,2,10,15,20,25,30,12,14,16,18,33};

        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < kay.length; i++) {

            if (kay[i] % 2 == 0){

                countEven++;

            }else{
                countOdd++;
            }
        }

        System.out.print("\nAmount of all number : "+ kay.length);
        System.out.print("\nAmount of odd number : "+ countOdd);
        System.out.print("\nAmount of even number : "+ countEven);

    }
}
