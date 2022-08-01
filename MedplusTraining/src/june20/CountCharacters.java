package june20;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args.length);
		int strLength=args.length;
		int count=0;
		for (int i=0;i<strLength;i++) {
			count+=args[i].length();
		}
		System.out.println(count);
		
		String newString="med plus store";
		int newCount=0;
		for (int i=0;i<newString.length();i++) {
			if ((int)newString.charAt(i)==32)
				continue;
			else
				newCount++;
		}
		System.out.println(newCount);

	}

}
