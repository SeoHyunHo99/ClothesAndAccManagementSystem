package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	
	MenuSelection menuselection;
	ClothesAdder clothesadder;
	ClothesViewer clothesViewer;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.clothesadder = new ClothesAdder(this);
		this.clothesViewer = new ClothesViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
