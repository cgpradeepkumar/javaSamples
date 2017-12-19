package sample.java.design.patterns.strategy;

/**
 * @author pkumar
 *
 *  strategy objects (implementation of Strategy interface)
 *  represents various strategies.
 *  
 *  context object will change the behaviour as per the strategy.
 */

public class StrategyPatternDemo {

	public static void main(String arg[]) {
		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println(context.executeStrategy(10, 5));
	}
}
