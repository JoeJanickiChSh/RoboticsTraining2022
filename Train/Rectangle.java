package Train;

public class Rectangle extends Shape implements Sided, Colorable {
    double width, height;
    String color;

    public Rectangle(double w, double h) {
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
        return 4;
    }

    public double getArea() {
        return this.width * this.height;
    }
}
