package june20;

public class CountPunctuationMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="a.v,d!e?...;";
		int punctuationCount=0;
		for (int i=0;i<str1.length();i++) {
			switch(str1.charAt(i)){
			case ',':
				punctuationCount++;
				break;
			case '.':
				punctuationCount++;
				break;
			case '?':
				punctuationCount++;
				break;
			case '!':
				punctuationCount++;
				break;
			case ';':
				punctuationCount++;
				break;
		}
		}
		System.out.println("PunctuationCountIs:"+punctuationCount);
	}

}
