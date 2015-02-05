package monster.model;

public class Monster
{

	private String name;
	private int weakFire;
	private boolean breakTail;
	
	public Monster(String name, int weakFire, boolean breakTail)
	{
		this.name = name;
		this.weakFire = weakFire;
		this.breakTail = breakTail;
	}
	public String getName()
	{
		return name;
	}
	public int getWeakFire()
	{
		return weakFire;
	}
	public boolean getBreakTail()
	{
		return breakTail;
	}
	@Override
	public String toString()
	{
		String monsterString = "";
		monsterString += "Hi, Im going to eat you in three seconds, rored " + name + ".";
		monsterString += " don't hit me with fire " + weakFire + " and ";
		if(breakTail)
		{
			monsterString += " You cut off my tail.";
		}
		else
		{
			monsterString += " You cant cut my tail off";
		}
		return monsterString;
	}
}
