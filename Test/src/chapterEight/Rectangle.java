package chapterEight;

public class Rectangle {
    private static float length = 1;
    private static float width = 1;

    public Rectangle(int length, int width) {
        Rectangle.width = width;
        Rectangle.length = length;
    }

    public static float getLength() {
        return length;
    }

    public static void setLength(float length) {
        if(length > 0.0 && length <= 20.0){
            Rectangle.length = length;
        }
    }

    public static float getWidth() {
        return width;
    }

    public static void setWidth(float width) {
        if(width > 0.0 && width <= 20.0){
            Rectangle.width = width;
        }
    }

    public static float calculatePerimeter(float length, float width) {
        float perimeter = 2 * length + 2 * width;
        return perimeter;
    }

    public static float calculateArea(float length, float width) {
        float area = length * width;
        return area;
    }
}
