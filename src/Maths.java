import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {

        //calculation parts

        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();
        z= Math.sqrt((x * x) + (y*y));
        System.out.println("The hypotenuse is:" +z);

        // always is good to close the scanner

        scanner.close();
    }
}