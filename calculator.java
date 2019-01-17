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
              
	 
	      
	 
	      case '5' : System.exit(0);
	                 break;
	
	      default : System.out.print("Wrong Choice!!!");
	                break;
	   }
																	            System.out.print("\n---------------------------------------\n");
	}while(choice != 5);       
    }
}
