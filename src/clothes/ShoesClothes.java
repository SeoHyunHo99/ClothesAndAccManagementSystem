package clothes;

import java.util.Scanner;

public class ShoesClothes extends Clothes {
	
	public ShoesClothes(ClothesKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setClothesNumber(input);
		setClothesType(input);	
		setClothesBrand(input);
		setClothesColor(input);
		setClothesSize(input);
		setClothesLocation(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " number:" + number + " type:" + type + " brande:" + brande +" color:" + color + " size:" + size + " location:" + location);
	}
}
