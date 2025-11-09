public class Calculator {
     
    int a, b;

    // --- Constructor Overloading ---
    Calculator() { a = b = 0; }
    Calculator(int x) { a = b = x; }
    Calculator(int x, int y) { a = x; b = y; }

    // --- Method Overloading ---
    int add(int x, int y) { return x + y; }
    double add(double x, double y) { return x + y; }

    public static void main(String[] args) {
        // Constructor overloading demonstration
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(5);
        Calculator c3 = new Calculator(5, 10);

        System.out.println("c1: " + c1.a + ", " + c1.b);
        System.out.println("c2: " + c2.a + ", " + c2.b);
        System.out.println("c3: " + c3.a + ", " + c3.b);

        // Method overloading demonstration
        System.out.println("add(3,4) = " + c3.add(3, 4));       // int version
        System.out.println("add(2.5,3.5) = " + c3.add(2.5, 3.5)); // double version
    }
}


