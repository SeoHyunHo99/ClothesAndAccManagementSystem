package clothes;

import java.util.Scanner;

public class OuterwearClothes extends TeenageClothes {
	
	public OuterwearClothes(ClothesKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setClothesNumber(input);
		setClothesType(input);
		setClothesBrandwithYN(input);
		setClothesColor(input);
		setClothesSize(input);
		setClothesLocation(input);
	}
}
