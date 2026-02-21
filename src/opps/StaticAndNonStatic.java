package opps;

public class StaticAndNonStatic {

	public static void main(String[] args) {
//		add();  Cannot make a static reference to the non-static method add()
		display();   // direct calling
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.abc();
		obj.add();
		StaticAndNonStatic.show();  // by using class name
		
		
	}
	public static void display() {
		System.out.println("Static Display method");
	}

	public void add() {
		System.out.println("Non-Static Add method");
	}

	public static void show() {
		System.out.println("Static Show method");
	}

	public void abc() {
		System.out.println("Non-Static ABC method");
	}

}
