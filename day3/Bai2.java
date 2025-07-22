package day3;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        nhapMang();
    }
    public static int[] nhapMang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng là:");
        int mang = sc.nextInt();
        System.out.println("Nhập các giá trị của mảng");
        int[] a = new int[mang];
        for (int i = 0; i < mang; i++) {
            System.out.println("Nhập giá trị ở vị trí thứ " + (i + 1));
            a[i] = sc.nextInt();
            if (a[i]%2==0 && a[i]%3==0) {
                System.out.println("Số thỏa mãn");
                return a;
            }
        }
        System.out.println("Không tìm thấy số thỏa mãn");
        return a;
    }
}