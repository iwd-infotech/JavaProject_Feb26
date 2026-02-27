package encap;

public class Employee {
	
//	Encapsulation: it is process of binding data(variables) & methods into a single
//	unit & restricting direct access from outer class.
	
	private String name;  // global variables
	private int salary;
	
//	Getter& Setter methods 
//	Setter: Used to set (assign) value to a private variable
//	Getter: Used to get (retrieve) value to a private variable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Seema");
		emp.setSalary(50000);
		
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

	}

}
