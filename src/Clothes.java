public class Clothes {
	int number;
	String type;
	String brande;
	String color;
	int size;
	String location;
	
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
	
	public void printInfo() {
		System.out.println("number:" + number + " type:" + type + " brande:" + brande +" color:" + color + " size:" + size + " location:" + location);
	}

}
