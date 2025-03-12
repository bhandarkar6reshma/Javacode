class Pattern9 {
public static void main(String[] args) {
int n=5; 
for (int i=1; i<=n; i++) { 
for (int j=1; j<=n-i; j++) {
System.out.print("  ");
}
for (int j=1; j<=i; j++) {
System.out.print(j + " ");
}
System.out.println(); // Move to the next row
}
}
}

Output

D:\Software_Testing\src\Pattern>javac Pattern9.java

D:\Software_Testing\src\Pattern>java Pattern9
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5