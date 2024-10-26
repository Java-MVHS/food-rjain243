//Rashika Jain
//10-25-24 Per. 5
/*
FoodTester3.java
This program uses the main method to print the final output.
*/

public class FoodTester3
{
	public static void main (String [] args) //main method
	{
		print(); //prints 3 blank lines
		Food3 food1 = new Food3 ("baked", "banana", "muffins", 12, 50); //instantiates Food3 to create food1 and uses values for muffins
		food1.printForSale(); //prints line for muffins
		Food3 food2 = new Food3 ("fried", "yam", "fritters", 3, 100); //instantiates Food3 to create food2 and uses values for fritters
		food2.printForSale(); //prints line for fritters
		Pizza3 pizza = new Pizza3 ("anchovies", 8, 250); //instantiates Pizza3 to create the first pizza and uses values for pizzas
		pizza.printForSale(); //prints line for pizzas
		DeepDishPizza3 pizza2 = new DeepDishPizza3("anchovies", 8, 250); //instantiates DeepDishPizza3 to create the second pizza and uses values for deepdishpizzas
		pizza2.printForSale(); //prints like for deepdishpizzas
		print(); //prints 3 blank lines
	}
	
	public static void print () //method to print 3 blank lines
	{
		System.out.println("\n\n\n");
	}
		
}
