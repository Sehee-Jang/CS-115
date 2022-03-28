package RealEstate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public interface Listable  {
	// returns a HashMap<String, Residential> containing a list of street addresses (key) and their associated residences (value)
	HashMap<String, Residential> getListings();
	
	//returns the Residential value for the associated String key in a HashMap<String, Residential>
	Residential getListing(String key);
	
	// returns a Set<String> of keys from a HashMap<String, Residential>
	Set<String> getStreetAddresses();
	
	// returns a Collection<Residential> of values from a HashMap<String, Residential>
	Collection<Residential> getResidences();

	// returns the number of listings in the HashMap<String, Residential>
	int getListingCount();
	
	// returns void. Adds a new key/value pair in a HashMap<String, Residential>
	void addListing(String key, Residential value);
	
}// end of interface
