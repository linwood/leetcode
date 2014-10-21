package LeetCode;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class FindTheSingleNum2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 43,16,45,89,45,-2147483648,45,2147483646,-2147483647,-2147483648,43,2147483647,-2147483646,-2147483648,89,-2147483646,89,-2147483646,-2147483647,2147483646,-2147483647,16,16,2147483646,43};
		int theSingleNum = findTheSingleNum(intArray);
		System.out.println("the single one is :" + theSingleNum);

	}

	private static int findTheSingleNum(int[] intArray) {
		// TODO Auto-generated method stub
		// List intList = Arrays.asList(intArray);
		Arrays.sort(intArray);
		int length = intArray.length;
		int theSingleNum = 0;
		for (int i = 0; i < length; i = i + 3) {
			long firstOne = intArray[i];
			long secOne = 0;
			long thirdOne = 0;
			if (i + 1 >= length) {
				theSingleNum = (int) firstOne;
				break;
			} else {
			 secOne = intArray[i + 1];
			 thirdOne = intArray[i + 2];
			 
			}
			
//			BigDecimal one = new BigDecimal(firstOne);
//			BigDecimal two = new BigDecimal(secOne);
//			BigDecimal three = new BigDecimal(thirdOne);
//			
//			
//			BigDecimal sum = one.add(two).add(three);
//			double half = sum.divide(new BigDecimal(3)).doubleValue();
//			if (half == firstOne && half == secOne && half == thirdOne) {
//			} else {
//				theSingleNum = firstOne;
//				break;
//			}
			
			
			
			long sum = firstOne+secOne+thirdOne;
			double half = sum/3;
			if (half == firstOne && half == secOne && half == thirdOne) {
			} else {
				theSingleNum = (int) firstOne;
				break;
			}
		}
		return theSingleNum;
	}

}
