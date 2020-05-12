package clothes;

import java.util.Scanner;

public abstract class TeenageClothes extends Clothes {
	
	public TeenageClothes(ClothesKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " number:" + number + " type:" + type + " brande:" + brande +" color:" + color + " size:" + size + " location:" + location);
	}
	
	public void setClothesBrandwithYN(Scanner input) {
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
	}

}
