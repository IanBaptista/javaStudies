import java.util.Scanner;

public class SameButWithInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates the Scanner

        System.out.print("Type temp in Celsius: ");
        double temperatureEmCelsius = scanner.nextDouble(); // It reads the value

        double temperatureEmFahrenheit = (temperatureEmCelsius * 1.8) + 32;

        String message = String.format("%.1f Cº is %.1f Fº",
                temperatureEmCelsius, temperatureEmFahrenheit);

        System.out.println(message);

        int temperatureEmFahrenheitInteira = (int) temperatureEmFahrenheit;
        System.out.println("Temperature in Integer Fº is: " + temperatureEmFahrenheitInteira);

        scanner.close(); // closes scanner (they said it's a good practice)
    }
}
