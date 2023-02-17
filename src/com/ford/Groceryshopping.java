package com.ford;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Groceryshopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		List<StockItems> arrList = new ArrayList<>();
		List<Rate> rateList = new ArrayList<>();
		String productName = null;
		String unit = null;
		double costPerUnit = 0.0;
		double totalAmount = 0.0;
		double overAllAmount = 0.0;
		int quantity = 0;
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
		
		  do {
			System.out.println("Enter ProductName");
			productName = sc.nextLine();
			System.out.println("Enter the Units");
			unit = sc.nextLine();
			System.out.println("Price");
			costPerUnit = sc.nextDouble();
			arrList.add(new StockItems(++id, productName, unit, costPerUnit));
			System.out.print("Want to add more items? (y or n): ");
			ch_switch = sc.next().charAt(0);
			sc.nextLine();

		} while (ch_switch == 'y' || ch_switch == 'Y');
		
		
	/*	do {
			System.out.println("\"--------------------Welcome to Henry Grocery-----------------\"");
			System.out.println();
			System.out.println("Product     unit      cost");
			System.out.println("==========================");
			System.out.println("1.   soup      tin       " + ConstantData.SOUP_PRICE);
			System.out.println("2.  bread     loaf      " + ConstantData.BREAD_PRICE);
			System.out.println("3.   milk      bottle    " + ConstantData.MILK_PRICE);
			System.out.println("4.   apples    single    " + ConstantData.APPLE_PRICE);
}
		while(ch_switch == 'y' || ch_switch == 'Y');
		*/
		
		
		StockItems.displayFormat();
		for (StockItems s : arrList) {
			s.display();
		}
		System.out.println("Enter Purchase Date ex:yyyy-MM-DD");
		String dateInput = sc.nextLine();
		LocalDate purchaseDate = validateDateFormat(dateInput, sc);
		do {
			System.out.println("Choose ProductID: ");
			int ch_id = sc.nextInt();
			HashMap<Integer, StockItems> map = new HashMap<>();
			for (StockItems arr : arrList) {
				map.put(arr.getId(), arr);
			}
			System.out.println("Enter Quantity: ");
			quantity = sc.nextInt();
			totalAmount = quantity * map.get(ch_id).getCost();
			// rateList.add(new Rate(map.get(ch_id).getProduct_name(), unit, quantity,
			// costPerUnit, totalAmount));
			rateList.add(new Rate(map.get(ch_id).getId(), map.get(ch_id).getProduct_name(), map.get(ch_id).getUnit(),
					quantity, map.get(ch_id).getCost(), totalAmount));
			System.out.print("Want to shopping more items? (y or n): ");
			ch_switch = sc.next().charAt(0);
			sc.nextLine();
		} while (ch_switch == 'y' || ch_switch == 'Y');
		Rate.displayFormat();
		int qtyOfSoup = 0;
		boolean findBread = false;
		for (Rate srate : rateList) {
			if (srate.getProduct_name().equalsIgnoreCase("Apple")) {
				calculateAppleDiscount(srate, purchaseDate);
			}
			if (srate.getProduct_name().equalsIgnoreCase("soup") && srate.getUnit().equalsIgnoreCase("tin")) {
				qtyOfSoup += srate.getQuantity();
			}
			if (srate.getProduct_name().equalsIgnoreCase("bread") && srate.getUnit().equalsIgnoreCase("loaf")) {
				findBread = true;
			}
			srate.display();
			overAllAmount = overAllAmount + srate.getTotalPrice();
		}
		calculateLoafPrice(rateList, purchaseDate, qtyOfSoup, findBread);
		System.out.println("OverAllAmount: " + String.format("%.2f", overAllAmount));
	}

	private static void calculateLoafPrice(List<Rate> rateList, LocalDate purchaseDate, int qtyOfSoup,
			boolean findBread) {
		LocalDate startDate = LocalDate.now().minusDays(1);
		LocalDate endDate = startDate.plusDays(7);
		System.out.println("End State:" + endDate);
		if (findBread && qtyOfSoup >= 2 && purchaseDate.isAfter(startDate) && purchaseDate.isBefore(endDate)) {
			// calculate the cost price of the loaf
		}
	}

	private static void calculateAppleDiscount(Rate srate, LocalDate purchaseDate) {
		LocalDate startDate = LocalDate.now().plusDays(3);
		LocalDate endDate = startDate.withDayOfMonth(startDate.getMonth().length(startDate.isLeapYear()));
		//System.out.println("End State:" + endDate);
		if (purchaseDate.isAfter(startDate) && purchaseDate.isBefore(endDate)) {
			double discount = srate.getTotalPrice() * 10 / 100;
			srate.setTotalPrice(srate.getTotalPrice() - discount);
		}
	}

	public static LocalDate validateDateFormat(String date, Scanner input) {
		LocalDate purchaseDate = null;
		boolean flag;
		do {
			try {
				purchaseDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy[-MM[-dd]]"));
				flag = false;
			} catch (DateTimeParseException e) {
				System.out.println("Date formate is incorrect please Enter correct formate");
				date = input.next();
				flag = true;
			}
		} while (flag);
		return purchaseDate;
	}

}
