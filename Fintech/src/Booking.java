import java.util.Scanner;

public class Booking 
{
    String user, Name, pass;
    int Age, i;
	long MobileNumber;
	String Source;
	String Dest;
	int Time;
	
	void login()
	{
		Scanner log = new Scanner(System.in);
		System.out.println("username : ");
		user = log.nextLine();
		System.out.println("password : ");
		pass = log.nextLine();
	}
	
	void book()
	{
		System.out.println("Welcome "+user);
		Scanner ent = new Scanner(System.in);
		System.out.println("If you want to book a ticket press 1 or you just checking the webpage press 2 : "+i);
		i = ent.nextInt();
		if(i==1)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name : ");
			Name = sc.nextLine();
			
			System.out.println("Enter your age : ");
			Age = sc.nextInt();

			if(Age<18)
			{
				System.out.println("Sorry, further steps are not allowed due to you are under 18");
			}
			else
			{
				System.out.println("Enter your mobile number : ");
				MobileNumber = sc.nextLong();
				
				Scanner travel = new Scanner(System.in);
				System.out.println("Enter your destination to travel : ");
				Dest = travel.nextLine();
				
				
				Scanner time = new Scanner(System.in);
				System.out.println("Enter the railway time : ");
				Time = time.nextInt();	
			}	
		}
		else if(i==2)
		{
			System.out.println("Thank you for visiting our page");
		}
	}
	
	void confirm()
	{
		String city[] = {"jammu", "chennai", "delhi", "kolkata", "mumbai"};
		for(int j=0;j<city.length-1;j++)
		{
			if(Dest.equals(city[j]))
			{
				System.out.println("Successfully your ticket have booked for the destination" +Dest+ "in time" +Time+ ", Thank you");
			}
		
		}
		
	}
	
	public static void main(String[] args) 
	{
		Booking obj = new Booking();
		obj.login();
		obj.book();
		System.out.println("qwer5tyuiuhygfdsdcv");
		obj.confirm();			
	}
}