import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Principal Amount: ");
        double principal = scan.nextDouble();

        System.out.println("Enter Annual Interest Rate (%): ");
        double rate = scan.nextDouble();

        System.out.println("Enter Time Period (Years): ");
        double time = scan.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.printf("Simple Interest: %.3f\n", simpleInterest);

    }
}

Output

D:\Software_Testing\src>javac SimpleInterestCalculator.java

D:\Software_Testing\src>java SimpleInterestCalculator
Enter Principal Amount:
100000
Enter Annual Interest Rate (%):
7
Enter Time Period (Years):
2
Simple Interest: 14000.000