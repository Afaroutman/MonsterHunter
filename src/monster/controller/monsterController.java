package monster.controller;

import javax.swing.JOptionPane;

import monster.model.Monster;
import monster.view.monsterFrame;

public class monsterController
{
	
	private Monster[][] myMonster;
	private monsterFrame appFrame;
	
	public monsterController()
	{
		myMonster = new Monster[3][2];
		fillMyMonsterArray();
		appFrame = new monsterFrame(this);
	}
	public Monster[][] getMyMonster()
	{
		return myMonster;
	}

	private void fillMyMonsterArray()
	{
		for(int row = 0; row < myMonster.length; row++)
		{
			for(int col = myMonster[row].length-1; col >= 0; col--)
			{
				String name = row + col + "Monster";
				int weakFire = (int) (Math.random() * 10);
				boolean breakTail = (weakFire%2 == 0);
				
				myMonster[row][col] = new Monster(name, weakFire, breakTail);
			}
		}
	}
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Welcome to monster app");
	}

	
}
