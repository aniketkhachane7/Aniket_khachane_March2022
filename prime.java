import java.util.Scanner;
class prime{
 public static void main (String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER A NUMBER");
   int n= sc.nextInt();
     int count=0;
   
    for(int i=1;i<=n;i++)
	{
	   if(n%i==0){
	   System.out.println("NOT A PRIME NUMBER"); //wrong???
	   
	   count++ ;
	   
	   }
	   else 
	   System.out.println("PRIME NUMBER");
	}
 
 
   }
  }