package day5_2;

public class Sinhvien extends Nguoi{
    String maSV;
    double GPA;
    int soTinChi;

    public void diThi()
    {
        System.out.println("Sinh viên đi thi giữa kỳ và cuối kỳ.");
    }
    public void printInfo()
    {
        System.out.println(super.getTen() + "," + maSV + "," + GPA + "," + super.getDiaChi() + "," + super.getTuoi() + " tuổi," + soTinChi);
    }
    @Override
    public void diChoi()
    {
        System.out.println("Sinh viên thích thì đi chơi!");
    }
}
