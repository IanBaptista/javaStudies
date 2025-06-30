import java.util.Scanner;

class Finalversion {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Celsius: ");
        var celsius = scanner.nextDouble(); // i was about to use double instead of var, but im trying to get used
        var fahrenheit = celsius * 1.8 + 32;  // the usual formule
        System.out.printf("%.1f Cº is %.1f Fº\n", celsius, fahrenheit); // tried o used \n and just to look cleaner
        System.out.println("Integer: " + (int) fahrenheit + " Fº"); // using Casting when printing was a good try i guess
        scanner.close();
    }
}
