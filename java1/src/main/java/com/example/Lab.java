package com.example;

public class Lab {

	/*
	 * 1. Cast from double to int
	 *
	 * labels:[primitives, casting]
	 *
	 * f(0.0) = 0
	 * f(3.1) = 3
	 */
	public static int castToInt(double n) {

		int y = (int) n;
		return y;
	}

	/*
	 * 2. Cast from short to byte
	 *
	 * labels:[primitives, casting]
	 *
	 * f(2) = 2
	 * f(128) = -128
	 */
	public static byte castToByte(short n) {

	    byte x = (byte) n;
	    return x;
	}

	/*
	 * 3. Division
	 *
	 * labels:[operators, exceptions, control statements]
	 *
	 * f(10,2) = 5.0
	 * f(3,2) = 1.5
	 * f(1,0) = throw IllegalArgumentException
	 */
	public static double divide(double operandOne, double operandTwo) {

	    int x = (int) operandTwo;

	    if (x == 0) {
            throw new IllegalArgumentException();
        }
	    return (operandOne/operandTwo);
	}
	/*
	 * 4. Even
	 *
	 * labels:[operators, control statements]
	 *
	 * f(2) = true
	 * f(3) = false
	 */
	public static boolean isEven(int n) {

	    return (n%2 == 0);
	}

	/*
	 * 5. All even
	 *
	 * labels:[operators, arrays, control statements]
	 *
	 * f([2]) = true
	 * f([2,4,6,8,10]) = true
	 *
	 * f([3]) = false
	 * f([2,4,6,8,11]) = false
	 */
	public static boolean isAllEven(int[] array) {

        int alength = array.length;

        for (int i = 0; i < alength; i++) {

            if (array[i] % 2 != 0) {
                return false;
            }
        }return true;
    }


	/*
	 * 6. Average
	 *
	 * labels:[arrays, operators, control statements, exceptions]
	 *
	 * f([2]) = 2.0
	 * f([2,3]) = 2.5
	 * f(null) = throw IllegalArgumentException
	 */
	public static double average(int[] array) {

        try {

        int aLength = array.length;
        double x = 0.0;

        for (int i = 0; i < aLength; i++) {

                x = x + array[i];
                }

	    double sum = x / aLength;
        return sum;}
        catch (IllegalArgumentException | NullPointerException A) {
            throw new IllegalArgumentException(A);
        }
	}

	/*
	 * 7. Palindrome
	 *
	 * labels:[strings]
	 *
	 * f("a") = true
	 * f("aba") = true
	 * f("abba") = true
	 *
	 * f("ab") = false
	 */
	public static boolean isPalindrome(String str) {

        int sL = str.length();
        int sum = 0;

        if (sL < 2) {
            return true;
        }

        for (int i = 0; i <= sL-1; i++) {
            char x = str.charAt(sL - i - 1);
            if (x == str.charAt(i)) {
                sum = sum + 1;
            }
            else return false;
        }
        return (sum == sL);
    }}