package Hafta2Odev;

public class ClassesWithAttributes_Product {
	
	public ClassesWithAttributes_Product() {
		System.out.println("Yapici blok calisti...");
		this.description=description;
		this.id=id;
		this.name=name;
		this.price=price;
		this.stockAmount=stockAmount;
	}
	
	
	//attribute | fields
	int id;
	String name;
	String description;
	double price;
	int stockAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	
	
	

}
