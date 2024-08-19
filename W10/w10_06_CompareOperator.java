package W10;

public class w10_06_CompareOperator {
    public static void main(String[] args) {
        // การเปรียบเทียบ ผลลัพธ์จะได้ True / False
        int a = 10, b = 5;  

        System.out.println(a + " มีค่าเท่ากับ " + b + " หรือไม่ ? " + (a == b));
        System.out.println(a + " มีค่าไม่เท่ากับ " + b + " หรือไม่ ? " + (a != b));
        System.out.println(a + " มีค่าน้อยกว่า " + b + " หรือไม่ ? " + (a < b));
        System.out.println(a + " มีค่ามากกว่า " + b + " หรือไม่ ? " + (a > b));
        System.out.println(a + " มีค่าน้อยกว่าหรือเท่ากับ " + b + " หรือไม่ ? " + (a <= b));
        System.out.println(a + " มีค่ามากกว่าหรือเท่ากับ " + b + " หรือไม่ ? " + (a >= b));
    

    }
}
