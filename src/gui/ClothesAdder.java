package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ClothesAdder extends JPanel {
	
	WindowFrame frame;

	public ClothesAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel(new SpringLayout());
		panel.setLayout(new SpringLayout());
		
		JLabel labelNumber = new JLabel("number: ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelType = new JLabel("Type: ", JLabel.TRAILING);
		JTextField fieldType = new JTextField(10);
		labelType.setLabelFor(fieldType);
		panel.add(labelType);
		panel.add(fieldType);

		JLabel labelBrande = new JLabel("Brande: ", JLabel.TRAILING);
		JTextField fieldBrande = new JTextField(10);
		labelBrande.setLabelFor(fieldBrande);
		panel.add(labelBrande);
		panel.add(fieldBrande);
		
		JLabel labelColor = new JLabel("Color: ", JLabel.TRAILING);
		JTextField fieldColor = new JTextField(10);
		labelColor.setLabelFor(fieldColor);
		panel.add(labelColor);
		panel.add(fieldColor);
		
		JLabel labelSize = new JLabel("Size: ", JLabel.TRAILING);
		JTextField fieldSize = new JTextField(10);
		labelSize.setLabelFor(fieldSize);
		panel.add(labelSize);
		panel.add(fieldSize);
		
		JLabel labelLocation = new JLabel("Location: ", JLabel.TRAILING);
		JTextField fieldLocation = new JTextField(10);
		labelLocation.setLabelFor(fieldLocation);
		panel.add(labelLocation);
		panel.add(fieldLocation);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);

		
		this.add(panel);
		this.setVisible(true);
		
	}

}
