/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shipping;

import javax.swing.UIManager;


public class Main {

    public Main(){
      

    }
    public static void main(String[] args) {

         try
                        {
                            //UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
                            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                            //SwingUtilities.updateComponentTreeUI(this);
                            }
                catch (Exception unused) {}

        // TODO code application logic here
     //   Main main = new Main();
       // master_form1 m=new master_form1();
       // m.setVisible(true);

        login obj = new login();
        obj.setVisible(true);
    }

}
