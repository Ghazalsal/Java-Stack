class Calculator implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double results;
	private double num1;
	private double num2;
	private char operator;
	public Calculator() {}
	public void setOperandOne(double num1) {
		this.num1 = num1;
	}
	public void setOperation(char operator) {
		this.operator=operator;
	}
	public void setOperandTwo(double num2) {
		this.num2 = num2;
	}
	public void performOperation() {
		if(this.operator == '+') {
			results = num1+ num2;
		}
		if(this.operator == '-') {
			results = num1 -num2;
		}
	}
	public double getResults() {
		System.out.println(results);
		return results;
	}
}
