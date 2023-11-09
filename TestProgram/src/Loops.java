
public class Loops {

	public static void main(String[] args) {
		
		
		
		
		//print the numbers from 1-5
		/* 
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		//print the numbers from 1-5
		
		//number =5  print 5
		
		// number = number + 1 is the same as number +=1 is the same as ++number
		
		//  starting point      Stopping condition     Step/Change
		for(int number = 1;     number <=5;        ++number) {
			System.out.println(number);
		}

		//print the numbers from 5-1
		// 5 4 3 2 1
		// 5 
		for(int number = 5; number >= 1; --number) {
			System.out.println(number);
		}
		
		int number = 1; //starting point
		while(number <= 5) {// stopping condition
			System.out.println(number);
			++number; //step/change
		}
		
		int number2 = 1; // starting condition
		do {

			System.out.println(number2);
			++number2; // step/change

		}
		while(number2 <=2);

	
	
		int x =10;
		//int x = 45; Not allowed due to duplicated variable
				
	for(int i = 0; i < 5; i++) {
		for(int j = 0; j < 5; j++) {
			System.out.println(i + "  " + j);
		}
	}
	//		 i  j
	//       0  0
	//		 0  1
	//		 0  2
	//		 1  0	
	//		 1  1
	//       1  2
	//       2  0
	//       2  1
	//       2  2
	
	
//	*  *  *	 *
//	*  *  *  *
//	*  *  *  *
//	*  *  *  *
	
	
//		*
//		*  *
//		*  *  *
//		*  *  *  *
	
//	*
//	*  *
//	*  *  *
//	*  *  *  *
//	*  *  *
//	*  *
//	*
	
	
	}
}
