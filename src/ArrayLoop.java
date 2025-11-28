import java.util.Scanner;

public class ArrayLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      Nhập số lượng phần tử của mảng
//      Array chứa phần tử

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] listInt = new int[n];

//      Nhập số nguyên vào trong listInt

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu "  + (i + 1) + ": ");
            // listInt[i]: Phần tử thứ i trong Array
            listInt[i] = scanner.nextInt(); // Nhập số nguyên từ bàn phím và gán vào phần tử thứ i của array
        }

//      Xuất list Interger
//        for (int i = 0; i < n; i++) {
//            System.out.print(listInt[i] + " ");
//        }

// --------------------------------------------------------------------------------------------------------------
//      BÀI 1: TÍNH TỔNG CÁC SỐ PHẦN TỬ TRONG MẢNG
// --------------------------------------------------------------------------------------------------------------

//      Input:
//        - Số lượng phần tử trong mảng: int n
//        - Array: int[] array = new int[];
//      Output:
//      Process:
//        - Tạo sum = 0;
//        - For để nhập phần tử

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += listInt[i];
        }

        System.out.println("Tong cua mang la: " + sum);


// --------------------------------------------------------------------------------------------------------------
//      BÀI 2: TÌM SỐ MAX VÀ MIN TRONG MẢNG
// --------------------------------------------------------------------------------------------------------------

        int max = 0;
        int min = listInt[0];

        for (int i = 1; i < n; i++) {
            if (listInt[i] > max) max =  listInt[i];
            if (listInt[i] < min) min =  listInt[i];
        }

        System.out.println("Max cua mang: " + max);
        System.out.println("Min cua mang: " + min);



// --------------------------------------------------------------------------------------------------------------
//      BÀI 3: ĐẾM SỐ LƯỢNG CHẴN LẺ TRONG MẢNG
// --------------------------------------------------------------------------------------------------------------

        int countChan = 0;
        int countLe = 0;

//    for cải tiến
//      for (int <item> : <array>)
        for (int item : listInt) {
            if (item % 2 == 0) countChan++;
                else countLe++;
        }

        System.out.println("So luong chan trong mang: " + countChan);
        System.out.println("So luong le chan trong mang: " + countLe);
    }



}
