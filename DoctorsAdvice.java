import java.util.Scanner;

class DoctorsAdvice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of water Sonu drank today (in ml):");
        int x = scan.nextInt();

        if (x >= 3000) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

Output

D:\Software_Testing\src>javac DoctorsAdvice.java

D:\Software_Testing\src>java DoctorsAdvice
Enter the amount of water Sonu drank today (in ml):
3046
YES

D:\Software_Testing\src>




