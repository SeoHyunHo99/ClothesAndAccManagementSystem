import java.util.ArrayList;
import java.util.Scanner;

import clothes.Clothes;
import clothes.ShoesClothes;

public class ClothesManager {
	ArrayList<Clothes> clothess = new ArrayList<Clothes>(); 
	Scanner input;
	ClothesManager(Scanner input){
		this.input = input;
	}
	
	public void addClothes() {	
		int kind = 0;
		Clothes clothes;
		while (kind != 1 && kind != 2) {
			System.out.print("1 for Shoes ");
			System.out.print("2 for Accessory");
			System.out.print("Select num for Clothes Kind between 1 and 2:");
			kind = input.nextInt();
			if(kind == 1) {
				clothes = new Clothes();
				clothes.getUserInput(input);
				clothess.add(clothes);
				break;
			}
			else if(kind == 2) {
				clothes = new ShoesClothes();
				clothes.getUserInput(input);
				clothess.add(clothes);
				break;
			}
			else {
				System.out.print("Select num for Clothes Kind between 1 and 2:");
			}
		}
	}

	public void deleteClothes() {
		System.out.print("Clothes number: ");
		int clothesNumber = input.nextInt();
		int index = -1;
		for(int i = 0; i<clothess.size(); i++) {
			if(clothess.get(i).getNumber() == clothesNumber) {
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
			if(clothes.getNumber() == clothesNumber) {
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
						int number = input.nextInt();
						clothes.setNumber(number);
					}
					else if(num == 2) {
						System.out.print("Clothes type: ");
						String type = input.next();	
						clothes.setType(type);
					}
					else if(num == 3) {
						System.out.print("Clothes brande: ");
						String brande = input.next();
						clothes.setBrande(brande);
					}
					else if(num == 4) {
						System.out.print("Clothes color: ");
						String color = input.next();
						clothes.setColor(color);
					}
					else if(num == 5) {
						System.out.print("Clothes size: ");
						int size = input.nextInt();	
						clothes.setSize(size);
					}
					else if(num == 6) {
						System.out.print("Clothes location: ");
						String location = input.next();		
						clothes.setLocation(location);
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
		System.out.println("# of registered clohtes:" + clothess.size());
		for(int i = 0; i<clothess.size(); i++) {
			clothess.get(i).printInfo();
		}
	}
	
}
