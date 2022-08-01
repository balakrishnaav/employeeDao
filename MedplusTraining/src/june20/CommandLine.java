package june20;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=args[0];
		int s1 =Integer.parseInt(args[1]);
		int s2=Integer.parseInt(args[2]);
		int s3=s1+s2;
		System.out.println(name + " " + s3);

	}

}
