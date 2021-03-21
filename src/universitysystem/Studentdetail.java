
package universitysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import net.proteanit.sql.*;

public class Studentdetail extends JFrame implements ActionListener
{
    JButton b1,b2,b3;
    JTable t1;
    JTextField t2;
    String x[]={"Name","Father","Age","DOB","Phone","Address","Email","Classx_No","Classxii_No","Adhar","Roll_No","Education","Department"};
    String y[][]=new String[20][13];
    int i=0,j=0;
    Studentdetail()
    {
        
          JLabel l1=new JLabel("Add new Student");
        l1.setFont(new Font("System",Font.CENTER_BASELINE,25));
        l1.setBounds(30,500,400,25);
        add(l1);
        
          JLabel l2=new JLabel("Update Student Detail");
        l2.setFont(new Font("System",Font.CENTER_BASELINE,25));
        l2.setBounds(30,565,400,25);
        add(l2);
        
        JLabel l3=new JLabel("Enter Rollno To Delete Student");
        l3.setFont(new Font("System",Font.CENTER_BASELINE,25));
        l3.setBounds(30,400,400,25);
        add(l3);
        
        t2=new JTextField("");
        t2.setFont(new Font("System",Font.CENTER_BASELINE,24));
        t2.setBounds(430,400,250,24);
        add(t2);
        
        b1=new JButton("Add");
        b1.setFont(new Font("System",Font.CENTER_BASELINE,22));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(350,500,150,23);
        add(b1);
        
        
        
        b2=new JButton("Update");
        b2.setFont(new Font("System",Font.CENTER_BASELINE,22));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(350,565,150,23);
        add(b2);
        
       b3=new JButton("Delete");
        b3.setFont(new Font("System",Font.CENTER_BASELINE,22));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setBounds(700,400,150,23);
        add(b3);
        
        
      
        try
        {
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery("select * from Student");
            while(rs.next())
            {
                y[i][j++]=rs.getString("Name");
                y[i][j++]=rs.getString("Father");
                y[i][j++]=rs.getString("Age");
                y[i][j++]=rs.getString("DOB");
                y[i][j++]=rs.getString("Phone");
                y[i][j++]=rs.getString("Address");
                y[i][j++]=rs.getString("Email");
                y[i][j++]=rs.getString("Classx_No");
                y[i][j++]=rs.getString("Classxii_No");
                y[i][j++]=rs.getString("Adhar");
                y[i][j++]=rs.getString("Roll_no");
                y[i][j++]=rs.getString("Education");
                y[i][j++]=rs.getString("Department");
                i++;
                j=0;
            }
              t1=new JTable(y,x);
           // t1.setModel(DbUtils.resultSetToTableModel(rs));
        
          // t1.setBounds(10,40,950,150);
        //add(t1);
        }catch(Exception e){}
        
        JScrollPane s1=new JScrollPane(t1);
        s1.setBounds(10,40,950,350);
        add(s1);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setLayout(null);
        setBounds(200,50,980,700);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }

   public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
           new Student().setVisible(true);
            this.setVisible(false); 
        }
        else if(ae.getSource()==b2)
        {
            new Updatestudent().setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource()==b3)
        {
            try
            {
            String id=t2.getText();
            conn c1=new conn();
            String q1="delete from Student where Roll_no='"+id+"'";
            c1.s.executeUpdate(q1);
            this.setVisible(false);
            //.showMessageDialog(null,"Teacherdetail Detail successfully delete");
            new Studentdetail().setVisible(true);
                
                        
            }catch(Exception e){e.printStackTrace();}
                    
        }
    }

    public static void main(String[] args)
    {
        new Studentdetail().setVisible(true);
    }
}

