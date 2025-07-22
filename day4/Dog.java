package day4;

public class Dog {
    // Thuộc tính
    String bread;
    String size;
    double age;
    String color;
    // Phương thức trả về tho
    public String getInfo()
    {
        return "Bread is" + bread + ", size is:" + size + ", age is:" + age + ", color is:" + color;
    }
    public static void main(String[] args) {
// Khởi tạo các đối tượng
        Dog beggie = new Dog();
        beggie.bread= "Beggie";
        beggie.size="Big";
        beggie.age=1.5;
        beggie.color= "Brown";
        System.out.println(beggie.getInfo());

        Dog puddle = new Dog();
        puddle.bread= "Puddle";
        puddle.size="Small";
        puddle.age =3;
        puddle.color= "Orange";
        System.out.println(puddle.getInfo());

    }
}
