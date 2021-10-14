public class Area {
    public static void main(String[] args) {
    }

    public static double getArea(double radius) {
        if (radius != 0 | radius > 0) {
            return Math.PI * Math.pow(radius, 2);
        } else
            return 0;
    }

    public static double getArea(int width, int length) {
        if (width !=0 | length != 0 | width > 0 | length > 0) {
            return width * length;
        } else
            return 0;
    }

    public static double getArea(double radius, double height) {
        if (radius != 0 | height !=0 | height > 0 | radius > 0) {
            return 2 * Math.PI * radius * (height + radius);
        } else
            return 0;

    }
}
