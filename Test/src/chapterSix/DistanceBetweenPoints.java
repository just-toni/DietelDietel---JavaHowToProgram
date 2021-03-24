package chapterSix;

public class DistanceBetweenPoints {
    private static double first;
    private static double second;
    private static double fourth;
    private static double third;

    public static double calculateDistance(double x1, double x2, double y1, double y2) {
        return (y2 - y1)/ (x2 - x1);
    }

    public static void setFirstCoordinate(double first) {
        if (first > 0)
            DistanceBetweenPoints.first = first;
    }

    public static double getFirstCoordinate() {
        return first;
    }
    public static void setSecondCoordinate(double second) {
        if (second > 0)
            DistanceBetweenPoints.second = second;
    }

    public static double getSecondCoordinate() {
        return second;
    }

    public static void setThirdCoordinate(double third) {
        if (third > 0)
            DistanceBetweenPoints.third = third;
    }

    public static double getThirdCoordinate() {
        return third;
    }

    public static void setFourthCoordinate(double fourth) {
        if (fourth > 0)
            DistanceBetweenPoints.fourth = fourth;
    }

    public static double getFourthCoordinate() {
        return fourth;
    }
}
