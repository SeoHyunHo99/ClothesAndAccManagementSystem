import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClothesManager clothesManager = new ClothesManager(input);
		
		selectMenu(input, clothesManager);
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
					break;
				case 2:
					clothesManager.deleteClothes();	
					break;
				case 3:
					clothesManager.editClothes();
					break;
				case 4:
					clothesManager.viewClothess();	
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
}
