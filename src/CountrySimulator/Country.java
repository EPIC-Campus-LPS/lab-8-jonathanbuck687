package CountrySimulator;

public class Country {
	private static String name;
	private static CapitolCity capitolCity;
	public Country(String n, CapitolCity c)
	{
		name = n;
		capitolCity = c;
	}
	public static String getName()
	{
		return name;
	}
	public static CapitolCity getCapitolCity()
	{
		return capitolCity;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setCapitolCity(CapitolCity c)
	{
		capitolCity = c;
	}
	public static boolean hasMegaCapitolCity()
	{
		if ((Country.getCapitolCity()).getPopulation() > 10000000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString(CapitolCity c)
	{
		return("CapitalCity(Name=" + name + " , Population=" + (Country.getCapitolCity()).getPopulation() + ")");
	}
	
}
