package day5_2;

public class Giaovien extends Nguoi{
    String maGV;
    String chuyenMon;
    // Phương thức riêng của giáo viên
    public void diDay()
    {
        System.out.println("Giáo viên đi dạy 5 ngày/ tuần.");
    }
    public void printInfo()
    {
        System.out.println(super.getTen() + "," + maGV + "," + chuyenMon + "," + super.getDiaChi() + ","+ super.getTuoi() + " tuổi");
    }
    @Override
    public void diChoi()
    {
        System.out.println("Giáo viên đi chơi vào ngày nghỉ.");
    }

}
