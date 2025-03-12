class Pattern20 {
public static void main(String[] args) {
int n=5;
for (int i=0; i<n; i++) { 
for (int j=0; j<i; j++) {
System.out.print(" ");
}
for (char ch=(char) ('A'+i); ch<'A'+n; ch++) {
System.out.print(ch);
}
System.out.println(); 
}
}
}


Output

D:\Software_Testing\src\Pattern>javac Pattern20.java

D:\Software_Testing\src\Pattern>java Pattern20
ABCDE
 BCDE
  CDE
   DE
    E