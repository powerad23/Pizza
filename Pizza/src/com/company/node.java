package com.company;

import java.util.Scanner;

/**
 * Created by Jared_Dana on 5/29/2017.
 */
public class node
{
	protected node prev;
	protected node next;
	protected String[] pizza;
	protected String pizza_name;
	protected Toppings pizza_toppings;
	Scanner read = new Scanner(System.in);

	public node()
	{
		prev = null;
		next = null;
		pizza = new String[3];
		pizza_toppings = null;
		pizza_name = "";
	}

	public int copy_pizza(Pizza my_pizza)
	{
		pizza_toppings = new Toppings(my_pizza.my_toppings.nToppings);
		System.out.println("What do you want to call this pizza for short?");
		pizza_name = read.nextLine();
		pizza[0] = new String(my_pizza.crust);
		pizza[1] = new String(my_pizza.cheese);
		pizza[2] = new String(my_pizza.sauce);
		pizza_toppings.copy_toppings(my_pizza);
		return 1;

	}
	public void display_basics()
	{
		System.out.println("Crust: " + pizza[0]);
		System.out.println("Cheese:" + pizza[1]);
		System.out.println("Sauce: " + pizza[2]);
	}
}

