package RealEstate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class REO {
	private static Listings listings = new Listings();
	
	public static void main(String[] args) {
		ArrayList<Residential> all = new ArrayList<Residential>();
		Scanner sIn = new Scanner(System.in);
		Residential menu;
		String choice;
		boolean done = false;
		
		while (!done) {
			System.out.println("----------------------------------------");
			System.out.printf("%24s\n", "Main Menu");
			System.out.println("----------------------------------------");
			System.out.println("\n1: Listings");
			System.out.println("2: Bids");
			System.out.print("\nWhat would you like to do? (1-2): ");

			choice = sIn.nextLine();
			if (choice.equals("")) {
				done = true;
			} else {
				switch (choice) {
				case "1":
					menu = Listings();
					break;
				case "2":
					menu = Bids();
					break;
				default:
					System.out.println("Invalid. Please, try again.");
				}// end of switch (choice)
			} // end of if (choice.equals(""))
		} // end of while (!done)

	}// end of main()

	
	
	/*
	 * This is a menu for listings. It returns to the main() when it's done.
	 */
	private static Residential Listings() {
		boolean done = false;
		
		while (!done) {
			System.out.println("----------------------------------------");
			System.out.printf("%26s\n", "Listing Menu");
			System.out.println("----------------------------------------");
			Scanner Lin = new Scanner(System.in);
			String Linput;
	
			System.out.println("1: Add Listing");
			System.out.println("2: Show Listings");
			System.out.println("3: Auto Populate Listings (Dev tool)");
			System.out.println("ENTER: Exit back to previous menu\n");
			System.out.print("What would you like to do? (1-3): ");
			Linput = Lin.nextLine();
			
			System.out.println("\n");
			if(Linput.equals("")) {
				done = true;
			} else {
				switch (Linput) {
				case "1":
					addListing(Lin);
					break;
				case "2":
					showListings();
					break;
				case "3":
					autoPopulate();
					break;
				default:
					System.out.println("Invalid. Please, try again.");
				}
				System.out.println("\n");
			}

		}// end of while
		return null;
	}// end of Listings()

	
	/*
	 * This is a menu for adding listings. It returns to the Listings() when it's done.
	 */
	private static void addListing(Scanner in) {
		boolean done = false;
		while(!done) {
			System.out.println("----------------------------------------");
			System.out.printf("%27s\n", "Add Listing Menu");
			System.out.println("----------------------------------------");
			Scanner Lin01 = new Scanner(System.in);
			
			System.out.println("1: Add House");
			System.out.println("2: Add Condo");
			System.out.println("ENTER: Exit back to previous menu");
			System.out.print("What would you like to do? (1-2): ");
			String Linput01 = Lin01.nextLine();
			
			if (Linput01.equals("")) {
				done = true;
			} else {
				switch (Linput01) {
				case "1":
					addHouseModule(Lin01);
					break;
				case "2":
					addCondoModule(Lin01);
					break;	
				default:
					System.out.println("Invalid. Please, try again.");
				}// end of switch (choice)	
			} // end of if (choice.equals(""))
			
		}// end of while(!done)	
	}// end of addListing(Scanner in)
	
	
	/*
	 * Query the user for all the data needed to create a House object
	 * as well as the List price and add it to your Listings HashMap object. 
	 */
	private static void addHouseModule(Scanner in) {
		System.out.print("Please enter the street address for the residence: ");
		String address = in.nextLine();
		System.out.print("Please enter the zip code for the residence: ");
		String zip = in.nextLine();
		System.out.print("Please enter the number of bedrooms: ");
		int numBed = in.nextInt();
		System.out.print("Please enter the number of bathrooms: ");
		int numBath = in.nextInt();
		System.out.print("Please enter the square footage of the residence: ");
		int sqrFt = in.nextInt();
		System.out.print("Please enter the size of the yard in acres: ");
		double yardAcr = in.nextDouble();
	
		House house = new House(address, zip, numBed, numBath, sqrFt, yardAcr);
		listings.addListing(zip, house);
		
		System.out.printf("Appraisal Price for this property is: $%.2f\n", house.calculateAppraisalPrice());
		
		System.out.print("Please enter the List Price for the property: $");
		double listPrice = in.nextDouble();
			
		house.setListPrice(listPrice);			

		System.out.print("You have created a new listing!\n");
		System.out.print("\n" + house.toString());
		
	}// end of addHouseModule()
	
	
	/*
	 * Query the user for all the data needed to create a Condo object
	 * as well as the List price and add it to your Listings HashMap object.
	 */
	private static void addCondoModule(Scanner in) {
		System.out.print("Please enter the street address for the residence: ");
		String address = in.nextLine();
		System.out.print("Please enter the zip code for the residence: ");
		String zip = in.nextLine();
		System.out.print("Please enter the number of bedrooms: ");
		int numBed = in.nextInt();
		System.out.print("Please enter the number of bathrooms: ");
		int numBath = in.nextInt();
		System.out.print("Please enter the square footage of the residence: ");
		double sqrFt = in.nextDouble();
		System.out.print("Please enter the floor level of the condo: ");
		int floorLvl = in.nextInt();
	
		Condo condo = new Condo(address, zip, numBed, numBath, sqrFt, floorLvl);
		listings.addListing(zip, condo);
		
		System.out.printf("Appraisal Price for this property is: $%.2f\n", condo.calculateAppraisalPrice());
		
		System.out.print("Please enter the List Price for the property: $");
		double listPrice = in.nextDouble();
			
		condo.setListPrice(listPrice);	
		
		System.out.print("You have created a new listing!\n");
		System.out.print("\n" + condo.toString());
	}// end of addCondoModule()
	
	
	/*
	 * Display all the listings in the HashMap object as shown in the Example Run. 
	 */
	private static void showListings() {
		int i = 1;
		System.out.println();
		for(String address : listings.getStreetAddresses()) {
			System.out.println("Lsiting No. " + i );
			System.out.println(listings.getListing(address));
			i++;
		}// end of for(String address : listing.getStreetAddresses())	
	}// end of showListings()
	
	
	/*
	 * Add the ability for a user to create several hard coded House and Condo objects
	 * and add them to your Listings HashMap object for testing purposes.  
	 */	
	private static void autoPopulate() {
		int currentSize = listings.getListings().size();
		
		House house1 = new House("34 Elm","95129", 3, 2, 2200, .2);
		house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
		listings.addListing("34 Elm", house1);
		House house2 = new House("42 Hitchhikers","95136", 4, 3, 2800, .3);
		house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
		listings.addListing("42 Hitchhikers", house2);
		Condo condo1 = new Condo("4876 Industrial", "95177", 3, 1, 1800, 3);
		condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
		listings.addListing("4876 Industrial", condo1);
		House house3 = new House("2654 Oak","84062", 5, 53, 4200, .5);
		house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
		listings.addListing("2654 Oak", house3);
		Condo condo2 = new Condo("9875 Lexington","84063", 2, 1, 1500, 1);
		condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
		listings.addListing("9875 Lexington", condo2);
		Condo condo3 = new Condo("3782 Market", "84066", 3, 1, 1800, 2);
		condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
		listings.addListing("3782 Market", condo3);
		House house4 = new House("7608 Glenwood", "84055", 6, 3, 3900, .4);
		house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
		listings.addListing("7608 Glenwood", house4);
		House house5 = new House("1220 Apple", "84057", 8, 7, 7900, 1);
		house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
		listings.addListing("1220 Apple", house5);
		
		System.out.println("\n" + (listings.getListingCount() - currentSize) + " listings were auto-populated.");
		
	}// end of autoPopulate()
	
	
	/*
	 * This is a menu for Bids. It returns to the main() when it's done.
	 */
	private static Residential Bids() {
		boolean done = false;
		
		while (!done) {
			System.out.println("----------------------------------------");
			System.out.printf("%23s\n", "Bids Menu");
			System.out.println("----------------------------------------");

			Scanner Bin = new Scanner(System.in);
			String Binput;
	
			System.out.println("1: Add New Bid");
			System.out.println("2: Show Existing Bids");
			System.out.println("3: Auto Populate Bids (Dev Tool)");
			System.out.println("ENTER: Exit back to previous menu");
			System.out.print("What would you like to do? (1-3): ");
			Binput = Bin.nextLine();
			
			System.out.println("\n");
			if(Binput.equals("")) {
				done = true;
			} else {
				switch (Binput) {
				case "1":
					addNewBid(Bin);
					break;
				case "2":
					showExistingBids(Bin);
					break;	
				case "3":
					autoPopulateBids();
					break;
				default:
					System.out.println("Invalid. Please, try again.");
				}// end of switch (choice)	
			} // end of if (choice.equals(""))

		}// end of while
		return null;
	}// end of Bids()
	
	private static HashMap<String, String> currentListing() {
		HashMap<String, String> list = new HashMap<String, String>();
		int cL = 1;
		
		for (String address : listings.getStreetAddresses()) {
			System.out.printf("%d: %s (%d)\n", cL, address, listings.getListing(address).getBidCount());
			String str = Integer.toString(cL);
			list.put(str, address);
			cL++;
		}// end of for
		
		return list;
	}// end of currentListing()
	
	private static void addNewBid(Scanner in) {
		HashMap<String, String> list;
		boolean done = false;
		System.out.println("Current Listings for REO:\n");
		System.out.printf("No. %2s Properties (bids)\n", " ");
		System.out.println("----------------------------------------");

		while(!done) {
			list = currentListing();
			
			System.out.print("For which property would you like to add a bid?: \n");
			String choice = in.nextLine();
			
			if(choice.equals("")) done = true;
			else if (!list.containsKey(choice))
				System.out.println("Invalid. Please, try again.");
			else {
				Residential listing = listings.getListing(list.get(choice));
				
				System.out.println(listing);
				System.out.print("Please enter the name of the bidder: ");
				String name = in.nextLine();
				System.out.print("Please enter the new bid: $");
				double bid = in.nextDouble();
				listing.newBid(name, bid);
				
				System.out.printf("\nNew bid for property '%s' added.\n\n", listing.getStreetAddress());
			}// end of else
		}// end of while(!done)
		
	}// end of addNewBid()
	
	private static void showExistingBids(Scanner in) {
		HashMap<String, String> list;
		boolean done = false;
		
		System.out.println("Current Listings for REO: \n");
		System.out.printf("No. %2s Properties (bids)\n", " ");
		System.out.println("----------------------------------------");
		
		while(!done) {
			list = currentListing();
			
			System.out.print("For which property would you like to add a bid?: ");
			String choice = in.nextLine();
			
			if(choice.equals("")) done = true;
			else if (!list.containsKey(choice))
				System.out.println("Invalid. Please, try again.");
			else {
				Residential listing = listings.getListing(list.get(choice));
				System.out.println(listing);
				
				System.out.println("Current bids for this listing: ");
				System.out.println("----------------------------------------");
				System.out.printf("%3s Bidder %17s Bid\n", " ", " ");
				System.out.println("----------------------------------------");
				
				for (String bidder : listing.getBidders()) {
                    System.out.printf("%-24s $%,10.2f\n", bidder, listing.getBid(bidder));
                } // end of for (String bidder : listing.getBidders())
                
                System.out.println("\n");
			}// end of else
		}// end of while(!done)
	}// end of addNewBid()
	
	private static void autoPopulateBids() {
		//Hard Coded set of names to be used as bidders
		String[] autoBidders= {
				"Patric Stewart",
				"Walter Koenig",
				"William Shatner",
				"Leonard Nimoy",
				"DeForect Kelley",
				"James Doohan",
				"George Takei",
				"Majel Barrett",
				"Nichelle Nichol",
				"Jonathan Frank",
				"Marina Sirtis",
				"Brent Spiner",
				"Gates McFadden",
				"Michael Dorn",
				"LeVar Burton",
				"Wil Wheaton",
				"Colm Meaney",
				"Michelle Forbes"
		};// end of String[]
	 

		//Create an object of type Random,  r
		Random r = new Random();
	
		for(Residential res : listings.getResidences()) {
			int amtBids = r.nextInt(5)+1;
			int currentBids = res.getBidCount();
			
			for (int i = 0; i < amtBids; i++) {
				//Randomly select a number between 0 and the length of the autoBidders list - 1.  This will be your random index into the array
				int index = r.nextInt((autoBidders.length-1) +1);
				
				//Use the random index number to select a random bidder and use the appraisal price * some percentage to generate a bid amount.
				res.newBid(autoBidders[index], res.calculateAppraisalPrice() *  1.03);
			}
			
			System.out.println((res.getBidCount() - currentBids) + "  new bids have been added to listing " + res.getStreetAddress() + ".");
			
		}// end of for
		
		
		
	}// end of addNewBid()
	
} // end of Class