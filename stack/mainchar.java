package stack;
import java.util.Scanner;
public class mainchar {

   public static void main(String []args) {
	   Scanner sc=new Scanner(System.in);
	   Stack_Char_Class obj=new Stack_Char_Class();
	   System.out.println("Enter string ");
	   String word=sc.next();
	  obj.create_Stack(word.length());
	  for(int i=0;i<word.length();i++) {
		  obj.push(word.charAt(i));
	  }
	  String r="";
	  while(obj.is_Empty()!=true) {
	  r=r+obj.pop();
	  System.out.println("revers is "+r);
	  }
	   
	  
   }
}
