package fascfighter;

/*
 * private static final long serialVersionUID = 1L;
boolean isRunning = true;
public GUI() {
	initComponents();
}

private void startActionPerformed(ActionEvent e) {
	
	String npcToAttack = npcId.getText();
	Variables.npcToKill = Methods.toIntArray(npcToAttack);
	
	String food = foodCombo.getSelectedItem().toString();
	if(food.equals("Salmon")){
		
	} else if (food.equals("Trout")){
		
	} else if (food.equals("Meat")){
		Variables.foodToEat = Variables.food_meat;
	} else if (food.equals("Cooked Chicken")){
		Variables.foodToEat = Variables.food_chicken;
	} else if (food.equals("Lobster")){
		
	} else if (food.equals("Shark")){
		
	}
	
	this.setVisible(true);

	Variables.GUIFinished = true;

	isRunning = false;
	Variables.startTime = System.currentTimeMillis();
	

	dispose();
}

private void initComponents() {
	// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
	// Generated using JFormDesigner Evaluation license - Ajith Kumar
	label1 = new JLabel();
	tabbedPane1 = new JTabbedPane();
	panel1 = new JPanel();
	label2 = new JLabel();
	npcId = new JTextField();
	npcdata = new JTextField();
	refresh = new JButton();
	panel2 = new JPanel();
	label6 = new JLabel();
	textField1 = new JTextField();
	label7 = new JLabel();
	textField2 = new JTextField();
	label8 = new JLabel();
	foodCombo = new JComboBox();
	label9 = new JLabel();
	panel3 = new JPanel();
	label3 = new JLabel();
	panel4 = new JPanel();
	locationCombo = new JComboBox();
	label4 = new JLabel();
	label5 = new JLabel();
	start = new JButton();

	//======== this ========
	setTitle("Fascinating AIO Fighter GUI");
	Container contentPane = getContentPane();

	//---- label1 ----
	label1.setText("Fascinating AIO Fighter");
	label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 3f));

	//======== tabbedPane1 ========
	{

		//======== panel1 ========
		{

			// JFormDesigner evaluation mark
			panel1.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


			//---- label2 ----
			label2.setText("Enter NPC IDs: ");

			//---- npcId ----
			npcId.setText("0");

			//---- npcdata ----
			npcdata.setEditable(false);

			//---- refresh ----
			refresh.setText("Refresh");

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(npcId, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
					.addGroup(panel1Layout.createSequentialGroup()
						.addGap(147, 147, 147)
						.addComponent(refresh)
						.addGap(0, 141, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
						.addContainerGap(103, Short.MAX_VALUE)
						.addComponent(npcdata, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
						.addGap(68, 68, 68))
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addGap(28, 28, 28)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label2)
							.addComponent(npcId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(npcdata, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(refresh)
						.addContainerGap(21, Short.MAX_VALUE))
			);
		}
		tabbedPane1.addTab("Main", panel1);


		//======== panel2 ========
		{

			//---- label6 ----
			label6.setText("Enter Amount: ");

			//---- label7 ----
			label7.setText("Enter Food ID: ");

			//---- label8 ----
			label8.setText("OR");
			label8.setFont(label8.getFont().deriveFont(label8.getFont().getStyle() | Font.BOLD, label8.getFont().getSize() + 2f));

			//---- foodCombo ----
			foodCombo.setModel(new DefaultComboBoxModel(new String[] {
				"Salmon",
				"Trout",
				"Meat",
				"Cooked Chicken",
				"Lobster",
				"Shark"
			}));

			//---- label9 ----
			label9.setText("Choose from list:");

			GroupLayout panel2Layout = new GroupLayout(panel2);
			panel2.setLayout(panel2Layout);
			panel2Layout.setHorizontalGroup(
				panel2Layout.createParallelGroup()
					.addGroup(panel2Layout.createSequentialGroup()
						.addGroup(panel2Layout.createParallelGroup()
							.addGroup(panel2Layout.createSequentialGroup()
								.addGap(11, 11, 11)
								.addComponent(label6)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGroup(panel2Layout.createSequentialGroup()
								.addGroup(panel2Layout.createParallelGroup()
									.addGroup(panel2Layout.createSequentialGroup()
										.addGap(115, 115, 115)
										.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
											.addComponent(label8)
											.addComponent(label7)))
									.addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(label9)))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(panel2Layout.createParallelGroup()
									.addComponent(foodCombo, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(89, GroupLayout.PREFERRED_SIZE))
			);
			panel2Layout.setVerticalGroup(
				panel2Layout.createParallelGroup()
					.addGroup(panel2Layout.createSequentialGroup()
						.addGap(27, 27, 27)
						.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label6)
							.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label7)
							.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label8)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(foodCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label9))
						.addContainerGap(19, Short.MAX_VALUE))
			);
		}
		tabbedPane1.addTab("Food", panel2);


		//======== panel3 ========
		{

			//---- label3 ----
			label3.setText("Coming Soon!");

			GroupLayout panel3Layout = new GroupLayout(panel3);
			panel3.setLayout(panel3Layout);
			panel3Layout.setHorizontalGroup(
				panel3Layout.createParallelGroup()
					.addGroup(panel3Layout.createSequentialGroup()
						.addGap(133, 133, 133)
						.addComponent(label3)
						.addContainerGap(160, Short.MAX_VALUE))
			);
			panel3Layout.setVerticalGroup(
				panel3Layout.createParallelGroup()
					.addGroup(panel3Layout.createSequentialGroup()
						.addGap(58, 58, 58)
						.addComponent(label3)
						.addContainerGap(85, Short.MAX_VALUE))
			);
		}
		tabbedPane1.addTab("Potions", panel3);


		//======== panel4 ========
		{

			//---- locationCombo ----
			locationCombo.setModel(new DefaultComboBoxModel(new String[] {
				"Lumbridge",
				"Draynor",
				"Varrock",
				"Falador"
			}));
			locationCombo.setEnabled(false);

			//---- label4 ----
			label4.setText("Choose the location where your npc is located.");

			//---- label5 ----
			label5.setText("This is not a feature where it'll walk to the location.");

			GroupLayout panel4Layout = new GroupLayout(panel4);
			panel4.setLayout(panel4Layout);
			panel4Layout.setHorizontalGroup(
				panel4Layout.createParallelGroup()
					.addGroup(panel4Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addComponent(locationCombo, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
							.addGroup(panel4Layout.createParallelGroup()
								.addComponent(label5)
								.addComponent(label4)))
						.addContainerGap(105, Short.MAX_VALUE))
			);
			panel4Layout.setVerticalGroup(
				panel4Layout.createParallelGroup()
					.addGroup(panel4Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label4)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(label5)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
						.addComponent(locationCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(36, 36, 36))
			);
		}
		tabbedPane1.addTab("Locations", panel4);

	}

	//---- start ----
	start.setText("Start Script!");
	start.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			startActionPerformed(e);
		}
	});

	GroupLayout contentPaneLayout = new GroupLayout(contentPane);
	contentPane.setLayout(contentPaneLayout);
	contentPaneLayout.setHorizontalGroup(
		contentPaneLayout.createParallelGroup()
			.addGroup(contentPaneLayout.createSequentialGroup()
				.addGroup(contentPaneLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
					.addGroup(contentPaneLayout.createSequentialGroup()
						.addGroup(contentPaneLayout.createParallelGroup()
							.addGroup(contentPaneLayout.createSequentialGroup()
								.addGap(53, 53, 53)
								.addComponent(start, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
							.addGroup(contentPaneLayout.createSequentialGroup()
								.addGap(110, 110, 110)
								.addComponent(label1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
						.addGap(0, 58, Short.MAX_VALUE)))
				.addContainerGap())
	);
	contentPaneLayout.setVerticalGroup(
		contentPaneLayout.createParallelGroup()
			.addGroup(contentPaneLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(label1)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(start, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
				.addContainerGap())
	);
	setSize(400, 300);
	setLocationRelativeTo(getOwner());
	// JFormDesigner - End of component initialization  //GEN-END:initComponents
}

// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
// Generated using JFormDesigner Evaluation license - Ajith Kumar
private JLabel label1;
private JTabbedPane tabbedPane1;
private JPanel panel1;
private JLabel label2;
private JTextField npcId;
private JTextField npcdata;
private JButton refresh;
private JPanel panel2;
private JLabel label6;
private JTextField textField1;
private JLabel label7;
private JTextField textField2;
private JLabel label8;
private JComboBox foodCombo;
private JLabel label9;
private JPanel panel3;
private JLabel label3;
private JPanel panel4;
private JComboBox locationCombo;
private JLabel label4;
private JLabel label5;
private JButton start;
// JFormDesigner - End of variables declaration  //GEN-END:variables
 */

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

