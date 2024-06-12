// 



// Define the abstract class with abstract methods
abstract class Temperature {
    double temp;

    void setTempData(double temp) {
        this.temp = temp;
    }

    abstract void changeTemp();
}

// Implement the Fahrenheit class that extends Temperature
class Fahrenheit extends Temperature {
    double ctemp;

    @Override
    void changeTemp() {
        ctemp = 5.0 / 9.0 * (temp - 32);
        System.out.println("Converted temperature in Celsius: " + ctemp);
    }
}

// Implement the Celsius class that extends Temperature
class Celsius extends Temperature {
    double ftemp;

    @Override
    void changeTemp() {
        ftemp = 9.0 / 5.0 * temp + 32;
        System.out.println("Converted temperature in Fahrenheit: " + ftemp);
    }
}

// Main class to test the implementation
public class p35 {
    public static void main(String[] args) {
        // Create an object of the Fahrenheit class and convert temperature
        Temperature fahrenheitTemp = new Fahrenheit();
        fahrenheitTemp.setTempData(98.6);  // Setting Fahrenheit temperature
        fahrenheitTemp.changeTemp();       // Converting to Celsius

        // Create an object of the Celsius class and convert temperature
        Temperature celsiusTemp = new Celsius();
        celsiusTemp.setTempData(37);       // Setting Celsius temperature
        celsiusTemp.changeTemp();          // Converting to Fahrenheit
    }
}
