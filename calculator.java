import java.util.Scanner;

 public class calculator
  {
    public static void main(String args[])
     {
       float a, b, res;
       char choice, ch;
       Scanner scan = new Scanner(System.in);
	      
      	do
         {
           
           
           System.out.print("5. Exit\n\n");
           System.out.print("Enter Your Choice : ");
           choice = scan.next().charAt(0);
           switch(choice)
            {
              

	      case '3' : System.out.print("Enter Two Number : ");
	                 a = scan.nextFloat();
	                 b = scan.nextFloat();
	                 res = a * b;
	                 System.out.print("Result = " + res);
	                 break;
	 
	      case '4' : System.out.print("Enter Two Number : ");
	                 a = scan.nextFloat();
	                 b = scan.nextFloat();
	                 res = a / b;
	                 System.out.print("Result = " + res);
	                 break;

	 
	      case '5' : System.exit(0);
	                 break;
	
	      default : System.out.print("Wrong Choice!!!");
	                break;
	   }
																	            
	}while(choice != 5);       
    }
}
