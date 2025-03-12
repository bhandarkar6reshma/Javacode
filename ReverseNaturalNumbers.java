import java.util.Scanner;
class ReverseNaturalNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = scanner.nextInt();
System.out.println("Natural numbers in reverse from " + n + " to 1:");
for (int i=n; i>=1; i--) {
System.out.print(i + " ");
}
}
}

Output

D:\Software_Testing\src\New Progrom>javac ReverseNaturalNumbers.java

D:\Software_Testing\src\New Progrom>java ReverseNaturalNumbers
Enter a number: 20
Natural numbers in reverse from 20 to 1:
20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
D:\Software_Testing\src\New Progrom>
