public class Food {
	protected String name;
	protected String description;
	protected double price;
	
	public Food(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
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
	
@Override
	public String toString() {
		return "Food [name=" + name + ", description=" + description + ", price=" + price + "]";
	}

@Override
	public boolean equals(Object other) {
		return other instanceof Food && ((Food)other).name.equals(this.name);
	}

}
