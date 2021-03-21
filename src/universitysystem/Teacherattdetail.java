/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitysystem;

import java.sql.*;
import javax.swing.*;
import javax.swing.JTable;


public class Teacherattdetail extends JFrame
{
         JTable t1;
         
    Teacherattdetail()
    {
        super("View Teacher Attendence");
        String x[]={"Emp_id","date","Half Time","Second Time"};
        String y[][]=new String[30][4];
        int i=0,j=0;
        try
        {
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from attendance_teacher");
            
            while(rs.next())
            {
                y[i][j++]=rs.getString("emp_id");
                 y[i][j++]=rs.getString("Date");
                  y[i][j++]=rs.getString("First");
                   y[i][j++]=rs.getString("second");
                   i++;
                   j=0;
            }
        }catch(Exception e){}
        t1=new JTable(y,x);
        JScrollPane s1=new JScrollPane(t1);
        s1.setBounds(0,0,540,390);
        add(s1);
        
        setLayout(null);
        setBounds(260,120,550,400);
        setVisible(true);
    
    }
    public static void main(String[] args)
    {
        new Teacherattdetail().setVisible(true);
    }
}
