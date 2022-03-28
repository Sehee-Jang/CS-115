package DessertShop;

import java.util.ArrayList;

public class Customer {
    /* Attributes */
    private String custName;
    private ArrayList<Order> orderHistory;
    private int custID;
    private static int nextCustID = 1000;

    /* Constructors */
    public Customer() {
        custName = "";
        orderHistory = new ArrayList<Order>();
        custID = nextCustID;
        nextCustID++;
    } // end of Customer()

    public Customer(String n) {
        custName = n;
        orderHistory = new ArrayList<Order>();
        custID = nextCustID;
        nextCustID++;
    } // end of Customer(String n)

    /* Methods */
    public String getName() { return custName; }

    public void setName(String n) { custName = n; }

    public int getID() { return custID; }

    public ArrayList<Order> getOrderHistory() { return orderHistory; }

    public void addToHistory(Order o) { orderHistory.add(o); }

    /* Overridden Methods */
    @Override
    public String toString() {
        return String.format("Customer Name: %-12s Customer ID: %-13d Total Orders: %03d\n",
                custName, custID, orderHistory.size());
    } // end of toString()
}