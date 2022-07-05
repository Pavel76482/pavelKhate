package Lesson7Task1;

public class Triangle implements Figure {
    double a;
    double b;
    double c;
    double p = a + b + c;
    double pp = ((p - a) * (p - b) * (p - c)) * p;
    double s = Math.sqrt(pp);


    @Override
    public double calculatePerimeter() {
        return p;
    }

    @Override
    public double calculateArea() {
        return s;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
