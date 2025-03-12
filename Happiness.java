import java.util.Scanner;

class Happiness {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Ram's score (M1): ");
        int M1 = scan.nextInt();

        System.out.print("Enter Sham's score (M2): ");
        int M2 = scan.nextInt();

        if (M1 >= 2 * M2) {
        System.out.println("Yes"); // Ram is happy
        } else {
            System.out.println("No"); // Ram is not happy
      }

   }
}

Output

Microsoft Windows [Version 10.0.19045.4598]
(c) Microsoft Corporation. All rights reserved.

D:\Software_Testing\src>javac Happiness.java

D:\Software_Testing\src>java Happiness
Enter Ram's score (M1): 20
Enter Sham's score (M2): 21
No

D:\Software_Testing\src>java Happiness
Enter Ram's score (M1): 20
Enter Sham's score (M2): 9
Yes

D:\Software_Testing\src>


