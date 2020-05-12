package clothes;

import java.util.Scanner;

public abstract class  Clothes implements ClothesInput {
	protected ClothesKind kind = ClothesKind.Shoes;
	protected int number;
	protected String type;
	protected String brande;
	protected String color;
	protected String size;
	protected String location;
	
	public Clothes() {
	}
	
	public Clothes(ClothesKind kind) {
		this.kind = kind;
	}
	
	public Clothes(int number, String type) {
		this.number = number;
		this.type = type;
	}
	
	public Clothes(int number, String type, String brande, String color, String size, String location) {
		this.number = number;
		this.type = type;
		this.brande = brande;
		this.color = color;
		this.size = size;
		this.location = location;	
	}
	
	public Clothes(ClothesKind kind, int number, String type, String brande, String color, String size, String location) {
		this.kind = kind;
		this.number = number;
		this.type = type;
		this.brande = brande;
		this.color = color;
		this.size = size;
		this.location = location;	
	}
	
	public ClothesKind getKind() {
		return kind;
	}

	public void setKind(ClothesKind kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrande() {
		return brande;
	}

	public void setBrande(String brande) {
		this.brande = brande;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	public abstract void printInfo();
	
	public void setClothesNumber( Scanner input) {
		System.out.print("Clothes number: ");
		int number = input.nextInt();
		this.setNumber(number);
	}
	
	public void setClothesType( Scanner input) {
		System.out.print("Clothes type: ");
		String type = input.next();	
		this.setType(type);
	}
	
	public void setClothesBrand( Scanner input) {
		System.out.print("Clothes brande: ");
		String brande = input.next();
		this.setBrande(brande);
	}
	
	public void setClothesColor( Scanner input) {
		System.out.print("Clothes color: ");
		String color = input.next();
		this.setColor(color);
	}
	
	public void setClothesSize( Scanner input) {
		System.out.print("Clothes size: ");
		String size = input.next();	
		this.setSize(size);
	}
	
	public void setClothesLocation( Scanner input) {
		System.out.print("Clothes location: ");
		String location = input.next();		
		this.setLocation(location);
	}
	
	public String getKindString() {
		String skind ="none";
		switch(this.kind) {
		case Shoes:
			skind = "Shoes.";
			break;
		case Accessory:
			skind = "Accessory.";
			break;
		case Outerwear:
			skind = "Outerwear.";
			break;
		case Top:
			skind = "Top.";
			break;
		case Bottom:
			skind = "Bottom.";
			break;
		default:
		}
		return skind;
	}

}
