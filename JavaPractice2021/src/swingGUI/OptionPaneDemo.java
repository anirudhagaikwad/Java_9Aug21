package swingGUI;
// JoptionPane to create prompt box 

/**
 * @author Vaishnavi
 *
 */



import javax.swing.*;  
public class OptionPaneDemo
{  
  JFrame optionPane_f;  
  OptionPaneDemo()
  {  
    optionPane_f=new JFrame();  
    JOptionPane.showInputDialog(optionPane_f,"Enter your Name");     
  }  
  public static void main(String[] args) 
  {  
    new OptionPaneDemo();  
  }  
}   
  