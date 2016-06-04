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



public class WashroomApproveScreen {
	
	 
	 private DefaultTableModel model = new DefaultTableModel();
	 
	 private JTable jTable1 = new JTable();
	 
	private JLabel jDeveloperInformationLabel = new JLabel();

    private JButton feedbackButton = new JButton();
    
    public WashroomApproveScreen(JFrame frame) {
    	createDCCMainMenuScreen(frame);
    }

    private void createDCCMainMenuScreen(final JFrame frame) {
//    	frame.getContentPane().setLayout( null );
      	int oldX = 0;
    	int newX = 0;
    	int oldY = 0;
    	int newY = 0;
		  Dimension screenSize = FrameCreator.screenSize;
	      oldX = 75;
	      oldY = 70 + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
	      int length = 90;
	      newX = oldX;
	      newY = oldY;
    	
    	frame.setTitle("Swach Shauch Seva screen");
        
        JPanel panel = new ImageCreator();
//        panel.setBounds(new Rectangle(425, 25, 300, 300));
       
        int inputStartX = 60;
        int inputStartY = 20;
        
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;

        int offset1 = 90;
        int length1 = 100;
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        int outputLength = 70;
        int outputWidth = 250;
        jTable1.setBounds(new Rectangle(newX - 60, newY, outputWidth, outputLength));
        model.addColumn("Sr.No");
        model.addColumn("Address");
        model.addColumn("Action");
        jTable1.setModel(model);
        model.addRow(new Object[]{"Sr.No","Address","Action"});
        model.addRow(new Object[]{"1", "bangur nagar washroom, near bangur nagar signal, goregaon(west), mumbai","Select/Reject"});
		 model.addRow(new Object[]{"2", "motilal nagar washroom, motilal nagar, goregaon(west), mumbai","Select/Reject"});
		 model.addRow(new Object[]{"3", "prashant washroom, near bangur nagar post office, goregaon(west), mumbai","Select/Reject"});
		 
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
       // inputStartY = inputStartY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
       
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
       
       
        newY = newY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
        
        jDeveloperInformationLabel.setText("Developed by Prashant Padmanabhan");
        jDeveloperInformationLabel.setBounds(new Rectangle(newX - 60, newY, FrameCreator.STANDARD_LONG_LABEL_WIDTH, FrameCreator.STANDARD_HEIGHT));
        
        int outputX = oldX + length + length + 45;
        int outputY = 20;
        
        
        outputY = outputY + FrameCreator.STANDARD_COMPONENT_DIFFERENCE;
        
//        jTable1.setEditable(false);
        
        
        
        
        List<Component> componentList = new ArrayList<Component>();
        
        componentList.add(jDeveloperInformationLabel);
	   	componentList.add(jTable1);
	   	componentList.add(panel);

        FrameCreator.addComponents(frame, componentList);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }

    private void feedbackOnClick(JFrame jframe) {
    	 jframe.dispose();
		   new WashroomFeedbackScreen(FrameCreator.createFrame());
      }	
    
   
    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new WashroomApproveScreen(FrameCreator.createFrame());
             }
         });
     }
     
}

