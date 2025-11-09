
import java.util.Scanner;                    

public class Rectangle {
    double length;   // Length of rectangle
    double width;    // Width of rectangle
    String color;    // Color of rectangle

    // Constructor to initialize rectangle
    Rectangle(double l, double w, String c) {
        length = l;
        width = w;
        color = c;
    }

    // Method to calculate area
    double area() {
        return length * width;
    }

    // Method to check if two rectangles match in area and color
    boolean matches(Rectangle r2) {
        return (this.area() == r2.area()) && (this.color.equalsIgnoreCase(r2.color));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first rectangle
        System.out.println("Enter details for Rectangle 1:");
        System.out.print("Length: ");
        double l1 = sc.nextDouble();
        System.out.print("Width: ");
        double w1 = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Color: ");
        String c1 = sc.nextLine();

        Rectangle r1 = new Rectangle(l1, w1, c1);

        // Input for second rectangle
        System.out.println("\nEnter details for Rectangle 2:");
        System.out.print("Length: ");
        double l2 = sc.nextDouble();
        System.out.print("Width: ");
        double w2 = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Color: ");
        String c2 = sc.nextLine();

        Rectangle r2 = new Rectangle(l2, w2, c2);

        // Compare rectangles
        if (r1.matches(r2)) {
            System.out.println("\nRectangles are matching!");
        } else {
            System.out.println("\nRectangles are not matching.");
        }

    }
}

