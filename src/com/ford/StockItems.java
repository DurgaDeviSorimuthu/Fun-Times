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
		System.out.format("             %5d                      %-9s                   %-9s                %9.2f   \n", id,product_name, unit, cost);
	}

}
