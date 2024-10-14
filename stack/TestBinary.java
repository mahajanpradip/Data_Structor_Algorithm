package stack;

import java.util.Scanner;

public class TestBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Bin b = new Bin();
		b.create_Stack(64);
		int temp = num;
		int rem = 0, count = 0;
		while (temp != 0) {
			rem = temp % 2;
			count++;
			b.push(rem);
			temp = temp / 2;
		}
		b.print();
	}

}