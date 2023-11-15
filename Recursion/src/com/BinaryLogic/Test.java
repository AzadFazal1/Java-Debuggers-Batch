package com.BinaryLogic;

public class Test {

	public static int calculateSum(int[] arr, int index, int sum) {
		if(index == arr.length) {
			return sum;
		}
		sum += arr[index];
		
		 sum = calculateSum(arr, ++index, sum);
		System.out.println("i am here");
		return sum;
		
	}
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		System.out.println(calculateSum(arr, 0, 0));

	}

}
