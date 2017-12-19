package sample.java.design.patterns.command;

public class CommandPatternDemo {

	/*
	 * 
	 * Command Pattern
	 * 
	 * a request is wrapped under an object as a command and passed to invoker.
	 * invoker looks for objects that can handle the request. 
	 * 
	 */
	
	public static void main(String arg[]) {
		Stock abcStock = new Stock("abc", 10);
		Stock xyxStock = new Stock("xyz", 2);
		
		Order order1 = new BuyStock(abcStock); // wrap the request in command
		Order order2 = new SellStock(xyxStock);
		
		Broker broker = new Broker();
		broker.takeOrder(order1);
		broker.takeOrder(order2);
		
		// let the invoker decides which command to be executed.
		broker.placeOrder();
	}
}
