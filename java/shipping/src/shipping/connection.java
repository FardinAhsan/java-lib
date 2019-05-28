

package shipping;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.*;
import java.sql.*;

public class connection extends JFrame{
    Connection con;
    private JDesktopPane dpane = new JDesktopPane();

    
    public connection(){
        Shipping_info1 s = new Shipping_info1();
        JInternalFrame f= new JInternalFrame("Shipping information", true, true, true);
        f.add(s,BorderLayout.CENTER);
        dpane.add(f);
        f.setSize(400,500);
        f.setVisible(true);
        
         try
         {
          /* Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           con=DriverManager.getConnection("jdbc:odbc:cuet", "System","tiger");
           System.out.println("Connection is successful");*/

           Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/diagnostic","root","");
            System.out.println("Connection Successful");

         }
         catch (Exception ex)
         {
             //System.exit(0);
             JOptionPane.showMessageDialog (null, ex.toString());
         }
        
    }


    public static void main(String[] args) {
        connection obj = new connection();
        
       
        //dpane.add(f);

    }

}
