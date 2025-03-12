class Pattern8 {
public static void main(String[] args) {
int n = 5;
for (int i=1; i<=n; i++) {
for (int j=1; j<=n; j++) { 
if (i==j) {
System.out.print(i + " "); 
} else {
System.out.print("0 "); 
}
}
System.out.println();
}
}
}

Output


D:\Software_Testing\src\Pattern>javac Pattern8.java

D:\Software_Testing\src\Pattern>java Pattern8
1 0 0 0 0
0 2 0 0 0
0 0 3 0 0
0 0 0 4 0
0 0 0 0 5
