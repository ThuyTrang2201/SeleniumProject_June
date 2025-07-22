package day5_2;

public class Application {
    public static void main(String[] args)
    {
        Giaovien gv = new Giaovien();
        gv.setDiaChi("Hà Nội");
        gv.setSoCCCD(123456789);
        gv.setTen("Nguyễn Hồng Hạnh");
        gv.setTuoi(25);
        gv.chuyenMon = "Thạc sĩ Toán";
        gv.maGV = "GV01";
        gv.printInfo();
        gv.diChoi();
        gv.diDay();
        System.out.println("====================================");

        Sinhvien sv = new Sinhvien();
        sv.setDiaChi("Thái Nguyên");
        sv.setSoCCCD(769875463);
        sv.setTen("Lê Thị Tuyết Mai");
        sv.setTuoi(22);
        sv.GPA = 4.8;
        sv.maSV = "SV01";
        sv.soTinChi = 130;
        sv.printInfo();
        sv.diChoi();
        sv.diThi();

    }
}
