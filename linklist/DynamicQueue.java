package linklist;
import java.util.Scanner;
public class DynamicQueue {

	Node front,rear;
	void create_Queue()
	{
	front=rear=null;
	}

	void Enqueue(int data)
	{
	Node n = new Node(data);
	if (rear==null)
	{
	front=rear=n;
	}
	else
	{
	rear.next=n;
	rear=n;
	}
	System.out.println(data + " inserted");

	}
	void Dequeue() {
	if ( front==null) {
	System.out.println("Empty Queue");
	}
	else {
	Node t;
	t = front;//1 if(front==rear)//single node front=rear=null;//reset else
	front=front.next;
	System.out.println(t.data + " dequeued");
	}
	}
	void print_queue() {
	if (front == null)
	System.out.println("Queue Empty");
	else
	{
	Node t = front;
	while (t != null) {
	System.out.print("|" + t.data + "|---");
	t = t.next;
	}
	}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    DynamicQueue obj=new DynamicQueue();//object created
   // System.out.println("Enter size of stack:");
   // int size=in.nextInt();
    obj.create_Queue();
    int ch,e;
    do
    {
        System.out.println("Stack Menu");
        System.out.println("-----------");
        System.out.println("1.Enque");
        System.out.println("2.Deque");
        System.out.println("3.Print all elements");
        System.out.println("0.Exit");
        System.out.println("-----------");
        System.out.println("Choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                
                    System.out.println("Enter a number:");
                    e=sc.nextInt();
                    obj.Enqueue(e);
              
                break;
            case 2:
                    obj.Dequeue();               
                break;
            case 3:               
             obj.print_queue();
                break;
            case 0:
                System.out.println("Thanks for using code , coded by pradipmahajan");
                break;
            default:
                System.out.println("Wrong option selsected:");
                break;
        }

    }while(ch!=0);
}
}

