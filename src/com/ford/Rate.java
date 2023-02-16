package com.ford;

public class Rate {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String product_name;
	private String unit;
	private int Quantity;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	private double price;  
     private double totalPrice;
	public Rate(int id,String product_name, String unit, int quantity, double price, double totalPrice) {
		super();
		this.id=id;
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
        System.out.format("        %-9s               %-9s           %-9f         %-9d           %14.2f\n" ,product_name, unit, price,Quantity, totalPrice);  
    }  
}
