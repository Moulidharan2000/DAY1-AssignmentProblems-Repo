package AssignmentProblem;

public class SumandCountofIntegers {
	public static void main(String[] args) {
		int sum = 0;
		int invalid = 0;
		for (int i=0; i<args.length; i++) {
			sum += Integer.parseInt(args[i]);
			invalid++;
		}
		System.out.println("Sum :"+sum);
		System.out.println("Invalid :"+invalid);
	}
}
