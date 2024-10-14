package stack;

import java.util.Scanner;

public class Stack_Class {

	private int stack[], maxSize, tos;

	public void create_Stack(int size) {
		tos = -1;
		stack = new int[size];
		maxSize = size;
	}

	void push(int e) {
		tos++;
		stack[tos] = e;
		System.out.println("Element " + e + "Pushed");
	}

	boolean is_Full() {
		if (tos == maxSize - 1) {
			return true;
		} else {
			return false;
		}
	}

	int pop() {

		return stack[tos--];
	}

	int peek() {
		return stack[tos];
	}

	boolean is_Empty() {
		if (tos == -1) {
			return true;
		} else {
			return false;
		}
	}

	void print() {
		System.out.println("Stack is this ==>>> ");
		for (int i = tos; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack_Class obj = new Stack_Class();
		System.out.println("Enter stack size..!!");
		int size = sc.nextInt();
		obj.create_Stack(size);
		int ch;
		do {
			System.out.println("..Enter choice..");
			System.out.println("1.create choice");
			System.out.println("2.push choice");
			System.out.println("3.peek ");
			System.out.println("4.print all elements");
			System.out.println("0.Exit");
			System.out.println("=================");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				obj.create_Stack(size);
				break;
			case 2:
				if (obj.is_Full() != true) {
					System.out.println("Enter element for push");
					int e = sc.nextInt();
					obj.push(e);
				} else {
					System.out.println("stack full");
				}
				break;
			case 3:
				if (obj.is_Empty() == true) {
					System.out.println("Stack empty..");
				} else {
					int i = obj.peek();
					System.out.println(i);
				}
				break;
			case 4:
				if (obj.is_Empty() != true) {
					System.out.println("stack is this ==>>");
					obj.print();
				} else {
					System.out.println("stack is empty");
				}
				break;
			case 0:
				ch = 0;
				break;
			}
		} while (ch != 0);
	}
}
