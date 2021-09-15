
//JTextField

package swingGUI;

/**
 * @author Vaishnavi
 *
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class TextFiledDemo extends JFrame
{
  public TextFiledDemo()
  {
    JTextField jtf = new JTextField(20);  //creating JTextField.
    add(jtf);                             //adding JTextField to frame.
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    setVisible(true);
  }
  public static void main(String[] args)
  {
    new TextFiledDemo();
  }
}
