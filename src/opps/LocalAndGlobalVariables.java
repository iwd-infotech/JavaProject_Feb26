package opps;

public class LocalAndGlobalVariables {
	
	static int m = 50;  // static Global Variable - scope within hole class 
	int n = 100;  // non-static global variable

	public static void main(String[] args) {
		int a = 10;  // Local variable - Scope of the local variable within the method 
		int b = 20;
		System.out.println(a+b);
		System.out.println(b+m);
		LocalAndGlobalVariables obj = new LocalAndGlobalVariables();
		System.out.println(a+obj.n);

	}
	
	public static void show() {
		int c = 30;   // local variable
		System.out.println(m+c);
	}

}
