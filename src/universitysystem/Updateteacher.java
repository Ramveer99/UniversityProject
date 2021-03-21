
package universitysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;


public class Updateteacher extends JFrame implements ActionListener
{
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    JComboBox c1,c2;
    JButton b1,b2,b3;
    
   
    
    
    Updateteacher()
    {
       
        JLabel l1=new JLabel("Enter Teacher emp_id for Update Data");
        l1.setFont(new Font("System",Font.CENTER_BASELINE,20));
        l1.setBounds(25,60,500,20);
        add(l1);
        
          t12=new JTextField();
       // t1.setFont(new Font("System",Font.BOLD,15));
       t12.setBounds(400,60,220,20);
       add(t12);
        
        JLabel l3=new JLabel("Name:");
        l3.setFont(new Font("System",Font.BOLD,20));
        l3.setBounds(25,118,120,20);
        add(l3);
        
        t1=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t1.setBounds(170,120,125,20);
        add(t1);
        
       JLabel l4=new JLabel("Age:");
        l4.setFont(new Font("System",Font.BOLD,20));
        l4.setBounds(25,158,120,20);
        add(l4);
        
        t2=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t2.setBounds(170,160,125,20);
        add(t2);
       
        JLabel l5=new JLabel("Address:");
        l5.setFont(new Font("System",Font.BOLD,20));
        l5.setBounds(25,198,120,20);
        add(l5);
        
        t3=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t3.setBounds(170,200,125,20);
        add(t3);
       
       JLabel l6=new JLabel("Email:");
        l6.setFont(new Font("System",Font.BOLD,20));
        l6.setBounds(25,238,120,20);
        add(l6);
        
        t4=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t4.setBounds(170,240,125,20);
        add(t4);
       
        JLabel l7=new JLabel("Class XII(%):");
        l7.setFont(new Font("System",Font.BOLD,20));
        l7.setBounds(25,278,120,20);
        add(l7);
        
        t5=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t5.setBounds(170,280,125,20);
        add(t5);
    
       /* JLabel l16=new JLabel("RollNo:");
        l16.setFont(new Font("System",Font.BOLD,20));
        l16.setBounds(25,358,160,20);
        add(l16);*/
        
      
       
    
       
        JLabel l8=new JLabel("Father's Name:");
        l8.setFont(new Font("System",Font.BOLD,20));
        l8.setBounds(340,118,160,20);
        add(l8);
        
        t6=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t6.setBounds(545,120,130,20);
        add(t6);
      
        JLabel l9=new JLabel("BOD (dd/yy/mm):");
        l9.setFont(new Font("System",Font.BOLD,20));
        l9.setBounds(340,158,160,20);
        add(l9);
        
        t7=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t7.setBounds(545,160,130,20);
        add(t7);
       
        JLabel l10=new JLabel("Phone:");
        l10.setFont(new Font("System",Font.BOLD,20));
        l10.setBounds(340,198,160,20);
        add(l10);
        
        t8=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t8.setBounds(545,200,130,20);
        add(t8);
       
        JLabel l11=new JLabel("Class X(%):");
        l11.setFont(new Font("System",Font.BOLD,20));
        l11.setBounds(340,238,160,20);
        add(l11);
        
        t9=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t9.setBounds(545,240,130,20);
        add(t9);
       
        JLabel l12=new JLabel("Aadhar:");
        l12.setFont(new Font("System",Font.BOLD,20));
        l12.setBounds(340,278,160,20);
        add(l12);
        
        t10=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t10.setBounds(545,280,130,20);
        add(t10);
       
        JLabel l13=new JLabel("Branch:");
        l13.setFont(new Font("System",Font.BOLD,20));
        l13.setBounds(340,318,160,20);
        add(l13);
        
         String B[]={"COMPUTE SCIENCE","ELECTRICAL","CIVIL","MACHINICAL","COMMERCIAL"};
        c2=new JComboBox(B);
        c2.setFont(new Font("System",Font.BOLD,20));
        c2.setBounds(545,320,130,20);
        add(c2);
        
      
       
        JLabel l15=new JLabel("Course:");
        l15.setFont(new Font("System",Font.BOLD,20));
        l15.setBounds(25,318,160,20);
        add(l15);
        
        String A[]={"BCA","MCA","B.TECH","M.TECH","BA","BBA","POLYTECHNIC"};
        c1=new JComboBox(A);
        c1.setFont(new Font("System",Font.BOLD,20));
        c1.setBounds(170,320,130,20);
        add(c1);
        
        
        b1=new JButton("SUBMITTE");
        b1.setFont(new Font("System",Font.BOLD,22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(120,430,160,30);
        add(b1);
       
        b2=new JButton("BACK");
        b2.setFont(new Font("System",Font.BOLD,22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(460,430,160,30);
        add(b2);
        
        b3=new JButton("Update");
        b3.setFont(new Font("System",Font.BOLD,20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(650,57,160,22);
        add(b3);
        
        getContentPane().setBackground(Color.WHITE);
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      
      setLayout(null);  
      setBounds(270,140,850,550); 
      setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String name=t1.getText();
            String age=t2.getText();
            String address=t3.getText();
            String email=t4.getText();
            String classxii=t5.getText();
            String fname=t6.getText();
            String dob=t7.getText();
            String phone=t8.getText();
            String classx=t9.getText();
            String Aadhar=t10.getText();
            //String id=t11.getText();
            String roll=t12.getText();
            String Education=(String)c1.getSelectedItem();
            String dept=(String)c2.getSelectedItem();
            
            conn c1=new conn();
            String q1="insert into teacher values('"+name+"','"+fname+"','"+age+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+classx+"','"+classxii+"','"+Aadhar+"','"+Education+"','"+roll+"','"+dept+"')";
           try
           {
            c1.s.executeUpdate(q1);
            JOptionPane.showMessageDialog(null,"New Student Added");
            
            this.setVisible(false);
           }
            catch(Exception e)
            {e.printStackTrace();}
        }
        else if(ae.getSource()==b2)
        {
            this.setVisible(false);
        }
        else if(ae.getSource()==b3)
        {
            try
            {
            conn c=new conn();
            String q2="select * from teacher where ID='"+t12.getText()+"'";
            ResultSet rs1=c.s.executeQuery(q2);
            while(rs1.next())
            {
                t1.setText(rs1.getString("Name"));
                t6.setText(rs1.getString("Father"));
                t2.setText(rs1.getString("Age"));
                t7.setText(rs1.getString("DOB"));
                t3.setText(rs1.getString("Address"));
                t8.setText(rs1.getString("Phone"));
                t4.setText(rs1.getString("Email"));
                t9.setText(rs1.getString("classx_No"));
                t5.setText(rs1.getString("classxii_No"));
                t10.setText(rs1.getString("Adhar"));
                //t1.setText(rs1.getString("name"));
                setVisible(true);
            }
            
            }catch(Exception e){System.out.println(e);}
        }    
    }
    
    public static void main(String[] args)
    {
        new Updateteacher().setVisible(true);
    }
    
}

