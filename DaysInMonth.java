import java.util.Scanner;
class DaysInMonth {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         System.out.println("Enter a Month");
         int a= scan.nextInt();
         switch(a) {
         case 1,3,5,7,8,10,12:
         System.out.println("It has 31 Days");
         break;
         case 2:
         System.out.println("It has 28 Days");
         break;
         case 4,6,9,11:
         System.out.println("It has 30 Days");
         break;
        }
    }
}

Output

D:\Software_Testing\src>javac DaysInMonth.java

D:\Software_Testing\src>java DaysInMonth
Enter a Month
8
It has 31 Days

D:\Software_Testing\src>
