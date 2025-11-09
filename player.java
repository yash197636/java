// Program to demonstrate Inheritance using Player class
// Superclass: Player
// Subclasses: CricketPlayer, FootballPlayer, HockeyPlayer

// --- Base Class ---
class Player {
    String name;
    int age;

    // Constructor
    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display player information
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// --- Subclass 1: Cricket Player ---
class CricketPlayer extends Player {
    String role; // e.g., Batsman, Bowler

    // Constructor
    CricketPlayer(String name, int age, String role) {
        super(name, age); // calling parent constructor
        this.role = role;
    }

    // Override display() method
    void display() {
        super.display();
        System.out.println("Sport: Cricket");
        System.out.println("Role: " + role);
        System.out.println("----------------------");
    }
}

// --- Subclass 2: Football Player ---
class FootballPlayer extends Player {
    String position; // e.g., Forward, Goalkeeper

    // Constructor
    FootballPlayer(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    // Override display() method
    void display() {
        super.display();
        System.out.println("Sport: Football");
        System.out.println("Position: " + position);
        System.out.println("----------------------");
    }
}

// --- Subclass 3: Hockey Player ---
class HockeyPlayer extends Player {
    String team; // team name

    // Constructor
    HockeyPlayer(String name, int age, String team) {
        super(name, age);
        this.team = team;
    }

    // Override display() method
    void display() {
        super.display();
        System.out.println("Sport: Hockey");
        System.out.println("Team: " + team);
        System.out.println("----------------------");
    }
}

// --- Main class to test inheritance ---
 class Main {
    public static void main(String[] args) {
        // Create objects of different player types
        CricketPlayer c = new CricketPlayer("Virat Kohli", 35, "Batsman");
        FootballPlayer f = new FootballPlayer("Lionel Messi", 37, "Forward");
        HockeyPlayer h = new HockeyPlayer("Manpreet Singh", 33, "India");

        // Display player details
        c.display();
        f.display();
        h.display();
    }
}
