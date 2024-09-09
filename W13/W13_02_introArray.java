package W13;

import java.util.Scanner;

public class W13_02_introArray {
    public static void main(String[] args) {
        String [] brandCars = new String[3];

        Scanner kb = new Scanner(System.in);

        brandCars[0] = "Toyota";
        brandCars[1] = "Honda";
        brandCars[2] = "Nissan";

        System.out.println("Defualt Brand of cars in the array are : ");
        for (int i = 0; i<brandCars.length ; i++) {
            System.out.print(brandCars[i] + "/");
        }

        System.out.println("\n Please enter the brand of the 3rd car :");
        for (int i = 0; i < brandCars.length; i++) {
            System.out.print("\nEnter the brand of the car" + (i+1) + ": ");
            brandCars[i] = kb.next();
        }

        System.out.println("\nNew Brand of cars in the array are : ");
        for (int i = 0; i < brandCars.length; i++) {
            System.out.print(brandCars[i] + "/");
        }
        

        brandCars[1] = "Mazda";
        System.out.println("\nBrand of cars in the array are : ");
        for (int i = 0; i < brandCars.length; i++) {
            System.out.print(brandCars[i] + "/");
        }
        brandCars[1] = "BMW";
        System.out.println("\nBrand of cars in the array are : ");
        for (String car : brandCars) {
            System.out.print(car + "/");
        }
    }
}