import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Width : ");
        double width = scanner.nextDouble();
        System.out.print("Enter the Height : ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your Rectangle :\n" + rectangle.display());
        System.out.println("Area of the rectangle = " + rectangle.getArea());
        System.out.println("Perimater of the rectangle = " + rectangle.getPerimeter());
    }
}
