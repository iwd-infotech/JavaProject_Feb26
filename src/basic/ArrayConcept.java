package basic;

public class ArrayConcept {
//	Array - Array is used to store similar data types in array variable
//	int i = normal variable
//	int i[] = array of variable

	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		int d = 40;
		
		int i[] = new int[6];
		i[0] = 0;
		i[1] = 10;
		i[2] = 20;
		i[3] = 30;
		i[4] = 40;
		i[5] = 50; // Exception - ArrayIndexOutOfBoundsException:
		
		System.out.println(i[2]);
		System.out.println(i[0]);
		System.out.println(i[5]);
		
		double d[] = new double[5];
		

	}

}
