import java.util.Scanner;
class SumOfNaturalNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = scanner.nextInt();
int sum = 0;
for (int i=1; i<=n; i++) {
sum += i;
}
System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);
}
}


Output

D:\Software_Testing\src\New Progrom>javac SumOfNaturalNumbers.java

D:\Software_Testing\src\New Progrom>java SumOfNaturalNumbers
Enter a number: 20
The sum of natural numbers from 1 to 20 is: 210