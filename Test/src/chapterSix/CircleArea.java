package chapterSix;

public class CircleArea {
    private static double radius;

    public static void setRadius(double radius) {
        if(radius > 0)
            CircleArea.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public static double circleArea(double radius) {
        double area = 0.00;
        area = ((22/7) * radius * radius);
        return area;
    }
}
