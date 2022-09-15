package shape;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3 , 10.5);
        System.out.println(rectangle);

        rectangle = new Rectangle("red", true, 5.0,10.0 );
    }
}

