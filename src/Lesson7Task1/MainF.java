package Lesson7Task1;

public class MainF {
    public static void main(String[] args) {


        Triangle triangle = new Triangle(3.0, 4.2, 5.1);
        double t1 = triangle.calculatePerimeter();
        Circle circle = new Circle(4.2);
        double c1 = circle.calculatePerimeter();
        Square square = new Square(6.1, 7.2);
        double s1 = square.calculatePerimeter();
        Square square1 = new Square(2.2, 3.1);
        double s2 = square1.calculatePerimeter();
        Square square2 = new Square(1.2,2.1);
        double s3 = square2.calculatePerimeter();
        System.out.println(triangle);

        double[] figureArray = {t1, c1, s1, s2, s3};
        double sum = 0;

        for (int i = 0; i < figureArray.length - 1; i++) {
             sum = sum + figureArray[i];
        }
        System.out.println(sum);


    }
}
