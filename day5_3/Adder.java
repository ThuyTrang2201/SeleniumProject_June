package day5_3;

public class Adder {

    public static int Add(int a, int b)
    {
        return a+b;
    }
    public static double Add (double a, double b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        System.out.println(Add(8,10));
        System.out.println(Add(6.5, 8.5));
    }
}
