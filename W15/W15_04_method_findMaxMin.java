package W15;

public class W15_04_method_findMaxMin {
    
    // 1) Method สำหรับหาค่ามากที่สุด
static int findMax(int a ,int b){

        if(a > b){
            return a;
        }else{
            return b;}
        
     }

    // 2) Method สำหรับหาค่าน้อยที่สุด
static int findMin(int a ,int b){

        if(a < b){
            return a;
        }else{
            return b;}
        
     }

    // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
static int findMaxbut3int(int a,int b,int c){

    int max = 0;
    if (a > max){
        max = a;
    }
    if (b > max){
        max = b;
    }
if (c > max){
        max = c;
    }

    return max;


}

    // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
    static int findMininarray(int[] numbers){
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }


    // 5) Method สำหรับแสดงค่าใน array ทั้งหมด
    static void showarrayasstring(int[] numbers){
        System.out.println(java.util.Arrays.toString(numbers));
    }




    public static void main(String[] args) {
        // 1) Method สำหรับหาค่ามากที่สุด
        System.out.println("Maxinium number is" + findMax(66, 99));

        // 2) Method สำหรับหาค่าน้อยที่สุด
        System.out.println("Mininium number is" + findMin(66, 99));

        // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
        System.out.println("Maxinium number from 3 int is" + findMaxbut3int(1000, 111, 1));
        

        // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
       int[] numbers = {146650, 4564620, 3546340 ,430 ,52570};
       showarrayasstring(numbers);
       System.out.println("Min number in array is : " + findMininarray(numbers));

      

    }
}

// method ที่มีชื่อเดียวกัน แต่มีพารามิเตอร์ต่างกันได้ เรียกว่า Method Overloading
// การเรียกใช้ method ที่มีชื่อเดียวกัน จะขึ้นอยู่กับพารามิเตอร์ที่ส่งเข้าไป
// ถ้ามี method ที่มีชื่อเดียวกัน และมีพารามิเตอร์ต่างกัน จะต้องมีการส่งพารามิเตอร์ตามที่ method ต้องการ
