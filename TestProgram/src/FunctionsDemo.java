
public class FunctionsDemo {
	
	
	public static void calculateSum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}

	public static void swapValuesInArray(int arr[]) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
	
	public static int calculateSumOfTwoDArray(int [][]arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
	
	public static void binarySearch(int []arr, int key) {
		int l = 0;
		int r = arr.length -1;
		int mid = 0;
		boolean found = false;
		while(l <= r) {
		
			mid = (l + r) /2;
			if (arr[mid] == key) {
				found = true;
				break;
			}
			
			else if(arr[mid] > key) {
					r = mid - 1;
				}	
			else {
				l = mid +1;
			}
		}
		
		if(found == true) {
			System.out.println("key found at index " + mid);
		}
		else{
			System.out.println("key Not found");

			
		}
		
		
	}
	public static void main(String[] args) {
		
		int x = 10; int y = 20;
		calculateSum(x, y);
		calculateSum(15, 24);
		calculateSum(47, 3254);
		
		swap(x, y);
		System.out.println(x + " " + y);

		int [] arr = {x, y};
		swapValuesInArray(arr);
		System.out.println(arr[0] + " " + arr[1]);
		
		int [][] numbers = new int [2][3];
		int count = 1;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0 ; j < numbers[i].length; j++) {
				numbers[i][j] = count;
				++count;
			}
		}
		System.out.println(calculateSumOfTwoDArray(numbers));
			int []array = {1, 4, 6, 9 ,14, 67};
			binarySearch(array, 18);
	}

}
