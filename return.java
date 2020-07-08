import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Return implements ActionListener{
   JFrame frame;
   JPanel panel;
   JLabel lstdid,lname,lbid,lbname,lrd,lre,lfine;
   JTextField tstdid;
   JTextField tbid;
   JTextField tname;
   JTextField trd;
   JTextField tbname;
   JTextField tfine;
   JComboBox returned;
   JButton breturn;
   JButton bcancel;
   Return()
   {
	     String arr[]= {"YES","NO"};
	    frame= new JFrame("Return Book");
 	    panel=new JPanel();
	    tstdid=new JTextField(10);
	    tbid=new JTextField(10);
	    tname=new JTextField(10);
	    tbname=new JTextField(20);
	    trd=new JTextField(10);
	    tfine=new JTextField(5);
 	    lname=new JLabel("Student Name :");
 	    lbname=new JLabel("Book Name :");
 	    lbid=new JLabel("Book ID :");
 	    lstdid=new JLabel("Student ID :");
 	    lrd=new JLabel("Return  Date :");
 	    lre=new JLabel("Returned :");
 	    lfine=new JLabel("Fine :");
 	    breturn=new JButton("Issue");
	    bcancel=new JButton("Cancel");
	    
	    returned=new JComboBox(arr);
	    
	    breturn.addActionListener(this);
	    bcancel.addActionListener(this);
	    
	    panel.add(lstdid);
	    panel.add(tstdid);
	    
	    panel.add(lname);
	    panel.add(tname);
  	    
  	    
	    panel.add(lbid);
  	    panel.add(tbid);
  	    
  	    panel.add(lre);
  	    panel.add(returned);
  	    
  	    panel.add(lbname);
  	    panel.add(tbname);
  	    
  	    panel.add(lrd);
  	    panel.add(trd);
  	    
  	    panel.add(lfine);
  	    panel.add(tfine);
  	 
	    panel.add(breturn);
	    panel.add(bcancel);
	    
	    frame.add(panel);
	    frame.setVisible(true);
	    frame.setSize(250,250);
	    
   }
   public static void main(String[] args)
	  {
		  new Return();
	  }
   
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	 if(e.getSource()==bcancel) {
		  tstdid.setText("");
		  tname.setText("");
		  tbid.setText("");
		  tbname.setText("");
		  trd.setText("");
		  tfine.setText("");
	  }
	  String id=null,name=null,bid=null,bnam=null,retd=null,recombo=null,fin=null;
	  if(e.getSource()==breturn) {
		  id=tstdid.getText();
		  name=tname.getText();
		  bid=tbid.getText(); 
		  bnam=tbname.getText();
		  retd=trd.getText();
		  fin=tfine.getText();
		  }
		 recombo =(String) returned.getItemAt(returned.getSelectedIndex());
		  
		  
         System.out.println(id+" "+name+" "+bid+" "+recombo+" "+bnam+" "+retd+" "+fin);
		  
		  int a=JOptionPane.showConfirmDialog(frame, "Thank you for Returning Book");
    	  if(a==JOptionPane.YES_OPTION) {
    		  JOptionPane.showMessageDialog(frame,"Book Returned successfully!!!");
    		  frame.dispose();
    		  
	  }
	  

   
}
}
