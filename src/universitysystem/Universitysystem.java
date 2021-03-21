
package universitysystem;
import javax.swing.*;
import java.awt.*;


public class Universitysystem //extends JFrame
{
 public static void main(String[] args) 
    {
        Frame f1=new Frame();
        f1.setVisible(true);
        int i;
        int x=1;
        for(i=2;i<650;i+=4,x+=1)
        {
            f1.setLocation((550-((i+x)/2)),350-(i/2));
            f1.setSize(i+3*x,i+x/2);
            
            try
            {
                Thread.sleep(10);
                
            }catch(Exception e){}
        }
    }
    
}
class Frame extends JFrame implements Runnable
{
    Thread t1;
    Frame()
    {
        super("Unversity Management System");
        setLayout(new FlowLayout());
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("universitysystem/icon/sans.jpg"));
        Image i2=i1.getImage().getScaledInstance(1100, 650,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        add(l1);
        t1= new Thread(this);
        t1.start();
        
        
    }
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(7000);
            this.setVisible(false);
          new Login().setVisible(true);
        }catch(Exception e){e.printStackTrace();}
    }
    /*public static void main(String[] args) 
    {
        new Universitysystem().f1.setVisible(true);
    }*/
}


