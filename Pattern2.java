class Pattern2 {
public static void main(String[] args) {
int n = 5; 
for (int i=1; i<=n; i++) { 
for (int j=1; j<=n; j++) { 
if (j<=i) {
System.out.print(j + " "); 
} else {   
System.out.print(1 + " ");                      
} 
}
System.out.println(); 
}
}
}

Output


D:\Software_Testing\src\Pattern>javac Pattern2.java

D:\Software_Testing\src\Pattern>java Pattern2
1 1 1 1 1
1 2 1 1 1
1 2 3 1 1
1 2 3 4 1
1 2 3 4 5

D:\Software_Testing\src\Pattern>
