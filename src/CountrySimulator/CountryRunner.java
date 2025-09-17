package CountrySimulator;

public class CountryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CapitolCity Paris = new CapitolCity("Paris", 2100000);
		CapitolCity Tokyo = new CapitolCity("Tokyo", 41000000);
		CapitolCity Cairo = new CapitolCity("Cairo", 22200000);
		Country France = new Country("France", Paris);
		Country Japan = new Country("Japan", Tokyo);
		Country Egypt = new Country("Egypt", Cairo);
		System.out.println(France.toString());
		System.out.println(Japan.toString());
		System.out.println(Egypt.toString());
	}

}
