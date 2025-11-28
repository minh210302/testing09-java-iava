import java.util.Locale;
import java.util.Scanner;

// win: crt + ?; mac: cmd + ?  -> tao comment ------------------
public class Helloworld {
    public static void main(String[] args) {

//      Println (print and line): in ra ngoài màn hình và xuống dòng
        System.out.println("Hello World");

//      Nối nhiều chuỗi bằng dấu "+"
        System.out.println("Hello " + "Testing09");


//      --------------------------------------1.KHAI BÁO BIẾN -----------------------------------------
//      - Số (số nguyên, số thực)
//      - Chuỗi (String)

//      1.1 ----- Cách khai báo biến: -----

//        <Kieu du lieu> <Ten bien> = <dữ liệu>;

//          https://vnshort.com/V690

//        1.1.1 ----- Kiểu số -----
        int number1 = 10;
        int number2 = 20;

        float number3 = 3.5f;
        double number4 = 7.0f;

//        1.1.2 ----- Kiểu chuỗi -----
        String string1 = "Hello World";
        String string2 = "Testing09";

//        1.1.3 ----- Kiểu True - Flase -----
        boolean bool1 = true;
        boolean bool2 = false;


//      ----------------------------------- 2. NHẬP VÀ XUẤT GIÁ TRỊ: ------------------------------------

//      2.1 ----- Xuất giá trị ra màn hình -----
        System.out.println(number1);

//      + Chuỗi + số => println sẽ tự động convert từ số -> Chuỗi
//      Vd: 10 -> "10"
        System.out.println(string1 + number1);

//      2.2 ----- Nhập giá trị từ bàn phím -----

//      * CÚ PHÁP:
//              Scanner(object) <đối tượng> = tạo đối tượng Scanner

//      * Khai báo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Trường hợp nhập float lỗi

//          2.2.1 ----- Nhập và xuất số nguyên -----
//      System.out.println("Please Enter a number: ");
//      int number6 = scanner.nextInt();
//      System.out.println("So ban nhap la: " +  number6);

//          2.2.2 ----- Nhập và xuất số thực -----
//      System.out.println("Moi ban nhap so thuc: ");
//      float number7 = scanner.nextFloat();
//      System.out.println("So thuc ban nhap la: " + number7);

//          2.2.3 ----- Nhập và xuất chuỗi -----
//       System.out.println("Moi ban nhap chuoi: ");
//       String string9 = scanner.nextLine();
//       System.out.println("Chuoi ban nhap la: " + string9);


//      ------------------ 3. PHÉP TÍNH  +, -, *, / (CHIA LẤY NGUYÊN), % (CHIA LẤY DƯ) ---------------------
//      * Đi chung với biến (variable)

//      ----- 3.1 Dấu + -----
        int number8 = 10;
        int number9 = 20;
        int result = number8 + number9 + 30 + 40;
        System.out.println("Ket qua cong 2 so la: " + result);

//      ----- 3.2 Dấu - -----
        int number10 = 20;
        int number11 = 10;
        int result1 = number10 - number11;
        System.out.println("Ket qua tru 2 so la: " + result1);

//      ----- 3.3 Dấu * -----
        int number12 = 68;
        int number13 = 79;
        int result2 = number12 * number13;
        System.out.println("Ket qua nhan 2 so la: " + result2);

//      ----- 3.4 Dấu / -----
        int number14 = 80;
        int number15 = 7;

//          ----- 3.4.1 Chia lấy nguyên (/) -----
        int result3 = number14 / number15;
        System.out.println("Ket qua chia lay nguyen la: " + result3);

//          ----- 3.4.2 Chia lấy dư (%) -----
        int result4 = number14 % number15;
        System.out.println("Ket qua chia lay du la: " + result4);

//          ----- 3.4.3 Viết gọn (làm màu :V) -----

//      result++ = ++result => result = result + 1;
//      result-- = --result => result = result - 1;
//      result +=2 = result = result + 2;
//      result -=5 = result = result - 5;
        int number16 = 10;
        System.out.println("Before number16: " + number16);
        ++number16; // number16 = number16 + 1
        // number16++; number16 = number16 +1;
        System.out.println("After number16: " + number16);

//          ----- 3.4.4 Khác nhau giữa ++(--) trước hay sau biến -----

//      * numberB = ++numberA => numberB = numberA +1;
        int number17 = ++number16; //cộng trước rồi mới gán cho number17
        System.out.println("number17 = number16 = number16 + 1 = " + number17);

//      * numberB = numberA++ => numberB = numberA and numberA = numberA +1;
        int number18 = number16++;
        //gán cho number17 trước sau đó mới cộng lên (number17 chỉ nhận giá trị trước khi cộng)
        System.out.println("number18 = number16 = " + number18 + " and number16 = number16 + 1 = " + number16);


//      ------------------------------------ 4. TRUE / FALSE-------------------------------------------

//      (>, >=, <, <=, ==, !=)
//      * Phải đi kiềm với keyword if-else
//      * Kết quả của phép so sánh là boolean

        int number19 = 30;
        int number20 = 20;
        boolean check1 = number19 > number20;
        boolean check2 = number19 < number20;
        boolean check3 = number19 == number20;
        boolean check4 = number19 != number20;

        System.out.println("check1(>): " + check1);
        System.out.println("check2(<): " + check2);
        System.out.println("check3(==): " + check3);
        System.out.println("check4(!=): " + check4);
    }
}
