import java.util.Scanner;
class SumOfAllEvenNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = scanner.nextInt();
int sum = 0;
for (int i=2; i<=n; i+=2) {
sum += i;
}
System.out.println("The sum of all even numbers from 1 to " + n + " is: " + sum);
}
}

Output


D:\Software_Testing\src\New Progrom>javac SumOfAllEvenNumbers.java

D:\Software_Testing\src\New Progrom>java SumOfAllEvenNumbers
Enter a number: 20
The sum of all even numbers from 1 to 20 is: 110
