package camstructures;

public class County {
	String name;
	int FIPS;
	String Seat;
	int population;
	double area;
	
	public County(String name, int FIPS, String Seat, int population, double area) {
		this.name = name;
		this.FIPS = FIPS;
		this.Seat = Seat;
		this.population = population;
		this.area = area;
	}
}
