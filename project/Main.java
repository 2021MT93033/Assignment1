public class Main {
	public static void main(String args[]) {
		int a = 20;
		int b = 40;

		int a2 = 70;
		int b2 = 60;

		int a1 = 31;
		int b1 = 41;

		MathFunctions mf = new MathFunctions(a, b);
		mf.add();
		mf.display();

		MathFunctions mf2 = new MathFunctions(a2, b2);
		mf2.subtract();
		mf2.display();

		MathFunctions mf1 = new MathFunctions(a1, b1);
		mf1.multiply();
		mf1.display();

	}
}