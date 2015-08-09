
import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;

class airline {
public static LinkedList<String> NameList1 = new LinkedList<String>();
public static LinkedList<String> NameList2 = new LinkedList<String>();
public static LinkedList<String> Flights = new LinkedList<String>();

	

	public static void main(String[] args) {
	
		String[] flightNum = {"187", "501"};
		for (String x : flightNum)
			Flights.add(x);
		
		
		menu();
	
	}

	
	public static void menu(){
		int menuOpt;
		
		System.out.println("Airline Menu:");
		System.out.println("1. Reserve a Ticket");
		System.out.println("2. Cancel Reservations");
		System.out.println("3. Check Reservations");
		System.out.println("4. Display Passengers on Flights");
		Scanner input = new Scanner(System.in);
		menuOpt=input.nextInt();
		System.out.println(menuOpt);
	
		
		switch (menuOpt){
		case 1:
			System.out.println("Reserve a Ticket");
			reservetix(flightOpt());
			break;
		
		case 2:
			System.out.println("Cancel Reservations");
			cancel(flightOpt());
			break;
		
		case 3:
			System.out.println("Check Reservations");
			check(flightOpt());
			break;
			
		case 4:
			System.out.println("Passengers listed by Flights");
			passengers(flightOpt());
			break;
			
		default:
			System.out.println("INVALID RESPONSE!");
			menu();
			break;
		}
	}
	
	
		
public static int flightOpt(){	
		
		int i = 0;
		System.out.println("What Flight Number Would you like to view?");
		for (String y : Flights){
			i++;
			System.out.println(i + ". Flight: " + y);
		}
		int flightSelect;
		Scanner input = new Scanner(System.in);
		flightSelect=input.nextInt();
		
		return flightSelect;
	}
	
	
		
	
	public static void reservetix(int flightOpt){
		
		if (flightOpt == 1){
			String name;
			System.out.println("Enter Customer Name to RESERVE ticket for this Flight: ");
			Scanner input = new Scanner(System.in);
			name = input.nextLine();
			addtonamelist1(name);
			
		}
		else if (flightOpt == 2){
			String name;
			System.out.println("Enter Customer Name to RESERVE ticket for this Flight: ");
			Scanner input = new Scanner(System.in);
			name = input.nextLine();
			addtonamelist2(name);
		}
		else {
			System.out.println("Error Bad Selection...Returning User to Main Menu");
			menu();
		}
	}
	
	public static void addtonamelist1(String name){
		
		NameList1.addLast(name);
		System.out.println(name + " Has been added to the Flight!");
		System.out.println(NameList1.toString());
		menu();	
	}
	
public static void addtonamelist2(String name){
		
		NameList2.addLast(name);
		System.out.println(name + " Has been added to the Flight!");
		System.out.println(NameList2.toString());
		menu();	
	}
	
	
	public static void cancel(int flightOpt){
		if (flightOpt == 1){
			String name;
			System.out.println("Enter Customer Name to CANCEL ticket for this Flight: ");
			Scanner input = new Scanner(System.in);
			name = input.nextLine();
			NameList1.remove(name);
			menu();
		}
		else if (flightOpt == 2){
			String name;
			System.out.println("Enter Customer Name to CANCEL ticket for this Flight: ");
			Scanner input = new Scanner(System.in);
			name = input.nextLine();
			NameList2.remove(name);
			menu();
		}
		else {
			System.out.println("Error Bad Selection...Returning User to Main Menu");
			menu();
		}
		
	}
	
	public static void check(int flightOpt){
		if (flightOpt == 1){
			String name;
			System.out.println("Enter Customer Name to CHECK RESERVATION ticket for this Flight: ");
			Scanner input = new Scanner(System.in);
			name = input.nextLine();
			if (NameList1.contains(name)) {
			    System.out.println(name +" has a Reservation on this FLight!");
			    menu();
			}
			else {
				System.out.println(name + " is not on this Flight!");
				menu();
			}
			

		}
		else if (flightOpt == 2){
			String name;
			System.out.println("Enter Customer Name to CHECK RESERVATION ticket for this Flight: ");
			Scanner input = new Scanner(System.in);
			name = input.nextLine();
			if (NameList2.contains(name)) {
			    System.out.println(name +" has a Reservation on this FLight!");
			    menu();
			}
			else {
				System.out.println(name + " is not on this Flight!");
				menu();
			}
		}
		else {
			System.out.println("Error Bad Selection...Returning User to Main Menu");
			menu();
		}
		
		
	}
	
	public static void passengers(int flightOpt){
		if (flightOpt == 1){
			Collections.sort(NameList1);
			System.out.println(NameList1.toString());
			menu();
		}
		else if (flightOpt == 2){
			System.out.println(NameList2.toString());
			Collections.sort(NameList2);
			menu();
		}
		else {
			System.out.println("Error Bad Selection...Returning User to Main Menu");
			menu();
		}
	}
	
}
