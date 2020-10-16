package model;

public class Beverage extends Food{
	
	private String size;
	private String type;

	public String getSize() {
		return size;
	}

	public boolean setSize(String size) {
		if(!(size.equals("Small") || size.equals("Medium") || size.equals("Large"))) return false;
		
		this.size = size;
		
		return true;
	}
	
	public String getType() {
		return type;
	}

	public boolean setType(String type) {
		if(!type.equals("Hot") && !type.equals("Cold")) return false;
		
		this.type = type;
		
		return true;
	}

	public int sizePrice() {
		if(this.size.equals("Small")) return 1 * 5000;
		else if(this.size.equals("Medium")) return 2 * 5000;
		else return 3 * 5000;
	}
	
	@Override
	public int totalPrice() {
		return (basePrice() + sizePrice()) * super.getQty();
	}

}
