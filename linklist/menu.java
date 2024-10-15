package linklist;
import java.util.Scanner;
public class menu {
	
	    public static void main(String args[])
	    {
	        Scanner in=new Scanner(System.in);
	        DynamicStack obj=new DynamicStack();//object created
	       // System.out.println("Enter size of stack:");
	       // int size=in.nextInt();
	        obj.create_stack();
	        int ch,e;
	        do
	        {
	            System.out.println("Stack Menu");
	            System.out.println("-----------");
	            System.out.println("1.Push");
	            System.out.println("2.Pop");
	            System.out.println("3.Peek");
	            System.out.println("4.Print all elements");
	            System.out.println("0.Exit");
	            System.out.println("-----------");
	            System.out.println("Choice:");
	            ch=in.nextInt();
	            switch(ch)
	            {
	                case 1:
	                    
	                        System.out.println("Enter a number:");
	                        e=in.nextInt();
	                        obj.push(e);
	                  
	                    break;
	                case 2:
	              
	                        System.out.println("Element poped is ");
	                        obj.pop();
	                   
	                    break;
	                case 3:
	                   
	                	obj.peek();
	                    break;
	                case 4:
	      
	                    obj.print_stack();
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
	

