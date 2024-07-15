import java.util.Scanner;

public class W05_Test1_674230028 {

    public static void main(String[] args) {
        System.out.println("Name : Theerapat Khongsakunthavorn");
        System.out.println("ID : 674230028");

        ractanglefinder starter = new ractanglefinder();
        starter.areafinder();
    }
}

class ractanglefinder {
    void areafinder() {
        System.out.println("if you want to find area ractangle");
        System.out.println("Type here !");
        Scanner input = new Scanner(System.in);
        System.out.print("Width : ");
        int count1 = input.nextInt();
        System.out.print("Hight : ");
        int count2 = input.nextInt();

        int result = count1 * count2;

        System.out.println(result + "is the area of the rectangle");

    }
}