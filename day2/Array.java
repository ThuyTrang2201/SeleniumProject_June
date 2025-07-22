package day2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scan.nextInt();
            sum += array[i];
        }

        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }
}
