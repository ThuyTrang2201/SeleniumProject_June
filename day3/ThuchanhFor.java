package day3;
import java.util.Scanner;
public class ThuchanhFor {
    public static void main(String[] args) {
//        inVaCongSoChan();
        System.out.println("Mảng các số chia hết cho 5 là");
        //inMangChuaSoChiaHetCho5(nhapMang());
        sapXepMangTangDan(nhapMang());

    }

    //    public static void inVaCongSoChan()
    public static int[] nhapMang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int n = sc.nextInt();
        System.out.println("Nhập các giá trị của mảng: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị ở vị trí thứ" + (i + 1));
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static void sapXepMangTangDan(int []a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length - i - 1; j++)
            {
                int tmp;
                if (a[j] > a[j + 1])
                {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        System.out.println("Mảng chứa các số tăng dần là");
        for (int j = 0; j < a.length; j++)
        {
            System.out.print(a[j] + ", ");
        }
    }
}
//        public static void inMangChuaSoChiaHetCho5(int[] input)
//        {
//            String[] output = new String[input.length];
//            for (int i = 0; i < input.length; i++) {
//                if (input[i] % 5 == 0)
//                {
//                    output[i] = String.valueOf(input[i]);
//                } else
//                    output[i] = "";
//            }
//            System.out.println("Mảng các số chia hết cho 5 là");
//            for (int j = 0; j < output.length; j++)
//            {
//                System.out.print(output[j] + ", ");
//                //System.out.println("Số chia hết cho 5: " + a[i]);
//            }
//        }
//    }