package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import clothes.ClothesInput;
import manager.ClothesManager;

public class ClothesViewer extends JPanel {
	
	WindowFrame frame;
	
	ClothesManager clothesManager;

	public ClothesViewer(WindowFrame frame, ClothesManager clothesManager) {
		this.frame = frame;
		this.clothesManager = clothesManager;
		
		System.out.println("***" + clothesManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Type");
		model.addColumn("Brande");
		model.addColumn("Color");
		model.addColumn("Size");
		model.addColumn("Location");
		
		for(int i=0; i< clothesManager.size(); i++) {
			Vector row = new Vector();
			ClothesInput ci = clothesManager.get(i);
			row.add(ci.getNumber());
			row.add(ci.getType());
			row.add(ci.getBrande());
			row.add(ci.getColor());
			row.add(ci.getSize());
			row.add(ci.getLocation());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
