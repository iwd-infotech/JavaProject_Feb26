package abs;

abstract public class Car {  // abstract class
	
//	0 to 100% abstraction
//	Cannot create object of abstract class 
//	Must be Extended
//	Abstraction have both normal & abstract methods
	abstract void start();  // abstract methods - no method body
	abstract void petrol();
	
	void stop() {   // normal methods
		System.out.println("Car Stop method");
	}
	
	void cngCar() {
		System.out.println("CNG Car Stop method");
	}

}
