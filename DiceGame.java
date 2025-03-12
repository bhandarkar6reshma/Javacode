import java.util.Scanner;

class DiceGame {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the number Rani got on her dice:");
        int x = scan.nextInt();

        System.out.println("Enter the number Rajesh got on his dice:");
        int y = scan.nextInt();

        if (x + y > 6) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

Output

D:\Software_Testing\src>javac DiceGame.java

D:\Software_Testing\src>java DiceGame
Enter the number Rani got on her dice:
2
Enter the number Rajesh got on his dice:
5
YES

D:\Software_Testing\src>