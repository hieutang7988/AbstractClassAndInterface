package shape;

public class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width*length;
    }

    public double getPiremeter() {
        return (width + length)*2;
    }

    @Override
    public String toString() {
        return "A rectangle with width="
                + getWidth()
                + "and length="
                + getLength()
                + ", which is a subclass of"
                + super.toString()
                + ", has area is: "
                + (double) Math.round(getArea() * 100) / 100;
    }

    @Override
    public void resize (double percent) {
       width += percent*width;
       length += percent*length;
    }
}
