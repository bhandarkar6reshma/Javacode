import java.util.Scanner;
class AddOfNum {
public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
// Taking first value from user
System.out.print("Enter the first number:" );
int num1 = scanner.nextInt();
// Taking second value from user 
System.out.print("Enter the second number:" );
int num2 = scanner.nextInt();
// Calculate the sum
int sum = num1 + num2;
System.out.print("The sum of two number is:" + sum);
}
}

Output

D:\Software_Testing\.Notes\Assignments>javac AddOfNum.java

D:\Software_Testing\.Notes\Assignments>java AddOfNum
Enter the first number:94
Enter the second number:83
The sum of two number is:177
D:\Software_Testing\.Notes\Assignments>
