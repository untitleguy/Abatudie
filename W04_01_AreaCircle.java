import java.util.Scanner;
public class W04_01_AreaCircle {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // double radius;
    // radius = 10;
System.out.println("insert radius value");
    double radius = sc.nextDouble();

    double area;
    double PI = 3.14159;

    area = PI*radius*radius;

    System.out.println("area of radius equrl to" + radius +" is "+ area);

}

}