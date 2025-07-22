package day4;

public class Attribute {
    int x = 40;
    public static void main(String[] args){
        Attribute att = new Attribute();
        att.x= 50;
        System.out.println("Giá trị x cuối cùng của x:" + att.x);
    }
}
