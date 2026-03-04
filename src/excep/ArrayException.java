package excep;

public class ArrayException {

	public static void main(String[] args) {
		
		try {
			int i[] = new int[3];
			i[0] = 0;
			i[1] = 30;
			System.out.println(i[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Exception");
		}
		
		System.out.println("Remaining code");
		
		
		try {
			int i[] = new int[3];
			i[0] = 0;
			i[1] = 30;
			System.out.println(i[1]);
		} finally {
			System.out.println("Finally block");
		}

	}

}
