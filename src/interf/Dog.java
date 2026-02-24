package interf;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Implemented Method - Sound");
		
	}

	@Override
	public void eating() {
		System.out.println("Implemented Method - Eating");
		
	}

}
