
package universitysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Studentattendensdetail extends JFrame implements ActionListener
{
    JTable t1;
    JButton b1;
    Studentattendensdetail()
    {
        super("View Student Attendence");
        String x[]={"Roll Number","date","Half Time","Second Time"};
        String y[][]=new String[30][4];
        int i=0,j=0;
        try
        {
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from attendance_student");
            
            while(rs.next())
            {
                y[i][j++]=rs.getString("Roll_no");
                 y[i][j++]=rs.getString("Date");
                  y[i][j++]=rs.getString("First");
                   y[i][j++]=rs.getString("second");
                   i++;
                   j=0;
            }
        }catch(Exception e){}
        t1=new JTable(y,x);
        JScrollPane s1=new JScrollPane(t1);
        s1.setBounds(0,0,540,340);
        add(s1);
        
      b1=new JButton("Print");
      b1.setFont(new Font("System",Font.BOLD,20));
     /* b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);*/
      b1.setBounds(0,340,540,20);
      add(b1);
        
        setLayout(null);
        setBounds(260,120,550,400);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            t1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args)
    {
        new Studentattendensdetail().setVisible(true);
    }
}
