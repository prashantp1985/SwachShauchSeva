package com.sss.screens;

/*
 * this class displays the login dialog
 */


import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.sss.util.FrameCreator;
import com.sss.util.ImageCreator;
import com.sss.util.ValidationHelper;



public class WashroomMainMenuScreen {
	
	 private JLabel outputDetailsLabel = new JLabel();
	 
	 private JLabel trainingSetLabel = new JLabel();
	 
	 private JLabel selectStateLabel = new JLabel();
	 
	 private JLabel selectCityLabel = new JLabel();
	 
	 private JLabel selectLocationLabel = new JLabel();
	 
	 private JLabel selectServiceLabel = new JLabel();
	 
	 private JTextField txtUsername = new JTextField();

	 private JPasswordField txtPassword = new JPasswordField();

	 
	 private JComboBox locationListCombo = null;
	 
	 private JComboBox serviceListCombo = null;
	 
	 private DefaultTableModel model = new DefaultTableModel();
	 
	 private JTable jTable1 = new JTable();
	 
	private JLabel jDeveloperInformationLabel = new JLabel();

    private JButton addButton = new JButton();
    
    private JButton editButton = new JButton();
    
    private JButton deleteButton = new JButton();
    
    private JButton searchButton = new JButton();
    
    private JButton clearButton = new JButton();
    
    private JButton approveButton = new JButton();
  
    private JButton closeButton = new JButton();
    
    public WashroomMainMenuScreen(JFrame frame) {
    	createDCCMainMenuScreen(frame);
    }

    private void createDCCMainMenuScreen(final JFrame frame) {
//    	frame.getContentPane().setLayout( null );
      	int oldX = 0;
    	int newX = 0;
    	int oldY = 0;
    	int newY = 0;
		  Dimension screenSize = FrameCreator.screenSize;
	      oldX = (screenSize.width) / 3 - 75;
	      oldY = 70 + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
	      int length = 90;
	      newX = oldX;
	      newY = oldY;
    	
    	frame.setTitle("Swach Shauch Seva screen");
        
        JPanel panel = new ImageCreator();
//        panel.setBounds(new Rectangle(425, 25, 300, 300));
       
        int inputStartX = 40;
        int inputStartY = 20;
        
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;

        int offset1 = 90;
        int length1 = 100;

        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        addButton.setText("Add");
        addButton.setBounds(new Rectangle(inputStartX + 35, newY, length, FrameCreator.STANDARD_HEIGHT));
        addButton.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                        	 addOnClick(frame);
                                          }

										
                                      }
        );
       
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        editButton.setText("Edit");
        editButton.setBounds(new Rectangle(inputStartX + 35, newY, length, FrameCreator.STANDARD_HEIGHT));
        editButton.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                        	 editOnClick(frame);
                                          }

										
                                      }
        );
       
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        deleteButton.setText("Delete");
        deleteButton.setBounds(new Rectangle(inputStartX + 35, newY, length, FrameCreator.STANDARD_HEIGHT));
        deleteButton.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                        	 deleteOnClick(frame);
                                          }

										
                                      }
        );
       
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        searchButton.setText("Search");
        searchButton.setBounds(new Rectangle(inputStartX + 35, newY, length, FrameCreator.STANDARD_HEIGHT));
        searchButton.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                        	 searchOnClick(frame);
                                          }

										
                                      }
        );
       
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        approveButton.setText("Approve");
        approveButton.setBounds(new Rectangle(inputStartX + 35, newY, length, FrameCreator.STANDARD_HEIGHT));
        approveButton.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                        	 approveOnClick(frame);
                                          }

										
                                      }
        );
       
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        jDeveloperInformationLabel.setText("Developed by Prashant Padmanabhan");
        jDeveloperInformationLabel.setBounds(new Rectangle(inputStartX, newY, FrameCreator.STANDARD_LONG_LABEL_WIDTH, FrameCreator.STANDARD_HEIGHT));
        
        int outputX = oldX + length + length + 45;
        int outputY = 20;
        int outputLength = 150;
        int outputWidth = 300;
        
        
        List<Component> componentList = new ArrayList<Component>();
        
        componentList.add(jDeveloperInformationLabel);
	   	componentList.add(addButton);
	   	componentList.add(editButton);
	   	componentList.add(deleteButton);
	   	componentList.add(searchButton);
	   	componentList.add(clearButton);
		componentList.add(approveButton);
//		componentList.add(closeButton);
	   	componentList.add(outputDetailsLabel);
	  	componentList.add(trainingSetLabel);
	  	componentList.add(selectServiceLabel);
		componentList.add(selectLocationLabel);
		componentList.add(selectCityLabel);
		componentList.add(selectStateLabel);
		componentList.add(txtUsername);
		componentList.add(txtPassword);
		
	   	componentList.add(panel);

        FrameCreator.addComponents(frame, componentList);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }

    private void searchOnClick(JFrame jframe) {
    	if (! validateInputs()) {
			JOptionPane.showMessageDialog(null,
					"Invalid Input", "Invalid Input",
					JOptionPane.ERROR_MESSAGE);

		} else {
			 jframe.dispose();
			 if (! "admin".equals(txtUsername.getText())) {
			   new WashroomInputScreen(FrameCreator.createFrame());
			 } else {
//				 new A
			 }
			
		}
      }	
    
    private boolean validateInputs() {
    	if (ValidationHelper.isStringNullOrEmpty(txtPassword.toString())
    	    	|| ValidationHelper.isStringNullOrEmpty(txtUsername.toString())
    	    	) {
    		return false;
    	} else {
    		return true;
    	}
    }
    
    
    private void approveOnClick(JFrame frame) {
    	 frame.dispose();
		   new WashroomApproveScreen(FrameCreator.createFrame());
     }
    
    private void deleteOnClick(JFrame frame) {
   	 frame.dispose();
		   new WashroomDeleteScreen(FrameCreator.createFrame());
    }
    
    private void addOnClick(JFrame frame) {
      	 frame.dispose();
   		   new WashroomAddScreen(FrameCreator.createFrame());
       }
    
    private void editOnClick(JFrame frame) {
     	 frame.dispose();
  		   new WashroomEditScreen(FrameCreator.createFrame());
      }
    
    
    private void closeOnClick() {
	  System.exit(0);
    }	
   
    
   
    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new WashroomMainMenuScreen(FrameCreator.createFrame());
             }
         });
     }
     
}

