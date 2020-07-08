import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Issue implements ActionListener{
   JFrame frame;
   JPanel panel;
   JLabel lstdid,lname,lbid,lbname,lid,lavl;
   JTextField tstdid;
   JTextField tbid;
   JTextField tname;
   JTextField tid;
   JTextField tbname;
   JComboBox available;
   JButton bissue;
   JButton bcancel;
   Issue()
   {
	     String arr[]= {"YES","NO"};
	    frame= new JFrame("Issue Book");
 	    panel=new JPanel();
	    tstdid=new JTextField(10);
	    tbid=new JTextField(10);
	    tname=new JTextField(10);
	    tbname=new JTextField(20);
	    tid=new JTextField(10);
 	    lname=new JLabel("Student Name :");
 	    lbname=new JLabel("Book Name :");
 	    lbid=new JLabel("Book ID :");
 	    lstdid=new JLabel("Student ID :");
 	    lid=new JLabel("Issue Date :");
 	    lavl=new JLabel("Available :");
 	    bissue=new JButton("Issue");
	    bcancel=new JButton("Cancel");
	    
	    available=new JComboBox(arr);
	    
	    bissue.addActionListener(this);
	    bcancel.addActionListener(this);
	    
	    panel.add(lstdid);
	    panel.add(tstdid);
	    
	    panel.add(lname);
	    panel.add(tname);
  	    
  	    
	    panel.add(lbid);
  	    panel.add(tbid);
  	    
  	    panel.add(lavl);
  	    panel.add(available);
  	    
  	    panel.add(lbname);
  	    panel.add(tbname);
  	    
  	    panel.add(lid);
  	    panel.add(tid);
  	 
	    panel.add(bissue);
	    panel.add(bcancel);
	    
	    frame.add(panel);
	    frame.setVisible(true);
	    frame.setSize(250,250);
	    
   }
   public static void main(String[] args)
	  {
		  new Issue();
	  }
   
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	 if(e.getSource()==bcancel) {
		  tstdid.setText("");
		  tname.setText("");
		  tbid.setText("");
		  tbname.setText("");
		  tid.setText("");
	  }
	  String id=null,name=null,bid=null,bnam=null,issu=null,al=null;
	  if(e.getSource()==bissue) {
		  id=tstdid.getText();
		  name=tname.getText();
		  bid=tbid.getText(); 
		  bnam=tbname.getText();
		  issu=tid.getText();
	  }
		 al =(String) available.getItemAt(available.getSelectedIndex());
		  
		  
         System.out.println(id+" "+name+" "+bid+" "+al+" "+bnam+" "+issu);
		  
		  int a=JOptionPane.showConfirmDialog(frame, "Do you want to Issue more Books");
    	  if(a==JOptionPane.YES_OPTION) {
    		  JOptionPane.showMessageDialog(frame,"Book Issued successfully!!!");
    		  frame.dispose();
    		  
	  }
	  

   
}
}
