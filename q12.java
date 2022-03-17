	//12. Write a Java program that takes three numbers as input to calculate and print the 
	//average of the numbers.
	import java.util.Scanner;
	class q12{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Three Integer Input");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	 int avg = (a+b+c)/3;
	 System.out.println("THE AVERAGE IS "+avg);
	 }
	 }
