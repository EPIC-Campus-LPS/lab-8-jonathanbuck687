package Monster;

public class MonsterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Jeremy";
		String name2 = "Yonder";
		String type1 = "Fire";
		String type2 = "Water";
		int level1 = 12;
		int level2 = 12345678;
		Monster jeremy = new Monster(name1, type1, level1);
		Monster yonder = new Monster(name2, type2, level2);
		System.out.println(jeremy.toString());
		System.out.println(yonder.toString());
		System.out.println(Monster.basicBattle(jeremy, yonder));
		System.out.println(Monster.typeBattle(jeremy, yonder));
		if (jeremy == null)
		{
			System.out.println("jeremy = null");
		}
		if (yonder == null)
		{
			System.out.println("yonder = null");
		}
		
	}

}
