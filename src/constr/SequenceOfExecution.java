package constr;

public class SequenceOfExecution {
	
	{   // Runs every time object is created
		System.out.println("Block");  // Instance block
	}
	
	static {   // runs only one
		System.out.println("Static Block");
	}
	
	SequenceOfExecution(){
		System.out.println("Constructor");
	}
	
	void display() {
		System.out.println("Display method");
	}

	public static void main(String[] args) {
		SequenceOfExecution obj = new SequenceOfExecution();
		obj.display();
	}

}
