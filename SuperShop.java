package SuperShopPackage;
import java.util.*;

public class SuperShop {

	public static void main(String[] args) {
		
		System.out.println("\t\tWelcome to All in One Super Shop");
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Your Address: ");
		String address=sc.nextLine();
		
		
		System.out.println("Enter 1 for MENU.\nEnter 0 for EXIT.");
		int a=sc.nextInt();
		
		if(a==1) {
			System.out.println("MENU:\n1:Chicken\t250tk\n2:Beef\t900tk\n3:Cold Drinks\t50tk\n4:Potato\t150tk\n5:Frozen Items\t200tk\n6:Chips\t20tk\n7:Ice Cream\t50tk\n");
			System.out.print("Enter your desired item to order: ");
			int b=sc.nextInt();
			switch(b){
				case 1:
					System.out.print("\n\nOrdered Details:\nCustomer Name: "+ name + "\nAddress: " + address + "\nItem: Chicken\nPrice: 250tk\nOrdered have been Placed Succesfull.\nThanks for visiting All in one Super Shop.");
					break;
				case 2:
					System.out.print("\n\nOrdered Details:\nCustomer Name: "+ name + "\nAddress: " + address + "\nItem: Beef\nPrice: 900tk\nOrdered have been Placed Succesfull.\nThanks for visiting All in one Super Shop.");
					break;
				case 3:
					System.out.print("\n\nOrdered Details:\nCustomer Name: "+ name + "\nAddress: " + address + "\nItem: Cold Drinks\nPrice: 50tk\nOrdered have been Placed Succesfull.\nThanks for visiting All in one Super Shop.");
					break;
				case 4:
					System.out.print("\n\nOrdered Details:\nCustomer Name: "+ name + "\nAddress: " + address + "\nItem: Potato\nPrice: 150tk\nOrdered have been Placed Succesfull.\nThanks for visiting All in one Super Shop.");
					break;
				case 5:
					System.out.print("\n\nOrdered Details:\nCustomer Name: "+ name + "\nAddress: " + address + "\nItem: Frozen Items\nPrice: 200tk\nOrdered have been Placed Succesfull.\nThanks for visiting All in one Super Shop.");
					break;
				case 6:
					System.out.print("\n\nOrdered Details:\nCustomer Name: "+ name + "\nAddress: " + address + "\nItem: Chips\nPrice: 20tk\nOrdered have been Placed Succesfull.\nThanks for visiting All in one Super Shop.");
					break;
				case 7:
					System.out.print("\n\nOrdered Details:\nCustomer Name: "+ name + "\nAddress: " + address + "\nItem: Ice Cream\nPrice: 50tk\nOrdered have been Placed Succesfull.\nThanks for visiting All in one Super Shop.");
					break;
			}
		}
		else {
			System.out.print("Thanks for Visiting.");

		}
		//System.out.println(name+address);
	}

}
