import java.util.Scanner;

class PhoneEntry { // the library
	String name; // name of a person
	String phone; // their phone number
	String address;
	String city;
	String province;
	String postalCode;

	PhoneEntry(String n, String p, String a, String c, String pr, String po) {
		name = n;
		phone = p;
		address = a;
		city = c;
		province = pr;
		postalCode = po;
	}
}

class PhoneBook {
	PhoneEntry[] phoneBook;

	PhoneBook() // constructor
	{
		phoneBook = new PhoneEntry[5]; // there are five indexes with infos in each of them
		phoneBook[0] = new PhoneEntry("James Barclay", "(418)665-1223", "1467 E 67th", "Washington", "DG", " SE6 7G6");
		phoneBook[1] = new PhoneEntry("Shrek Williams", "(860)399-3044", "1524 Smith 53rd", "Ellinoir", "VH", "SJ9 R72");
		phoneBook[2] = new PhoneEntry("Smash Mouth", "(815)439-9271", "528 Gabriella 47th", "Wyongang", "WM", "H7K U95");
		phoneBook[3] = new PhoneEntry("Violet Smith", "(312)223-1937", "4922 Mellis 39th", "Wolfgang", "AD", "6GB 1E3");
		phoneBook[4] = new PhoneEntry("John Wood", "(913)883-2874", "692 Kellison 12th", "Amadeus", "LT", "52S X23");
	}

	PhoneEntry searchName(String targetName) { // loops through all of them to see the exact information typed in and return the result of which array matches
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].name.equals(targetName))
				return phoneBook[j];
		}
		return null;
	}
	PhoneEntry searchPhone(String targetPhone) {
		for (int j = 0; j < phoneBook.length; j++){
			if (phoneBook[j].phone.equals(targetPhone))
			    return phoneBook[j];
		}
		return null;
	}
	PhoneEntry searchAddress(String targetAddress) {
		for (int j = 0; j < phoneBook.length; j++){
			if (phoneBook[j].address.equals(targetAddress))
			    return phoneBook[j];
		}
		return null;
	}
    PhoneEntry searchCity(String targetCity) {
		for (int j = 0; j < phoneBook.length; j++){
			if (phoneBook[j].city.equals(targetCity))
				return phoneBook[j];
		}
		return null;
	}
	PhoneEntry searchProvince(String targetProvince) {
		for (int j = 0; j < phoneBook.length; j++){
			if (phoneBook[j].province.equals(targetProvince))
			return phoneBook[j];
		}
		return null;
	}
	PhoneEntry searchPostalCode(String targetPostalCode) {
		for (int j = 0; j < phoneBook.length; j++) {
			if (phoneBook[j].postalCode.equals(targetPostalCode))
            return phoneBook[j];
		}
		return null;
	}
}

class PhoneBookTester {
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook(); //phonebook know as pb in the current class
		Scanner sc = new Scanner(System.in); // function of scanner
		PhoneEntry entry; // entry is the new Phoen Entry
		System.out.println("Enter 1 to search by Name, 2 by Number, 3 by Address, 4 by City, 5 by Province, and 6 by Postal Code. Enter 0 to exit");
		int searchChoice = sc.nextInt(); // type in to choose which method to find info
		sc.nextLine();
		// prompt user to enter 0-6 store in search choice

		switch (searchChoice) { // 6 scenarios possible to be chosen
		case 0:
			System.out.println("Exiting");
			System.exit(0);
		case 1: //type in what is being search and transfer the result to phoneEntry loops
			System.out.println("Enter name to search for: ");
			String searchQ = sc.nextLine();
			entry = pb.searchName(searchQ);
			break;
		case 2:
		    System.out.println("Enter Phone to search for: ");
			String searchP = sc.nextLine();
			entry = pb.searchPhone(searchP); 
		break;	
		case 3:
			System.out.println("Enter Address to search for: ");
			String searchB = sc.nextLine();
			entry = pb.searchAddress(searchB);
			break;
		case 4:
			System.out.println("Enter City to search for: ");
			String searchH = sc.nextLine();
			entry = pb.searchCity(searchH);
		break;
		case 5:
			System.out.println("Enter Province to search for: ");
			String searchJ = sc.nextLine();
			entry = pb.searchProvince(searchJ);
			break;
		case 6:
			System.out.println("Enter Postal Code to search for: ");
			String searchN = sc.nextLine();
			entry = pb.searchPostalCode(searchN);
		default:
			entry = null;
		}

		if (entry != null) // type out all information of the specific answer user is looking for after typing in part of info
			System.out.println(entry.name + ": " + entry.phone + entry.address + ", " +  entry.city + " " + entry.province + " " + entry.postalCode);
		else
			System.out.println("Not found"); // invalid info

	}
}