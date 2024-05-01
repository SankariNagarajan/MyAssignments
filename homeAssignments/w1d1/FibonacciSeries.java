package homeAssignments.w1d1;


public class FibonacciSeries {
	
	public static void main (String args[]) {
		
		int f1=0, f2=1, f3, range=8;
		
		System.out.println(f1);
		System.out.println(f2);
		
		for(int i =2; i<range; i++) {
			
			f3 = f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			
		}
		
	}

}
