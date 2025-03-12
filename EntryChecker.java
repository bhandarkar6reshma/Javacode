import java.util.Scanner;

public class EntryChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of friends: ");
        int friends = scan.nextInt();

        System.out.print("Enter the number of passes: ");
        int passes = scan.nextInt();

        if (passes >= friends + 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

Output

D:\Software_Testing\src>javac EntryChecker.java

D:\Software_Testing\src>java EntryChecker
Enter the number of friends: 6
Enter the number of passes: 8
YES

D:\Software_Testing\src>java EntryChecker
Enter the number of friends: 5
Enter the number of passes: 5
NO

D:\Software_Testing\src>
