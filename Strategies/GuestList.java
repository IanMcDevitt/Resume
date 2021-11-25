package Strategies;

import java.util.ArrayList;
public class GuestList {
	/**
	 * Private variables
	 */
	private String title;
	private ArrayList<String> people;
	private SearchBehavior searchBehavior;
	/**
	 * constructor for the object GuestList
	 * @param title
	 */
	public GuestList(String title) 
	{
		this.title = title;
		searchBehavior = new LinearSearch();
		this.people = new ArrayList<String>();
	}
	/**
	 * checks the boolean value for the adds method
	 * @param person
	 * @return
	 */
	public boolean add(String person) 
	{
		if(searchBehavior.contains(people,person))
			return false;

		setList(person);
		return true;	
	}
	public boolean remove(String person) 
	{
		if(searchBehavior.contains(people, person))
		{
			setListRemove(person);	
			return true;
		}
		else 
			return false;
	}
	/**
	 * gets the title
	 * @return
	 */
	public String getTitle() 
	{
		return this.title;
	}
	/**
	 * sets title
	 * @param Ta
	 */
	public void setTitle(String Ta) 
	{
		if(Ta != null)
			this.title = Ta;
		else 
			this.title = "none";
	}
	/**
	 * sets new search behavior for Bindary
	 * @param searchBehavior
	 */
	public void setSearchBehavior(SearchBehavior searchBehavior)
	{
			if(searchBehavior != null) {
				this.searchBehavior = searchBehavior;
			}
	}		
	/**
	 * getter for arrayList getList
	 * @return
	 */
	public ArrayList<String> getList()
	{
		return this.people;
	}
	/**
	 * setter for ArrayList people
	 * @param person
	 */
	public void setList(String person)
	{
		if(person != null)
		people.add(person);
	}
	/**
	 * removes a person from the arraylist people
	 * @param person
	 */
	public void setListRemove(String person) 
	{
		if(person != null)
		people.remove(person);
	}
	
	
		
	
}
