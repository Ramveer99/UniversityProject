package universitysystem;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class Examdetail extends JFrame implements ActionListener
{
    JTable table;
    JTextField t1;
    JPanel panel;
    JButton b1,b2,b3;
    
    
    Examdetail()
    {
      
      panel=new JPanel();
      panel.setBorder(new LineBorder(new Color(2,5,5),2,true));
       //panel.setBorder(new EmptyBorder(5,5,5,5));
       panel.setBounds(300,300,600,300);
      //panel.setBackground(Color.WHITE);
      panel.setBorder(new LineBorder(new Color(5,5,5),2,true));
        setContentPane(panel);
        panel.setLayout(null);
        //add(panel);
        
         JScrollPane sc=new JScrollPane();
        sc.setBorder(new LineBorder(new Color(5,5,5),2,true));
        sc.setBounds(18,128,870,270);
        panel.add(sc);
        
        table=new JTable();
        conn c1=new conn();
        String q1="Select * from student";
        try
        {
            ResultSet rs=c1.s.executeQuery(q1);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){}
        
        table.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent arg0)
            {
                int row=table.getSelectedRow();
                t1.setText(table.getModel().getValueAt(row,10).toString());
            }
        });
        table.setBounds(40,40,550,350);
       table.setBackground(Color.white);
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("System",Font.BOLD,16));
        sc.setViewportView(table);
        
        
        JPanel pan=new JPanel();
        pan.setBorder(new TitledBorder(new LineBorder(new Color(0,128,128),3,true), "Book_Detail",TitledBorder.LEADING,TitledBorder.TOP,null, new Color(0,128,0)));
        pan.setBackground(Color.WHITE);
        pan.setBounds(4,50,900,380);
        panel.add(pan);
        pan.setLayout(null);
        
        JLabel l1=new JLabel("Check Result");
        l1.setForeground(Color.DARK_GRAY);
        l1.setFont(new Font("System",Font.BOLD,24));
        l1.setBounds(200,15,200,23);
        panel.add(l1);
        
        
        JLabel l2=new JLabel("Back");
        l2.setForeground(Color.DARK_GRAY);
        l2.setFont(new Font("System",Font.BOLD,19));
        l2.addMouseListener(new MouseAdapter()
                {
                    @Override
                    public void mouseClicked(MouseEvent arg0)
                    {
                        setVisible(false);
                    }
                });
        l2.setBounds(50,30,200,19);
        pan.add(l2);
        
          t1=new JTextField("");
          t1.setBorder(new  LineBorder(new Color(255,105,180),2,true));
        t1.setFont(new Font("System",Font.BOLD,23));
        t1.setBounds(150,30,200,23);
        pan.add(t1);  
        //t1.setColumns(10);
        
         b1=new JButton("Result");
      b1.setFont(new Font("System",Font.BOLD,23));
      b1.setBorder(new  LineBorder(new Color(255,105,180),2,true));
     /* b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);*/
      b1.setBounds(420,30,150,23);
      pan.add(b1);
      
      b1.addActionListener(this);
      getContentPane().setBackground(Color.WHITE);
        
       setLayout(null);
       setBounds(250,100,950,485);
       setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            conn c2=new conn();
        if(ae.getSource()==b1)
        {
        new Marks(t1.getText()).setVisible(true);
        this.setVisible(false);
        }
        }catch(Exception e){}
    }
    
    
    public static void main(String[] args)
    {
        new Examdetail().setVisible(true);
    }

   /* private void Visible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
