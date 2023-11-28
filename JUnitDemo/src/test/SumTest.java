package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import math.Sum;

class SumTest {
	Sum sum = new Sum();
	
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");

	}
	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each");
	}
	

	@AfterEach
	void afterEach() {
		System.out.println("After Each");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All");
	}
	
	@Test
	void calulateSum_arrayOfThreeNumbers() {
//		int arr[] = {3, 4, 6};
//		int actual = sum.calulateSum(arr);
//		int expected = 13;
//		assertEquals(expected, actual);
		System.out.println("in test1");

		assertEquals(13, sum.calulateSum(new int[] {3, 4, 6}));

	}
	
	@Test
	void calculateSum_emptyArray() {
		int arr[] = new int[] {};
		int actual = sum.calulateSum(arr);
		int expected = 0;
		System.out.println("in test2");

		assertEquals(expected, actual);
		
		
	}
	
	

}
