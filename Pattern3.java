class Pattern3 {
public static void main(String[] args) {
int n = 5; 
for (int i=1; i<=n; i++) { 
for (int j=1; j<=n; j++) { 
if (j<=i) {
System.out.print(i + " "); 
} else {   
System.out.print(1 + " ");                      
} 
}
System.out.println(); 
}
}
}

Output


D:\Software_Testing\src\Pattern>javac Pattern3.java

D:\Software_Testing\src\Pattern>java Pattern3
1 1 1 1 1
2 2 1 1 1
3 3 3 1 1
4 4 4 4 1
5 5 5 5 5
