package swingGUI;

// change background color of a frame (Using Action Event)



import java.awt.*;  //importing awt package
import javax.swing.*;  //importing swing package
import java.awt.event.*;  //importing event package

//For an event to occur upon clicking the button, ActionListener interface should be implemented
class StColor extends JFrame implements ActionListener{

JFrame frame;
JPanel panel;
JButton b1,b2,b3,b4,b5;

StColor(){

   frame = new JFrame("COLORS");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   panel = new JPanel();  //Creating a panel which is a container and will hold all the buttons
   panel.setSize(100, 50);

   b1 = new JButton("BLUE");  //Creating a button named BLUE
   b1.addActionListener(this);  //Registering the button with the listener

   b2 = new JButton("RED");  //Creating a button named RED
   b2.addActionListener(this);  //Registering the button with the listener

   b3 = new JButton("CYAN");//Creating a button named CYAN
   b3.addActionListener(this);//Registering the button with the listener

   b4 = new JButton("PINK");  //Creating a button named PINK
   b4.addActionListener(this);  //Registering the button with the listener

   b5 = new JButton("MAGENTA");  //Creating a button named MAGENTA
   b5.addActionListener(this);  //Registering the button with the listener

   //Adding buttons to the Panel
   panel.add(b1);
   panel.add(b2);
   panel.add(b3);
   panel.add(b4);
   panel.add(b5);

   frame.getContentPane().add(panel);  //adding panel to the frame
   frame.setSize(500,300);
   frame.setVisible(true);
   frame.setLayout(new FlowLayout());

}
//The below method is called whenever a button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {

        //This method returns an object of the button on which the Event-
        //Pressing of button initially occurred
        Object see = e.getSource();

        if(see ==(b1)){  //Checking if the object returned is of button1
        frame.getContentPane().setBackground(java.awt.Color.blue);  //changing the panel color to blue
        }
        if(see == b2){  //Checking if the object returned is of button2
            frame.getContentPane().setBackground(java.awt.Color.red);  //changing the panel color to red
        }
        if(see == b3){  //Checking if the object returned is of button3
        frame.getContentPane().setBackground(java.awt.Color.cyan);//changing the panel color to cyan
        }
        if(see == b4){  //Checking if the object returned is of button4
            frame.getContentPane().setBackground(java.awt.Color.pink);  //changing the panel color to pink
        }
        if(see == b5){  //Checking if the object returned is of button5
        frame.getContentPane().setBackground(java.awt.Color.magenta);  //changing the panel color to magenta
        }
    }
}

class TestActionListner {
    public static void main(String[] args) {
        StColor o = new StColor();
    }
}
