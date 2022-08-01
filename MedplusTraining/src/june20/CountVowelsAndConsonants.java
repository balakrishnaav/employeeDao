package june20;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowelCount=0;
		int consonantCount=0;
		String str1="abcdefghi";
		
		for (int i=0;i<str1.length();i++) {
			switch(str1.charAt(i)){
			case 'a':
				vowelCount++;
				break;
			case 'e':
				vowelCount++;
				break;
			case 'i':
				vowelCount++;
				break;
			case 'o':
				vowelCount++;
				break;
			case 'u':
				vowelCount++;
				break;
			default:
				consonantCount++;
				
		}
		}
		System.out.println("vowelCount: "+vowelCount+" consonantCount: "+consonantCount);
	}

}
