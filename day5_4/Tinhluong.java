package day5_4;

public class Tinhluong {
    public double tinhLuong(int luongCoban, double heSoluong, double soNamKN, int loaibs)
    {
        switch (loaibs) {
            case 1: {
                return luongCoban * heSoluong * soNamKN + luongCoban * 0.2;
            }
            case 2: {
                return luongCoban * heSoluong * soNamKN + luongCoban * 0.45;
            }
            default: {
                System.out.println("loại bs không hợp lệ!");
                return luongCoban;
            }
        }
    }
}
