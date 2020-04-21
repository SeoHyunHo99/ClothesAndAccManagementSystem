package clothes;

import java.util.Scanner;

public class ShoesClothes extends Clothes {
	
	public void getUserInput(Scanner input) {
		System.out.print("Clothes number:");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Clothes type:");
		String type = input.next();
		this.setType(type);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you have a brand? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				System.out.print("Clothes brande:");
				String brande = input.next();
				this.setBrande(brande);
				break;
			}
			else if(answer == 'n' || answer =='N') {
				this.setBrande("");
				break;
			}
			else {				
			}
		}
		
		
		System.out.print("Clothes color:");
		String color = input.next();
		this.setColor(color);
		
		System.out.print("Clothes size:");
		int size = input.nextInt();
		this.setSize(size);
		
		System.out.print("Clothes location:");
		String location = input.next();
		this.setLocation(location);
	}

}
