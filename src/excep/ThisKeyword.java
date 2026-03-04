package excep;

public class ThisKeyword {
	String name;
	
//  this - this keywords refers to the current class instance
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword("Pragati");
		obj.display();

	}
	
	ThisKeyword(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println(name);
	}

}
