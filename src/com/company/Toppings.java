package com.company;
import java.util.Scanner;

/**
 * Created by Jared_Dana on 5/29/2017.
 */
public class Toppings
{
	protected Topping[] my_toppings;
	protected static Scanner read;
	int nToppings;
	String to_add;

	public Toppings()
	{
		nToppings = 0;
		to_add = "y";
		read = new Scanner(System.in);
		System.out.println("How many topping does this pizza have?");
		nToppings = read.nextInt();
		read.nextLine();
		my_toppings = new Topping[nToppings];
		for(int i = 0; i < nToppings; ++i)
		{
			my_toppings[i] = null;
		}
	}
	public Toppings(int num)
	{
		nToppings = num;
		my_toppings = new Topping[nToppings];
		nToppings = nToppings - 1; //Set it to highest index
		for(int i = 0; i <= nToppings; ++i)
		{
			my_toppings[i] = null;
		}
	}

	public static void main(String[] args)
	{

	}

	public void choose_toppings()
	{
		while(my_toppings[nToppings - 1] != null || !to_add.equals("n")) //Add toppings until pizza is full or user is done
		{
			int i = 0;
			while (my_toppings[i] != null) {
				++i;
			}
			while(to_add.equals("n") == false)
			{
				System.out.println("What topping do you wanna add?");
				to_add = read.nextLine();

				my_toppings[i] = new Topping(to_add); //Fill the array slot with a topping

				System.out.println("Want to add another topping");
				to_add = read.nextLine();
			}
		}
	}

	public void edit_toppings()
	{
		for(int i = 0; i < nToppings; ++i)
		{
			if(my_toppings[i] != null)
			{
				System.out.print("index: " + i);
				my_toppings[i].display();
			}
		}
	}

	public void copy_toppings(Pizza copy_from)
	{
		for(int i = 0; i < nToppings; ++i)
		{
			my_toppings[i] = copy_from.my_toppings.my_toppings[i]; //Confusing as heck but first my_toppings is the pizza list and second is array of toppings
		}
	}

	public void display_toppings()
	{
		for (int i = 0; i < nToppings; ++i)
		{
			System.out.println("Topping: " + my_toppings[i]);
		}
	}
}
