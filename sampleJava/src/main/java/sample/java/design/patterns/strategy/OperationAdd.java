package sample.java.design.patterns.strategy;

public class OperationAdd implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		return a + b;
	}

}
