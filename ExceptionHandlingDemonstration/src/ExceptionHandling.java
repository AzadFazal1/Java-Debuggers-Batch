
public class ExceptionHandling {
	
	public static int fun(int x ) {
		
		try {
		 x = 10/x;
		}
		catch(ArithmeticException e){
			System.out.println(e);	
		}
		finally {
			System.out.println("Executing finally Block");
		}
		return x;
	}
	static int sum(int [] arr) {
		int sum = 0;
		for(int i = -1; i <= arr.length;i++) {
			try {
				sum += arr[i];
			}
			catch(ArrayIndexOutOfBoundsException e) {
				
				e.printStackTrace();
			}
		}
		return sum;
		
	}
	
	public static void voteEligibility(int age) throws ArithmeticException {
		if(age < 18) {
			throw new ArithmeticException("Not Eligible to vote");
		}
		else {
			System.out.println("Eligibile to vote");
		}
	}
	public static void main(String args []) {
		//System.out.println(fun(0));
		int [] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		System.out.println(sum(arr));
//		try {
//			voteEligibility(12);
//		}
//		catch(ArithmeticException e){
//			System.out.println("Not Eligible to vote");
//			
//		}
		System.out.println("End of Program");
		
		
	}
}
