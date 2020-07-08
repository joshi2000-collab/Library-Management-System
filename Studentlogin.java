import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SB implements ActionListener{
   JFrame frame;
   JPanel panel;
   JLabel lstdid,lname,lstream,lclass,laddr;
   JTextField tstdid;
   JTextField tname;
   JComboBox stream;
   JComboBox class1;
   JTextField taddress;
   JButton bregister;
   JButton bcancel;
   SB()
   {
	   String arr[]= {"Computer","ETC","IT","Mechanical","Civil"};
   	   String arr1[]= {"FE","SE","TE","BE"};
	   frame= new JFrame("Student Library Registration");
 	    panel=new JPanel();
	    tstdid=new JTextField(10);
	    tname=new JTextField(10);
	    taddress=new JTextField(20);
	    lstdid=new JLabel("Student ID :");
 	    lname=new JLabel("Student Name :");
 	    lstream=new JLabel("Stream:");
 	    lclass=new JLabel("Class:");
 	    laddr=new JLabel("Address:");
 	    bregister=new JButton("Register");
	    bcancel=new JButton("Cancel");
	    
	    stream=new JComboBox(arr);
	    class1=new JComboBox(arr1);
	    
	    bregister.addActionListener(this);
	    bcancel.addActionListener(this);
	    
	    panel.add(lstdid);
	    panel.add(tstdid);
	    
	    panel.add(lname);
	    panel.add(tname);
  	    
  	    
	    panel.add(lstream);
  	    panel.add(stream);
  	    
  	    panel.add(lclass);
  	    panel.add(class1);
  	    
  	   panel.add(laddr);
  	   panel.add(taddress);
  	    
  	    
  	    
	    panel.add(bregister);
	    panel.add(bcancel);
	    
	    frame.add(panel);
	    frame.setVisible(true);
	    frame.setSize(250,250);
	    
   }
   public static void main(String[] args)
	  {
		  new SB();
	  }
   
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	 if(e.getSource()==bcancel) {
		  tstdid.setText("");
		  tname.setText("");
		  taddress.setText("");
	  }
	  String stdid=null,name=null,str=null,cla=null,addr=null;
	  if(e.getSource()==bregister) {
		  stdid=tstdid.getText();
		  name=tname.getText();
		  addr=taddress.getText();  
	  }
		  cla=(String) class1.getItemAt(class1.getSelectedIndex());
		  str=(String) stream.getItemAt(stream.getSelectedIndex());
		  
		  
         System.out.println(stdid+" "+name+" "+str+" "+cla+" "+addr);
		  
		  int a=JOptionPane.showConfirmDialog(frame, "Do you want to Issue or Return Books");
    	  if(a==JOptionPane.YES_OPTION) {
    		  JOptionPane.showMessageDialog(frame,"You Entered College Library Successfully!!!");
    		  frame.dispose();
    		  
	  }
	  

   
}
}
