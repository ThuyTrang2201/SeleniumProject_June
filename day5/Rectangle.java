package day5;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw rectangle by 4 lines with " + super.getColor());
    }
}
