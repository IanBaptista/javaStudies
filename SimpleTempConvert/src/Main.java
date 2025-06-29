// Next time i'll try to import the "java.util.Scanner" Class

public class Main {

    public static void main(String[] args) {
        double temperatureCelsius = 12.3; // Even tho we don't use decimals, i think it might be good for study purposes
        double temperatureFahrenheit = (temperatureCelsius * 1.8) + 32; // Cº to Fº formule

        String message = String.format("%.2fCº is %.2f Fº", temperatureCelsius, temperatureFahrenheit);

        System.out.println(message); // used Cº without space on purpose  to check if it affects "%.2f" sintax

        int tempFahrenheitInt = (int) temperatureFahrenheit; // now converting to integer, it's explicit
        System.out.println("The temperature in Integer Fahrenheit is: " + tempFahrenheitInt);
    }
}