package stack;

public class Stack_Char_Class {


	private int maxSize, tos;
    private char stack[];
	public void create_Stack(int size) {
		tos = -1;
		stack = new char[size];
		maxSize = size;
	}

	void push(char e) {
		tos++;
		stack[tos] =e;
		System.out.println("Element " + e + "Pushed");
	}

	boolean is_Full() {
		if (tos == maxSize - 1) {
			return true;
		} else {
			return false;
		}
	}

	char pop() {

		return stack[tos--];
	}

	char peek() {
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
}
