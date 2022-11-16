package AssignmentProblem;

public class StringsEqualorNot {
	static String s1 = "Ram";
	static	String s2 = "Setu";
	static	String s3 = new String(s1);
	
	public static void main (String[] args) {
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
	}

}
