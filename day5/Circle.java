package day5;

public class Circle extends Shape {
    @Override
    public void draw() {
       System.out.println("Draw rectangle by 1 round with " + super.getColor());
    }
}
