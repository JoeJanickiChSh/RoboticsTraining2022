package Train;

public class Circle extends Shape {
    double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }
}
