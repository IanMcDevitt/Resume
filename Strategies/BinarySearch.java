package Strategies;

import java.util.ArrayList;
/**
 * Created a child of interface SearchBehaviors
 * @author imm20
 *
 */
public class BinarySearch implements SearchBehavior {
	
	public boolean contains(ArrayList<String> data, String item) {
/**
 * Created a binary search to return a boolean value of false if it matchces
 */

/**
 * The fondation of this Binary Search is from: https://www.geeksforgeeks.org/java-program-to-perform-binary-search-on-arraylist/
 */
		int first = 0;
	    int last = data.size() - 1;
	    int mid;
	    while (first <= last)
	    {
	        mid = ( first + last ) / 2;
	        if(item.equalsIgnoreCase(data.get(mid)))
	        {
	        	return true;
	        } else if(item.compareTo(data.get(mid)) > 0)
	        {
	            last = mid - 1;    
	        } else {
	            first = mid + 1;
	        }
	       
	    }
		return false;
		
	}
	
}
