package day5_4;

public class Application {
    public static void main( String[] args)
    {
        Tinhluong luong = new Tinhluong();
        System.out.println(String.format("%.1f",luong.tinhLuong(10000000, 2,1.5,1)));
    }
}
