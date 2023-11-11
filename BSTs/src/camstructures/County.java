package camstructures;

public class County {
	String name;
	String FIPS;
	String Seat;
	int population;
	double area;
	int key; //representation of FIPS without 
	
	public County(String name, String FIPS, String Seat, int population, double area) {
		this.name = name;
		this.FIPS = FIPS; //key
		this.key = cutZeros(FIPS);
		this.Seat = Seat;
		this.population = population;
		this.area = area;
	}
	
	private int cutZeros(String str) {
		while(str.charAt(0) == '0') {
			str = str.substring(1);
		}
		return Integer.valueOf(str);
	}
}
