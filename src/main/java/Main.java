import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%6.2f\n", Area.getArea(10.0));
        System.out.printf("%6.2f\n", Area.getArea(15, 25));
        System.out.printf("%6.2f\n", Area.getArea(12.0, 17.0));
    }
}
