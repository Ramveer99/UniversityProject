package universitysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Entermark extends JFrame implements ActionListener
{
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b1;
    Entermark()
    { 
        JLabel l1=new JLabel("Enter marks of Student");
        l1.setFont(new Font("System",Font.BOLD,30));
        l1.setBounds(100,20,400,25);
        add(l1);
                
          JLabel l2=new JLabel("Enter Rollno of Student");
        l2.setFont(new Font("System",Font.BOLD,22));
        l2.setBounds(100,80,400,25);
        add(l2);     
        
        t1=new JTextField("");
        t1.setFont(new Font("System",Font.BOLD,25));
        t1.setBounds(360,80,200,25);
        add(t1);  
        
        JLabel l3=new JLabel("Enter Subject");
        l3.setFont(new Font("System",Font.BOLD,22));
        l3.setBounds(100,150,200,23);
        add(l3);
        
         t2=new JTextField("");
        t2.setFont(new Font("System",Font.BOLD,24));
        t2.setBounds(100,190,230,24);
        add(t2);
        
        t3=new JTextField("");
        t3.setFont(new Font("System",Font.BOLD,24));
        t3.setBounds(100,230,230,24);
        add(t3);
        
        t4=new JTextField("");
        t4.setFont(new Font("System",Font.BOLD,24));
        t4.setBounds(100,270,230,24);
        add(t4);
        
        t5=new JTextField("");
        t5.setFont(new Font("System",Font.BOLD,24));
        t5.setBounds(100,310,230,24);
        add(t5);
        
        t6=new JTextField("");
        t6.setFont(new Font("System",Font.BOLD,24));
        t6.setBounds(100,350,230,24);
        add(t6);
        
        JLabel l4=new JLabel("Enter Mark");
        l4.setFont(new Font("System",Font.BOLD,22));
        l4.setBounds(350,150,200,23);
        add(l4);
        
        t7=new JTextField("");
        t7.setFont(new Font("System",Font.BOLD,24));
        t7.setBounds(331,190,230,24);
        add(t7);
        
        t8=new JTextField("");
        t8.setFont(new Font("System",Font.BOLD,24));
        t8.setBounds(331,230,230,24);
        add(t8);
        
        t9=new JTextField("");
        t9.setFont(new Font("System",Font.BOLD,24));
        t9.setBounds(331,270,230,24);
        add(t9);
        
         t10=new JTextField("");
        t10.setFont(new Font("System",Font.BOLD,24));
        t10.setBounds(331,310,230,24);
        add(t10);
        
        t11=new JTextField("");
        t11.setFont(new Font("System",Font.BOLD,24));
        t11.setBounds(331,350,230,24);
        add(t11);
        
        b1=new JButton("Submit");
        b1.setFont(new Font("System",Font.BOLD,20));
        b1.setBounds(100,400,100,23);
        add(b1);
        
        b1.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(250,100,650,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String a=t1.getText();
        String b=t2.getText();
        String c=t3.getText();
        String d=t4.getText();
        String l=t5.getText();
        String f=t6.getText();
        String g=t7.getText();
        String h=t8.getText();
        String i=t9.getText();
        String j=t10.getText();
        String k=t11.getText();
        conn c1=new conn();
        String q1="insert into subject values('"+a+"','"+b+"','"+c+"','"+d+"','"+l+"','"+f+"')";
        String q2="insert into marks values('"+a+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
        try
        {
            c1.s.executeUpdate(q1);
            c1.s.executeUpdate(q2);
            JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
            this.setVisible(false);
        }
        catch(Exception e){}
        
    }
    
    public static void main(String[] args)
    {
        new Entermark().setVisible(true);
    }
    
}
