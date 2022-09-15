package shape;
public class ResizeableTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes = createShapes(shapes);

        System.out.println("Original shapes array is: ");
        displayShapes(shapes);

        System.out.println("\nResizing shapes array...");
        resizeShapes(shapes);

        System.out.println("\nAfter resizing, shapes array is: ");
        displayShapes(shapes);
    }

    private static Shape[] resizeShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(0.1);
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(0.1);
            } else if (shape instanceof Square) {
                ((Square) shape).resize(0.1);
            }
        }
        return shapes;
    }

    private static void displayShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    private static Shape[] createShapes(Shape[] shapes) {
        shapes[0] = new Circle(2.3);
        shapes[1] = new Rectangle(2.3, 3.4);
        shapes[2] = new Square(3.4);
        return shapes;
    }
}

