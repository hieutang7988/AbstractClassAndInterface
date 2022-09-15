package shape;

import resizeable.Resizeable;

public class Square extends Shape implements Resizeable {
    private double edge = 1.0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(double edge, String color, boolean filled) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge * this.edge;
    }

    public double getPerimeter() {
        return 4 * this.edge;
    }

    @Override
    public String toString() {
        return "A Square with edge="
                + getEdge()
                + ", which is a subclass of "
                + super.toString()
                + ", has area is: "
                + (double) Math.round(getArea() * 100) / 100;
    }

    @Override
    public void resize(double percent) {
        edge += percent * edge;
    }
}
