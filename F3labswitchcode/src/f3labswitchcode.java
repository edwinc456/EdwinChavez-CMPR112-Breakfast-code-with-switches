import java.util.Scanner;
public class f3labswitchcode 
{
public static void main(String[]args)
{
	int thirsty;
	Scanner input= new Scanner(System.in);
	System.out.println("Hungry");
	System.out.println("Get in line");
	System.out.println("Buy lunch");
	System.out.println("Thirsty? 1 for yes and 0 for no");
	thirsty = input.nextInt();
	switch(thirsty)
	{
	case 0: System.out.println("You get water");
	 break;
	case 1: System.out.println("Did you eat breakfast? 3 for yes or 4 for no");
	 thirsty = input.nextInt();
		if(thirsty == 3)
		  System.out.println("You get a diet coke.");
	  else if(thirsty==4)
		  System.out.println("You get a coke.");
	  break;

	}
	System.out.println("You eat");
	System.out.println("You return the tray");
	System.out.println("You leave.");
}

}
