// דניאל בן עמי ת.ז 313577140

public class Dessert extends Food {
	protected double caloric_value;

	public Dessert(String name, String description, double price, double caloric_value) {
		super(name, description, price);
		this.caloric_value = caloric_value;
	}

	public double getCaloric_value() {
		return caloric_value;
	}

	public void setCaloric_value(double caloric_value) {
		this.caloric_value = caloric_value;
	}

	@Override
	public String toString() {
		return "Dessert [caloric_value=" + caloric_value + ", name=" + name + ", description=" + description
				+ ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Dessert && ((Dessert)obj).name.equals(this.name);
	}
	
}
