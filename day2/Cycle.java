package myAssignments.day2;

public class Cycle {
	
	public String brand (String brandname) {
		
		return brandname;
	}
	
	
	public void color() {
		
		System.out.println("The color is Blue");
		
	}
	
	public static void main (String args []) {
		
		Cycle obj1 = new Cycle ();
		System.out.println(obj1.brand("Hercules"));
		obj1.color();
		
		GearCycle obj2 = new GearCycle();
		System.out.println(obj2.price(10000));
		
	}

}
