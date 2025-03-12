class ReversePrintAlphabets {
public static void main(String[] args) {
System.out.println("Alphabets from Z to A:");
for (char ch='Z'; ch>='A'; ch--) {
System.out.print(ch + " ");
}
System.out.println(); 
}
}

Output


D:\Software_Testing\src\New Progrom>javac ReversePrintAlphabets.java

D:\Software_Testing\src\New Progrom>java ReversePrintAlphabets
Alphabets from Z to A:
Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
