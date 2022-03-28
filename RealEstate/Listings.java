package RealEstate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class Listings implements Listable {

	//Attribute
	private HashMap<String, Residential> listings;
	
	//Constructor
	public Listings() {
		listings = new HashMap<String, Residential>();
	}

	
	//Methods
	
	@Override
	public HashMap<String, Residential> getListings() {
		return listings;
	}
	@Override
	public Residential getListing(String key) {
		return listings.get(key);
	}

	@Override
	public Set<String> getStreetAddresses() {
		return listings.keySet();
	}

	@Override
	public Collection<Residential> getResidences() {
		return listings.values();
	}

	@Override
	public int getListingCount() {
		return listings.size();
	}

	@Override
	public void addListing(String key, Residential value) {
		listings.put(key, value);	
	}
	
}
