// דניאל בן עמי ת.ז 313577140

public class MainCourse extends Food {
	protected String kitchen;

	public MainCourse(String name, String description, double price, String kitchen){
		super(name, description, price);
		this.kitchen = kitchen;
	}

	public String getKitchen() {
		return kitchen;
	}

	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}

	@Override
	public String toString() {
		return "MainCourse [kitchen=" + kitchen + ", name=" + name + ", description=" + description + ", price=" + price
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof MainCourse && ((MainCourse)obj).name.equals(this.name);
	}
	
}
