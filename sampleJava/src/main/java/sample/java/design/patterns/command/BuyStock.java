package sample.java.design.patterns.command;

public class BuyStock implements Order {

	private Stock stock;
	
	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();
	}

}
