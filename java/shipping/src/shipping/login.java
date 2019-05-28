package shipping;

//package ofshore_nasir;
// login form.....

import javax.swing.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.sql.*;

public class login extends JFrame implements ActionListener,MouseListener{

    int w=500;
    int h=300;
    JPanel header,center,footer;
    String type[]={"Super Admin","Admin","User"};
    JComboBox cb;
    JLabel l;
    JButton login,forgotpass;
    Border border=new EtchedBorder();
    Font font=new Font("courier new",Font.PLAIN,16);
    JTextField userNameF,field;
    Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
    Statement sta;
    Font lFont=new Font("courier new",Font.PLAIN,15);
    JPasswordField passwordF;
    Font smallF=new Font("serif",Font.PLAIN,12);
    JLabel link,fPassword,exitL;

    public String user;
    public String catagory1;
    private Connection con;


    public login(){
        super("Offshore Shiping Lines");
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        setLayout(new BorderLayout());


        try
         {
          /* Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           con=DriverManager.getConnection("jdbc:odbc:cuet", "System","tiger");
           System.out.println("Connection is successful");*/

           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/offshore_shiping","root","");
           System.out.println("Connection Successful");

         }
         catch (Exception ex)
         {
             //System.exit(0);
             JOptionPane.showMessageDialog (null, ex.toString());
         }





        setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));

// creating panel object
        header=new JPanel();
        center=new JPanel();
        footer=new JPanel();


// set layout to panel
        header.setLayout(new FlowLayout());
        footer.setLayout(null);
        center.setLayout(null);
        //center.setBorder(new EtchedBorder(Color.green,Color.blue));



// panel size
        center.setPreferredSize(new Dimension(screen.width+50,50));
        header.setPreferredSize(new Dimension(screen.width,50));
        footer.setPreferredSize(new Dimension(screen.width,50));

// set background color to panel
        header.setBackground(new Color(155,200,200));
        footer.setBackground(new Color(155,200,200));
        //center.setBackground(new Color(50,200,200));
        center.setBackground(Color.white);








        l=new JLabel("Offshore Shiping Lines");
        l.setFont(new Font("serif",Font.PLAIN,24));
        l.setForeground(Color.white);
        header.add(l);






//component to center....
        l=new JLabel("User Name :");
                l.setBounds(100, 60, 110, 25);
                l.setFont(font);
                center.add(l);
        l=new JLabel("Password  :");
                l.setBounds(100, 100, 110, 25);
                l.setFont(font);
                center.add(l);

       userNameF=new JTextField();
                userNameF.setBounds(220, 60, 140, 25);
                userNameF.setFont(font);
                center.add(userNameF);

       passwordF=new JPasswordField();
                passwordF.setBounds(220, 100, 140, 25);
                passwordF.setFont(font);
                center.add(passwordF);

       cb=new JComboBox(type);
                cb.setBounds(220, 130, 140, 25);
                cb.setFont(lFont);
                center.add(cb);

       link=new JLabel("Login");
                link.setForeground(Color.blue);
                link.setCursor(cursor);
                link.setBounds(220, 165,30, 15);
                link.setFont(smallF);
                center.add(link);
                link.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                        MainFrame obj = new MainFrame(con);
                        obj.setVisible(true);
                        setVisible(false);
                        }
                        public void mouseReleased(MouseEvent e) {
                            //center.setBackground(Color.black);
                        }
                        public void mouseEntered(MouseEvent e) {
                            link.setForeground(Color.red);
                            link.setFont(new Font("serif",Font.BOLD,12));
                        }
                        public void mouseExited(MouseEvent e) {
                            link.setForeground(Color.blue);
                            link.setFont(smallF);
                        }
                        });



       l=new JLabel("|");
                l.setBounds(255, 160,4, 25);
                l.setFont(new Font("serif",Font.BOLD,12));
                center.add(l);
       fPassword=new JLabel("Forget Password");
                fPassword.setCursor(cursor);
                fPassword.setBounds(270, 165,85, 15);
                fPassword.setForeground(Color.blue);
                fPassword.setFont(smallF);
                center.add(fPassword);
                fPassword.addMouseListener(new MouseAdapter()  {
                        public void mouseClicked(MouseEvent e) {
                            //System.exit(0);
                        }
                        public void mouseReleased(MouseEvent e) {
                            //center.setBackground(Color.black);
                        }
                        public void mouseEntered(MouseEvent e) {
                            fPassword.setForeground(Color.red);
                            fPassword.setFont(new Font("serif",Font.BOLD,12));
                        }
                        public void mouseExited(MouseEvent e) {
                            fPassword.setForeground(Color.blue);
                            fPassword.setFont(smallF);
                        }
                        });


       exitL=new JLabel("Exit");
                exitL.setCursor(cursor);
                exitL.setBounds(w-30,30,85, 15);
                exitL.setForeground(Color.gray);
                exitL.setFont(smallF);
                footer.add(exitL);
                exitL.addMouseListener(new MouseAdapter()  {
                        public void mouseClicked(MouseEvent e) {
                            System.exit(0);
                        }
                        public void mouseReleased(MouseEvent e) {
                            //center.setBackground(Color.black);
                        }
                        public void mouseEntered(MouseEvent e) {
                            exitL.setForeground(Color.black);
                            exitL.setFont(new Font("serif",Font.BOLD,12));
                        }
                        public void mouseExited(MouseEvent e) {
                            exitL.setForeground(Color.gray);
                            exitL.setFont(smallF);
                        }
                        });









//       Icon icon=new ImageIcon("background.jpg");
//       l=new JLabel(icon);
//       center.add(l);







        add(header,BorderLayout.NORTH);
        add(center,BorderLayout.CENTER);
        add(footer,BorderLayout.SOUTH);
// end of disign.....








        setResizable(false);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle( JRootPane.COLOR_CHOOSER_DIALOG);
        setLocation((screen.width-w)/2,(screen.height-h)/2);
        setSize(w,h);
        show();
    }

   public static void login(String[] args) {
       try {
           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
       } catch (Exception e) {
       }

    login m=new login();
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public void actionPerformed(ActionEvent e) {


        }

    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
// mouse listener method....

