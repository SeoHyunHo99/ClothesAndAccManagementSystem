package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.ClothesManager;

public class WindowFrame extends JFrame {
	
	ClothesManager clothesManager;
	
	MenuSelection menuselection;
	ClothesAdder clothesadder;
	ClothesViewer clothesViewer;
	
	public WindowFrame(ClothesManager clothesManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.clothesManager = clothesManager;
		menuselection = new MenuSelection(this);
		clothesadder = new ClothesAdder(this);
		clothesViewer = new ClothesViewer(this, this.clothesManager);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ClothesAdder getClothesadder() {
		return clothesadder;
	}

	public void setClothesadder(ClothesAdder clothesadder) {
		this.clothesadder = clothesadder;
	}

	public ClothesViewer getClothesviewer() {
		return clothesViewer;
	}

	public void setClothesViewer(ClothesViewer clothesViewer) {
		this.clothesViewer = clothesViewer;
	}

}
