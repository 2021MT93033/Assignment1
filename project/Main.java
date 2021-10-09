public class Main {
	public static void main(String args[]) {
		int a = 20;
		int b = 40;

		int a2 = 70;
		int b2 = 60;

		MathFunctions mf = new MathFunctions(a, b);
		mf.add();
		mf.display();

		MathFunctions mf2 = new MathFunctions(a, b);
		mf2.subtract();
		mf2.display();
	}
}