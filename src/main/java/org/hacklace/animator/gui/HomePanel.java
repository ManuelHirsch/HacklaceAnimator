package org.hacklace.animator.gui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class HomePanel extends JPanel {
	private static final long serialVersionUID = 1045750321890262891L;
	
	JList animationList;

	public HomePanel() {
		animationList = new JList();
		JScrollPane animationListScrollPane = new JScrollPane(animationList);
		// TODO: not working :( animationList.setMinimumSize(new Dimension(200, 50));
		add(animationListScrollPane);
		
		add(new JButton(new AnimationListActions.AddAction()));
		add(new JButton(new AnimationListActions.RemoveAction()));
		add(new JButton(new AnimationListActions.MoveUpAction()));
		add(new JButton(new AnimationListActions.MoveDownAction()));
		
		// TODO: REMOVE test data
		String[] testData = {"test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", "test9"};
		animationList.setListData(testData);
	}
	
	/**
	 * Update the list contents
	 * @param items list of strings to select from
	 */
	public void updateList(String[] items) {
		animationList.setListData(items);
	}
	
	/**
	 * Clear the list
	 */
	public void clear() {
		animationList.setListData(new String[0]);
	}
}
