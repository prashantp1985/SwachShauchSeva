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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sss.util.FrameCreator;
import com.sss.util.ImageCreator;
import com.sss.util.ValidationHelper;



public class WashroomInputScreen {
	
	 private JLabel outputDetailsLabel = new JLabel();
	 
	 private JLabel trainingSetLabel = new JLabel();
	 
	 private JLabel selectStateLabel = new JLabel();
	 
	 private JLabel selectCityLabel = new JLabel();
	 
	 private JLabel selectLocationLabel = new JLabel();
	 
	 private JLabel selectServiceLabel = new JLabel();
	 
	 private JComboBox stateListCombo = null;
	 
	 private JComboBox cityListCombo = null;
	 
	 private JComboBox locationListCombo = null;
	 
	 private JComboBox serviceListCombo = null;
	 
	 private DefaultTableModel model = new DefaultTableModel();
	 
	 private JTable jTable1 = new JTable();
	 
	private JLabel jDeveloperInformationLabel = new JLabel();

    private JButton classifyButton = new JButton();
    
    private JButton clearButton = new JButton();
  
    private JButton closeButton = new JButton();
    
    public WashroomInputScreen(JFrame frame) {
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
        
        selectStateLabel.setText("State : ");
        selectStateLabel.setBounds(new Rectangle(inputStartX, newY, length, FrameCreator.STANDARD_HEIGHT));
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        stateListCombo = new JComboBox();
        stateListCombo.setBounds(new Rectangle(inputStartX + offset1, newY, length1, FrameCreator.STANDARD_HEIGHT));
        stateListCombo.addItem("Maharashtra");
        stateListCombo.setSelectedIndex(-1);
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        selectCityLabel.setText("City : ");
        selectCityLabel.setBounds(new Rectangle(inputStartX, newY, length, FrameCreator.STANDARD_HEIGHT));
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        cityListCombo = new JComboBox();
        cityListCombo.setBounds(new Rectangle(inputStartX + offset1, newY, length1, FrameCreator.STANDARD_HEIGHT));
        cityListCombo.addItem("Mumbai");
        cityListCombo.setSelectedIndex(-1);
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        selectLocationLabel.setText("Location : ");
        selectLocationLabel.setBounds(new Rectangle(inputStartX, newY, length, FrameCreator.STANDARD_HEIGHT));
        
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        locationListCombo = new JComboBox();
        locationListCombo.setBounds(new Rectangle(inputStartX + offset1, newY, length1, FrameCreator.STANDARD_HEIGHT));
        locationListCombo.addItem("Goregaon");
        locationListCombo.setSelectedIndex(-1);
        
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        selectServiceLabel.setText("Service type : ");
        selectServiceLabel.setBounds(new Rectangle(inputStartX, newY, length, FrameCreator.STANDARD_HEIGHT));
        
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        serviceListCombo = new JComboBox();
        serviceListCombo.setBounds(new Rectangle(inputStartX + offset1, newY, length1, FrameCreator.STANDARD_HEIGHT));
        serviceListCombo.addItem("Paid");
        serviceListCombo.addItem("Free");
        serviceListCombo.addItem("Both");
        serviceListCombo.setSelectedIndex(-1);
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
       
        classifyButton.setText("Search");
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
       
        closeButton.setText("Close");
        closeButton.setBounds(new Rectangle(oldX, newY, length, FrameCreator.STANDARD_HEIGHT));
        closeButton.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                        	  closeOnClick();
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
		componentList.add(stateListCombo);
		componentList.add(cityListCombo);
		componentList.add(locationListCombo);
		componentList.add(serviceListCombo);
	   	componentList.add(jTable1);
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
			   new WashroomOutputScreen(FrameCreator.createFrame());
			
		}
      }	
    
    private boolean validateInputs() {
    	if (stateListCombo.getSelectedIndex() == -1
    			|| ValidationHelper.isStringNullOrEmpty(stateListCombo.getSelectedItem().toString())
    			|| cityListCombo.getSelectedIndex() == -1
    	    	|| ValidationHelper.isStringNullOrEmpty(cityListCombo.getSelectedItem().toString())
    	    	|| locationListCombo.getSelectedIndex() == -1
    	    	|| ValidationHelper.isStringNullOrEmpty(locationListCombo.getSelectedItem().toString())
    	    	|| serviceListCombo.getSelectedIndex() == -1
    	    	|| ValidationHelper.isStringNullOrEmpty(serviceListCombo.getSelectedItem().toString())) {
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
	  	stateListCombo.setSelectedIndex(-1);
	  	cityListCombo.setSelectedIndex(-1);
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
                 new WashroomInputScreen(FrameCreator.createFrame());
             }
         });
     }
     
}

