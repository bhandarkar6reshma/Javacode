import java.util.Scanner;
class NaturalNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = scanner.nextInt();
System.out.println("Natural numbers from 1 to " + n + ":");
for (int i=1; i<=n; i++) {
System.out.print(i + " ");
}
}
}


Output

D:\Software_Testing\src\New Progrom>javac NaturalNumbers.java

D:\Software_Testing\src\New Progrom>java NaturalNumbers
Enter a number: 10
Natural numbers from 1 to 10:
1 2 3 4 5 6 7 8 9 10
D:\Software_Testing\src\New Progrom>
