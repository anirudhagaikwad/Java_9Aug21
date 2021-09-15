
package swingGUI;

/**
 * @author Vaishnavi
 *
 */

import javax.swing.*; //importing swing package

import java.awt.*; //importing awt package


public class Frame2 extends JFrame
{
	public Frame2()
	{
		setTitle("MyWindow"); //setting title of frame as  MyWindow
		JLabel lb = new JLabel("Welcome to My Frame2 Window");//Creating a label named Welcome to My Frame2 Window
		add(lb);                        //adding label to frame.
		setLayout(new FlowLayout());    //setting layout using FlowLayout object.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close operation.
		setSize(400, 400);              //setting size
		setVisible(true);               //setting frame visibility
	}

	public static void main(String[] args)
	{
		new Frame2();
	}
}
