package Lesson7Task1;

public class Square implements Figure {
    double height;
    double weight;

    @Override
    public double calculatePerimeter() {
        return 2 * (height + weight);
    }

    @Override
    public double calculateArea() {
        return height * weight;
    }

    public Square(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Square() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
