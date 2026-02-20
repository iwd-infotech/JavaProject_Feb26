package basic;

public class StringConcat {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		String name = "Java";
		String str = "Selenium";
		
		System.out.println(a+b);  // 300
		System.out.println(name+str); // JavaSelenium
		System.out.println(a+name+b);  //100Java200
		System.out.println(a+b+str);  // 300Selenium
		System.out.println(b+name+a+b);  // 200Java100200
		System.out.println(b+name+(a+b));  // 200Java300

	}

}
