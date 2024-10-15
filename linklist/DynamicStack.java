package linklist;

public class DynamicStack {
	Node tos;

	void create_stack() {
	tos= null;//preparing with empty tos
}

	void push(int data) {
	Node n = new Node(data);
	if (tos == null) {
	tos = n;//n becomes 1st so root } else {
	n.next = tos;//1 tos = n;//2 
	}
	System.out.println(tos.data + " pushed on stack");

	}

	void pop() {
	if (tos == null) {
	System.out.println("Empty Stack");
	}
	else {
	Node t;
	t = tos;//1 tos = tos.next;//2 System.out.println(t.data + " poped");
	}
	}
	void peek() {
	if (tos == null) {
	System.out.println("Empty Stack");
	}
	else {
	System.out.println(tos.data + " @ peek");
	}
	}
	void print_stack() {
	if (tos == null)
	System.out.println("Stack Empty");
	else {
	Node t = tos;
	while (t != null) {
	System.out.println(t.data );
	System.out.println("--------");
	t = t.next;
	}
	
	}
	}

}
