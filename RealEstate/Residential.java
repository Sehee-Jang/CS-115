package RealEstate;

import java.util.HashMap;
import java.util.Set;

public abstract class Residential extends Property implements Biddable {
	// Attributes
	private int bedCount;
	private int bathCount;
	private double sqFootage;
	private HashMap<String, Double> bids;

	// Constructors
	public Residential() {
		super();
		bedCount = 0;
		bathCount = 0;
		sqFootage = 0.0;
		bids = new HashMap<String, Double>();
	}
	
	public Residential(String sA, String Z, int bed, int bath, double ft) {
		super(sA, Z);
		bedCount = bed;
		bathCount = bath;
		sqFootage = ft;
		bids = new HashMap<String, Double>();
	}
	
	// Methods
	public int getBeds() {
		return bedCount;
	}// end of getBeds
	
	public int getBaths() {
		return bathCount;
	}// end of getBaths
	
	public double getSize() {
		return sqFootage;
	}// end of getSize
	
	public int setBeds(int bed) {
		return bedCount = bed;
	}// end of getBeds
	
	public int setBaths(int bath) {
		return bathCount = bath;
	}// end of getBaths
	
	public double setSize(double ft) {
		return sqFootage = ft;
	}// end of getSize
	
	public abstract double calculateAppraisalPrice();
	
	@Override
	public HashMap<String, Double> getBids() {
		return bids;
	} // end of getBids()

	@Override
	public Double getBid(String key) {
		return bids.get(key);
	} // end of getBid(String key)

	@Override
	public Set<String> getBidders() {
		return bids.keySet();
	} // end of getBidders()

	@Override
	public int getBidCount() {
		return bids.size();
	} // end of getBidCount()

	@Override
	public void newBid(String key, Double value) {
		if (bids.containsKey(key)) bids.replace(key, value);
		else bids.put(key, value);
	} // end of newBid(String key, Double value)
	
}// end of class
