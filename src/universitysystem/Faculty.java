
package universitysystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;


public class Faculty extends JFrame implements ActionListener
{
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    JComboBox c1,c2;
    JButton b1,b2;
    
    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    long first=Math.abs(first4);
    
    
    
    Faculty()
    {
        JLabel l1=new JLabel("New Faculty Detail");
        l1.setFont(new Font("System",Font.CENTER_BASELINE,25));
        l1.setBounds(240,5,400,25);
        add(l1);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/fifth.jpg"));
        Image i2=i1.getImage().getScaledInstance(750, 430,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l2=new JLabel(i3);
        l2.setBounds(0,28,750,450);
        add(l2);
        
        JLabel l3=new JLabel("Name:");
        l3.setFont(new Font("System",Font.BOLD,22));
        l3.setBounds(25,58,120,50);
        l2.add(l3);
        
        t1=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t1.setBounds(170,76,125,20);
       l2.add(t1);
        
       JLabel l4=new JLabel("Age:");
        l4.setFont(new Font("System",Font.BOLD,22));
        l4.setBounds(25,98,120,50);
        l2.add(l4);
        
        t2=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t2.setBounds(170,112,125,20);
       l2.add(t2);
       
       JLabel l5=new JLabel("Address:");
        l5.setFont(new Font("System",Font.BOLD,22));
        l5.setBounds(25,138,120,50);
        l2.add(l5);
        
        t3=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t3.setBounds(170,152,125,20);
       l2.add(t3);
       
       JLabel l6=new JLabel("Email:");
        l6.setFont(new Font("System",Font.BOLD,22));
        l6.setBounds(25,178,120,50);
        l2.add(l6);
        
        t4=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t4.setBounds(170,192,125,20);
       l2.add(t4);
       
       JLabel l7=new JLabel("Class XII(%):");
        l7.setFont(new Font("System",Font.BOLD,22));
        l7.setBounds(25,218,120,50);
        l2.add(l7);
        
        t5=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t5.setBounds(170,232,125,20);
       l2.add(t5);
    
        JLabel l8=new JLabel("Father's Name:");
        l8.setFont(new Font("System",Font.BOLD,22));
        l8.setBounds(340,58,160,50);
        l2.add(l8);
        
        t6=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t6.setBounds(545,76,130,20);
       l2.add(t6);
      
        JLabel l9=new JLabel("BOD (dd/yy/mm):");
        l9.setFont(new Font("System",Font.BOLD,22));
        l9.setBounds(340,98,160,50);
        l2.add(l9);
        
        t7=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t7.setBounds(545,112,130,20);
       l2.add(t7);
       
        JLabel l10=new JLabel("Phone:");
        l10.setFont(new Font("System",Font.BOLD,22));
        l10.setBounds(340,138,160,50);
        l2.add(l10);
        
        t8=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t8.setBounds(545,152,130,20);
       l2.add(t8);
       
        JLabel l11=new JLabel("Class X(%):");
        l11.setFont(new Font("System",Font.BOLD,22));
        l11.setBounds(340,178,160,50);
        l2.add(l11);
        
        t9=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t9.setBounds(545,192,130,20);
       l2.add(t9);
       
        JLabel l12=new JLabel("Aadhar:");
        l12.setFont(new Font("System",Font.BOLD,22));
        l12.setBounds(340,218,160,50);
        l2.add(l12);
        
        t10=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
        t10.setBounds(545,232,130,20);
       l2.add(t10);
       
        JLabel l13=new JLabel("Department:");
        l13.setFont(new Font("System",Font.BOLD,22));
        l13.setBounds(340,258,160,50);
        l2.add(l13);
        
         String B[]={"COMPUTE SCIENCE","ELECTRICAL","CIVIL","MACHINICAL","COMMERCIAL"};
        c2=new JComboBox(B);
        c2.setFont(new Font("System",Font.BOLD,22));
        c2.setBounds(545,272,130,25);
        l2.add(c2);
        
        JLabel l14=new JLabel("Emp Id:");
        l14.setFont(new Font("System",Font.BOLD,22));
        l14.setBounds(340,298,160,50);
        l2.add(l14);
        
        t11=new JTextField("");
       // t1.setFont(new Font("System",Font.BOLD,15));
       t11.setText("12310"+first4);
        t11.setBounds(545,312,130,20);
       l2.add(t11);
       
        JLabel l15=new JLabel("Education:");
        l15.setFont(new Font("System",Font.BOLD,22));
        l15.setBounds(25,258,160,50);
        l2.add(l15);
        
        String A[]={"BCA","MCA","B.TECH","M.TECH","BA","BBA","POLYTECHNIC"};
        c1=new JComboBox(A);
        c1.setFont(new Font("System",Font.BOLD,22));
        c1.setBounds(170,272,130,25);
        l2.add(c1);
        
      b1=new JButton("SUBMITTE");
      b1.setFont(new Font("System",Font.BOLD,22));
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.setBounds(120,362,160,30);
      l2.add(b1);
       
      b2=new JButton("BACK");
      b2.setFont(new Font("System",Font.BOLD,22));
      b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      b2.setBounds(460,362,160,30);
      l2.add(b2); 
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      
      setLayout(null);  
      setBounds(270,170,750,495); 
      setVisible(true);
    }
    
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
            String id=t11.getText();
            String Education=(String)c1.getSelectedItem();
            String dept=(String)c2.getSelectedItem();
            
            conn c1=new conn();
            String q1="insert into teacher values('"+name+"','"+fname+"','"+age+"','"+dob+"','"+phone+"','"+address+"','"+email+"','"+classx+"','"+classxii+"','"+Aadhar+"','"+Education+"','"+id+"','"+dept+"')";
           try
           {
            c1.s.executeUpdate(q1);
            JOptionPane.showMessageDialog(null,"New Faculty Added");
            this.setVisible(false);
           }
            catch(Exception e)
            {e.printStackTrace();}
        }
        else if(ae.getSource()==b2)
        {
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new Faculty().setVisible(true);
    }
    
}
