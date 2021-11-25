package Strategies;

import java.util.ArrayList;
/**
 * child for interface SearchBehavior: Linear Search Behavior
 */
public class LinearSearch implements SearchBehavior {
	public boolean contains(ArrayList<String> data, String item) {
	
		/**
		 * assumes that the first value of the array list is filled 
		 * when it reality is hasnt been filled yet.
		 */
		if(data == null)
		{
					return false;
		}
		else
		/**
		 * loops through the now existing list to check to see if there is a match
		 */
		{
			for(int i=0;i<data.size();i++)
			{
				if(data.get(i).equalsIgnoreCase(item))
					return true;
			}
		}
		return false;
	}
	
}
