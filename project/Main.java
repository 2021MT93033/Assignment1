public class Main {
	public static void main(String args[]) {
		int a = 20;
		int b = 40;

		int a1 = 31;
		int b1 = 41;

		MathFunctions mf = new MathFunctions(a, b);
		mf.add();
		mf.display();

		MathFunctions mf1 = new MathFunctions(a1, b1);
		mf1.multiply();
		mf1.display();

	}
}