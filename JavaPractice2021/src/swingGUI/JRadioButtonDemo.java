package swingGUI;
//JRadioButton

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JRadioButtonDemo extends JFrame
{
 public JRadioButtonDemo()
 {
  JRadioButton jcb = new JRadioButton("A");	//creating JRadioButton.
  add(jcb);					//adding JRadioButton to frame.
  jcb = new JRadioButton("B");			//creating JRadioButton.
  add(jcb);					//adding JRadioButton to frame.
  jcb = new JRadioButton("C");			//creating JRadioButton.
  add(jcb);					//adding JRadioButton to frame.
  jcb = new JRadioButton("none");
  add(jcb);
  setLayout(new FlowLayout());
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(400, 400);
  setVisible(true);
 }
 public static void main(String[] args)
 {
  new JRadioButtonDemo();
 }
}