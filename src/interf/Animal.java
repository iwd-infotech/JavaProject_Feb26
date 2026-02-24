package interf;

public interface Animal { // by default abstraction
	
	void sound();  // no method body
	void eating();
	
	default void shape() {  // default method 
		System.out.println("Default Method");
	}

}
