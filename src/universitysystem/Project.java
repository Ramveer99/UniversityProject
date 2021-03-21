
package universitysystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener
{
    JMenuBar mb;
    JMenu m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18;
    
    Project()
    {
        super("UNVERSITY MANAGEMENT SYSTEM");
        
        JLabel jl=new JLabel("SANSKRITI UNIVERSITY");
        jl.setFont(new Font("System",Font.PLAIN,30));
        jl.setForeground(Color.magenta);
        jl.setBounds(350,100,400,50);
        add(jl);
        
       mb=new JMenuBar();
       mb.setBounds(0,0,1840,30);
        add(mb);
        
        m1= new JMenu("Master");
        m1.setForeground(Color.RED);
        mb.add(m1);
        
        m2=new JMenu("Detail");
        m2.setForeground(Color.BLUE);
        mb.add(m2);
        
         m3=new JMenu("Attendence");
        m3.setForeground(Color.RED);
        mb.add(m3);
        
         m4=new JMenu("Attendence Detail");
        m4.setForeground(Color.BLUE);
        mb.add(m4);
        
         m5=new JMenu("Examination");
        m5.setForeground(Color.RED);
        mb.add(m5);
        
         m6=new JMenu("Update Detail");
        m6.setForeground(Color.BLUE);
        mb.add(m6);
         
        m7=new JMenu("fee Detail");
        m7.setForeground(Color.RED);
        mb.add(m7);
        
         m8=new JMenu("Utilite");
        m8.setForeground(Color.BLUE);
        mb.add(m8);
        
         m9=new JMenu("Exit");
        m9.setForeground(Color.RED);
        mb.add(m9);
       
        
        
        i1=new JMenuItem("new Faculty");
         ImageIcon b1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon1.png"));
        Image b2=b1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i1.setIcon(new ImageIcon(b2));
        
        m1.add(i1);
       i1.addActionListener(this);
       
                
         i2=new JMenuItem("New Student Admission");
          ImageIcon c1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon2.png"));
        Image c2=c1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i2.setIcon(new ImageIcon(c2));
        i2.addActionListener(this);
        m1.add(i2);
        
         i3=new JMenuItem("Teacher Detail");
         i3.addActionListener(this);
          ImageIcon d1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon3.png"));
        Image d2=d1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i3.setIcon(new ImageIcon(d2));
        m2.add(i3);
        
         i4=new JMenuItem("Student detail");
         i4.addActionListener(this);
         ImageIcon e1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon4.jpg"));
        Image e2=e1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i4.setIcon(new ImageIcon(e2));
        m2.add(i4);
        
         i5=new JMenuItem("Student Attendens");
         i5.addActionListener(this);
         ImageIcon f1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon8.png"));
        Image f2=f1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i5.setIcon(new ImageIcon(f2));
        m3.add(i5);
        
         i6=new JMenuItem("Teacher Attendens");
         i6.addActionListener(this);
         ImageIcon g1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon17.png"));
        Image g2=g1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i6.setIcon(new ImageIcon(g2));
        m3.add(i6);
        
         i7=new JMenuItem("Student Attendens detail");
         i7.addActionListener(this);
         ImageIcon h1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon4.jpg"));
        Image h2=h1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i7.setIcon(new ImageIcon(h2));
        m4.add(i7);
        
         i8=new JMenuItem("Teacher Attendens detail");
         i8.addActionListener(this);
         ImageIcon j1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon15.png"));
        Image j2=j1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i8.setIcon(new ImageIcon(j2));
        m4.add(i8);
        
         i9=new JMenuItem("Exam Detail");
         i9.addActionListener(this);
         ImageIcon k1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon16.png"));
        Image k2=k1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i9.setIcon(new ImageIcon(k2));
        m5.add(i9);
        
         i10=new JMenuItem("Marks");
         i10.addActionListener(this);
         ImageIcon n1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon15.png"));
        Image n2=n1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i10.setIcon(new ImageIcon(n2));
        m5.add(i10);
        
         i11=new JMenuItem("Update Student");
         i11.addActionListener(this);
         ImageIcon o1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon4.jpg"));
        Image o2=o1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i11.setIcon(new ImageIcon(o2));
        m6.add(i11);
        
         i12=new JMenuItem("Update Teacher");
         i12.addActionListener(this);
         ImageIcon p1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon4.jpg"));
        Image p2=p1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i12.setIcon(new ImageIcon(p2));
        m6.add(i12);
        
         i13=new JMenuItem("Fee Structure");
         i13.addActionListener(this);
         ImageIcon q1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon7.png"));
        Image q2=q1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i13.setIcon(new ImageIcon(q2));
        m7.add(i13);
        
         i14=new JMenuItem("Fee Form");
         i14.addActionListener(this);
         ImageIcon r1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon8.png"));
        Image r2=r1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i14.setIcon(new ImageIcon(r2));
        m7.add(i14);
        
         i15=new JMenuItem("Notepad");
         i15.addActionListener(this);
         ImageIcon s1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon9.png"));
        Image s2=s1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i15.setIcon(new ImageIcon(s2));
        m8.add(i15);
        
         i16=new JMenuItem("Calculater");
         i16.addActionListener(this);
         ImageIcon t1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon10.png"));
        Image t2=t1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i16.setIcon(new ImageIcon(t2));
        m8.add(i16);
        
         i17=new JMenuItem("web browser");
         i17.addActionListener(this);
         ImageIcon u1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon11.png"));
        Image u2=u1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i17.setIcon(new ImageIcon(u2));
        m8.add(i17);
        
         i18=new JMenuItem("Exit");
         i18.addActionListener(this);
         ImageIcon v1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/icon4.jpg"));
        Image v2=v1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        i18.setIcon(new ImageIcon(v2));
        m9.add(i18);
        
        ImageIcon a1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/sans-pic.jpg"));
        Image a2=a1.getImage().getScaledInstance(1500, 700,920);
        ImageIcon a3=new ImageIcon(a2);
        JLabel l1=new JLabel(a3);
        l1.setBounds(0,0,1500,730);
        add(l1);
       // i2.addActionListener(this);
        
        setLayout(null);
        setBounds(0,0,1860,720);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getActionCommand().equals("new Faculty"))
        {
           new Faculty().setVisible(true);
        }
        else if(ae.getActionCommand().equals("New Student Admission"))
        {
      
           new Student().setVisible(true);
        }
        else if(ae.getActionCommand().equals("Teacher Detail"))
        {
            new Teacherdetail().setVisible(true);
        }
        else if(ae.getActionCommand().equals("Student detail"))
        {
            new Studentdetail().setVisible(true);
        }
        else if(ae.getActionCommand().equals("Marks"))
        {
            new Entermark().setVisible(true);
        }
         else if(ae.getActionCommand().equals("Student Attendens"))
        {
            new Studentattendence().setVisible(true);
        }
          else if(ae.getActionCommand().equals("Teacher Attendens"))
        {
            new Teacherattendence().setVisible(true);
        }
            else if(ae.getActionCommand().equals("Student Attendens detail"))
        {
            new Studentattdetail().setVisible(true);
        }
              else if(ae.getActionCommand().equals("Teacher Attendens detail"))
        {
            new Teacherattdetail().setVisible(true);
        }  
               else if(ae.getActionCommand().equals("Fee Form"))
        {
            new Studentfeeform().setVisible(true);
        }
          else if(ae.getActionCommand().equals("Fee Structure"))
        {
          new  Feestructure().setVisible(true);
        }  
            else if(ae.getActionCommand().equals("Exam Detail"))
        {
            new Examdetail().setVisible(true);
        }
                else if(ae.getActionCommand().equals("Update Student"))
        {
            new Updatestudent().setVisible(true);
        }
               else if(ae.getActionCommand().equals("Update Teacher"))
        {
            new Updateteacher().setVisible(true);
        }
        else if(ae.getActionCommand().equals("Exit"))
        {
            this.setVisible(false);
        }
    }
   
    public static void main(String[] orgs)
    {
        new Project().setVisible(true);
    }
}