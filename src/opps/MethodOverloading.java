package opps;

public class MethodOverloading {

//	When method name is same with different input parameters within 
//	same class is known as method overloading.
	public static void main(String[] args) {
		MethodOverloading objMethodOverloading = new MethodOverloading();
		objMethodOverloading.show(33.33);
	}
	
//	Can we overload main method?
//	Yes but this is not a good practice.
//	public static void main() {
//
//	}

	// Duplicate methods are not allowed in Java
	public void show() { // zero parameter
		System.out.println("Zero Input Parameter");
	}

	public void show(int a) { // 1 input parameter
		System.out.println("One Input Parameter");
	}
	
	public void show(double d) { // 1 input parameter with diff. data type
		System.out.println("One Input Parameter");
	}
	
	public void show(int m, int n) { // 2 input parameter
		System.out.println("Two Input Parameters");
	}

}
