class Pattern7 {
public static void main(String[] args) {
int n=5;
for (int i=1; i<=n; i++) { 
for (int j=1; j<=n; j++) { 
if (j<i) {
System.out.print("0"); 
} else {
System.out.print("1"); 
}
}
System.out.println(); 
}
}
}

Output


D:\Software_Testing\src\Pattern>javac Pattern7.java

D:\Software_Testing\src\Pattern>java Pattern7
11111
01111
00111
00011
00001
