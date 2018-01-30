import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//Adding the event since we will now be using an action listener

/**
 * Name: Mrs. Andrighetti and Mr. Anandrajan
 * Date: January 7, 2016
 * Description:  This frame has a name text field and a button.  When the 
 *               button is pressed, it outputs a thank-you message with the name entered.
 * 
 * Challenge: Update this frame to do the following:
 *     1. be able to store more than one name and display it
 *     2. store an email address and address for each name entered
 *     3. save entered information into a file
 *     4. retrieve and prepopulate the screen with information from file.
 */
public class GUIExample3 extends JFrame implements ActionListener{ 
  //Declare some Panels
  JPanel pan1;
  JPanel pan2;
  
  //Added some code
  static final int MAX = 100;
  String names [];
  String e_mail [];
  String address [];
  int total;
  
  
  //Declare some GUI components
  JLabel nameLabel; 
  JTextField nameField;
  JButton okButton;          
  JLabel instructionsLabel;
  
  
  /*
   * This is the constructor.  It creates all necessary components and
   * initializes all objects and values
   */
  public GUIExample3() { 
    pan1 = new JPanel();
    pan2 = new JPanel();
    
    names = new String [MAX];
    e_mail = new String [MAX];
    address = new String [MAX];

    //Create some GUI components
    nameLabel = new JLabel("Name: ", JLabel.RIGHT); 
    nameField = new JTextField(10);
    okButton = new JButton("OK");          
    instructionsLabel = new JLabel("Enter your name", JLabel.RIGHT);
    
    // initialize some values
    total = 0;
    names [0]="Akbari";
    e_mail [0]="Akbarij@gmail.com";
    address [0]="123 Bayview blvd";
    
    names [1]="Greekamol";
    e_mail [1]="Greekamolj@gmail.com";
    address [1]="123 Jackie blvd";
    total = 2;
    setTitle("Hello World!");    //Create a window with a title
    setSize(640, 480);           // set the window size
    
    // Create some Layouts
    GridLayout layout1 = new GridLayout(2,1);
    FlowLayout layout2 = new FlowLayout();
    
    // Set the frame and both panel layouts
    setLayout(layout1);//Setting layout for the whole frame
    pan1.setLayout(layout2);//Layout for Pan1
    pan2.setLayout(layout2);//Layout for Pan2
    
    okButton.addActionListener(this);  // Add an action listener to the button
    // this allows the program to know if
    // the button was pressed
    
    // Add all the components to the panels
    pan1.add(nameLabel);
    pan1.add(nameField);
    pan1.add(okButton);
    pan2.add(instructionsLabel);
    
    // add the panels to the frame and display the window
    add(pan1);
    add(pan2);
    setVisible(true); 
  }
  
  /* 
   * ACTION LISTENER - This method runs when an event occurs
   * Code in here only runs when a user interacts with a component
   * that has an action listener attached to it
   */
  public void actionPerformed(ActionEvent event) {
    
    String command = event.getActionCommand();  //find out the name of the component
    //that was used
    
    if (command.equals("OK")) {                 // if the OK button was pressed
      System.out.println("ok button pressed");  // display message in console(for testing)
      System.out.println("Date:" + nameField.getText()); //get the info located in the field component
      instructionsLabel.setText("Thank you " + nameField.getText() );            // change the label message to 'thank you'
      names[total] = nameField.getText();
      total++;
    } // no other conditions 
    
  }
  
  //Main method
  public static void main(String[] args) {
    GUIExample3 frame1 = new GUIExample3();  //Start the GUI
  }
  
}