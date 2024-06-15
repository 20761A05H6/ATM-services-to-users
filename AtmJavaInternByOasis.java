
/******************************************************************************

Enter User_ID : ASHOK
Enter PIN : 1234
Welcome to the ATM Service
1 --> Deposite 
2 --> Credit 
3 --> Balance 
4 --> History
5 --> Exit 
Select the option : 4
There is nothing in history
1 --> Deposite 
2 --> Credit 
3 --> Balance 
4 --> History
5 --> Exit 
Select the option : 3
Available balance in account : 0
1 --> Deposite 
2 --> Credit 
3 --> Balance 
4 --> History
5 --> Exit 
Select the option : 2
Enter amount to credit : 1
Insufficient balance in your account
1 --> Deposite 
2 --> Credit 
3 --> Balance 
4 --> History
5 --> Exit 
Select the option : 5
Exit

*******************************************************************************/
import java.util.*;

public class AtmJavaInternByOasis {
	static int amount;
	static List<List<String>> l = new ArrayList<List<String>>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User_ID : ");
		String s1 = sc.next();
		System.out.print("Enter PIN : ");
		// String s2=sc.next();
		int s2 = sc.nextInt();
		int choice = -1;
		System.out.println("Welcome to the ATM Service");
		do {
			System.out.println("1 --> credit ");
			System.out.println("2 --> deposit ");
			System.out.println("3 --> Balance ");
			System.out.println("4 --> History");
			System.out.println("5 --> Exit ");
			System.out.print("Select the option : ");
			choice = sc.nextInt();
			switch (choice) {
				case 2:
					System.out.print("Enter amount to deposite : ");
					int a = sc.nextInt();
					deposite(a);
					break;
				case 1:
					System.out.print("Enter amount to credit : ");
					int b = sc.nextInt();
					credit(b);
					break;
				case 3:
					balance();
					break;
				case 4:
					history();
					break;
				case 5:
					System.out.println("Thank you for visiting.");
					return;
				default:
					System.out.println("Invalid choice , select valid one");
					break;
			}

		} while (choice != 5);
	}

	static void credit(int a) {
		List<String> l1 = new ArrayList<>();

		if (a > 0) {
			l1.add("credit");
			l1.add(a + "");
			amount += a;
			System.out.println("Successfully credited");
			l.add(l1);
		} else
			System.out.println("Enter valid amount to credit : ");
	}

	static void deposit(int a) {
		List<String> l1 = new ArrayList<>();
		if (a > 0 && a <= amount) {
			l1.add("Credit");
			l1.add("-" + a + "");
			amount -= a;
			System.out.println("Successfully debited");
			l.add(l1);
		} else
			System.out.println("Insufficient balance in your account");
	}

	static void balance() {
		System.out.println("Available balance in account : " + amount);
	}

	static void history() {
		if (l.size() == 0)
			System.out.println("There is nothing in history");
		for (int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));
	}

}
