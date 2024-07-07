// דניאל בן עמי ת.ז 313577140

public class Wine extends Beverage {
	protected double percentage_of_alcohol;
	protected int year_of_manufacture;
	
	public Wine(String name, String description, double price, double drink_size, Boolean isCarbonated,
			double percentage_of_alcohol, int year_of_manufacture) {
		super(name, description, price, drink_size, isCarbonated);
		this.percentage_of_alcohol = percentage_of_alcohol;
		this.year_of_manufacture = year_of_manufacture;
	}

	public double getPercentage_of_alcohol() {
		return percentage_of_alcohol;
	}

	public int getYear_of_manufacture() {
		return year_of_manufacture;
	}

	public void setPercentage_of_alcohol(double percentage_of_alcohol) {
		this.percentage_of_alcohol = percentage_of_alcohol;
	}

	public void setYear_of_manufacture(int year_of_manufacture) {
		this.year_of_manufacture = year_of_manufacture;
	}

	@Override
	public String toString() {
		return "Wine [percentage_of_alcohol=" + percentage_of_alcohol + ", year_of_manufacture=" + year_of_manufacture
				+ ", drink_size=" + drink_size + ", isCarbonated=" + isCarbonated + ", name=" + name + ", description="
				+ description + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Wine && ((Wine)obj).name.equals(this.name);
	}
	
	
}
