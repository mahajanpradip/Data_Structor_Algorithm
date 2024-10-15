package linklist;

public class Linke_List_Class {

	Node root;
	
	void create_List() {
		root=null;
	}
	
	void insert_left(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=n;//n becomes first root
		}else {
			n.next=root;
			root=n;
		}
		System.out.println(root.data+" inserted");
	}
	
	void delet_left() {
		if(root==null) {
			System.out.println("List is Empty... ");
		}else {
			Node n;
			n=root;
			root=root.next;
			System.out.println(n.data+" deleted");
		}
	}
	void insert_right(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=n;
		}else {
			Node t=root;
			while(t.next!=null) {
				t=t.next;
			}
			t.next=n;
		}
	}
	
	void delet_rigth() {
		if(root==null) {
			System.out.println("Empty list..");
		}else {
			Node t,t2;
			t=t2=root;//t=root t2=root;
			while(t.next!=null) {
			t2=t;
			t=t.next;	
			}
			if(root==null) {
				root=null;
			}else {
				t2.next=null;
				System.out.println(t.data+"deleted");
			}
		}
	}
	
	void print() {
		if(root==null) {
			System.out.println("List is empty..!!");
		}else {
			Node t=root;
			while(t!=null) {
				System.out.print("|"+t.data+"|->");
				t=t.next;
			}
			System.out.println("");
		}
	}
	
//	void search(int data) {
//		if(root==null) {
//			System.out.println("list is Empty..");
//		}else {
//			Node t=root;
//			while(t!=root) {
//				if(t.data==data) {
//					System.out.println(t.data+" <<==data found");
//	break;
//				}
//				t=t.next;
//			}
//			if(t==null) {
//				System.out.println(data+" data not found...!!!!");
//			}
//		}
//	}
	void search_list(int data){
	Node t=root;
	if(root==null)
	System.out.println("List Empty");
	else {
	while(t!=null){ 
		if(t.data==data){//match found {	
			System.out.println(t.data+"found in list");		
		    break;
		}
		t=t.next;
	}
	
	}
	if(t==null)//not found System.out.println(data+" not found in list");
		System.out.println("not found");
	}	
	
	void insert_after(int key,int new_data) {
        Node n = new Node(new_data);
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t = root;
            while (t != null) {
                if (t.data == key)//match found
                {
                    System.out.println(t.data + " found in list");
                    n.next = t.next;//1
                    t.next = n;
                    System.out.println(new_data + " inserted in list");
                    break;
                }
                t = t.next;
            }
            if (t == null)//not found
                System.out.println(key + " not found in list");

        }
    }
	
	 void insert_before(int key,int new_data) {
	        Node n = new Node(new_data);
	        if (root == null)
	            System.out.println("List Empty");
	        else {
	            Node t,t2;
	            t=t2=root;
	            
	            while (t != null) {
	                if (t.data == key)//match found
	                {
	                    System.out.println(t.data + " found in list");
	                    n.next = t;//1
	                    t2.next= n;
	                    System.out.println(new_data + " inserted in list");
	                    break;
	                }
	                t = t.next;
	                t2=t;
	            }
	            if (t == null)//not found
	                System.out.println(key + " not found in list");

	        }
	    }
}
	//delete_element(e) //search_element(r)}
