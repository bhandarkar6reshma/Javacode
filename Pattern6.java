class Pattern6 {
public static void main(String[] args) {
int rows = 5; // Number of rows
int columns = 6; // Number of columns
for (int i=1; i<=rows; i++) { 
for (int j=1; j<=columns; j++) { 
if ((i + j) % 2 == 0) {
System.out.print("1");
} else {
System.out.print("0");
}
}
System.out.println(); 
}
}
}


Output

D:\Software_Testing\src\Pattern>javac Pattern6.java

D:\Software_Testing\src\Pattern>java Pattern6
101010
010101
101010
010101
101010