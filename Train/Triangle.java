package RoboticsTraining2022.Train;

public class Triangle extends Shape implements Sided, Colorable {
    double width, height;
    String color;

    public Triangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public int getSides() {
        return 3;
    }

    public double getArea() {
        return (this.width * this.height) / 2.;
    }
}
