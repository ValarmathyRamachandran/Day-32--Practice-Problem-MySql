package bridgelabzAddressBook;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Enumeration;

import com.mysql.cj.jdbc.Driver;
public class ConnectToDatabase {
   public static void main(String[] args) {
      Connection con = null;
      try {
    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	  System.out.println("Driver loaded");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user = root & password = ******* ");
         if (con != null) {
            System.out.println("Database connection is successful !!!!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   
  private static void listDrivers() {
	  Enumeration<java.sql.Driver> driverList = DriverManager.getDrivers();
	  while (driverList.hasMoreElements()) {
		  Driver driverClass =(Driver) driverList.nextElement();
		  System.out.println("  "+driverClass.getClass().getName());
	  }
  } 
 }
 
