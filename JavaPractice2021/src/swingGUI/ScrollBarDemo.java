//JScrollBar

/**
 * @author Vaishnavi
 *
 */
package swingGUI;

import javax.swing.*;  


class ScrollBarDemo
{  
  ScrollBarDemo()
  {  
    JFrame scrollBar_f= new JFrame("Scrollbar ==> Scrollbar Demo");  
    JScrollBar scrollBar_s=new JScrollBar();  
    scrollBar_s.setBounds(100,100, 80,100);  
    scrollBar_f.add(scrollBar_s);  
    scrollBar_f.setSize(500,500);  
    scrollBar_f.setLayout(null);  
    scrollBar_f.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
    new ScrollBarDemo();  
  }
}
  