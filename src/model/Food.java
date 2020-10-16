package model;

public class Food {

	private String name;
	private int rating;
	private int qty;
	
	public String getName() {
		return name;
	}
	
	public boolean setName(String name) {
		if(name.length() < 5 || name.length() > 20) return false;

		for(int i = 0; i < name.length(); i++) {
			if(!Character.isAlphabetic(name.charAt(i))) return false;
		}
		
		this.name = name;
		
		return true;
	}
	
	public int getRating() {
		return rating;
	}
	
	public boolean setRating(int rating) {
		if(rating < 1 || rating > 4) return false;
		
		this.rating = rating;
		
		return true;
	}
	
	public int getQty() {
		return qty;
	}
	
	public boolean setQty(int qty) {
		if(qty <= 0) return false;
		
		this.qty = qty;
		
		return true;
	}
	
	public int basePrice() {
		return this.rating * 10000;
	}
	
	public int totalPrice() {
		return this.basePrice() * this.qty;
	}
	
}
