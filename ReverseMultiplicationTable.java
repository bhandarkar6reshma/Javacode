import java.util.Scanner;
class ReverseMultiplicationTable {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to print its multiplication table: ");
int number = scanner.nextInt();
System.out.print("Enter the range for the table: ");
int range = scanner.nextInt();
System.out.println("Multiplication Table for " + number + ":");
for (int i=range; i>=1; i--) {
System.out.println(number + " x " + i + " = " + (number * i));
}
}
}

Output

D:\Software_Testing\src\New Progrom>javac ReverseMultiplicationTable.java

D:\Software_Testing\src\New Progrom>java ReverseMultiplicationTable
Enter a number to print its multiplication table: 13
Enter the range for the table: 10
Multiplication Table for 13:
13 x 10 = 130
13 x 9 = 117
13 x 8 = 104
13 x 7 = 91
13 x 6 = 78
13 x 5 = 65
13 x 4 = 52
13 x 3 = 39
13 x 2 = 26
13 x 1 = 13