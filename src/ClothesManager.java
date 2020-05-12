import java.util.ArrayList;
import java.util.Scanner;

import clothes.OuterwearClothes;
import clothes.ShoesClothes;
import clothes.Clothes;
import clothes.ClothesInput;
import clothes.ClothesKind;
import clothes.AccessoryClothes;

public class ClothesManager {
	ArrayList<ClothesInput> clothess = new ArrayList<ClothesInput>(); 
	Scanner input;
	ClothesManager(Scanner input){
		this.input = input;
	}
	
	public void addClothes() {	
		int kind = 0;
		ClothesInput clothesInput;
		while (kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1 for Shoes ");
			System.out.println("2 for Accessory");
			System.out.println("3 for Outerwear");
			System.out.println("Select num 1, 2 or 3 for Clothes Kind:");
			kind = input.nextInt();
			if(kind == 1) {
				clothesInput = new ShoesClothes(ClothesKind.Shoes);
				clothesInput.getUserInput(input);
				clothess.add(clothesInput);
				break;
			}
			else if(kind == 2) {
				clothesInput = new AccessoryClothes(ClothesKind.Accessory);
				clothesInput.getUserInput(input);
				clothess.add(clothesInput);
				break;
			}
			else if(kind == 3) {
				clothesInput = new OuterwearClothes(ClothesKind.Outerwear);
				clothesInput.getUserInput(input);
				clothess.add(clothesInput);
				break;
			}
			else {
				System.out.print("Select num for Clothes Kind between 1 and 2 or 3:");
			}
		}
	}

	public void deleteClothes() {
		System.out.print("Clothes number: ");
		int clothesNumber = input.nextInt();
		int index = findIndex(clothesNumber);
		removefromClothes(index, clothesNumber);
	}
	
	public int findIndex(int clothesNumber) {
		int index = -1;
		for(int i = 0; i<clothess.size(); i++) {
			if(clothess.get(i).getNumber() == clothesNumber) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromClothes(int index,int clothesNumber) {
		if(index >= 0) {
			clothess.remove(index);
			System.out.println("the clothes" + clothesNumber + "is deleted");
			return 1;
		}
		else {
			System.out.println("the clothes has not been registered");
			return -1;
		}
	}

	public void editClothes() {
		System.out.print("Clothes number: ");
		int clothesNumber = input.nextInt();
		for(int i = 0; i<clothess.size(); i++) {
			ClothesInput clothes = clothess.get(i);
			if(clothes.getNumber() == clothesNumber) {
				int num = -1;
				while(num != 7) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						clothes.setClothesNumber(input);
						break;
					case 2:
						clothes.setClothesType(input);
						break;
					case 3:
						clothes.setClothesBrand(input);
						break;
					case 4:
						clothes.setClothesColor(input);
						break;
					case 5:
						clothes.setClothesSize(input);
						break;
					case 6:
						clothes.setClothesLocation(input);
						break;
					default:
						continue;
					}
				} //while
				break;
			} //if
		} //for
	}//end
	
	public void viewClothess() {
		System.out.println("# of registered clohtes:" + clothess.size());
		for(int i = 0; i<clothess.size(); i++) {
			clothess.get(i).printInfo();
		}
	}
	

	
	public void showEditMenu() {
		System.out.println("** Clothes Info Edit Menu **"); 
		System.out.println(" 1. Edit Number "); 
		System.out.println(" 2. Edit Type ");
		System.out.println(" 3. Edit Brand "); 
		System.out.println(" 4. Edit Color "); 
		System.out.println(" 5. Edit Size"); 
		System.out.println(" 6. Edit Location"); 
		System.out.println(" 7. Exit");
		System.out.println("Select one number between 1 - 7:"); 
	}
	
}
