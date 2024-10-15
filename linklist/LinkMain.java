package linklist;

import java.util.Scanner;

public class LinkMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key;
		Linke_List_Class linklist = new Linke_List_Class();
		boolean n = true;
		while (n) {
			System.out.println("============================");
			System.out.println("Enter your choice...");
			System.out.println("-----------------------------");
			System.out.println("1.create list");
			System.out.println("2.insert left");
			System.out.println("3.delet left");
			System.out.println("4.insert right");
			System.out.println("5.delet right");
			System.out.println("6.print");
			System.out.println("7.search element.");
			System.out.println("8.insert before");
			System.out.println("9.insert after");
			System.out.println("10.for exit");
			System.out.println("===========================");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				linklist.create_List();
				System.out.println("list created..");
				break;
			case 2:
				System.out.println("Enter element for insert..");
				int e = sc.nextInt();
				linklist.insert_left(e);
				break;
			case 3:
				linklist.delet_left();
				System.out.println("left element deleted");
				break;
			case 4:
				System.out.println("enter element for insert");
				int s = sc.nextInt();
				linklist.insert_right(s);
				System.out.println("element inserted " + s);
				break;
			case 5:
				linklist.delet_rigth();
				break;
			case 6:
				System.out.println("list is ==>>> ");
				linklist.print();
				break;
			case 7:
				System.out.println("enter element for search..");
				key = sc.nextInt();
				linklist.search_list(key);
				break;
			case 8:
				System.out.println("Enter element ");
				int ee=sc.nextInt();
				System.out.println("enter key");
				 key=sc.nextInt();
				linklist.insert_before(ee, key);
				break;
			case 9:
				 System.out.println("Enter element");
				 int ele=sc.nextInt();
				 System.out.println("enter key");
				 key=sc.nextInt();
				 linklist.insert_before(ele, key);
				break;
			case 10:
				n = false;
				break;
			default:
				System.out.println("thankyouuuu...");
				break;
			}
		}
	}
}
