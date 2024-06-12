// 6 Write a java program to create an interface that consists of a method to display
// volume () as an abstract method and redefine this method in the derived 2
// classes to suit their requirements.
// Create classes called Cone, Hemisphere and Cylinder that implements the
// interface. Using these three classes, design a program that will accept
// dimensions of a cone, cylinder and hemisphere interactively and display the
// volumes.
// Volume of cone = (1/3)πr2h Volume of hemisphere = (2/3)πr3Volume of
// cylinder = πr2h





import java.util.Scanner;

// Define the interface with the abstract method
interface Volume {
    void displayVolume();
}

// Implement the Cone class that implements the Volume interface
class Cone implements Volume {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void displayVolume() {
        double volume = (1.0 / 3.0) * Math.PI * radius * radius * height;
        System.out.println("Volume of the cone: " + volume);
    }
}

// Implement the Hemisphere class that implements the Volume interface
class Hemisphere implements Volume {
    private double radius;

    public Hemisphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayVolume() {
        double volume = (2.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Volume of the hemisphere: " + volume);
    }
}

// Implement the Cylinder class that implements the Volume interface
class Cylinder implements Volume {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void displayVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}

// Main class to test the implementation
public class p36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept dimensions for a cone
        System.out.print("Enter the radius of the cone: ");
        double coneRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double coneHeight = scanner.nextDouble();
        Volume cone = new Cone(coneRadius, coneHeight);
        cone.displayVolume();

        // Accept dimensions for a hemisphere
        System.out.print("Enter the radius of the hemisphere: ");
        double hemisphereRadius = scanner.nextDouble();
        Volume hemisphere = new Hemisphere(hemisphereRadius);
        hemisphere.displayVolume();

        // Accept dimensions for a cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double cylinderHeight = scanner.nextDouble();
        Volume cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        cylinder.displayVolume();

        scanner.close();
    }
}
