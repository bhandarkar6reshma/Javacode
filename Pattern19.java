class Pattern19 {
public static void main(String[] args) {
int n = 5; 
for (int i=1; i<=n; i++) { 
for (char ch='A'; ch<'A'+n; ch++) { 
System.out.print(ch); 
}
System.out.println();
}
}
}

Output

D:\Software_Testing\src\Pattern>javac Pattern19.java

D:\Software_Testing\src\Pattern>java Pattern19
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
