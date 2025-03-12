import java.util.Scanner;
class SumOfAllOddNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = scanner.nextInt();
int sum = 0;
for (int i=1; i<=n; i+=2) {
sum += i;
}
System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);
}
}


Output


D:\Software_Testing\src\New Progrom>javac SumOfAllOddNumbers.java

D:\Software_Testing\src\New Progrom>java SumOfAllOddNumbers
Enter a number: 10
The sum of all odd numbers from 1 to 10 is: 25