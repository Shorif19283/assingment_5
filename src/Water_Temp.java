import java.util.Scanner;
public class Water_Temp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the temperature value: ");
            double temperature = scanner.nextDouble();

            System.out.print("Enter the temperature scale (C or F): ");
            char scale = scanner.next().charAt(0);
            scale = Character.toUpperCase(scale);

            double celsiusTemperature;

            if (scale == 'C') {
                celsiusTemperature = temperature;
            } else if (scale == 'F') {
                celsiusTemperature = (temperature - 32) * 5 / 9;
            } else {
                System.out.println("Invalid temperature scale.");
                return;
            }

            if (celsiusTemperature < 0) {
                System.out.println("Water is solid (ice) at " + celsiusTemperature + "°C.");
            } else if (celsiusTemperature >= 0 && celsiusTemperature < 100) {
                System.out.println("Water is liquid at " + celsiusTemperature + "°C.");
            } else {
                System.out.println("Water is gaseous (steam) at " + celsiusTemperature + "°C.");
            }
        }
}
