package CountrySimulator;

public class CapitolCity {
	private static String name;
	private static int population;
	public CapitolCity(String n, int p)
	{
		name = n;
		population = p;
	}
	public static String getName()
	{
		return name;
	}
	public static int getPopulation()
	{
		return population;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setPopulation(int p)
	{
		population = p;
	}
	public boolean isMegaCity()
	{
		if (population > 10000000)
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
		return("CapitalCity(Name=" + name + " , Population=" + population + ")");
	}
}
