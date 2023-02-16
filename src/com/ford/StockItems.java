package com.ford;

public class StockItems {

	private int id;
	private String product_name;
	private String unit;
	private int Quantity;

	public StockItems(int id, String product_name, String unit, double cost) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.unit = unit;
		this.cost = cost;
	}

	private double cost;

	public static void displayFormat() {
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("\n \t\tID\t\tProduct\t\tUnit\t\tCost \t\t\t\t\n");
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------\n");
	}

	// Print All Items in stock
	public void display() {
		System.out.format("            %5d                  %-9s                 %-9s            %9.2f   \n", id,product_name, unit, cost);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
