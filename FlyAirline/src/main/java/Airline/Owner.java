package Airline;
import java.sql.*;
import java.util.*;

public class Owner {
	
   public static void main(String args[]) throws ClassNotFoundException, SQLException {
	   
	   Scanner sc=new Scanner(System.in);
	   String name="SpiceJet",src="Chennai",dest="Banglore",date="10/09/22";
	   int time=10,amt=10000;
	   
	   
	   
	   System.out.print("enter how many: ");
	   int n=sc.nextInt();
	   
	   
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/airline","root","root16");
	   Statement st=con.createStatement();
	  
	   
	   
       for(int i=1;i<=n;i++) {
//		   System.out.print("\nflight name: ");
//		   name=sc.next();
//		   
//		   System.out.print("\nsrc: ");
//		   src=sc.next();
//		   
//		   System.out.print("\ndest: ");
//		   dest=sc.next();
//		   
//		   System.out.print("\ndate: ");
//		   date=sc.next();
//		   
//		   System.out.print("\ntime: ");
//		   time=sc.nextInt();
//		   
//		   System.out.print("\nAmount: ");
//		   amt=sc.nextInt();
		   
		   String code="('"+i+"','"+name+"','"+src+"','"+dest+"','"+date+"','"+time+"','"+amt+"')";
		   int x=st.executeUpdate("insert into flights values "+code);
		   if(x >0) {
			   System.out.println(i +"is inserted");
			   x=0;
		   }
		   else {
			   System.out.println("Operation failed");
		   }
	     }
	   
       System.out.println("Flight list");
       ResultSet rs=st.executeQuery("Select * from flights");
	   
	   while(rs.next()) {
		   
		   System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6)+"  "+rs.getInt(7));
		  
		   
	   }
	   
	   System.out.println("Enter the id to delete: ");
	   int id=sc.nextInt();
	   PreparedStatement ps=con.prepareStatement("DELETE FROM FLIGHTS WHERE ID="+"('"+ id +"')");
	   ps.execute();
//	   
//	   System.out.println("passenger list: ");
//	   ResultSet r=st.executeQuery("select * from booking");
//       
//       while(rs.next()) {
//    	   
//       	System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)+" "+r.getLong(4)+" "+r.getString(5)+" "+r.getString(6)+" "+r.getInt(7));
//       }
       
	   rs.close();
	   st.close();
	   ps.close();
		
   }
}
