import java.util.Comparator;

public class CircleComparator implements Comparator <Circle> {
@Override
    public int compare(Circle x1 , Circle x2) {
    if(x1.getRadius() > x2.getRadius()) return 1;
    else if(x1.getRadius() < x2.getRadius()) return -1;
    else return 0;
}
}
