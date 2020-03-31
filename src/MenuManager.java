import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 4;

		while(num != 5) {
			System.out.println("*** ClothesAndAcc Management System Menu ***"); 
			System.out.println(" 1. View ClothesAndAcc Type "); /* �ʰ� ��ű� ������ �� �� �ֱ� ���� ���� �޴� ���. */
			System.out.println(" 2. View ClothesAndAcc Location "); /* �ʰ� ��ű� ��ġ�� ���� �� �� �ֱ� ���� ���� �޴� ���. */
			System.out.println(" 3. Edit TypeAndLocation Of ClothesAndAcc "); /* �ʰ� ��ű��� ������ ��ġ�� ���� �� �� �ֱ� ���� ���� �޴� ��� */
			System.out.println(" 4. Show a menu"); 
			System.out.println(" 5. Exit"); 
			System.out.println("Select one number between 1 - 5:"); /* ��ȣ�� ������ �� �ִٴ� ������ ���. */
			num = input.nextInt();
			if(num == 1) {
				ViewClothesAndAccType();
			}
			else if(num == 2) {
				ViewClothesAndAccLocation();				
			}
			else if(num == 3) {
				EditTypeAndLocationOfClothesAndAcc();				
			}
			else {
				continue;
			}
		}
	}
	
	public static void ViewClothesAndAccType() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes type: ");
		String ClothesType = input.next();
		System.out.print("Acc type: ");
		String AccType  = input.next();
	}
	
	public static void ViewClothesAndAccLocation() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes and ACC in Home: ");
		String ClothesAndAccinHome = input.nextLine();
		System.out.print("Clothes and ACC in Domitory: ");
		String ClothesAndAccinDomitory = input.nextLine();
		
	}
	
	public static void EditTypeAndLocationOfClothesAndAcc() {
		Scanner input = new Scanner(System.in);
		System.out.print("Location Of ClothesandACC Edit: ");
		String LocationOfClothesAndAccEdit = input.nextLine();
		System.out.print("Type Of ClothesandACC Edit: ");
		String TypeOfClothesAndAccEdit = input.nextLine();
		
	}

}
