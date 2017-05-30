package com.company;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int response = 0;
		Scanner read = new Scanner(System.in);
		List my_list = new List();
		while(response != 5) {
			System.out.println("Welcome to the pizza app. Can I take your order?");
			System.out.println("What would you like to do?");
			System.out.println("1.Add a new pizza to list of pizzas");
			System.out.println("2.Display all pizzas");
			System.out.println("3.Remove a pizza");
			response = read.nextInt();
			read.nextLine();

			if(response == 1)
			{
				String to_add;
				Pizza my_pizza = new Pizza();
				my_pizza.create_pizza();
				my_list.add_node(my_pizza);
			}
			else if(response == 2)
			{
				my_list.display_all();
			}
			else if(response == 5)
			{
				System.out.println("Bye!");
			}
		}


	}
}
