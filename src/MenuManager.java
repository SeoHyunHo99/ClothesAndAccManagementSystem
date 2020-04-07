import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClothesManager clothesManager = new ClothesManager(input);
		
		int num = -1;
		while(num != 5) {
			System.out.println("*** Clothes Management System Menu ***"); 
			System.out.println(" 1. Add Clothes "); 
			System.out.println(" 2. Delete Clothes ");
			System.out.println(" 3. Edit Clothes "); 
			System.out.println(" 4. View Clothes "); 
			System.out.println(" 5. Exit"); 
			System.out.println("Select one number between 1 - 5:"); 
			num = input.nextInt();
			if(num == 1) {
				clothesManager.addClothes();
			}
			else if(num == 2) {
				clothesManager.deleteClothes();				
			}
			else if(num == 3) {
				clothesManager.editClothes();				
			}
			else if(num == 4) {
				clothesManager.viewClothes();				
			}
			else {
				continue;
			}
		}
	}



}
