package stack;

public class Bin {
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
}
