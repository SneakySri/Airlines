package Airline;
import java.sql.*;
import java.util.Scanner;
public class Passengers {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int i=2;
		String name="Sri",src="Banglore",dest="Chennai";
		int age=21,amt=22000;
		double ph=1234567899;
		
		
    	System.out.println("Name: ");
    	name=sc.next();
    	
    	System.out.println("age: ");
    	age=sc.nextInt();
    	
    	System.out.println("ph: ");
    	ph=sc.nextDouble();
//    	
//    	System.out.println("src: ");
//    	System.out.println("dest: ");
//    	System.out.println("amt: ");
    	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/airline","root","root16");
        Statement st=con.createStatement();
        PreparedStatement ps=con.prepareStatement("INSERT INTO BOOKING");{
        	ps.setInt(1, i);
        	ps.setString(2, name);
        	ps.setInt(3, age);
        	ps.setDouble(4, ph);
        	ps.setString(5, src);
        	ps.setString(6, dest);
        	ps.setInt(7, amt);
        	i++;
        }
   
        ResultSet rs=st.executeQuery("select * from booking");
        
        while(rs.next()) {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7));
        }
            
	}

}
