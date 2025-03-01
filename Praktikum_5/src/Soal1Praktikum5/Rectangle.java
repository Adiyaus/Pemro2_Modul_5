package Soal1Praktikum5;

public class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public String toString() {
        return super.toString() + " of width " + width + " and length " + length;
    }
}
