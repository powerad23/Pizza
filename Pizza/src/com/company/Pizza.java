package com.company;
import java.util.Scanner;

/**
 * Created by Jared_Dana on 5/29/2017.
 */
public class Pizza
{
	protected String crust;
	protected String sauce;
	protected String cheese;
	protected static Scanner read;
	protected Toppings my_toppings;

	public Pizza()
	{
		crust = "";
		sauce = "";
		cheese = "";
		read = new Scanner(System.in);
		my_toppings = new Toppings();
	}

	public static void main(String[] args)
	{

	}

	public int create_pizza()
	{

		System.out.println("What Kind of crust does it have?");
		crust = read.nextLine();

		System.out.println("Okay, what kind of sauce?");
		sauce = read.nextLine();

		System.out.println("What kind of cheese?");
		cheese = read.nextLine();

		my_toppings.choose_toppings();
		return 1;
	}

	public void display()
	{
		System.out.println("Crust: " + crust);
		System.out.println("Sauce: " + sauce);
		System.out.println("Cheese: " + cheese);
		my_toppings.display_toppings();
	}
}
