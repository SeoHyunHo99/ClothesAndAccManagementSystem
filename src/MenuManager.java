import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 4;

		while(num != 5) {
			System.out.println("*** ClothesAndAcc Management System Menu ***"); 
			System.out.println(" 1. View ClothesAndAcc Type "); /* 옷과 장신구 종류를 볼 수 있기 위한 선택 메뉴 출력. */
			System.out.println(" 2. View ClothesAndAcc Location "); /* 옷과 장신구 위치를 보기 할 수 있기 위한 선택 메뉴 출력. */
			System.out.println(" 3. Edit TypeAndLocation Of ClothesAndAcc "); /* 옷과 장신구의 종류와 위치를 편집 할 수 있기 위한 선택 메뉴 출력 */
			System.out.println(" 4. Show a menu"); 
			System.out.println(" 5. Exit"); 
			System.out.println("Select one number between 1 - 5:"); /* 번호를 선택할 수 있다는 문구를 출력. */
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
