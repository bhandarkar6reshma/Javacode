class FactorialNo {
public static void main(String[] args) {
int num = 8;
int factorial = 1;
System.out.println("Factorial No: " + num);
for (int i = 1; i<=num; i++){
int product = num * i; 
factorial *=i;
}
System.out.println("Factorial Number of " + num + " is: " + factorial); 
}
}

Output

D:\Software_Testing\src\New folder>javac FactorialNo.java

D:\Software_Testing\src\New folder>java FactorialNo
Factorial No: 8
Factorial Number of 8 is: 40320

D:\Software_Testing\src\New folder>
