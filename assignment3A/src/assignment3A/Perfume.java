package assignment3A;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JToolBar;

public class Perfume extends JFrame {

   private JPanel contentPane;
   private JFrame frame;
   private JTextField textFieldRefNo;
   private JTextField textFieldName;
   private JTextField textFieldPhn;
   private JTextField textFieldAddress;
   private JTextField textFieldPostCode;
   private JTable table;
  
   
	/**
	 * Launch the application.
	 */
   public static void main(String[] args) {
      EventQueue.invokeLater(
         new Runnable() {
            public void run() {
               try {
                  Perfume frame = new Perfume();
                  frame.setVisible(true);
               } catch (Exception e) {
                  e.printStackTrace();
               }
            }
         });
   }

	/**
	 * Create the frame.
	 */
   public Perfume() {
		      setBackground(UIManager.getColor("Button.background"));
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setBounds(0, 0, 1400, 800);
		      contentPane = new JPanel();
		      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		      setContentPane(contentPane);
		      contentPane.setLayout(null);
		   	
		      JPanel panel = new JPanel();
		      panel.setBorder(new LineBorder(new Color(135, 206, 235), 8, true));
		      panel.setBackground(new Color(255, 228, 196));
		      panel.setBounds(0, 11, 446, 588);
		      contentPane.add(panel);
		      panel.setLayout(null);
	 
	   	
	      JLabel lblNewLabel_4 = new JLabel("Perfume Order System");
	      lblNewLabel_4.setBackground(Color.PINK);
	      lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
	      lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 27));
	      lblNewLabel_4.setBounds(34, 61, 383, 58);
	      panel.add(lblNewLabel_4);
   	
      JLabel lblNewLabel_1 = new JLabel("Order Now!");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setToolTipText("");
      lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
      lblNewLabel_1.setBounds(20, 104, 409, 73);
      panel.add(lblNewLabel_1);
   	
      JLabel lblNewLabel = new JLabel("Reference No.");
      lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
      lblNewLabel.setBounds(20, 178, 100, 14);
      panel.add(lblNewLabel);
      
      JLabel lblNewLabel_Name = new JLabel("Name");
      lblNewLabel_Name.setHorizontalAlignment(SwingConstants.LEFT);
      lblNewLabel_Name.setFont(new Font("Times New Roman", Font.PLAIN, 16));
      lblNewLabel_Name.setBounds(20, 199, 90, 42);
      panel.add(lblNewLabel_Name);
   	
      JLabel lblNewLabel_Phn = new JLabel("Phone Number");
      lblNewLabel_Phn.setHorizontalAlignment(SwingConstants.LEFT);
      lblNewLabel_Phn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
      lblNewLabel_Phn.setBounds(20, 235, 106, 42);
      panel.add(lblNewLabel_Phn);
      
      JLabel lblNewLabel_Address = new JLabel("Address");
      lblNewLabel_Address.setHorizontalAlignment(SwingConstants.LEFT);
      lblNewLabel_Address.setFont(new Font("Times New Roman", Font.PLAIN, 16));
      lblNewLabel_Address.setBounds(20, 271, 106, 42);
      panel.add(lblNewLabel_Address);
   	
      JLabel lblNewLabel_Postcode = new JLabel("Postcode");
      lblNewLabel_Postcode.setHorizontalAlignment(SwingConstants.LEFT);
      lblNewLabel_Postcode.setFont(new Font("Times New Roman", Font.PLAIN, 16));
      lblNewLabel_Postcode.setBounds(20, 308, 106, 42);
      panel.add(lblNewLabel_Postcode);
   	
      JLabel lblNewLabel_Model = new JLabel("Type Of Perfume");
      lblNewLabel_Model.setHorizontalAlignment(SwingConstants.LEFT);
      lblNewLabel_Model.setFont(new Font("Times New Roman", Font.PLAIN, 16));
      lblNewLabel_Model.setBounds(14, 349, 106, 42);
      panel.add(lblNewLabel_Model);
      
      
      JLabel lblNewLabel_2 = new JLabel("Perfume Brand");
      lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
      lblNewLabel_2.setBounds(14, 402, 99, 14);
      panel.add(lblNewLabel_2);
      
      
      textFieldRefNo = new JTextField();
      textFieldRefNo.setColumns(10);
      textFieldRefNo.setBounds(127, 172, 284, 28);
      panel.add(textFieldRefNo);
      
      textFieldName = new JTextField();
      textFieldName.setColumns(10);
      textFieldName.setBounds(127, 207, 284, 28);
      panel.add(textFieldName);
   	
      textFieldPhn = new JTextField();
      textFieldPhn.setColumns(10);
      textFieldPhn.setBounds(127, 243, 284, 28);
      panel.add(textFieldPhn);
   	
      textFieldAddress = new JTextField();
      textFieldAddress.setColumns(10);
      textFieldAddress.setBounds(127, 279, 284, 28);
      panel.add(textFieldAddress);
   	
      textFieldPostCode = new JTextField();
      textFieldPostCode.setColumns(10);
      textFieldPostCode.setBounds(127, 316, 284, 28);
      panel.add(textFieldPostCode);
   	
      JComboBox comboBox = new JComboBox();
      comboBox.setBackground(new Color(255, 228, 196));
      comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
      comboBox.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "For Her ", "For Him"}));
      comboBox.setBounds(127, 355, 284, 30);
      panel.add(comboBox);

      JComboBox comboBox_1 = new JComboBox();
      comboBox_1.setBackground(new Color(255, 228, 196));
      comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
      comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "DKNY - RM89", "CK - RM90", "Victoria Secret - RM120 ", "Givenchy - RM 80", "Bulgari - RM130", "Hugo Boss -RM 85"}));
      comboBox_1.setBounds(127, 394, 284, 30);
      panel.add(comboBox_1);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBorder(new LineBorder(new Color(135, 206, 235), 8, true));
      panel_1.setBackground(new Color(255, 228, 196));
      panel_1.setForeground(Color.BLACK);
      panel_1.setBounds(10, 610, 1350, 87);
      contentPane.add(panel_1);
      panel_1.setLayout(null);
   	
      JButton btnNewButton = new JButton("ADD ");
      btnNewButton.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               DefaultTableModel model = (DefaultTableModel) table.getModel();
               model.addRow(new Object[] {
                  textFieldRefNo.getText(),
                  textFieldName.getText(),
                  textFieldPhn.getText(),
                  textFieldAddress.getText(),
                  textFieldPostCode.getText(),
                  comboBox.getSelectedItem(),
                  comboBox_1.getSelectedItem(),
                  });
            
               if(table.getSelectedRow() == -1) {
                  if(table.getRowCount() == 0) {
                     JOptionPane.showMessageDialog(null, "Order ", "Perfume Order System",
                        JOptionPane.OK_OPTION);
                  }
               }
            }
         });
      btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
      btnNewButton.setBounds(32, 20, 221, 49);
      panel_1.add(btnNewButton);
   	
      JButton btnExit = new JButton("EXIT");
      btnExit.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               frame = new JFrame();
               if(JOptionPane.showConfirmDialog(frame, "Are You Confirm To Exit ?", "Perfume Order System",
               	JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                  System.exit(0);
               }
            }
         });
      btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
      btnExit.setBounds(1163, 20, 160, 49);
      panel_1.add(btnExit);
      
      JButton btnReset = new JButton("RESET");
      btnReset.addActionListener(
    	         new ActionListener() {
    	            public void actionPerformed(ActionEvent e) {
    	               textFieldRefNo.setText("");
    	               textFieldName.setText("");
    	               textFieldPhn.setText("");
    	               textFieldAddress.setText("");
    	               textFieldPostCode.setText("");
    	               comboBox.setSelectedItem("- Please Select - ");
    	               comboBox_1.setSelectedItem("- Please Select -");
    	               
    	            }
    	         });
      btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
      btnReset.setBounds(284, 20, 221, 49);
      panel_1.add(btnReset);
      
      JButton btnDelete = new JButton("DELETE");
      btnDelete.addActionListener(
    	         new ActionListener() {
    	            public void actionPerformed(ActionEvent e) {
    	            
    	               DefaultTableModel model = (DefaultTableModel) table.getModel();
    	               if(table.getSelectedRow() == -1) {
    	                  if(table.getRowCount() == 0) {
    	                     JOptionPane.showMessageDialog(null, "No Data", "Perfume Order System",
    	                        JOptionPane.OK_OPTION);
    	                  }else {
    	                     JOptionPane.showMessageDialog(null, "Select data to delete", "Perfume Order System",
    	                        JOptionPane.OK_OPTION);
    	                  }
    	               }else {
    	                  model.removeRow(table.getSelectedRow());
    	               }
    	            }
    	         });
      
      btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 20));
      btnDelete.setBounds(980, 20, 160, 49);
      panel_1.add(btnDelete);
      
   	
      JPanel panel_2 = new JPanel();
      panel_2.setBorder(new LineBorder(new Color(135, 206, 235), 8, true));
      panel_2.setBackground(new Color(255, 235, 205));
      panel_2.setBounds(466, 11, 894, 588);
      contentPane.add(panel_2);
      panel_2.setLayout(null);
   	
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBounds(32, 38, 806, 505);
      panel_2.add(scrollPane);
   	
      table = new JTable();
      table.setModel(new DefaultTableModel(
         new Object[][] {
         },
         new String[] {
         	"Ref.No", "Name", "Phone Number", "Address", "Postcode", "Type Of Perfume", "Brand Perfume"
         }
         ));
      table.getColumnModel().getColumn(1).setPreferredWidth(89);
      table.getColumnModel().getColumn(2).setPreferredWidth(90);
      table.getColumnModel().getColumn(3).setPreferredWidth(206);
      table.getColumnModel().getColumn(5).setPreferredWidth(88);
      scrollPane.setViewportView(table);
   }
}
