import java.util.Scanner;
class Factorial {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = scanner.nextInt();
long factorial = 1;
for (int i=1; i<=n; i++) {
factorial *= i;
}
System.out.println("The factorial of " + n + " is: " + factorial);
}
}

Output


D:\Software_Testing\src\New Progrom>javac Factorial.java

D:\Software_Testing\src\New Progrom>java Factorial
Enter a number: 6
The factorial of 6 is: 720