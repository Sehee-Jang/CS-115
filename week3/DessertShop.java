package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public abstract class DessertShop {
	
	static HashMap<String, Customer> customerDB = new HashMap<>(); /*{
		ArrayList<Customer> Customer = new ArrayList<Customer>();
		Customer Karis = new Customer("Karis");
		Customer James = new Customer("James");
		Customer Mei = new Customer("Mei");
		
		Customer.add(Karis);
		Customer.add(James);
		Customer.add(Mei);
		
		customerDB.put("Karis", Karis);
		customerDB.put("James", James);
		customerDB.put("Mei", Mei);
	};*/
	
	public static void main(String[] args) {
		Order order = new Order("Order", null);
		//ArrayList<DessertItem> all = new ArrayList<DessertItem>();
		Scanner sIn = new Scanner(System.in);
		String choice;
		DessertItem orderItem;
		String paymentMethod;
		boolean done = false;
		boolean closed = false;
		
		while (!closed) {
			order = new Order();
			done = false;
			
			/* Hard Code to Add orders */
			Candy i1 = new Candy("Candy Corn", 1.5, .25);
			Candy i2 = new Candy("Gummy Bears", .25, .35);
			Cookie i3 = new Cookie("Chocolate Chip", 6, 3.99);
			IceCream i4 = new IceCream("Pistachio", 2, .79);
			Sundae i5 = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
			Cookie i6 = new Cookie("Oatmeal Raisin", 2, 3.45);
	
			order.addDessertItem(i1);
			order.addDessertItem(i2);
			order.addDessertItem(i3);
			order.addDessertItem(i4);
			order.addDessertItem(i5);
			order.addDessertItem(i6);
			
			
			/* Menu */ 			
			while (!done) {
				System.out.println("\n1: Candy");
				System.out.println("2: Cookie");
				System.out.println("3: Ice Cream");
				System.out.println("4: Sundae");
				System.out.println("5: Admin Module");
				System.out.print("\nWhat would you like to add to the order? (1-5, Enter for done): ");
				choice = sIn.nextLine();
				
				if (choice.equals("")) {
					done = true;
				} else {
					switch (choice) {
					case "1":
						orderItem = userPromptCandy();
						order.addDessertItem(orderItem);
						break;
					case "2":
						orderItem = userPromptCookie();
						order.addDessertItem(orderItem);
						break;
					case "3":
						orderItem = userPromptIceCream();
						order.addDessertItem(orderItem);
						break;
					case "4":
						orderItem = userPromptSundae();
						order.addDessertItem(orderItem);
						break;
					case "5":
						adminModule();
						break;
					}// end of switch (choice)
				} // end of if (choice.equals(""))
			} // end of while (!done)
			//System.out.println("\n");
			
			
			
			/* Ask Customer's Name */
			System.out.print("Enter the customer name: ");
			String custName = sIn.nextLine();
			
			/* Check the Customer Name*/
			if(!customerDB.containsKey(custName)) {
				Customer custObj = new Customer(custName);
				customerDB.put(custName, custObj);
			} // end of if
			
			Customer custObj = customerDB.get(custName);
			custObj.addToHistory(order);
			
			
			
			/* Ask Payment Method */
			boolean valid = false;
			while (!valid) {
				System.out.print("What form of payment will be used? (CASH, CARD, PHONE): ");
				String answer = sIn.nextLine().toUpperCase();
				for (Payable.PayType value : Payable.PayType.values()) {
					if (answer.equalsIgnoreCase(value.name())) {
						valid = true;
						order.setPayType(answer);
						break;
					} // end of if
				} // end of for
				if (!valid) {
					System.out.println("That's not a valid form of payment.");
				} // end of if not valid
			} // end of for while !valid
			
			Collections.sort(order.getOrderList());
			
			/* Print Receipt */
			System.out.print("\n" + order.toString()); // Print Order List		
			System.out.println("---------------------------------------------------------------");
			System.out.println(custObj); // Customer information
		
			
			/* Start a new Order */
			System.out.println("\nHit enter to start a new order.");
			String hit = sIn.nextLine();
			if(!hit.equals("")) closed = true; // if any other value is entered, the shop closes.
					
		}// end of while (!closed)
		
	}// end of main()
	
	private static DessertItem userPromptCandy() {
		Scanner in = new Scanner(System.in);
		String input;
		System.out.print("Enter the type of Candy: ");
		String input1 = in.nextLine();
		
		System.out.print("Enter the weight purchased: ");
		input = in.nextLine();
		double input2 = Double.parseDouble(input);
		
		System.out.print("Enter the price per pound: ");
		input = in.nextLine();
		double input3 = Double.parseDouble(input);
		/*
		 * String input3 = in.nextLine(); Double num3 = Double.parseDouble(input3);
		 */
		Candy cd = new Candy(input1, input2, input3);
		return cd;
	}// end of userPromptCandy

	private static DessertItem userPromptCookie() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the type of Cookie: ");
		String input1 = in.nextLine();
		System.out.print("Enter the quantity purchased: ");
		String input2 = in.nextLine();
		int num2 = Integer.parseInt(input2);
		System.out.print("Enter the price per dozen: ");
		String input3 = in.nextLine();
		Double num3 = Double.parseDouble(input3);
		Cookie ck = new Cookie(input1, num2, num3);
		return ck;
	}// end of userPromptCookie()

	private static DessertItem userPromptIceCream() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the type of IceCream: ");
		String input1 = in.nextLine();
		System.out.print("Enter the number of scoop: ");
		String input2 = in.nextLine();
		int num2 = Integer.parseInt(input2);
		System.out.print("Enter the price per scoop: ");
		String input3 = in.nextLine();
		Double num3 = Double.parseDouble(input3);
		IceCream ic = new IceCream(input1, num2, num3);
		return ic;
	}// end of userPromptIceCream()

	private static DessertItem userPromptSundae() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the type of Ice Cream chosen: ");
		String input1 = in.nextLine();
		System.out.print("Enter the number of scoops: ");
		String input2 = in.nextLine();
		int num2 = Integer.parseInt(input2);
		System.out.print("Enter the price per scoop: ");
		String input3 = in.nextLine();
		Double num3 = Double.parseDouble(input3);
		System.out.print("Enter the kind of topping used: ");
		String input4 = in.nextLine();
		System.out.print("Enter the price for the topping: ");
		String input5 = in.nextLine();
		Double num5 = Double.parseDouble(input5);
		Sundae sd = new Sundae(input1, num2, num3, input4, num5);
		return sd;
	}// end of userPromptSundae()
	
	private static void adminModule() {
		Scanner in = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			System.out.println("\n1: Shop Customer List");
			System.out.println("2: Customer Order History");
			System.out.println("3: Best Customer");
			System.out.println("4: Exit Admin Module\n");
			
			System.out.print("What would you like to do? (1-4): ");
			
			String answer = in.nextLine();
			switch (answer) {
			case "1":
				customerList();
				break;
			case "2":
				customerOrderHistory();
				break;
			case "3":
				bestCustomer();
				break;
			case "4":
				done = true;
				break;
					
			}// end of switch(answer)
		}// end of while(!done)
		
	}// end of adminModule()
	
	private static void customerList() {
		for (String name : customerDB.keySet()) {
			System.out.printf("Customer Name: %-8sCustomer ID: %-4d\n", name, customerDB.get(name).getID());
		}// end of for
	}// end of customerList()
	
	private static void customerOrderHistory() {
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		String name = "";
		
		/* This is for finding customers */
		while(!valid) {
			System.out.print("Enter the name of the customer: ");
			name = in.nextLine();
			if (customerDB.containsKey(name)) valid = true;
			else System.out.println("Customer not found. Try agian.");
		}//end of while(!valid)
		
		Customer customer = customerDB.get(name);
		System.out.print("\n" + customer);
		System.out.println("------------------------------------------------------------------------");
	
		int orderCount = 1;
		for (Order order : customer.getOrderList()) {
			System.out.println("Order: #" + orderCount);
			System.out.println(order + "\n");
			orderCount++;
		}// end of for (Order order : customer.getOrderList())
	}// end of customerOrderHistory()
	
	private static void bestCustomer() {
		System.out.println("------------------------------------------------------------------------");
		
		int orders = 0;
		String bestCustomer = "";
		
		for (String name : customerDB.keySet()) {
			
			if (customerDB.get(name).getOrderList().size() > orders) {
				orders = customerDB.get(name).getOrderList().size(); // update orders
				bestCustomer = name; // store the customer's name
			}// end of if
		}// end of for
		
		System.out.println("The Dessert Shop's most valued customer is: " + bestCustomer +"!");
		System.out.println("------------------------------------------------------------------------");
		
	}// end of bestCustomer()
	

	public abstract String toString();
}// end of Class