package com.example;

import java.util.Arrays;
import java.util.Stack;

public class Lab {

	/*
	  1. Return the nth fibonacci number
	  f(0) = 0
	  f(1) = 1
	  f(10) = 55
	*/
	public static int fibonacci(int n) { //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

		int x = 0;
		int y = 1;

		if (n==0) {
			y = 0;
		}

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				x = x + y;
			}
			else y = x + y;
		}
		return(Math.max(x, y));}

	/*
	  2. Sort array of integers
	  f([2,4,5,1,3,1]) = [1,1,2,3,4,5]
	  Don't use built-in sort() method... that would be lame.
	*/
	public static int[] sort(int[] array) {

		 if (array.length < 2) {
		 return array;
		   }

		int cnt = 0;
		int p0[] = Arrays.copyOf(array, array.length);

		if (array.length < 3) {
			if(p0[cnt] > array[array.length-1]) {
				int temp = p0[cnt];
				p0[cnt] = array[array.length-1];
				p0[cnt+1] = temp;}

		}
		else while (cnt < array.length-1) {

			if(p0[cnt] > array[array.length-1]) {

				int temp = p0[cnt];
				p0[cnt] = array[array.length-1];
				p0[cnt+1] = temp;
			}
			cnt = cnt + 1;

		}
		return p0;
	}


	/*
	  3. Return the factorial of n
	  f(0) = 1
	  f(1) = 1
	  f(3) = 6
	*/
	public static int factorial(int n) {

		int fSum = 1;

		if (n < 2) {

			fSum = 1;
		}
		while (n > 1){
			fSum = fSum * n;
			n = n-1;

		}
		return fSum;
	}

	/*
	  4. Rotate left
	  Given array, rotate left n times and return array
	  f([1,2,3,4,5], 1) = [2,3,4,5,1]
	  f([1,2,3,4,5], 6) = [2,3,4,5,1]
	  f([1,2,3,4,5], 3) = [4,5,1,2,3]
	*/
	public static int[] rotateLeft(int[] array, int n) {

		int newOne[] = Arrays.copyOf(array, array.length);
		int len = array.length;
		int c = 0;
		if (n>len) {
			n= n-len;
		}
		for (int i = 0; i < len; i++) {

			if (i < len - n) {
				newOne[i] = array[i + n];

			} else {
				newOne[i] = array[c];
				c = c + 1;
			}
		}return newOne;
	}


	/*
	  5. Balanced Brackets
	  A bracket is any one of the following: (, ), {, }, [, or ]
	  The following are balanced brackets:
	    ()
	    ()()
	    (())
	    ({[]})
	  The following are NOT balanced brackets:
	  (
	  )
	  (()
	  ([)]
	  Return true if balanced
	  Return false if not balanced
	*/
	public static boolean balancedBrackets(String bracketsString) {

		int sL = bracketsString.length();
		int sum = 0;
		Boolean torf = false;
		if (sL < 2 || sL % 2 != 0) {
			return false;
		}
		else {
		//	int half = sL / 2;
		//	for (int i = 0; i<= half; i++) {
				char x = bracketsString.charAt(0);
				char y = bracketsString.charAt(sL-1);

				if ((x == '(' && y == ')') || (x == '[' && y == ']') || (x == '{' && y == '}')) {
					torf = true;
				}
			}
		//}
		return torf;
	}
}
