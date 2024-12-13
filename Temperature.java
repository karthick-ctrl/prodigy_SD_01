import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        int temp = get.nextInt(); 
        get.nextLine(); 

        System.out.println("Enter the unit of temperature (Celsius/Fahrenheit/K): ");
        String type = get.nextLine();

        if (type.equalsIgnoreCase("Celsius")) {
            double f = (temp * 1.8) + 32;
            System.out.println("Fahrenheit: " + f);
            double k = temp + 273.15;
            System.out.println("Kelvin: " + k);
        } else if (type.equalsIgnoreCase("Fahrenheit")) {
            double c = (temp - 32) / 1.8;
            System.out.println("Celsius: " + c);
            double k = c + 273.15;
            System.out.println("Kelvin: " + k);
        } else if (type.equalsIgnoreCase("K")) {
            double c = temp - 273.15;
            System.out.println("Celsius: " + c);
            double f = (c * 1.8) + 32;
            System.out.println("Fahrenheit: " + f);
        } else {
            System.out.println("Invalid unit entered. Please use Celsius, Fahrenheit, or K.");
        }

        get.close(); 
    }
}
