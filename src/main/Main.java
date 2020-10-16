package main;

import java.util.Scanner;

import model.*;

public class Main {
	
	private Scanner scan = new Scanner(System.in);
	private Food food;
	private Beverage beverage;
	
	private void menu() {
		System.out.println("Fnbucks Cofee Shop");
		System.out.println("==================");
		System.out.println();
		System.out.print("Choose menu you want to order [Coffee | Cheese Cake]: ");
	}
	
	private void coffee() {
		beverage = new Beverage();
		System.out.println("Order Coffee:");
		
		do {
			System.out.print("Input order name [5..20 characters]: ");
		}while(!beverage.setName(scan.nextLine()));
		
		do {
			System.out.print("Input order size [Small | Medium | Large]: ");
		}while(!beverage.setSize(scan.nextLine()));
		
		do {
			System.out.print("Input order type [Cold | Hot]: ");
		}while(!beverage.setType(scan.nextLine()));
		
		do {
			System.out.print("Input order rating [1..4]: ");
		}while(!beverage.setRating(scan.nextInt()));
		
		do {
			System.out.print("Input order quantity: ");
		}while(!beverage.setQty(scan.nextInt()));
		
		System.out.println();
		System.out.println("Order coffee success!");
	}
	
	private void cheeseCake() {
		food = new Food();
		System.out.println("Order Cake:");
		
		do {
			System.out.print("Input order name [5..20 characters]: ");
		}while(!food.setName(scan.nextLine()));
		
		do {
			System.out.print("Input order rating [1..4]: ");
		}while(!food.setRating(scan.nextInt()));
		
		do {
			System.out.print("Input order quantity: ");
		}while(!food.setQty(scan.nextInt()));
		
		System.out.println();
		System.out.println("Order coffee success!");
	}
	
	private void print() {
		for(int i = 1; i <= 30; i++) System.out.println();
		
		System.out.println("Fnbucks Cofee Shop");
		System.out.println("==================");
		System.out.println();
		
		if(beverage == null) {
			System.out.println(" Cheese Cake Order");
			System.out.println("==========================================================");
			System.out.println("| Name                 | Quantity | Rating | Total Price |");
			System.out.println("==========================================================");
			System.out.printf("| %-20s | %9d | %5d | %11d |\n", food.getName(), food.getQty(), food.getRating(), food.totalPrice());
			System.out.println("==========================================================");
		} else {
			System.out.println(" Coffee Order");
			System.out.println("==========================================================================");
			System.out.println("| Name                 | Size   | Type | Quantity | Rating | Total Price |");
			System.out.println("==========================================================================");
			System.out.printf("| %-20s | %-6s | %-4s | %9d | %5d | %11d |\n", beverage.getName(), beverage.getSize(), beverage.getType(), beverage.getQty(), beverage.getRating(), beverage.totalPrice());
			System.out.println("==========================================================================");
		}
	}
	
	public Main() {
		String opt = "";
		
		do {
			menu();
			opt = scan.nextLine();
		} while(!opt.equals("Coffee") && !opt.equals("Cheese Cake"));
		
		if(opt.equals("Coffee")) {
			coffee();
		} else {
			cheeseCake();
		}
		print();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
