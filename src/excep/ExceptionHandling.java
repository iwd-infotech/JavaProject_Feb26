package excep;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 5;
			
			int result = a/b;
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("Arithmetic Exception Handled");
		}
		
		System.out.println("Remaining code...");
		
//		try {
//			risky code
//		} catch (Exception e) {
//			handling code
//		}

	}

}
