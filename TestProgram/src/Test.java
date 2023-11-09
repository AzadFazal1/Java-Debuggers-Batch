
public class Test {
	//Declaration
	
	char c = 'C';
    String string = "ACSSFFSS";
	boolean b = true; 
	byte a =127;
	short s = 255;
	int x;
	long l;
	float y;
	double z;
	
	// byte < short < int < long < float < double
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.x);
		System.out.println(t.y);
		System.out.println(t.z);


		
		//Initialization
		//x = 10;
		// Declaration + Initialization
		//int y = 10;
		
		//int number = 10.2; // error
		float xyz = 10;
		int number = (int)10.2; // type casting
		System.out.println(number);
		
		
		float result = (float)3/2;
		System.out.println(result);
		
		int input =-10;
		
		
		if(input > 0) {
			System.out.println("input is positive");
		}
		else {
			System.out.println("input is negative");
		}
			
		boolean isPresent = true;
		if(isPresent) {
			System.out.println("Student is present");
		}
		else {
			System.out.println("Student is absent");

		}
		
		
		int fNumber = 10;
		int sNumber = -10;
		
		
		if(fNumber > 0 && sNumber > 0) {
			System.out.println("Both numbers are positive");
		}
		else {
			System.out.println("At least number is negative");
		}
		if(fNumber > 0 || sNumber > 0) {
			System.out.println("One of the numbers is positive");
		}
		
		
		//Ternary Operator
		
		int result2 = (fNumber > 0|| sNumber > 0)?fNumber*sNumber:sNumber*2;
		System.out.println(fNumber > 0|| sNumber > 0?fNumber*sNumber:sNumber*2);


		
		
		
		
		



	}

}
