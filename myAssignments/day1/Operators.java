package myAssignments.day1;

public class Operators {

	public static void main (String args []) {
		
		int a = 20;
		int b = 5;
		
		//Arithmetic Operators
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	
		//Comparison Operators
		
		System.out.println(a == b);
		System.out.println(a!=b);
		
		//Logical Operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>b && a<b);
		System.out.println(a>b || a<b);
		
		//post-increment
		
		System.out.println(a++);
		System.out.println(a);
		
		//pre-increment
		
		System.out.println(++b);
		
		
	}
}
