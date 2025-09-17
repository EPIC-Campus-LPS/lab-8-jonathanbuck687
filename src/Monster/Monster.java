package Monster;

public class Monster {
	private String name;
	private String type;
	private int level;
	public Monster(String n, String t, int l)
	{
		name = n;
		type = t;
		level = l;
	}
	public Monster (String n, String t)
	{
		name = n;
		type = t;
		level = 1;
	}
	public String getName()
	{
		return name;
	}
	public String getType()
	{
		return type;
	}
	public int getLevel()
	{
		return level;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setType(String t)
	{
		type = t;
	}
	public void setLevel(int l)
	{
		level = l;
	}
	public static Monster basicBattle(Monster m1, Monster m2)
	{
		if (m1.getLevel() >= m2.getLevel())
		{
			return m1;
		}
		else
		{
			return m2;
			
		}
	}
	public static Monster typeBattle(Monster m1, Monster m2)
	{
		if (m1.getType().equals("Water") && (m2.getType().equals("Fire")))
		{
			return m2;
		}
		else if (m1.getType().equals("Water") && (m2.getType().equals("Earth")))
		{
			return m1;
		}
		else if (m1.getType().equals("Fire") && (m2.getType().equals("Earth")))
		{
			return m2;
		}
		else if (m1.getType().equals("Fire") && (m2.getType().equals("Water")))
		{
			return m1;
		}
		else if (m1.getType().equals("Earth") && (m2.getType().equals("Water")))
		{
			return m2;
		}
		else if (m1.getType().equals("Earth") && (m2.getType().equals("Fire")))
		{
			return m1;
		}
		else
		{
			return m1;
		}
		
	}
	public String toString(Monster m)
	{
		return "Monster(Name=" + name + " , Type=" + type + " , Level=" + level + ")";
	}
	public boolean equals(Monster m1, Monster m2)
	{
		if ((m1.getName().equals(m2.getName())) && (m1.getType().equals(m2.getType())))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
}
