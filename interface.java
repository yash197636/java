// Define an interface
interface Shape {
    // Abstract method (no body)
    double area();
    double perimeter();
}

// Class implementing the interface
class Rectangle implements Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing area() method
    public double area() {
        return length * width;
    }

    // Implementing perimeter() method
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Main class
class InterfaceExample {
    public static void main(String[] args) {
        // Create object of Rectangle
        Rectangle rect = new Rectangle(5.0, 3.0);

        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}
