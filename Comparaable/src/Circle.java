
public class Circle  {
    private double radius ;
    String color;
    boolean filled;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius =radius;
    }

    public Circle(double radius,String color , boolean filled) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    public double getPiremeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getRadius()
                + " , which is a subclass of "
                + super.toString();
    }
}
