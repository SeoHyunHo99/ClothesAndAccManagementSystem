package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ClothesManager clothesManager = getObject("clothesmanager.ser");
		if(clothesManager == null) {
		   clothesManager = new ClothesManager(input);
		}
		else {
			clothesManager.setScanner(input);
		}
		
		WindowFrame frame = new WindowFrame(clothesManager);
		selectMenu(input, clothesManager);
		putObject(clothesManager, "clothesmanager.ser");
	}
	
	public static void selectMenu(Scanner input,ClothesManager clothesManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					clothesManager.addClothes();
					logger.log("add a clothes");
					break;
				case 2:
					clothesManager.deleteClothes();	
					logger.log("delete a clothes");
					break;
				case 3:
					clothesManager.editClothes();
					logger.log("edit a clothes");
					break;
				case 4:
					clothesManager.viewClothess();	
					logger.log("edit a list of clothes");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {	
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Clothes Management System Menu ***"); 
		System.out.println(" 1. Add Clothes "); 
		System.out.println(" 2. Delete Clothes ");
		System.out.println(" 3. Edit Clothes "); 
		System.out.println(" 4. View Clothess "); 
		System.out.println(" 5. Exit"); 
		System.out.println("Select one number between 1 - 5:"); 
	}
	
	public static ClothesManager getObject(String filename) {
		ClothesManager clothesManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			clothesManager = (ClothesManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return clothesManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return clothesManager;
		
	}
	
	public static void putObject(ClothesManager clothesManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(clothesManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
