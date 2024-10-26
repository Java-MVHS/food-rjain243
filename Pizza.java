//Rashika Jain
//10-25-24 Per. 5
/*
Pizza.java
This program uses constructors to pass values to Food & DeepDishPizza.
*/

public class Pizza extends Food
{
	public Pizza(String ingredientIn) //passes value of ingredient
	{	
		super("baked", ingredientIn, "pizza"); //sends values to Food
	}
	public Pizza(String ingredientIn, String nameIn) //passes values of ingredient and name
	{
		super("baked", ingredientIn, nameIn); //sends values to DeepDishPizza
	}
}
	
	
