//Rashika Jain
//10-25-24 Per. 5
/*
Pizza3.java
This program uses constructors to pass values to Food & DeepDishPizza including the cost and amount.
*/

public class Pizza3 extends Food3
{
	public Pizza3(String ingredientIn, int amountIn, int costIn) //passes values of ingredient, amount, and cost
	{	
		super("baked", ingredientIn, "pizza", amountIn, costIn); //sends values to Food
	}
	
	public Pizza3(String ingredientIn, String nameIn, int amountIn, int costIn) //passes values of ingredient, name, amount, and cost
	{
		super("baked", ingredientIn, nameIn, amountIn, costIn); //sends values to DeepDishPizza
	}
}
	
	
