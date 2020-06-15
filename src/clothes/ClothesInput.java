package clothes;

import java.util.Scanner;

import exception.ColorFormatException;

public interface ClothesInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public String getType();
	
	public void setType(String type);
	
	public String getBrande();
	
	public void setBrande(String brande);
	
	public String getColor();
	
	public void setColor(String color) throws ColorFormatException;
	
	public String getSize();
	
	public void setSize(String size);
	
	public String getLocation();
	
	public void setLocation(String location);

	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setClothesNumber(Scanner input);
	
	public void setClothesType(Scanner input);
	
	public void setClothesBrand(Scanner input);
	
	public void setClothesColor( Scanner input);
	
	public void setClothesSize(Scanner input);
	
	public void setClothesLocation(Scanner input);
}
