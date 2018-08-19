package com.nirav;
/*Git Test method*/
public class TestNirav {

	public static void main(String[] args) {
		System.out.println(testMthod(3, 3.0f));
		System.out.println(testMthodMultiplication(2, 9.2f));
	}

	public static int testMthod(int x, float f2) {
		return Integer.valueOf(x * (int) f2);
	}
	
	
	public static int testMthodMultiplication(int x, float f2) {
		return Integer.valueOf(x * (int) f2 * 4);
	}
}
