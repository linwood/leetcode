package LeetCode;

import java.util.Arrays;
import java.util.List;

public class FindTheSingleNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 2, 3, 3, 2, 4, 5, 5, 7, 4, 7,8,9,9,15,15,6, 6 };
		int theSingleNum = findTheSingleNum(intArray);
		System.out.println("the single one is :" + theSingleNum);

	}

	private static int findTheSingleNum(int[] intArray) {
		// TODO Auto-generated method stub
		// List intList = Arrays.asList(intArray);
		Arrays.sort(intArray);
		int length = intArray.length;
		int theSingleNum = 0;
		for (int i = 0; i < length; i = i + 2) {
			int firstOne = intArray[i];
			int secOne = 0;
			if (i + 1 >= length) {
				theSingleNum = firstOne;
				break;
			} else {
			 secOne = intArray[i + 1];
			}
			int sum = firstOne + secOne;
			double half = sum / 2;
			if (half == firstOne && half == secOne) {
			} else {
				theSingleNum = firstOne;
				break;
			}
		}
		return theSingleNum;
	}

}
