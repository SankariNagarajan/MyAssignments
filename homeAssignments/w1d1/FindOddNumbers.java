package homeAssignments.w1d1;

public class FindOddNumbers {
	
	public static void main (String args []) {
		
		int maxRange = 10;
		
		System.out.println("The Odd Numbers are: ");
		
		for (int i=1; i<=maxRange; i++) {
			
			if(i%2 != 0) {
				System.out.println(i);
				
			}
		}
		
		
	}

}
