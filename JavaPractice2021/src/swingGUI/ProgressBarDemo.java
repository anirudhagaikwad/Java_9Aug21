//JProgressBar

package swingGUI;

/**
 * @author Vaishnavi
 *
 */


import javax.swing.*;    
public class ProgressBarDemo extends JFrame
{    
  JProgressBar progBar_jb;    
  int progBar_i=0, progBar_num=0;     
  ProgressBarDemo()
  {    
    progBar_jb=new JProgressBar(0,2000);    
    progBar_jb.setBounds(40,40,180,30);         
    progBar_jb.setValue(0);    
    progBar_jb.setStringPainted(true);    
    add(progBar_jb);    
    setSize(250,150);    
    setLayout(null);    
  }    
  public void iterate()
  {    
    while(progBar_i<=2000)
    {    
      progBar_jb.setValue(progBar_i);    
      progBar_i = progBar_i + 10;    
      try
      {
        Thread.sleep(150);
      }
      catch(Exception e){}    
    }    
  }    
  public static void main(String[] args) {    
    ProgressBarDemo obj=new ProgressBarDemo();    
    obj.setVisible(true);    
    obj.iterate();    
  }    
} 
  