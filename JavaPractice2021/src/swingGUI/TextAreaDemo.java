// JTextArea

/**
 * 
 */
package swingGUI;

/**
 * @author Vaishnavi
 *
 */

import javax.swing.*;  
public class TextAreaDemo  
{  
    TextAreaDemo()
  {  
        JFrame textArea_f= new JFrame();  
        JTextArea textArea_area=new JTextArea("Welcome to TextArea ");  
        textArea_area.setBounds(10,30, 200,200);  
        textArea_f.add(textArea_area);  
        textArea_f.setSize(400,400);  
        textArea_f.setLayout(null);  
        textArea_f.setVisible(true);  
        }  
public static void main(String args[])  
    {  
   new TextAreaDemo();  
}
}
  