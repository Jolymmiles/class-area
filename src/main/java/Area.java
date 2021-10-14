public class Area {
    public static void main(String[] args) {
    }

    public static double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double getArea(int width, int length) {
        return width*length;
    }

    public static double getArea(double radius, double height) {
        return 2 * Math.PI * radius * (height + radius);
    }
}
