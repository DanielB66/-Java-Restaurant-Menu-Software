public class Beverage extends Food {
	protected double drink_size;
	protected Boolean isCarbonated;
	
	public Beverage(String name, String description, double price, double drink_size, Boolean isCarbonated) {
		super(name, description, price);
		this.drink_size = drink_size;
		this.isCarbonated = isCarbonated;
	}

	public double getDrink_size() {
		return drink_size;
	}

	public Boolean getIsCarbonated() {
		return isCarbonated;
	}

	public void setDrink_size(double drink_size) {
		this.drink_size = drink_size;
	}

	public void setIsCarbonated(Boolean isCarbonated) {
		this.isCarbonated = isCarbonated;
	}

	@Override
	public String toString() {
		return "Beverage [drink_size=" + drink_size + ", isCarbonated=" + isCarbonated + ", name=" + name
				+ ", description=" + description + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Beverage && ((Beverage)obj).name.equals(this.name);
	}
	
}
