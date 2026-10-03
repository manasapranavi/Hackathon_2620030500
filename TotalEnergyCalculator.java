import java.util.Scanner;

public class TotalEnergyCalculator {

    
    public double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning energy generated (kWh): ");
        double morning = sc.nextDouble();

        System.out.print("Enter evening energy generated (kWh): ");
        double evening = sc.nextDouble();

        // Create an object of TotalEnergyCalculator to call non-static method
        TotalEnergyCalculator calculator = new TotalEnergyCalculator();
        double totalEnergy = calculator.calculateTotalEnergy(morning, evening);

        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        sc.close();
    }
}