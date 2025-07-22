package day5_3;

public class Application {
    public static void main(String[] args)
    {
        Hinhtron ht = new Hinhtron();
        ht.setTenhinh("Hình tròn");
        ht.banKinh = 5.5;
        System.out.println(ht.getTenhinh() + "có diện tích là: " + ht.tinhDienTich());

        Hinhvuong hv = new Hinhvuong();
        hv.setTenhinh("Hình vuông");
        hv.chieudaicanh = 5.5;
        System.out.println(hv.getTenhinh() + " có diện tích là: " + hv.tinhDienTich());
    }
}
