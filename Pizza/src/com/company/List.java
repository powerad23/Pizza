package com.company;

/**
 * Created by Jared_Dana on 5/29/2017.
 */
public class List
	{
		protected node head;

		public List()
		{
			head = null;
		}

		public static void main(String[] args)
		{

		}
		public int add_node(Pizza my_pizza)
		{
			if(head == null)
			{
				head = new node();
				head.prev = null;
				head.next = null;
				head.copy_pizza(my_pizza); //Fill in pizza data to the node;
				return 1;
			}
			else
			{
				node temp = new node();
				temp.copy_pizza(my_pizza);
				temp.next = head;
				head.prev = temp;
				head = temp;
				return 1;
			}
		}
		public void display_all()
		{
			if(head == null)
			{
				return;
			}
			node curr = head;
			while(curr != null)
			{
				System.out.printf("Pizza name: " + curr.pizza_name + "\n");
				curr.display_basics();
				curr.pizza_toppings.display_toppings();
				curr = curr.next;
			}
		}
	}
