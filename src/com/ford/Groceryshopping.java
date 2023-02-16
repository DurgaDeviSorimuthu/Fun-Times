package com.ford;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Groceryshopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		List<StockItems> arrList=new ArrayList<>();
		 List<Rate> rateList=new ArrayList<>();
		String productName = null;
		String unit=null;
		double costPerUnit = 0.0;
		double totalAmount = 0.0;
		double overAllAmount = 0.0;
		int quantity=0;
		double subtotal = 0.0, discount = 0.0;
		System.out.println("\"--------------------Welcome to Henry Grocery-----------------\"");
		char ch_switch = '\0';
		// Datetime Format
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		// String days[]=new String[] { "Sunday", "Monday", "Tuesday", "Wednesday",
		// "Thursday", "Friday", "Saturday"};
		// prints current date and time
		System.out.println("date: " + dateformat.format(date));
		System.out.println("Enter the Customer Name: ");
		String prd=sc.nextLine() ;
		 do {
			
			 System.out.println("Enter ProductName");
			 productName=sc.nextLine();
			 System.out.println("Enter the Units");
			 unit=sc.nextLine();
			 System.out.println("Price");
			 costPerUnit=sc.nextDouble(); 
			 arrList.add(new StockItems(++id,productName,unit,costPerUnit));
             System.out.print("Want to add more items? (y or n): ");
			 ch_switch = sc.next().charAt(0);  
			 sc.nextLine();  
			 
		}
		 while(ch_switch == 'y' || ch_switch == 'Y');
		 StockItems.displayFormat();
		 for(StockItems s:arrList) {
			 s.display();
		 }
		 System.out.println("Choose Product: " );
		 int ch_id=sc.nextInt();
		 
		 
	}

}
