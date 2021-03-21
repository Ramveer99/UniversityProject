
package universitysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Teacherattendence extends JFrame implements ActionListener
{
    Choice c,fh,sh;
    JButton b1,b2;
    JLabel l1,l2,l3;
    Teacherattendence()
    {
        c=new Choice();
        
            conn c1=new conn();
           
            try
            {
                 ResultSet rs=c1.s.executeQuery("select * from teacher");
                 while(rs.next())
                 {
                     c.add(rs.getString("ID"));
                 }
            }catch(Exception e){}
            add(new JLabel("Teacher id"));
            add(c);
        l1=new JLabel("First Half");
        fh=new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");
        
        add(l1);
        add(fh);
        
        l2=new JLabel("Second ");
        sh=new Choice();
        sh.add("Present");
        sh.add("Absent");
        sh.add("Leave");
        
        add(l2);
        add(sh);
        
         b1=new JButton("SUBMITTE");
      b1.setFont(new Font("System",Font.BOLD,22));
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      add(b1);
        
      
      b2=new JButton("CANCEL");
      b2.setFont(new Font("System",Font.BOLD,22));
      b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      add(b2);
      
      b1.addActionListener(this);
      b2.addActionListener(this);
        setLayout(new GridLayout(4,2,50,50));
        setBounds(260,120,400,450);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String roll=c.getSelectedItem();
            String fhalf=fh.getSelectedItem();
            String shalf=sh.getSelectedItem();
            String date=new java.util.Date().toString();
            conn c1=new conn();
            try
            {
                String q1="insert into attendance_teacher values('"+roll+"','"+date+"','"+fhalf+"','"+shalf+"')";
                c1.s.executeUpdate(q1);
                
                JOptionPane.showMessageDialog(null,"Attendance Confired");
                this.setVisible(false);
            }catch(Exception e){}
        }
        if(ae.getSource()==b2)
        {
            this.setVisible(false);
        }
    }

public static void main(String[] args)
{
    new Teacherattendence().setVisible(true);
}
}
