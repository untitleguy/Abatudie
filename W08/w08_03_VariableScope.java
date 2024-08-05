package W08;

public class w08_03_VariableScope {

    // Static Variable (ตัวแปรระดับคลาสที่เป็น static สามารถเข้าถึงได้โดยตรง)
    static int x = 50;

    // Instance Variables (คล้ายตัวแปรระดับคลาส แต่ต้องสร้าง instance
    // ของคลาสเพื่อเข้าถึง)
    int a = 100;
    int b = 200;

    public static void main(String[] args) {

        System.out.println("x = " + x); // เข้าถึง static variable โดยตรง

        // สร้าง instance ของคลาสเพื่อเข้าถึง instance variables
        w08_03_VariableScope obj = new w08_03_VariableScope();

        // การเข้าถึง instance variables ผ่าน object
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);

        int y = 300; // Local Variable วงจรชีวิตของตัวแปร y จะทำงานเฉพาะใน main method
        System.out.println("y in method" + y);

        if (true) {
            int c = 300; // Local Variable วงจรชีวิตของตัวแปร c จะทำงานเฉพาะในบล็อกนี้เท่านั้น
            System.out.println("y in if"+ y);

        }

        System.out.println("a = " + obj.a);

    }

}
