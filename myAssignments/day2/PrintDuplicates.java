package myAssignments.day2;

public class PrintDuplicates {
	
	public static void main (String args[]) {
		
		int a[] = {1, 2, 4, 7, 3, 7, 4, 1};
		
		{
			for (int i=0; i<a.length; i++) {
				
				for(int j=i+1; j<a.length; j++) {
					
					if (a[i] == a[j]) {
						
						System.out.println(a[i]);
					}
					
				}
				
			}
			
			
		}
		
		
	}

}
