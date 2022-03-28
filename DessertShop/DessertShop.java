package DessertShop;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import DessertShop.Payable.PayType;

public class DessertShop {
	static HashMap<String, Customer> customerDB = new HashMap<>();
	/*
	   This function operates input validation for double numeric values.
	   It prompts the user for with a question, throws a warning when the
	   input is invalid, and returns the numeric value of the user's input.
	 */
	private static double inputNumber(String prompt, String warning, Scanner in) {
		double num;

		while (true) {
			System.out.print(prompt);
			String str = in.nextLine();
			try {
				num = Double.parseDouble(str);
				break;
			} catch (Exception e) {
				System.out.println(warning);
			} // end of try-catch
		} // end of while (true)
		return num;
	} // end of inputNumber(String prompt, String warning, Scanner in)

	/*
	   This functions executes the prompt action for a Candy order.
	   It returns a new Candy Object.
	 */
	private static DessertItem userPromptCandy(Scanner in) {
		double weight, price;
		String name;
		System.out.print("Enter the type of candy: ");
		name = in.nextLine();
		weight = inputNumber("Enter the weight purchased: ", "Invalid weight, try again.", in);
		price = inputNumber("Enter the price per pound: ", "Invalid price, try again.", in);
		return new Candy(name, weight, price);
	} // end of userPromptCandy(Scanner in)

	/*
	   This functions executes the prompt action for a Cookie order.
	   It returns a new Cookie Object.
	 */
	private static DessertItem userPromptCookie(Scanner in) {
		int qty;
		double price;
		String name;

		System.out.print("Enter the type of cookie: ");
		name = in.nextLine();

		qty = (int) inputNumber("Enter the quantity purchased: ", "Invalid quantity, try again.", in);

		price = inputNumber("Enter the price per dozen: ", "Invalid price, try again.", in);

		return new Cookie(name, qty, price);
	} // end of userPromptCookie(Scanner in)

	/*
	   This functions executes the prompt action for an Ice Cream order.
	   It returns a new IceCream Object.
	 */
	private static DessertItem userPromptIceCream(Scanner in) {
		int scoops;
		double price;
		String name;

		System.out.print("Enter the type of Ice Cream used: ");
		name = in.nextLine();

		scoops = (int) inputNumber("Enter how many scoops were purchased: ", "Invalid scoops, try again.", in);

		price = inputNumber("Enter the price per scoop: ", "Invalid price, try again.", in);

		return new IceCream(name, scoops, price);
	} // end of userPromptIceCream(Scanner in)

	/*
	   This functions executes the prompt action for a Sundae order.
	   It returns a new Sundae Object.
	 */
	private static DessertItem userPromptSundae(Scanner in) {
		int scoops;
		double priceSc, priceTp;
		String name, topping;

		System.out.print("Enter the type of Ice Cream used: ");
		name = in.nextLine();

		scoops = (int) inputNumber("Enter how many scoops were purchased: ", "Invalid scoops, try again.", in);

		priceSc = inputNumber("Enter the price per scoop: ", "Invalid price, try again.", in);

		System.out.print("Enter the kind of topping used: ");
		topping = in.nextLine();

		priceTp = inputNumber("Enter the price for the topping: ", "Invalid price, try again.", in);

		return new Sundae(name, scoops, priceSc, topping, priceTp);
	} // end of userPromptSundae(Scanner in)

