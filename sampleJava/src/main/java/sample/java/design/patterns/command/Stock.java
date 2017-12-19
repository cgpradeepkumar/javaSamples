package sample.java.design.patterns.command;

public class Stock {

	private String name;

	private int quantity;

	public Stock(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void sell() {
		System.out.println(this + " sold.");
	}

	public void buy() {
		System.out.println(this + " bought.");
	}

	@Override
	public String toString() {
		return "name [" + name + "], quantity [" + quantity + "]";
	}
}
