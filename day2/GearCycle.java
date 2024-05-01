package myAssignments.day2;

public class GearCycle {
	
	public int price(int price) {
		
		return price;
		
	}
	
	public static void main (String args[]) {
		
		Cycle obj2 = new Cycle();
		
		System.out.println(obj2.brand("Hercules Gear Cycles"));
		obj2.color();
		
		GearCycle obj3 = new GearCycle();
		System.out.println(obj3.price(5000));
		
	}

}
