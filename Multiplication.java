import java.util.Scanner;
class Multiplication {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = scanner.nextInt();
System.out.println("Multiplication table of " + num + ":");
for (int a = 1; a <= 10; a++) {
int product = num * a; 
System.out.println(num + " * " + a + " = " + product); 
}
scanner.close(); 
}
}

Output


D:\Software_Testing\.Notes\Assignments>javac Multiplication.java

D:\Software_Testing\.Notes\Assignments>java Multiplication
Enter a number:
26
Multiplication table of 26:
26 * 1 = 26
26 * 2 = 52
26 * 3 = 78
26 * 4 = 104
26 * 5 = 130
26 * 6 = 156
26 * 7 = 182
26 * 8 = 208
26 * 9 = 234
26 * 10 = 260

D:\Software_Testing\.Notes\Assignments>

