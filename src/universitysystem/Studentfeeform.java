
package universitysystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class Studentfeeform extends JFrame  implements ActionListener
{
 Choice c;
 JTextField t1,t2,t3;
 JButton b1,b2;
 JComboBox c2,c3,c4;
    
    Studentfeeform()
    {
        super("Student Fee Form");
        
         JPanel pan=new JPanel();
        pan.setBorder(new TitledBorder(new LineBorder(new Color(0,250,150),3,true), "Pay",TitledBorder.LEADING,TitledBorder.TOP,null, new Color(0,128,0)));
        pan.setBackground(Color.WHITE);
        pan.setBounds(4,50,360,410);
        add(pan);
        pan.setLayout(null);
        
        
        JLabel l1=new JLabel("Select Rollno");
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setForeground(Color.red);
        l1.setBounds(10,50,130,20);
        pan.add(l1);
        
        c=new Choice();
        try
        {
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery("select * from student");
            while(rs.next())
            {
            c.add(rs.getString("Roll_no"));
            }
        }catch(Exception e){}
        c.setBounds(160,50,130,20);
        pan.add(c);
        
        JLabel l2=new JLabel("Name");
        l2.setFont(new Font("System",Font.BOLD,18));
        l2.setForeground(Color.red);
        l2.setBounds(10,90,130,20);
        pan.add(l2);
        
       t1=new JTextField("");
       t1.setFont(new Font("System",Font.BOLD,15));
       t1.setBounds(160,90,130,19);
       pan.add(t1);
        
        JLabel l4=new JLabel("Fathername:");
        l4.setFont(new Font("System",Font.BOLD,18));
        l4.setForeground(Color.red);
        l4.setBounds(10,130,130,20);
        pan.add(l4);
        
        t2=new JTextField("");
       t2.setFont(new Font("System",Font.BOLD,15));
       t2.setBounds(160,130,130,19);
       pan.add(t2);
       
        JLabel l5=new JLabel("Course");
        l5.setFont(new Font("System",Font.BOLD,18));
        l5.setForeground(Color.red);
        l5.setBounds(10,170,130,20);
        pan.add(l5);
        
         String A[]={"BCA","MCA","B.TECH","M.TECH","BA","BBA","POLYTECHNIC"};
        c2=new JComboBox(A);
        c2.setFont(new Font("System",Font.BOLD,18));
        c2.setBounds(160,170,130,20);
        pan.add(c2);
        
        JLabel l6=new JLabel("Branch");
        l6.setFont(new Font("System",Font.BOLD,18));
        l6.setForeground(Color.red);
        l6.setBounds(10,210,130,20);
        pan.add(l6);
        
         String B[]={"COMPUTE SCIENCE","ELECTRICAL","CIVIL","MACHINICAL","COMMERCIAL"};
        c3=new JComboBox(B);
        c3.setFont(new Font("System",Font.BOLD,18));
        c3.setBounds(160,210,130,20);
        pan.add(c3);
        
        JLabel l7=new JLabel("Semester");
        l7.setFont(new Font("System",Font.BOLD,18));
        l7.setForeground(Color.red);
        l7.setBounds(10,250,130,20);
        pan.add(l7);
        
         String D[]={"I sem","II sem","III sem","IV sem","V sem","VI sem"};
        c4=new JComboBox(D);
        c4.setFont(new Font("System",Font.BOLD,18));
        c4.setBounds(160,250,130,20);
        pan.add(c4);
        
        JLabel l8=new JLabel("Total Payable");
        l8.setFont(new Font("System",Font.BOLD,18));
        l8.setForeground(Color.red);
        l8.setBounds(10,290,130,20);
        pan.add(l8);
        
       t3=new JTextField("");
       t3.setFont(new Font("System",Font.BOLD,15));
       t3.setBounds(160,290,130,19);
       pan.add(t3);
        
        b1=new JButton("Pay");
        b1.setFont(new Font("System",Font.BOLD,20));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setBounds(12,365,130,22);
        pan.add(b1);
       
        b2=new JButton("Back");
        b2.setFont(new Font("System",Font.BOLD,20));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(160,365,130,22);
        pan.add(b2);
       
        
        setUndecorated(true);
        //getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,1.0f));
        setBackground(new Color(1.0f,1.0f,1.0f,1.0f));
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(null);
        setBounds(400,150,370,510);
        //setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String name=t1.getText();
            String fname=t2.getText();
            String pay=t3.getText();
            String roll=c.getSelectedItem();
            String course=(String)c2.getSelectedItem();
            String br=(String)c3.getSelectedItem();
            String sem=(String)c4.getSelectedItem();
            conn c=new conn();
            String q1="insert into fee values('"+roll+"','"+name+"','"+fname+"','"+course+"','"+br+"','"+sem+"','"+pay+"')";
            try
            {
                c.s.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "fee Payed");
                
                 this.setVisible(false);
            }catch(Exception e){}
            
        }
        else if(ae.getSource()==b2)
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new Studentfeeform().setVisible(true);
    }
    
}
