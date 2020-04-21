package clothes;

import java.util.Scanner;

public class Clothes {
	protected ClothesKind kind = ClothesKind.Shoes;
	protected int number;
	protected String type;
	protected String brande;
	protected String color;
	protected int size;
	protected String location;
	
	public Clothes() {
	}
	
	public Clothes(int number, String type) {
		this.number = number;
		this.type = type;
	}
	
	public Clothes(int number, String type, String brande, String color, int size, String location) {
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	public void printInfo() {
		System.out.println("number:" + number + " type:" + type + " brande:" + brande +" color:" + color + " size:" + size + " location:" + location);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Clothes number:");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Clothes type:");
		String type = input.next();
		this.setType(type);
		
		System.out.print("Clothes brande:");
		String brande = input.next();
		this.setBrande(brande);
		
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
