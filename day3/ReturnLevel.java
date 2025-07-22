package day3;
import java.util.Scanner;
public class ReturnLevel {
    public static void main(String[] args)
    {
        System.out.println("Nhập số tháng:");
        System.out.println(level());
    }
    public static String level()
    {
        Scanner sc = new Scanner(System.in);
        int soThang = sc.nextInt();
        if (0 <soThang && soThang<6)
        {
            return "Fresher";
        }
    else if  (soThang>=6 && soThang<=24)
        return "Junior";
    else
        return "Senior";
    }
}
