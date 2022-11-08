
import java.util.Scanner;



class airRoute{
	String name;
	int price;
	String flightcode;
	String flightname;
	airRoute(String name,int price,String fcode,String fname){
		this.name=name;
		this.price=price;
		this.flightcode=fcode;
		this.flightname=fname;
	}
}



public class airTicket {
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	String route;
	int Amount;
	double ph;
	int age;
	
	
	int offer(int amount) {
		//Display
		System.out.println("Currenty avail offers are\n"
				+ "\t For Childrens get a 50%off \t use 111\n"
				+ "\t Festive offer of flat 25% on booking\t use 123\n"
				+ "\t Coupen code : ");
		int code=sc.nextInt();
		//execution
		int amt=amount;
		int flat;
		if(code==123) {
			System.out.println("Festival Offer Flat 25%");
			flat=amount*25/100;
			amt=amount-flat;
			System.out.println("Coupencode applied price changes from "+amount+" to "+amt);
			
			
		}
		else if(code==111) {
			if(age>=10) {
			    System.out.println("Sorry Children only");
			}
			else {
				System.out.println("50% off for childrens");
				flat=amount/2;
				amt=amount-flat;
				System.out.println("Coupencode applied price changes from "+amount+" to "+amt);
							}
			
		}
		else {
			System.out.println("invalid code");
		}
		
		return amt;
	}
	
	//First display and return choice
	int display() {
		System.out.print("\t\tWELCOME TO OUR AIRLINES\n\t1.book a ticket\n\t2.check the ticket\n\t3.cancel the ticket\n\t4.Avail Offers\n\t5.Back\n_________________________________________________\nEnter your choice: ");
		int ch=sc.nextInt(); 
		return ch;
		 
	}
	
	//display of newTicket returns choice
	int displaynew() {
		System.out.print("\n\tNEW TICKET_________________________________________________\n");
		System.out.println("1.CHENNAI TO BANGLORE  20000     Air123    AirIndia\r\n"
				+ "2.CHENNAI TO MUMBAI    30000     Spice123  SpiceJet\r\n"
				+ "3.CHENNAI TO DELHI     18000     Ind123    IndiGo\r\n"
				+ "4.CHENNAI TO KARNATAKA 23000     Go123     GoIndia\r\n"
				+ "5.PUNJAB TO CHENNAI    30000     Air123    AirAsia\r\n"
				+ "6.UTTARPRADESH TO CHENNAI 12000  Vist123   Vistara\n");
		System.out.println("_________________________________________________\n");
		System.out.println("ENTER YOUR CHOICE: ");
		int ch=sc.nextInt();
		return ch;		
	}
	
	//Assign values to object
	void newTicket(int id,String name,String route,int amount,int age,double ph2) {
		this.id=id;
		this.name=name;
		this.route=route;
		this.Amount=amount;
		this.age=age;
		this.ph=ph2;
	}
	
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	 
		int i=1;
		String name;
		int age;
		double ph;
		int l=0;
		int amount=0;
		String route=null;
		String flightname;
		String flightcode;
		int fcode;
		String fname;
		airTicket a=new airTicket();
	
