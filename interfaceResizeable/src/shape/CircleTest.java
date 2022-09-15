package shape;
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(1.5);
        System.out.println(circle);

        circle = new Circle(5.9,"indigo",false);
        System.out.println(circle );

        circle.setRadius(5.3);
        System.out.println( circle.getRadius() + "\n"+ circle.getArea());
    }
}
