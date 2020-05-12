package clothes;

import java.util.Scanner;

public class AccessoryClothes extends TeenageClothes {
	
	protected String length;
	
	public AccessoryClothes(ClothesKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setClothesNumber(input);
		setClothesType(input);
		setClothesBrandwithYN(input);
		setClothesColor(input);
		setClothesSizewithYN(input);
		setClothesLocation(input);
	}
	
	public void setClothesSizewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Accessory have a length? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				setClothesSize(input);
				break;
			}
			else if(answer == 'n' || answer =='N') {
				this.setSize("");
				break;
			}
			else {				
			}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " number:" + number + " type:" + type + " brande:" + brande +" color:" + color + " length:" + size + " location:" + location);
	}
	

}
