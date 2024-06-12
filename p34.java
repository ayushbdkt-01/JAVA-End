// Method overriding (Runtime Polymorphism), Abstract class and Abstract
// method, Inheritance, interfaces:
// Write a java program to calculate the area of a rectangle, a square and a circle.
// Create an abstract class 'Shape' with three abstract methods namely
// rectangleArea() taking two parameters, squareArea() and circleArea() taking
// one parameter each.
// Now create another class ‘Area’ containing all the three methods
// rectangleArea(), squareArea() and circleArea() for printing the area of
// rectangle, square and circle respectively. Create an object of class Area and call
// all the three methods.
// (Use Runtime Polymorphism)




// Define the abstract class with abstract methods
abstract class Shape {
    abstract double rectangleArea(double length, double width);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

// Implement the concrete class that extends the abstract class
class Area extends Shape {
    @Override
    double rectangleArea(double length, double width) {
        return length * width;
    }

    @Override
    double squareArea(double side) {
        return side * side;
    }

    @Override
    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

// Main class to test the implementation
public class p34 {
    public static void main(String[] args) {
        // Create an object of the Area class
        Shape shape = new Area();

        // Call all three methods
        double rectangleArea = shape.rectangleArea(5, 3);
        double squareArea = shape.squareArea(4);
        double circleArea = shape.circleArea(2.5);

        // Print the results
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the square: " + squareArea);
        System.out.println("Area of the circle: " + circleArea);
    }
}
