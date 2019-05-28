/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shipping;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author ICONMicrosystems
 */
public class conn {

       public conn(){

    try{

                                             String driver = "com.mysql.jdbc.Driver";
					     String connection = "jdbc:mysql://localhost:3306/offshore_shiping";
					     String user = "root";
					     String password = "";


						Class.forName(driver);
						Connection con = DriverManager.getConnection(connection, user, password);
					        JOptionPane.showMessageDialog(null,"JB Con Ok...");
                                                con.close();

    }
    catch(Exception ex){
        System.out.println("Database not Found");

    }
    }
}