		try {
		//creating a array of objects
			
		airRoute z=new airRoute("CHENNAI TO BANGLORE",20000,"Air123","AirIndia");
		airRoute x=new airRoute("CHENNAI TO MUMBAI",30000,"Spice123","SpiceJet");
		airRoute y=new airRoute("CHENNAI TO DELHI",18000,"Ind123","IndiGo");
		airRoute w=new airRoute("CHENNAI TO KARNATAKA",23000,"Go123","GoIndia");
		airRoute v=new airRoute("PUNJAB TO CHENNAI",30000,"Air123","AirAsia");
		airRoute u=new airRoute("UTTARPRADESH TO CHENNAI",12000,"Vist123","Vistara");
		airTicket p[]=new airTicket[10];
		int ch=a.display();
		
		//while executes until user enters 5
		while(ch!=5) {
			
		  switch(ch) {
		     case 1:{
		    	 System.out.println("\tBOOK A TICKET");
			
		    	 int n=a.displaynew();
		    	 switch(n) {
		    	 case 1:{
		    		 route=z.name;
		    		 amount=z.price;
		    	 }
		    	 break;
		    	 
		    	 case 2:{
		    		 route=x.name;
		    		 amount=x.price;
		    	 }
		    	 break;
		    	 
		    	 case 3:{
		    		 route=y.name;
		    		 amount=y.price;
		    	 }
		    	 break;
		    	 
		    	 case 4:{
		    		 route=u.name;
		    		 amount=u.price;
		    	 }
		    	 break;
		    	 case 5:{
		    		 route=v.name;
		    		 amount=v.price;
		    	 }
		    	 break;
		    	 
		    	 case 6:{
		    		 route=u.name;
		    		 amount=u.price;
		    	 }
		    	 break;
		    	 default:System.out.println("Invalid choice");break;
		    	 }
//		    	 if(n==1) {
//		    		 amount=20000;
//		    		 route="CHENNAI TO BANGLORE";
//		    	 }
//		    	 else {
//		    		 amount=10000;
//		    		 route="MUMBAI TO DELHI";
//		    	 }
		    	 p[i]=new airTicket();
		    	 
		         do {
		    	 System.out.println("Enter your name: ");
		    	 name=sc.nextLine();
		    	 if(name.matches("[a-zA-z]+")) {
		    		 break;
		    	 }
		         }while(true);
		    	 
		    	 do {
		    	 System.out.println("Enter your age: ");
		    	 age=sc.nextInt();
		    	 }while(age>90||age<3);
		    	 
		    	 do {
		    		 
		    	 System.out.println("Enter your ph: ");
		    	 ph=sc.nextDouble();
		    	 double temp=ph; 
		    	 
		    	 while(temp>1) {
		    		 temp=temp/10;		    		 
		    		 l++;
		    	 }
		    	 }while(l!=10);
		    	 
		    	 int amt=p[i].offer(amount);
			
		    	 p[i].newTicket(i,name,route,amt,age,ph);
			
		    	 System.out.println("TICKET IS BOOKED");
		    	 ch=a.display();
		    	 i++;
		     }
		     break;
		 
		     case 2:{
		    	 System.out.println("\tCHECK YOUR TICKET");
		    	 System.out.println("Enter your id: ");
		    	 int id=sc.nextInt();
		    	 if(id<p.length) {
		    		 System.out.println("id:"+p[id].id+"\nname : "+p[id].name+"\nage : "+p[id].age+"\nph : "+p[id].ph+"\nroute : "+p[id].route+"\nAmount : "+p[id].Amount);
		    	 }
		    	 else {
		    		 System.out.println("invaid id");
		    	 }
		    	 ch=a.display();			
		     }
		     break;
		
		     case 3:{
		    	 System.out.println("\tCANCEL YOUR TICKET");
		    	 System.out.println("Enter your id: ");
		    	 int id=sc.nextInt();
		    	 System.out.println("Your Details");
			    	 if(id<p.length) {
			    		 System.out.println("id:"+p[id].id+"\nname : "+p[id].name+"\nage : "+p[id].age+"\nph no : "+p[id].ph+"\nroute : "+p[id].route+"\nAmount : "+p[id].Amount);
			    	 }
			    	 else {
			    		 System.out.println("Id not Found");
			    	 }
			    	 System.out.println("Are you sure??\n1.Yes\t2.No");
			    	 int yn=sc.nextInt();
			    	 if(yn==1) {
			    		 p[id].id=0;
			    		 p[id].name=null;
			    		 p[id].route=null;
			    		 p[id].ph=0;
			    		 p[id].age=0;
			    		 
			    		 System.out.println("Your ticket is cancelled \n"+p[id].Amount+"will be refunded soon");
			    		 p[id].Amount=0;
			    	 }
			    	 else {
			    		 System.out.println("invaid id");
			    	 }
			    	 ch=a.display();
		     }
		     break;
		     case 4:{
		    	 System.out.println(" Offers are\n"
		 				+ "\t For Childrens get a 50%off \t use 111\n"
		 				+ "\t Festive offer of flat 25% on booking\t use 123");
		    	 
		    	 ch=a.display();

		     }
		     break;
		     default:{
		    	 System.out.println("Invaid Choice");
		    	 ch=a.display();
		    	 
		 }
		}
	}
		System.out.println("\tThankyou...:)");
		
	}catch(Exception e) {
		System.out.println(e);
	}

 }

}
