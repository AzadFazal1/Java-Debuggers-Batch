
public class ArraysDemo {

	public static void main(String[] args) {
		
		// Declare an array of integers
		
		
		int x = 10;
		int [] arr = new int [5];
		arr[0] = 23;
		arr[1] = 12;
		arr[2] = 13;
		arr[3] = 45;
		arr[4] = 67;
		
		for(int i = 0; i <= arr.length -1; i++) {
			System.out.println(arr[i]);
		}
		//arr[5] = 56;
		// we cannot increase or decrease the size of arrays once declared
		for(int i  = arr.length -1; i >=0; i--) {
			System.out.println(arr[i]);
		}
		
		int [] arr1 = {12, 34, 56, 78, 23};
		// 12 23 34 46 78
		
		char c = 'A';
		c= (char)(c + 32);
		System.out.println(c);
		
//		int number = c;
//		System.out.println(number + 1);
		
		int [][] twoDArray = new int[2][2];
		
		//  [[3 9], [2 6]]
		
		twoDArray[0][0] = 3;
		twoDArray[0][1] = 9;
		twoDArray[1][0] = 2;
		twoDArray[1][1] = 6;
		
		for(int row = 0; row <= twoDArray.length - 1; row++) {
			for(int col = 0; col <= twoDArray[row].length -1; col++) {
				System.out.print(twoDArray[row][col] + "  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
