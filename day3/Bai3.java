package day3;
import java.util.Scanner;
public class Bai3 {
    // Tìm giá trị nhỏ nhất của mảng số nguyên nhập vào từ bàn phím
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng số nguyên:");
        int n = scanner.nextInt();
        int[] mang1 = new int[n];
        System.out.println("Nhập các giá trị của mảng số nguyên:");
        for (int i = 0; i < n; i++) {
            mang1[i] = scanner.nextInt();
        }
        int min = mang1[0];
        for (int i = 1; i < n; i++) {
            if (mang1[i] < min) {
                min = mang1[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
        // Tìm giá trị lớn nhất của mảng số thập phân nhập vào từ bàn phím

        System.out.println("Nhập số phần tử của mảng số thập phân: ");
        int m = scanner.nextInt();
        double[] mang2 = new double[m];
        System.out.println("Nhập các phần tử của mảng số thập phân:");
        for (int i = 0; i < m; i++) {
            mang2[i] = scanner.nextDouble();
        }
        double max = mang2[0];
        for (int i = 1; i < m; i++) {
            if (mang2[i] > max) {
                max = mang2[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng số thập phân là: " + max);
    }
}