/*
 * Created by JFormDesigner on Sat Nov 10 11:34:02 WST 2012
 */

/**
 * @author Name
 */
public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	boolean isRunning = true;

	public GUI() {
		initComponents();
	}

	private void startActionPerformed(ActionEvent e) {

		String npcToAttack = npcId.getText();
		Variables.npcToKill = Methods.toIntArray(npcToAttack);

		String lootToLoot = GroundLoot.getText();
		Variables.lootID = Methods.toIntArray(lootToLoot);
		
		String foodEaten = foodID.getText();
		Variables.foodID = Integer.parseInt(foodEaten);

		String food = foodCombo.getSelectedItem().toString();
		if (food.equals("Salmon")) {

		} else if (food.equals("Trout")) {

		} else if (food.equals("Meat")) {
			Variables.foodToEat = Variables.food_meat;
		} else if (food.equals("Cooked Chicken")) {
			Variables.foodToEat = Variables.food_chicken;
		} else if (food.equals("Lobster")) {

		} else if (food.equals("Shark")) {

		}

		this.setVisible(true);

		Variables.GUIFinished = true;

		isRunning = false;
		Variables.startTime = System.currentTimeMillis();

		dispose();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Ajith Kumar
		label1 = new JLabel();
		tabbedPane1 = new JTabbedPane();
		panel1 = new JPanel();
		label2 = new JLabel();
		npcId = new JTextField();
		npcdata = new JTextField();
		refresh = new JButton();
		panel2 = new JPanel();
		label6 = new JLabel();
		foodAmount = new JTextField();
		label7 = new JLabel();
		foodID = new JTextField();
		label8 = new JLabel();
		foodCombo = new JComboBox();
		label9 = new JLabel();
		panel5 = new JPanel();
		label10 = new JLabel();
		GroundLoot = new JTextField();
		panel3 = new JPanel();
		label3 = new JLabel();
		panel4 = new JPanel();
		locationCombo = new JComboBox();
		label4 = new JLabel();
		label5 = new JLabel();
		start = new JButton();

		// ======== this ========
		setTitle("Fascinating AIO Fighter GUI");
		Container contentPane = getContentPane();

		// ---- label1 ----
		label1.setText("Fascinating AIO Fighter");
		label1.setFont(label1.getFont().deriveFont(
				label1.getFont().getSize() + 3f));

		// ======== tabbedPane1 ========
		{

			// ======== panel1 ========
			{

				// JFormDesigner evaluation mark
				panel1.setBorder(new javax.swing.border.CompoundBorder(
						new javax.swing.border.TitledBorder(
								new javax.swing.border.EmptyBorder(0, 0, 0, 0),
								"JFormDesigner Evaluation",
								javax.swing.border.TitledBorder.CENTER,
								javax.swing.border.TitledBorder.BOTTOM,
								new java.awt.Font("Dialog", java.awt.Font.BOLD,
										12), java.awt.Color.red), panel1
								.getBorder()));
				panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
					@Override
					public void propertyChange(java.beans.PropertyChangeEvent e) {
						if ("border".equals(e.getPropertyName()))
							throw new RuntimeException();
					}
				});

				// ---- label2 ----
				label2.setText("Enter NPC IDs: ");

				// ---- npcId ----
				npcId.setText("0");
				
				// ---- foodID ----
				foodID.setText("0");

				// ---- npcdata ----
				npcdata.setEditable(false);

				// ---- refresh ----
				refresh.setText("Refresh");

				GroupLayout panel1Layout = new GroupLayout(panel1);
				panel1.setLayout(panel1Layout);
				panel1Layout
						.setHorizontalGroup(panel1Layout
								.createParallelGroup()
								.addGroup(
										panel1Layout
												.createSequentialGroup()
												.addContainerGap()
												.addComponent(label2)
												.addPreferredGap(
														LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(
														npcId,
														GroupLayout.PREFERRED_SIZE,
														230,
														GroupLayout.PREFERRED_SIZE)
												.addContainerGap())
								.addGroup(
										panel1Layout
												.createSequentialGroup()
												.addGap(147, 147, 147)
												.addComponent(refresh)
												.addGap(0, 141, Short.MAX_VALUE))
								.addGroup(
										GroupLayout.Alignment.TRAILING,
										panel1Layout
												.createSequentialGroup()
												.addContainerGap(103,
														Short.MAX_VALUE)
												.addComponent(
														npcdata,
														GroupLayout.PREFERRED_SIZE,
														188,
														GroupLayout.PREFERRED_SIZE)
												.addGap(68, 68, 68)));
				panel1Layout
						.setVerticalGroup(panel1Layout
								.createParallelGroup()
								.addGroup(
										panel1Layout
												.createSequentialGroup()
												.addGap(28, 28, 28)
												.addGroup(
														panel1Layout
																.createParallelGroup(
																		GroupLayout.Alignment.BASELINE)
																.addComponent(
																		label2)
																.addComponent(
																		npcId,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addComponent(
														npcdata,
														GroupLayout.PREFERRED_SIZE,
														41,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(
														LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(refresh)
												.addContainerGap(21,
														Short.MAX_VALUE)));
			}
			tabbedPane1.addTab("Main", panel1);

			// ======== panel2 ========
			{

				// ---- label6 ----
				label6.setText("Enter Amount: ");

				// ---- label7 ----
				label7.setText("Enter Food ID: ");

				// ---- label8 ----
				label8.setText("OR");
				label8.setFont(label8.getFont().deriveFont(
						label8.getFont().getStyle() | Font.BOLD,
						label8.getFont().getSize() + 2f));

				// ---- foodCombo ----
				foodCombo.setModel(new DefaultComboBoxModel(new String[] {
						"Salmon", "Trout", "Meat", "Cooked Chicken", "Lobster",
						"Shark" }));

				// ---- label9 ----
				label9.setText("Choose from list:");

				GroupLayout panel2Layout = new GroupLayout(panel2);
				panel2.setLayout(panel2Layout);
				panel2Layout
						.setHorizontalGroup(panel2Layout
								.createParallelGroup()
								.addGroup(
										panel2Layout
												.createSequentialGroup()
												.addGroup(
														panel2Layout
																.createParallelGroup()
																.addGroup(
																		panel2Layout
																				.createSequentialGroup()
																				.addGap(11,
																						11,
																						11)
																				.addComponent(
																						label6)
																				.addPreferredGap(
																						LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						foodAmount,
																						GroupLayout.PREFERRED_SIZE,
																						45,
																						GroupLayout.PREFERRED_SIZE))
																.addGroup(
																		panel2Layout
																				.createSequentialGroup()
																				.addGroup(
																						panel2Layout
																								.createParallelGroup()
																								.addGroup(
																										panel2Layout
																												.createSequentialGroup()
																												.addGap(115,
																														115,
																														115)
																												.addGroup(
																														panel2Layout
																																.createParallelGroup(
																																		GroupLayout.Alignment.TRAILING)
																																.addComponent(
																																		label8)
																																.addComponent(
																																		label7)))
																								.addGroup(
																										GroupLayout.Alignment.TRAILING,
																										panel2Layout
																												.createSequentialGroup()
																												.addContainerGap()
																												.addComponent(
																														label9)))
																				.addPreferredGap(
																						LayoutStyle.ComponentPlacement.UNRELATED)
																				.addGroup(
																						panel2Layout
																								.createParallelGroup()
																								.addComponent(
																										foodCombo,
																										GroupLayout.PREFERRED_SIZE,
																										77,
																										GroupLayout.PREFERRED_SIZE)
																								.addComponent(
																										foodID,
																										GroupLayout.PREFERRED_SIZE,
																										41,
																										GroupLayout.PREFERRED_SIZE))))
												.addContainerGap(
														89,
														GroupLayout.PREFERRED_SIZE)));
				panel2Layout
						.setVerticalGroup(panel2Layout
								.createParallelGroup()
								.addGroup(
										panel2Layout
												.createSequentialGroup()
												.addGap(27, 27, 27)
												.addGroup(
														panel2Layout
																.createParallelGroup(
																		GroupLayout.Alignment.BASELINE)
																.addComponent(
																		label6)
																.addComponent(
																		foodAmount,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(
														panel2Layout
																.createParallelGroup(
																		GroupLayout.Alignment.BASELINE)
																.addComponent(
																		label7)
																.addComponent(
																		foodID,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(
														LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(label8)
												.addPreferredGap(
														LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(
														panel2Layout
																.createParallelGroup(
																		GroupLayout.Alignment.BASELINE)
																.addComponent(
																		foodCombo,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		label9))
												.addContainerGap(19,
														Short.MAX_VALUE)));
			}
			tabbedPane1.addTab("Food", panel2);

			// ======== panel5 ========
			{

				// ---- label10 ----
				label10.setText("Enter loot ID:");
				label10.setFont(label10.getFont().deriveFont(
						label10.getFont().getStyle() | Font.BOLD,
						label10.getFont().getSize() + 3f));

				GroupLayout panel5Layout = new GroupLayout(panel5);
				panel5.setLayout(panel5Layout);
				panel5Layout
						.setHorizontalGroup(panel5Layout
								.createParallelGroup()
								.addGroup(
										panel5Layout
												.createSequentialGroup()
												.addContainerGap()
												.addComponent(label10)
												.addPreferredGap(
														LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(
														GroundLoot,
														GroupLayout.PREFERRED_SIZE,
														207,
														GroupLayout.PREFERRED_SIZE)
												.addContainerGap(43,
														Short.MAX_VALUE)));
				panel5Layout
						.setVerticalGroup(panel5Layout
								.createParallelGroup()
								.addGroup(
										panel5Layout
												.createSequentialGroup()
												.addGap(45, 45, 45)
												.addGroup(
														panel5Layout
																.createParallelGroup(
																		GroupLayout.Alignment.BASELINE)
																.addComponent(
																		label10)
																.addComponent(
																		GroundLoot,
																		GroupLayout.PREFERRED_SIZE,
																		28,
																		GroupLayout.PREFERRED_SIZE))
												.addContainerGap(84,
														Short.MAX_VALUE)));
			}
			tabbedPane1.addTab("Loot", panel5);

			// ======== panel3 ========
			{

				// ---- label3 ----
				label3.setText("Coming Soon!");

				GroupLayout panel3Layout = new GroupLayout(panel3);
				panel3.setLayout(panel3Layout);
				panel3Layout
						.setHorizontalGroup(panel3Layout.createParallelGroup()
								.addGroup(
										panel3Layout
												.createSequentialGroup()
												.addGap(133, 133, 133)
												.addComponent(label3)
												.addContainerGap(160,
														Short.MAX_VALUE)));
				panel3Layout.setVerticalGroup(panel3Layout
						.createParallelGroup().addGroup(
								panel3Layout.createSequentialGroup()
										.addGap(58, 58, 58)
										.addComponent(label3)
										.addContainerGap(85, Short.MAX_VALUE)));
			}
			tabbedPane1.addTab("Potions", panel3);

			// ======== panel4 ========
			{

				// ---- locationCombo ----
				locationCombo.setModel(new DefaultComboBoxModel(new String[] {
						"Lumbridge", "Draynor", "Varrock", "Falador" }));
				locationCombo.setEnabled(false);

				// ---- label4 ----
				label4.setText("Choose the location where your npc is located.");

				// ---- label5 ----
				label5.setText("This is not a feature where it'll walk to the location.");

				GroupLayout panel4Layout = new GroupLayout(panel4);
				panel4.setLayout(panel4Layout);
				panel4Layout
						.setHorizontalGroup(panel4Layout
								.createParallelGroup()
								.addGroup(
										panel4Layout
												.createSequentialGroup()
												.addContainerGap()
												.addGroup(
														panel4Layout
																.createParallelGroup(
																		GroupLayout.Alignment.TRAILING)
																.addComponent(
																		locationCombo,
																		GroupLayout.PREFERRED_SIZE,
																		185,
																		GroupLayout.PREFERRED_SIZE)
																.addGroup(
																		panel4Layout
																				.createParallelGroup()
																				.addComponent(
																						label5)
																				.addComponent(
																						label4)))
												.addContainerGap(105,
														Short.MAX_VALUE)));
				panel4Layout
						.setVerticalGroup(panel4Layout
								.createParallelGroup()
								.addGroup(
										panel4Layout
												.createSequentialGroup()
												.addContainerGap()
												.addComponent(label4)
												.addPreferredGap(
														LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(label5)
												.addPreferredGap(
														LayoutStyle.ComponentPlacement.RELATED,
														56, Short.MAX_VALUE)
												.addComponent(
														locationCombo,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addGap(36, 36, 36)));
			}
			tabbedPane1.addTab("Locations", panel4);

		}

		// ---- start ----
		start.setText("Start Script!");
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startActionPerformed(e);
			}
		});

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout
				.setHorizontalGroup(contentPaneLayout
						.createParallelGroup()
						.addGroup(
								contentPaneLayout
										.createSequentialGroup()
										.addGroup(
												contentPaneLayout
														.createParallelGroup()
														.addGroup(
																GroupLayout.Alignment.TRAILING,
																contentPaneLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				tabbedPane1,
																				GroupLayout.DEFAULT_SIZE,
																				364,
																				Short.MAX_VALUE))
														.addGroup(
																contentPaneLayout
																		.createSequentialGroup()
																		.addGroup(
																				contentPaneLayout
																						.createParallelGroup()
																						.addGroup(
																								contentPaneLayout
																										.createSequentialGroup()
																										.addGap(53,
																												53,
																												53)
																										.addComponent(
																												start,
																												GroupLayout.PREFERRED_SIZE,
																												263,
																												GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								contentPaneLayout
																										.createSequentialGroup()
																										.addGap(110,
																												110,
																												110)
																										.addComponent(
																												label1,
																												GroupLayout.PREFERRED_SIZE,
																												147,
																												GroupLayout.PREFERRED_SIZE)))
																		.addGap(0,
																				58,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		contentPaneLayout
				.setVerticalGroup(contentPaneLayout
						.createParallelGroup()
						.addGroup(
								contentPaneLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(label1)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(tabbedPane1,
												GroupLayout.PREFERRED_SIZE,
												185, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(start,
												GroupLayout.DEFAULT_SIZE, 28,
												Short.MAX_VALUE)
										.addContainerGap()));
		setSize(400, 300);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization
		// //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY
	// //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Ajith Kumar
	private JLabel label1;
	private JTabbedPane tabbedPane1;
	private JPanel panel1;
	private JLabel label2;
	private JTextField npcId;
	private JTextField npcdata;
	private JButton refresh;
	private JPanel panel2;
	private JLabel label6;
	private JTextField foodAmount;
	private JLabel label7;
	private JTextField foodID;
	private JLabel label8;
	private JComboBox foodCombo;
	private JLabel label9;
	private JPanel panel5;
	private JLabel label10;
	private JTextField GroundLoot;
	private JPanel panel3;
	private JLabel label3;
	private JPanel panel4;
	private JComboBox locationCombo;
	private JLabel label4;
	private JLabel label5;
	private JButton start;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
