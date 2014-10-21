package LeetCode;

public class GetLastWordLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "1";
		Long startTime = System.currentTimeMillis();

		// String ss = reverseWords(s);
		Long endTime = System.currentTimeMillis();

		int length = lengthOfLastWord(s);
		System.out.println("The length of last word is :" + length);
		System.out.println("StartTime:" + startTime + " EndTime:" + endTime);
		System.out.println("String ºÄÊ±£º" + (endTime - startTime));

	}

	private static int lengthOfLastWord(String ss) {
		// TODO Auto-generated method stub
		String[] words = ss.split(" ");
		int arrayLength = words.length;
		int lastWordLength = 0;
		if (arrayLength > 0) {
			String lastWord = words[arrayLength - 1];
			if (lastWord.trim().length() > 0) {
				lastWordLength = lastWord.length();
			}
		}
		return lastWordLength;
	}

}
