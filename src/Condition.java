import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



//------------------------------------------------------------------------------------------------------------
//      Bài 1: NHẬP SỐ NGUYÊN TỪ BÀN PHÍM. KIỂM TRA ĐÓ LÀ SỐ CHẴN HAY SỐ LẺ
//------------------------------------------------------------------------------------------------------------

//      Input: Số nguyên nhập từ bàn phím => Scanner
//      Output: Số đó là số ... (chẵn hoặc lẻ)
//      Process:
//          => Dùng if-else để xử lý
//              + Số chẵn là số chia hết cho 2 => (number1 % 2 == 0)
//              + Số lẻ là số không chia hết cho 2 => (number1 % 2 != 0) hoặc (number1 % 2 == 1)

//        System.out.print("Nhap so nguyen: ");
//        int number1 = scanner.nextInt();

//        if (number1 % 2 == 0 ) {
//            System.out.println("So "+ number1 + " la so chan");
//        } else {
//            System.out.println("So "+ number1 + " la so le");
//        }


//------------------------------------------------------------------------------------------------------------
//      BÀI 2: NHẬP SỐ NGUYÊN TỪ BÀN PHÍM. KIỂM TRA SỐ ĐÓ LÀ SỐ NGUYÊN DƯƠNG, NGUYÊN ÂM HAY SỐ 0
//------------------------------------------------------------------------------------------------------------

//      Input: Số nguyên nhập từ bàn phím => Scanner
//      Output: Số đó là số ... (dương hoặc âm hoặc số 0)
//      Process:
//          - if - else if - else if => correct
//          - if - if - if => correct
//                + Số nguyên dương > 0
//                + Số nguyên âm < 0
//                + Số 0 == 0

//        System.out.print("Nhap so nguyen: ");
//        int number1 = scanner.nextInt();

//  Cách 1:
//        if (number1 > 0) {
//            System.out.println("So " + number1 + " la so nguyen duong");
//        } else if (number1 < 0) {
//            System.out.println("So " + number1 + " la so nguyen am");
//        } else {
//            System.out.println("So " + number1 + " la so 0");
//        }

//  Cách 2:
//        if (number1 > 0) {
//            System.out.println("So " + number1 + " la so nguyen duong");
//        }
//        if (number1 < 0) {
//            System.out.println("So " + number1 + " la so nguyen am");
//        }
//        if (number1 == 0) {
//            System.out.println("So " + number1 + " la so 0");
//        }

//  ====>  LƯU Ý: Nếu if else quá nhiều => dùng switch-case


//------------------------------------------------------------------------------------------------------------
//      BÀI 3: TÌM SỐ MAXIMUM TRONG 3 SỐ
//------------------------------------------------------------------------------------------------------------

//      Input: 3 số nguyên nhập từ bàn phím => Scanner
//      Output: số maximum
//      Process:
//          - Flag (Chọn 1 số làm số maximum - Số đầu tiên)
//          - if số thứ hai > max => gán max = số thứ 2
//          - Tương tự cho số thứ ba

//        System.out.print("Nhap so thu nhat: ");
//        int number2 = scanner.nextInt();
//        System.out.print("Nhap so thu hai: ");
//        int number3 = scanner.nextInt();
//        System.out.print("Nhap so thu ba: ");
//        int number4 = scanner.nextInt();
//
//        int max = number2;
//        if (number3 > max) {
//            max = number3;
//        }
//        if (number4 > max) {
//            max = number4;
//        }
//        System.out.println("So " + max + " la so lon nhat");



//------------------------------------------------------------------------------------------------------------
//      BÀI 4: TÍNH TIỀN TAXI
//------------------------------------------------------------------------------------------------------------

//      Input: Số Km nhập từ bàn phím (float, double) => Scanner
//      Output: Số tiền cước taxi (int)
//      Process:
//       - 1km đầu tiên: 15000 VND
//       - Từ km thứ 2 trở đi: 12000 VND
//       - Tính tiền cước taxi với số km nhập từ bàn phím
//          +Vd1: 3km => 15000 + 2*12000
//          +Vd2: 1.2km => 15000 + 1*12000 (0.2km thứ hai => 1km thứ hai)
//      DEFAULT: Nhập số Km > 0

        System.out.println("Nhap so Km: ");
        float soKm = scanner.nextFloat();
        int tongTien = 0;

//  Trừ 1km đầu tiên, làm tròn lên (ceil) số km còn lại

//  Cách 1: if-else
//      0 < km < 1
//      0 < km && km < 1
//        if (0.0f <= soKm && soKm <= 1.0f) {
//            tongTien = 15000;
//        } else {
//
//            int soKmConLai = (int)Math.ceil(soKm - 1);
//            tongTien = 15000 + soKmConLai * 12000;
//        }
//        System.out.println("Tien taxi la: " +  tongTien);


//  Cách tính tiền khác:
        if  (soKm > 1) {
            tongTien = 15000 + ((int)Math.ceil(soKm) - 1) * 12000;
            System.out.println("Tien taxi la: " +  tongTien);
        }  else {
            System.out.println("Tien taxi la: " +  15000);
        }






    }
}
