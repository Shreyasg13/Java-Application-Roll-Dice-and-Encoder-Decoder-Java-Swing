package encoderDecoder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

public class EncoderInterface extends JFrame {

	 private static final int FRAME_WIDTH = 400;
	 private static final int FRAME_HEIGHT = 200;
	 //private JMenuBar file;
	 private JTextField input;
	 private JTextField output;
	 private JButton button;
	 private JComboBox menu;
	    
	public EncoderInterface() {
		createFileMenu();
		createInputField();
		createMenu();
		createButton();		
		createOutPutField();
		createPanel();
		setSize(500,200);
	}
	

	
	/** for creating file menu**/
	 public JMenuBar createFileMenu()
	   {
		 JMenuBar bar = new JMenuBar();
		 JMenu fileOption = new JMenu("File");
		 JMenuItem exit = new JMenuItem("Exit");
		 fileOption.add(exit);
		 bar.add(fileOption);
		 bar.setVisible(true);
		 exit.addActionListener(e -> System.exit(0));
		 
/* 	//****Using Method****
  		 exit.addActionListener(new ActionListener() {
 
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});*/
		 
		 return bar;
	   }
	 
	 /*	Creating application Panel*/
	 public void createPanel()
	    {
		   JPanel panel = new JPanel();  		//Creating Panel
		   JMenuBar exit = createFileMenu();	//Creating Menu Bar
		   
		   panel.add(exit,BorderLayout.NORTH);
	       panel.add(input,BorderLayout.CENTER);
	       panel.add(menu,BorderLayout.CENTER);
	       panel.add(button,BorderLayout.CENTER);
	       panel.add(output,BorderLayout.SOUTH);
	       
	       add(panel);
	    }
	 
	 
	 /*	Creating Input Field 	*/
	 public void createInputField()
	    {
	       input = new JTextField(20);
	       input.setText("");
	       // Event Listener Using Lambda Function
//	       input.addActionListener((e) -> System.out.println("textfield has value: " + input.getText()));
	       input.addCaretListener(new TypingListener());
	    }
	 /* For real time input box encoding into output */
	 class TypingListener implements CaretListener {

			@Override
			public void caretUpdate(CaretEvent e) {
				String s=input.getText();
				String DropdownValue = String.valueOf(menu.getSelectedItem());
				if (DropdownValue.equals("ROT13"))
				{	
					//System.out.println(Encoder.encodeROT13(s));
					output.setText(Encoder.encodeROT13(s));
				}
				else
				{
					output.setText(Encoder.encodeNumeric(s));
				}
				//System.out.println(" current menu : "+ DropdownValue);
				
			}
			
				
			}
	 public void createOutPutField()
	    {
	       output = new JTextField(20);
	       output.setText("");
	    }
	 
	 /** Using implements ActionListener**/
	 
	/* public void createButton()
	 {
		 class ClearFields implements ActionListener
	       {
	          public void actionPerformed(ActionEvent event)
	          {
	             input.setText("");
	             output.setText("");
	          }            
	       }
		 button = new JButton("Clear");
		 ActionListener listener = new ClearFields();
		 button.addActionListener(listener);
		 
	 }*/
	 
	 /** Clear Button clears input & output fields **/
	 public void createButton()
	 {
		 button = new JButton("Clear");	
		 /*	 Using Lamda Function*/
		 button.addActionListener(e-> input.setText(""));
		 button.addActionListener(e-> output.setText("") );
		 
	 }
	 /**	 Creating Schemes Menu	**/
	 public void createMenu() 
	 {	
		 String[] opts = { "ROT13","Numeric" };
		 menu=new JComboBox(opts);
	 }

	 	
	public static void main(String[] args) {
	      JFrame frame = new EncoderInterface();
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);    
	}

}
