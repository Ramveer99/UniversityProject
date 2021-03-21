
package universitysystem;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;



public class Marks extends JFrame 
{
    JTextArea t1;
    JPanel p1;
    Marks(){}
    Marks(String str)
    {
        setSize(500,600);
        setLayout(new BorderLayout());
        setVisible(true);
        
        p1= new JPanel();
        
        t1=new JTextArea(50,15);
        JScrollPane jp=new JScrollPane(t1);
        t1.setFont(new Font("Senserif",Font.ITALIC,18));
        add(p1,"North");
        add(jp,"Center");
        setLocation(450,200);
       mark(str);
    }
    
    public void mark(String s)
    {
        try
        {
          
            conn c=new conn();
            t1.setText("\tResult of Examination\n\nsubject\n");
            ResultSet rs=c.s.executeQuery("select * from subject where Roll_no="+s);
            if(rs.next())
            {
                t1.append("\n\t"+rs.getString("subject1"));
                t1.append("\n\t"+rs.getString("subject2"));
                t1.append("\n\t"+rs.getString("subject3"));
                t1.append("\n\t"+rs.getString("subject4"));
                t1.append("\n\t"+rs.getString("subject5"));
                t1.append("\n---------------------------------------------");
                t1.append("\n");
            }
            
             ResultSet rs1=c.s.executeQuery("select * from marks where Roll_no="+s);
             if(rs1.next())
             {
                 int mark1=Integer.parseInt(rs1.getString("mark1"));
                 int mark2=Integer.parseInt(rs1.getString("mark2"));
                 int mark3=Integer.parseInt(rs1.getString("mark3"));
                 int mark4=Integer.parseInt(rs1.getString("mark4"));
                 int mark5=Integer.parseInt(rs1.getString("mark5"));
                 int total=mark1+mark2+mark3+mark4+mark5;
                         
                 t1.append("\nMark\n\n\t"+rs1.getString("mark1"));
                 t1.append("\n\t"+rs1.getString("mark2"));
                 t1.append("\n\t"+rs1.getString("mark3"));
                 t1.append("\n\t"+rs1.getString("mark4"));
                 t1.append("\n\t"+rs1.getString("mark5"));
                 t1.append("\n---------------------------------------------");
                 t1.append("\n");
                 t1.append("\nTotal marks:      ");
                 t1.append(total+"/500");
                 
             }
        }catch(Exception e){e.printStackTrace();}
        
    }
      
           
   
            
            
            public static void main(String[] args)
    {
        new Marks().setVisible(true);
    }

  
}
