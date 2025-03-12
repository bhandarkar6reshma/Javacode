import java.util.Scanner;
class MultiplicationTable {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to print its multiplication table: ");
int number = scanner.nextInt();
System.out.print("Enter the range for the table: ");
int range = scanner.nextInt();
System.out.println("Multiplication Table for " + number + ":");
for (int i=1; i<=range; i++) {
System.out.println(number + " x " + i + " = " + (number * i));
}
}
}

Output


D:\Software_Testing\src\New Progrom>javac MultiplicationTable.java

D:\Software_Testing\src\New Progrom>java MultiplicationTable
Enter a number to print its multiplication table: 9
Enter the range for the table: 20
Multiplication Table for 9:
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
9 x 4 = 36
9 x 5 = 45
9 x 6 = 54
9 x 7 = 63
9 x 8 = 72
9 x 9 = 81
9 x 10 = 90
9 x 11 = 99
9 x 12 = 108
9 x 13 = 117
9 x 14 = 126
9 x 15 = 135
9 x 16 = 144
9 x 17 = 153
9 x 18 = 162
9 x 19 = 171
9 x 20 = 180