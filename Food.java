//Rashika Jain
//10-25-24 Per. 5
/*
Food.java
This program uses constructors and the method printForSale() to make the final output
*/

public class Food
{
	protected String str;
	
	public Food () //constuctor for Food
	{
		str = new String("");
	}
	
	public Food (String prepMethod, String ingredient, String name) //overloaded constructor for Food
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient; //unformatted way of writing the final output with no values passed in
	}

	public void printForSale() //method to print final output
	{
		System.out.println(str);
	}
}

