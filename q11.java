//11. Write a Java program to print the area and perimeter of a circle.
	class q11{
	public static void main (String args[]){
      //float PI= 3.14;
	  double r=7.5;  // why not float?
	  double perimeter =(2*r*Math.PI);
	  double area=(Math.PI*r*r);
	  System.out.println(perimeter);
	  	  System.out.println(area);
	}
	}