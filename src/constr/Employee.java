package constr;

public class Employee {
	
	String name;
	int salary;
	
	Employee(String n, int s){
		name = n;
		salary = s;
		
	}

	void show() {
		System.out.println(name + " " +salary );
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee("Dev", 10000);
		emp.show();
		
	}

}
