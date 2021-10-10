public class MathFunctions {
	private int op1;
	private int op2;
	private String result;

	public MathFunctions() {

	}

	public MathFunctions(int op1, int op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	public int getOp1() {
		return op1;
	}

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public int getOp2() {
		return op2;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void add() {
		System.out.println("the operands are op1: " + op1 + " op2: " + op2);
		this.result = (op1 + op2) + "";
	}

	public void subtract() {
		System.out.println("the operands are op1: " + op1 + " op2: " + op2);
		this.result = (op1 - op2) + "";
	}

	public void display() {
		System.out.println("The value of the operation is: " + result);
	}

	public void multiply() {
		System.out.println("the operands are op1: " + op1 + " op2: " + op2);
		this.result = (op1 * op2) + "";
	}

}