package com.nirav;
/*Git Test method*/
public class TestNirav {

	public static void main(String[] args) {
		System.out.println(testMthodMultiplication(3, 3.0f));
		System.out.println(testMthodDivision(9, 3.0f));

	}

	public static int testMthodMultiplication(int x, float f2) {
		return Integer.valueOf(x * (int) f2);
	}
	
	
	public static int testMthodDivision(int x, float f2) {
		return Integer.valueOf(x / (int) f2);
	}
}
