import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();

        ArrayList<Integer> number =  new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            number.add(sc.nextInt());
        }

//        for (int item: number) {
//            System.out.print(item + " ");
//        }

// --------------------------------------------------------------------------------------------------------------
//      BÀI 1: TÌM SỐ LẦN XUẤT HIỆN PHẦN TỬ BẤT KÌ TRONG MẢNG
// --------------------------------------------------------------------------------------------------------------

//      Input:
//        - n: Số lượng phần tử của mảng
//        - Arraylist
//        - number: tìm số xuất hiện <number> trong mảng
//      Output: số lần xuất hiện của number
//      Process:
//         - count = 0 => đếm số lần xuất hiện của number
//         - Duyệt mảng:
//              + Nếu phần tử thứ i == number => count++
//              + if count == 0 => không có phần tử number trong mảng
//              + else => in ra số lần xuất hiện phần tử number

        int count = 0;
        System.out.print("Nhap phan tu can dem: ");
        int num = sc.nextInt();

        for (int item :  number) {
            if (item == num) count++;
        }

        if (count == 0) {
            System.out.println("Khong co phan tu " + num + " trong mang");
        } else System.out.println("Co " + count + " phan tu " + num + " trong mang");


// --------------------------------------------------------------------------------------------------------------
//      BÀI 2: TÌM MAX VÀ MIN TRONG MẢNG
// --------------------------------------------------------------------------------------------------------------

        int max = Collections.max(number);
        int min = Collections.min(number);


// --------------------------------------------------------------------------------------------------------------
//      BÀI 3: SẮP XẾP TĂNG DẦN, GIẢM DẦN
// --------------------------------------------------------------------------------------------------------------

        Collections.sort(number); //Tăng dần
        Collections.sort(number, Collections.reverseOrder()); //Giảm dần


        Collections.reverse(number); //Đảo ngược mảng


//  Remove phần tử trong Array
//      - Remove theo index
//        Lưu ý: index <= số lượng phần tử của mảng
        number.remove(1);

//      - Remove theo value
        number.remove(Integer.valueOf(2));




    }
}
