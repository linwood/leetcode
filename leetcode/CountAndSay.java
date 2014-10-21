package LeetCode;

public class CountAndSay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		String s = countAndSay(n);

	}

	private static String countAndSay(int n) {
		// TODO Auto-generated method stub
		
		int start = 1;
		String preValue = "1";
		int nextValue = 0;
		if(n == 1) {
			System.out.println("value:" + preValue);
			return preValue;
		} 

		for (int i = 1; i < n; i++) {
			String s = preValue + "";
			int valuaPre = Character.getNumericValue(s.charAt(0));
			int valueCur = 1;
			int count = 0;
			StringBuilder strValue = new StringBuilder();
			for (int j = 0; j < s.length(); j++) {

				valueCur = Character.getNumericValue(s.charAt(j));
				if (valuaPre == valueCur) {
					count++;
				} else {
					
					strValue.append(count + "" + valuaPre);
					count =1 ;
				}
				valuaPre = Character.getNumericValue(s.charAt(j));
			}
			if (count != 0) {
				strValue.append(count + "" + valuaPre);
			}
			preValue = strValue.toString();
			System.out.println("value:" + preValue);
		}
		System.out.println("value:" + preValue);
		return preValue + "";
	}

}
