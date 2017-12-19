package sample.java.design.patterns.command;

public class SellStock implements Order {

	private Stock stock;
	
	public SellStock(Stock stock) {
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
		stock.sell();
	}

}
