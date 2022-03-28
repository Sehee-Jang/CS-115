package week03;

import java.util.Scanner;

public class DessertShop {

	public static void main(String[] args) {
		Order order1 = new Order();
	
		//Add items to the order
		Candy i1 = new Candy("Candy Corn", 1.5, .25);
		Candy i2 = new Candy("Gummy Bears", .25, .35);
		Cookie i3 = new Cookie("Chocolate Chip", 6, 3.99);
		IceCream i4 = new IceCream("Pistachio", 2, .79);
		Sundae i5 = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
		Cookie i6 = new Cookie("Oatmeal Raisin", 2, 3.45);
		
		order1.add(i1);
		order1.add(i2);
		order1.add(i3);
		order1.add(i4);
		order1.add(i5);
		order1.add(i6);
		
		Scanner sIn = new Scanner(System.in);
		String choice;
		DessertItem orderItem;

		boolean done = false;
		while (!done) {
		     System.out.println("\n1: Candy");
		     System.out.println("2: Cookie");
		     System.out.println("3: Ice Cream");
		     System.out.println("4: Sunday");

		     System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
		     choice = sIn.nextLine();

		     if (choice.equals("")) {
		          done = true;
		     } else {
		          switch (choice) {
		               case "1":
		                    orderItem = userPromptCandy();
		                    order1.add(orderItem);
		                    break;
		               case "2":
		                    orderItem = userPromptCookie();
		                    order1.add(orderItem);
		                    break;
		               case "3":
		                    orderItem = userPromptIceCream();
		                    order1.add(orderItem);
		                    break;
		               case "4":
		                    orderItem = userPromptSundae();
		                    order1.add(orderItem);
		                    break;
		               }//end of switch (choice)
		          }//end of if (choice.equals(""))
		     }//end of while (!done)
		System.out.println("\n");
		System.out.print(order1.toString());
		
//		System.out.printf("'%s' added.\n", i1.getName());
//		System.out.println(order.itemCount());
		
		//go through whole getOrderList of order
		//grab each DessertITem in order
//		for(DessertItem n : order.getOrderList()) {
//			System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", n.getName(), n.calculateCost(), n.calculateTax());
//		}
//		
//		String finalOutput = "";
//		finalOutput += "------------------------Receipt------------------------\n";
//		System.out.println(finalOutput);
//		for(DessertItem n : order1.getOrderList()) {
//			String outputVar = String.format("%-25s$%-8.2f[Tax: $%.2f]\n", n.getName(), n.calculateCost(), n.calculateTax());
//			System.out.println(outputVar);
//		}
//		
		

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
		
		Candy cd = new Candy(input1, input2, input3);		
		return cd;
	} 
	
	private static DessertItem userPromptCookie() {
		Scanner in = new Scanner(System.in);
		String input;
		System.out.print("Enter the type of Cookie: ");
		String input1 = in.nextLine();
		
		System.out.print("Enter the quantity purchased: ");
		input = in.nextLine();
		int input2 = Integer.parseInt(input);
		
		System.out.print("Enter the price per dozen: ");
		input = in.nextLine();
		double input3 = Double.parseDouble(input);
		
		Cookie ck = new Cookie(input1, input2, input3);		
		return ck;
	}
	private static DessertItem userPromptIceCream() {
		Scanner in = new Scanner(System.in);
		String input;
		System.out.print("Enter the type of IceCream: ");
		String input1 = in.nextLine();
		
		System.out.print("Enter the number of scoops: ");
		input = in.nextLine();
		int input2 = Integer.parseInt(input);
		
		System.out.print("Enter the price per scoop: ");
		input = in.nextLine();
		double input3 = Double.parseDouble(input);
		
		IceCream ic = new IceCream(input1, input2, input3);		
		return ic;
	}
	private static DessertItem userPromptSundae() {
		Scanner in = new Scanner(System.in);
		String input;
		System.out.print("Enter the type of IceCream: ");
		String input1 = in.nextLine();
		
		System.out.print("Enter the price per scoop: ");
		input = in.nextLine();
		int input2 = Integer.parseInt(input);
		
		System.out.print("Enter the price per scoop: .");
		input = in.nextLine();
		double input3 = Double.parseDouble(input);
		
		System.out.print("Enter the kind of topping used:");
		String input4 = in.nextLine();
		
		System.out.print("Enter the price for the topping: ");
		input = in.nextLine();
		double input5 = Double.parseDouble(input);
		
		Sundae sd = new Sundae(input1, input2, input3, input4, input5);		
		return sd;
	}

}// end of class
