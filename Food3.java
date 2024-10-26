//Rashika Jain
//10-25-24 Per. 5
/*
Food3.java
This program formats and writes the final output and the method printForSale() is made to get called in FoodTester3 
*/


public class Food3
{
	double price = -1; //declare price

	protected String str;
	
	public Food3 () //constuctor for Food3
	{
		str = new String("");
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int amount, int cost) //overloaded constructor for Food3
	{	
		price = amount*cost/100; //conversion from cents to dollars
		
		str = String.format("At the sale: %s %s with %s with be sold for %d cents each. With %d muffin(s) $%.2f can be made.", name, prepMethod, ingredient, cost, amount, price); //formats the sentence to pass in the values for name, prepMethod, ingredient, cost ,amount, and price to print to user
	}

	public void printForSale() //prints str to show to user in final output
	{
		System.out.println(str);
	}
}
