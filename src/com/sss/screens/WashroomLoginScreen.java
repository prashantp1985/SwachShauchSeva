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



public class WashroomLoginScreen {
	
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

    private JButton classifyButton = new JButton();
    
    private JButton clearButton = new JButton();
  
    private JButton closeButton = new JButton();
    
    public WashroomLoginScreen(JFrame frame) {
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
        
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        selectStateLabel.setText("Username : ");
        selectStateLabel.setBounds(new Rectangle(inputStartX, newY, length, FrameCreator.STANDARD_HEIGHT));
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        txtUsername.setBounds(new Rectangle(inputStartX + offset1, newY, length1, FrameCreator.STANDARD_HEIGHT));
       
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        selectCityLabel.setText("Password : ");
        selectCityLabel.setBounds(new Rectangle(inputStartX, newY, length, FrameCreator.STANDARD_HEIGHT));
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        txtPassword.setBounds(new Rectangle(inputStartX + offset1, newY, length1, FrameCreator.STANDARD_HEIGHT));
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
       
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
       
        classifyButton.setText("Login");
        classifyButton.setBounds(new Rectangle(inputStartX, newY, length, FrameCreator.STANDARD_HEIGHT));
        classifyButton.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                        	  searchOnClick(frame);
                                          }

										
                                      }
        );
       
        clearButton.setText("Clear");
        clearButton.setBounds(new Rectangle(inputStartX + offset1 + 10, newY, length, FrameCreator.STANDARD_HEIGHT));
        clearButton.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                        	  clearOnClick();
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
	   	componentList.add(classifyButton);
	   	componentList.add(clearButton);
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
				 new WashroomMainMenuScreen(FrameCreator.createFrame());
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
    
    
    private void clearOnClick() {
	  	 if (jTable1.getRowCount() > 0) {
             for (int i = jTable1.getRowCount() - 1; i > 0; i--) {
                 model.removeRow(i);
             }
         }
	  	txtPassword.setText("");
	  	txtUsername.setText("");
	  	locationListCombo.setSelectedIndex(-1);
	  	serviceListCombo.setSelectedIndex(-1);
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
                 new WashroomLoginScreen(FrameCreator.createFrame());
             }
         });
     }
     
}

