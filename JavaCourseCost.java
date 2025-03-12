import java.util.Scanner;

class JavaCourseCost {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter the number of weeks Saniya will attend classes: ");
        int weeks = scan.nextInt();

        System.out.print("Enter the cost of classes per week (in coins): ");
        int costPerWeek = scan.nextInt();

        int totalCost = weeks * costPerWeek;

        System.out.println("The total amount Saniya has to pay: " + totalCost + " Coins");

    }
}

Output

D:\Software_Testing\src>javac JavaCourseCost.java

D:\Software_Testing\src>java JavaCourseCost
Enter the number of weeks Saniya will attend classes: 2
Enter the cost of classes per week (in coins): 20
The total amount Saniya has to pay: 40 Coins

D:\Software_Testing\src>
