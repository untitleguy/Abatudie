public class W03_01_NetPrice {

    public static void main(String[] args) {
        short price = 350;
        byte quantity = 10;
        int totalprice = quantity*price;
        System.out.println(totalprice);
        double discount = totalprice*0.05;
        double netprice = totalprice-discount;

        System.out.println("ราคาทั้งหมด" + totalprice + "บาท");
        System.out.println("ส่วนลด" + discount + "บาท");
        System.out.println("ราคาสุทธิที่ต้องจ่าย" + netprice + "บาท");
    }
    
}