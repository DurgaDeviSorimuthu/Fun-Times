package com.ford;

public class Rate {
	private String product_name;
	private String unit;
	private int Quantity;
	 private double price;  
     private double totalPrice;
	public Rate(String product_name, String unit, int quantity, double price, double totalPrice) {
		super();
		this.product_name = product_name;
		this.unit = unit;
		Quantity = quantity;
		this.price = price;
		this.totalPrice = totalPrice;
	}  
	public static void displayFormat()   
    {  
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");  
        System.out.print("\n \t\tProduct\t\tUnit\t\tCost \t\tquantity\t\t\tTotalPrice\n");  
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");  
    }  
	 // display  
    public void display()   
    {  
        System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,product_name, unit, Quantity, price, totalPrice);  
    }  
}
