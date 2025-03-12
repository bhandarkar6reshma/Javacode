class Pattern1 {
public static void main(String[] args) {
int n = 5;
for (int i=1; i<=n; i++) {
for (int j=1; j<=n; j++) { 
if (i==j) {
System.out.print(i + " "); 
} else {
System.out.print("1 "); 
}
}
System.out.println();
}
}
}

Output


D:\Software_Testing\src\Pattern>javac Pattern1.java

D:\Software_Testing\src\Pattern>java Pattern1
1 1 1 1 1
1 2 1 1 1
1 1 3 1 1
1 1 1 4 1
1 1 1 1 5

D:\Software_Testing\src\Pattern>
