import java.util.Scanner;

public class ClothesManager {
	Clothes clothes;
	Scanner input;
	ClothesManager(Scanner input){
		this.input = input;
	}
	
	public void addClothes() {	
		clothes = new Clothes();
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
	}

	public void deleteClothes() {
		System.out.print("Clothes number: ");
		int clothesNumber = input.nextInt();
		if (clothes == null) {
			System.out.println("the clothes has not been registered");
			return;
		}
		if(clothes.number == clothesNumber) {
			clothes = null;
			System.out.println("the clothes is deleted");
		}
	}

	public void editClothes() {
		System.out.print("Clothes number: ");
		int clothesNumber = input.nextInt();
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
				}
			}
		}
	}
	
	public void viewClothes() {
		System.out.print("Clothes number: ");
		int clothesNumber = input.nextInt();
		if(clothes.number == clothesNumber) {
			clothes.printInfo();
		}

	}
	
}
