package firsthaithamproject;
import java.util.Scanner;
import firsthaithamproject.Operation;
public class haitham {
	
	
	public void userName(String name) {
		System.out.println("you have Entered your name " + name);
	}
		public void Email(String Email) {
			System.out.println("you have Entered your mail " + Email);
	}   
		
		public void Faculty(String Faculty) {
			System.out.println("you have Entered your Faculty " + Faculty);
	}
		public void age(int num1) {
			System.out.println("you have Entered your age " + num1);
	}
		
   public static void main (String []args) {
	  	   Scanner sc = new Scanner(System.in); // moshtarak maben el-atnen (obj1 and obj 2)
	  	   
	   System.out.println("###################### Object 1 Start #################");  
	   haitham obj1 =new haitham();
	   System.out.println("please enter your name :- ");
	   String name = sc.nextLine();
	   System.out.println("Hello " +name);
	   System.out.println("please enter your email :- ");
	   String email = sc.nextLine();
	   System.out.println("please enter your age :- ");
	   int age = sc.nextInt();
	   sc.nextLine();// take input after INT
	   System.out.println("please enter your Faculty :- ");  
	   String Faculty = sc.nextLine();
	   obj1.userName(name);
	   obj1.Email(email);
	   obj1.Faculty(Faculty);
	   obj1.age(age);
	   System.out.println("###################### Object 1 End #################");  
	   
	   System.out.println("###################### Object 2 Start #################");
	   haitham obj2 =new haitham();
	   System.out.println("please enter your name :- ");
	   String name1 = sc.nextLine();
	   System.out.println("Hello " +name1);
	   System.out.println("please enter your email :- ");
	   String email1 = sc.nextLine();
	   System.out.println("please enter your age :- ");
	   int age1 = sc.nextInt();
	   sc.nextLine();// take input after INT
	   System.out.println("please enter your Faculty :- ");  
	   String Faculty1 = sc.nextLine();
	   obj2.userName(name1);
	   obj2.Email(email1);
	   obj2.Faculty(Faculty1);
	   obj2.age(age1);
	   System.out.println("###################### Object 2 End #################"); 
	   System.out.println("###################### Operations #################"); 
	   Operation obj3 =  new Operation();
	   obj3.operationsOnNumbers(16, 12);
	   
   }
	
	
}