	/*
	   This functions execute the admin module.
	   It displays a menu, which then will call the appropriate function
	   based on the user's selection.
	 */
	private static void adminModule(Scanner in) {
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
					customerOrderHistory(in);
					break;
				case "3":
					bestCustomer();
					break;
				case "4":
					done = true;
					break;
			} // end of switch (answer)
		} // end of while (!done)
	} // end of adminModule(Scanner in)

	/* This functions prints a customer list with names and ID's */
	private static void customerList() {
		for (String name : customerDB.keySet()) {
			System.out.printf("Customer Name: %-8sCustomer ID: %-4d\n", name, customerDB.get(name).getID());
		} // end of for (String name : customerDB.keySet())
	} // end of customerList()

	/*
	   This functions prints to the screen all of the customer's order history.
	   It displays every single receipt generated for the customer.
	 */
	private static void customerOrderHistory(Scanner in) {
		boolean valid = false;
		String name = "";

		/* Input validation for finding customers */
		while (!valid) {
			System.out.print("Enter the name of the customer: ");
			name = in.nextLine();
			if (customerDB.containsKey(name)) valid = true;
			else System.out.println("Customer not found. Try again.");
		} // end of while (!valid)

		Customer customer = customerDB.get(name); // Object referent to the customer
		System.out.print("\n" + customer);
		System.out.println("------------------------------------------------------------------------");

		int orderCount = 1;
		for (Order order : customer.getOrderHistory()) {
			System.out.println("Order: #" + orderCount);
			System.out.println(order + "\n");
			orderCount++;
		} // end of for (Order order : customer.getOrderHistory())
	} // end of customerOrderHistory(Scanner in)

	/*
	   This functions iterates through the customersDB and compare all of the customers orderHistory sizes.
	   Then it displays the customer with most orders as the best customer.
	 */
	private static void bestCustomer() {
		System.out.println("---------------------------------------------------------------");

		int orders = 0;
		String valuedCustomer = "";

		for (String name : customerDB.keySet()) {
			// if the customers total order number is greater than the current orders
			if (customerDB.get(name).getOrderHistory().size() > orders) {
				orders = customerDB.get(name).getOrderHistory().size(); // orders value is updated
				valuedCustomer = name; // customer's name is store in a String
			} // end of if (customerDB.get(name).getOrderHistory().size() > orders);
		} // end of for (String name : customerDB.keySet())
		System.out.println("The Dessert Shop's most valued customer is: " + valuedCustomer + "!");
		System.out.println("---------------------------------------------------------------");
	} // end of bestCustomer()

	public static void main(String[] args) {
		/* Main's object declaration */
		Order order;
		Scanner in = new Scanner(System.in);
		DessertItem orderItem;


		boolean closed = false;
		while(!closed) {
			order = new Order();
			String choice, paymentMethod;

			boolean done = false;
			while (!done) {
				/* Hard code to add standard DessertItems to the current order */
				Candy candyCorn = new Candy("Candy Corn", 1.5, .25);
				order.add(candyCorn);
				Candy gummyBear = new Candy("Gummy Bear", .25, .35);
				order.add(gummyBear);
				Candy gummyBear2 = new Candy("Gummy Bear", 1.00, .35);
				order.add(gummyBear2);
				Cookie chocolateChip = new Cookie("Chocolate Chip", 6, 3.99);
				order.add(chocolateChip);
				Cookie chocolateChip2 = new Cookie("Chocolate Chip", 6, 1.99);
				order.add(chocolateChip2);
				IceCream pistachio = new IceCream("Pistachio", 2, .79);
				order.add(pistachio);
				Sundae vanillaHotFudge = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
				order.add(vanillaHotFudge);
				Cookie oatmealRaisin = new Cookie("Oatmeal Raisin", 2, 3.45);
				order.add(oatmealRaisin);

				/* Prompt Menu Display */
				System.out.println("\n1: Candy");
				System.out.println("2: Cookie");
				System.out.println("3: Ice Cream");
				System.out.println("4: Sundae");
				System.out.println("5: Admin Module");
				System.out.print("\nWhat would you like to add to the order? (1-5, Enter for done): ");
				choice = in.nextLine();

				if (choice.equals("")) {
					done = true;
				} else {
					switch (choice) {
						case "1":
							orderItem = userPromptCandy(in);
							order.add(orderItem);
							break;
						case "2":
							orderItem = userPromptCookie(in);
							order.add(orderItem);
							break;
						case "3":
							orderItem = userPromptIceCream(in);
							order.add(orderItem);
							break;
						case "4":
							orderItem = userPromptSundae(in);
							order.add(orderItem);
							break;
						case "5":
							adminModule(in);
							break;
					}// end of switch (choice)
				} // end of if (choice.equals(""))
			} // end of while (!done)

			/* CustomerDB implementation */
			System.out.print("Enter the customer name: ");
			String customerName = in.nextLine();

			if (!customerDB.containsKey(customerName)) { // if the map does not contain the customer key...
				Customer customerObj = new Customer(customerName); // a new customer object is instantiated...
				customerDB.put(customerName, customerObj); // then it is added to the map
			} // end of if (!customerDB.containsKey(customerName))

			Customer customerObj = customerDB.get(customerName); // reference to the customer key's value.
			customerObj.addToHistory(order);


			done = false;
			while (!done) {
				System.out.println("\nWhat form of payment will be used? (CASH, CARD, PHONE): ");
				paymentMethod = in.nextLine();
				paymentMethod = paymentMethod.toUpperCase();
				switch (paymentMethod) {
					case "CASH":
						order.setPayType(PayType.CASH);
						done = true;
						break;
					case "CARD":
						order.setPayType(PayType.CARD);
						done = true;
						break;
					case "PHONE":
						order.setPayType(PayType.PHONE);
						done = true;
						break;
					default:
						System.out.println("That's not a valid form of payment.");
				} // end of switch (paymentMethod.toUpperCase())
			} // end of while (!done)

			Collections.sort(order.getOrderList());

			/* Print receipt */
			System.out.println("\n" + order);
			System.out.println("------------------------------------------------------------------------");
			System.out.println(customerObj);

			/* Start a new Order */
			System.out.println("\nHit enter to start a new order.");
			String hit = in.nextLine();
			if(!hit.equals("")) closed = true; // if any other value is entered, the shop closes.
		} // end of while (!closed)
		in.close();
	} // end of main(String[] args)
} // end of DessertShop