import java.util.ArrayList;
import java.util.Scanner;

public class ClothesManager {
	ArrayList<Clothes> clothess = new ArrayList<Clothes>(); 
	Scanner input;
	ClothesManager(Scanner input){
		this.input = input;
	}
	
	public void addClothes() {	
		Clothes clothes = new Clothes();
		System.out.print("Clothes number: ");
		clothes.number = input.nextInt();
		System.out.print("Clothes type: ");
		clothes.type = input.next();
		System.out.print("Clothes brande: ");
		clothes.brande = input.next();
		System.out.print("Clothes color: ");
		clothes.color = input.next();
		System.out.print("Clothes size: ");
		clothes.size = input.nextInt();
		System.out.print("Clothes location: ");
		clothes.location = input.next();
		clothess.add(clothes);
	}

	public void deleteClothes() {
		System.out.print("Clothes number: ");
		int clothesNumber = input.nextInt();
		int index = -1;
		for(int i = 0; i<clothess.size(); i++) {
			if(clothess.get(i).number == clothesNumber) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			clothess.remove(index);
			System.out.println("the clothes" + clothesNumber + "is deleted");
		}
		else {
			System.out.println("the clothes has not been registered");
			return;
		}
	}

	public void editClothes() {
		System.out.print("Clothes number: ");
		int clothesNumber = input.nextInt();
		for(int i = 0; i<clothess.size(); i++) {
			Clothes clothes = clothess.get(i);
			if(clothes.number == clothesNumber) {
				int num = -1;
				while(num != 7) {
					System.out.println("** Clothes Info Edit Menu **"); 
					System.out.println(" 1. Edit Number "); 
					System.out.println(" 2. Edit Type ");
					System.out.println(" 3. Edit Brand "); 
					System.out.println(" 4. Edit Color "); 
					System.out.println(" 5. Edit Size"); 
					System.out.println(" 6. Edit Location"); 
					System.out.println(" 7. Exit");
					System.out.println("Select one number between 1 - 7:"); 
					num = input.nextInt();
					if(num == 1) {
						System.out.print("Clothes number: ");
						clothes.number = input.nextInt();
					}
					else if(num == 2) {
						System.out.print("Clothes type: ");
						clothes.type = input.next();				
					}
					else if(num == 3) {
						System.out.print("Clothes brande: ");
						clothes.brande = input.next();				
					}
					else if(num == 4) {
						System.out.print("Clothes color: ");
						clothes.color = input.next();				
					}
					else if(num == 5) {
						System.out.print("Clothes size: ");
						clothes.size = input.nextInt();				
					}
					else if(num == 6) {
						System.out.print("Clothes location: ");
						clothes.location = input.next();				
					}
					else {
						continue;
					} //if
				} //while
				break;
			} //if
		} //for
	}//end
	
	public void viewClothess() {
//		System.out.print("Clothes number: ");
//		int clothesNumber = input.nextInt();
		for(int i = 0; i<clothess.size(); i++) {
			clothess.get(i).printInfo();
		}
	}
	
}
