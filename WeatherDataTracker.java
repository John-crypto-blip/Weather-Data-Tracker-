// John Renzel M. Fangon
// CC2
// CITCS 1B
    import java.util.Scanner;

public class WeatherDataTracker {
    
    public static void main(String[] args) {
        
        // Create a 2D array to store temperatures for 3 cities over 7 days
        double[][] temperatures = new double[3][7];

        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Collect temperature data for 3 cities over 7 days
        for (int city = 0; city < 3; city++) {
            System.out.println("Enter temperatures for City " + (city + 1) + " over 7 days:");
            for (int day = 0; day < 7; day++) {
                System.out.print("Day " + (day + 1) + ": ");
                temperatures[city][day] = scanner.nextDouble();
            }
        }

        // Calculate and print the average temperature and highest temperature for each city
        for (int city = 0; city < 3; city++) {
            double totalTemperature = 0.0;
            double highestTemperature = temperatures[city][0];

            // Calculate total temperature and find the highest temperature for the city
            for (int day = 0; day < 7; day++) {
                totalTemperature += temperatures[city][day];
                if (temperatures[city][day] > highestTemperature) {
                    highestTemperature = temperatures[city][day];
                }
            }

            // Calculate average temperature for the city
            double averageTemperature = totalTemperature / 7;

            // Output the results for the city
            System.out.println("\nCity " + (city + 1) + ":");
            System.out.printf("Average Temperature: %.2f°C\n", averageTemperature);
            System.out.printf("Highest Temperature: %.2f°C\n", highestTemperature);
        }

        // Close the scanner
        scanner.close();
    }
}
