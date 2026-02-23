package inheri;

public class ChildProperty extends ParentProperty{ // IS-A Relation
	
	public void bike() {
		System.out.println("Child Property - Bike");
	}

	public void bycle() {
		System.out.println("Child Property - Bycle");
	}
	
	// method overriding
	public void car() {
		System.out.println("Child Property - Car");
	}


}
