package Lesson7Task1;

public class Circle implements Figure {
 double r;

    @Override
    public double calculatePerimeter() {
        return r * r * Math.PI;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
