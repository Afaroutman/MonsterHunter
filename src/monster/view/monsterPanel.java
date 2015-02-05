package monster.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import monster.controller.monsterController;
import monster.model.Monster;

public class monsterPanel extends JPanel
{
	private monsterController baseController;
	private JTable monsterTable;
	private SpringLayout baseLayout;
	private JLabel titleLabel;
	
	public monsterPanel(monsterController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		titleLabel = new JLabel("Fight to Survive");
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupTable()
	{
		String [] colNames = {"Monster col 1", "Monster col 2"};
		DefaultTableModel monsterModel = new DefaultTableModel(baseController.getMyMonster(), colNames);
		monsterTable = new JTable(monsterModel);
		baseLayout.putConstraint(SpringLayout.WEST, monsterTable, 150, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, monsterTable, -50, SpringLayout.EAST, this);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, titleLabel, 55, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, titleLabel, -181, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, monsterTable, 100, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, monsterTable, -50, SpringLayout.SOUTH, this);
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(monsterTable);
		this.add(titleLabel);
		this.setBackground(Color.GRAY);
	}
	private void setupListeners()
	{
		
	}
}
