package day4;

public class Motobike {
    String hangXe;
    String mauXe;
    String bienSo;
    String ngayDangky;
    public String getInfo(){
        return "hãng xe:" + hangXe + ", mã xe:" + mauXe + ", biển số:" + bienSo + ", ngày đăng ký:" + ngayDangky;
    }
    public static void main(String[] args)
    {
        Motobike vision = new Motobike();
        vision.hangXe= "Honda";
        vision.mauXe= "Black and White";
        vision.bienSo = "30H3 - 123456";
        vision.ngayDangky = "01/01/2000";
        System.out.println(vision.getInfo());

        Motobike lead = new Motobike();
        lead.hangXe= "Honda";
        lead.mauXe= "Yellow";
        lead.bienSo = "30H4 - 09876";
        lead.ngayDangky = "10/2/2000";
        System.out.println(lead.getInfo());
    }

}
