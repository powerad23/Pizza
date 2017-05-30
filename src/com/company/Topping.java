package com.company;

/**
 * Created by Jared_Dana on 5/29/2017.
 */
public class Topping
{
	String my_topping;
	public Topping(String to_add)
	{
		my_topping = to_add;
	}
	public static void main(String[] args)
	{

	}
	public void change_topping(String swap)
	{
		my_topping = swap;
	}

	public void display()
	{
		System.out.println("Topping: " + my_topping);
	}
}
