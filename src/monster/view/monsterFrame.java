package monster.view;

import javax.swing.JFrame;

import monster.controller.monsterController;

public class monsterFrame extends JFrame
{
	private monsterPanel appPanel;
	
	public monsterFrame(monsterController baseController)
	{
		appPanel = new monsterPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setContentPane(appPanel);
		this.setVisible(true);
	}
}
