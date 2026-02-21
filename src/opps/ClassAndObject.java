package opps;

public class ClassAndObject {

	public static void main(String[] args) {
//		ClassAndObject - Class name
//		dev - reference variable
//		new - keyword
//		ClassAndObject() - constructor
//		new ClassAndObject();   - object
		
		ClassAndObject dev = new ClassAndObject();
		dev.eating();
		dev.running();
		dev.speaking();
	}
	
	public void eating() {
		System.out.println("Eating");
	}
	
	public void running() {
		System.out.println("Running");
	}
	
	public void speaking() {
		System.out.println("Speaking");
	}

}
