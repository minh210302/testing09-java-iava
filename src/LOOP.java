import java.util.Scanner;

public class LOOP {
    public static void main(String[] args) {
//-------------------------------------------------------------------------------------------------------------
//  BÀI 1: TÍNH TỔNG CÁC SỐ TỪ 1 ĐẾN 100
//-------------------------------------------------------------------------------------------------------------

//      Input: Nhập số n để tính tổng từ 1 -> n
//      Output: Tổng các số từ 1 -> n
//      Process:
//        - Dùng for để xử lý
//          for (<điều kiện bắt đầu loop>; <điều kiện đi vào loop>; <điều kiện để dừng vòng lập>){
//              <code ở đây>
//          }
//              + Điều kiện bắt đầu vòng lặp: iterator = 1
//              + Điều kiện đi vào loop: iterator <= n thì đi vào vòng lặp
//              + Logic để dừng vòng lặp: iterator = iterator + 1

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);



//-------------------------------------------------------------------------------------------------------------
//  BÀI 2: TÍNH TỔNG CÁC SỐ CHẴN TỪ 1 ĐẾN 100
//-------------------------------------------------------------------------------------------------------------

//  Cách 1:
//      - Điều kiện bắt đầu vòng lặp: iterator = 1
//      - Điều kiện đi vào loop: iterator <= n thì đi vào vòng lặp
//      - Logic để dừng vòng lặp: iterator = iterator + 1

        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum1 = sum1 + i; // sum1 += i;
            }
        }
        System.out.println("Tong so chan la: " + sum1);

//  Cách 2:
//      - Điều kiện bắt đầu vòng lặp: iterator = 2
//      - Điều kiện đi vào loop: iterator <= n thì đi vào vòng lặp
//      - Logic để dừng vòng lặp: iterator = iterator + 2 hoac iterator += 2


//-------------------------------------------------------------------------------------------------------------
//  BÀI 3: IN BẢNG CỬU CHƯƠNG
//-------------------------------------------------------------------------------------------------------------

//      Input: Nhập n với n là bảng cửu chương thứ n (vd bảng cửu chương 5)
//      Output: In ra bảng cửu chương thứ n
//      Process:
//        - for
//        - Điều kiện bắt đầu vòng lặp: iterator = 1
//        - Điều kiện đi vào loop: iterator <= 10 thì đi vào vòng lặp
//        - Logic để dừng vòng lặp: iterator = iterator++

        System.out.print("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Bang cuu chuong " + n + "la:");
        for  (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }



    }
}
