import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JLabel;

import java.awt.SystemColor;
import java.awt.Color;


public class cal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnRadianToGradian;
	private JButton btnGradianToDegree;
	private JButton btnGradianToRadian;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton_3;
	private JLabel lblAngleCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 12));
		frame.setBounds(100, 100, 329, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(SystemColor.textHighlightText);
		textField.setBackground(SystemColor.textInactiveText);
		textField.setBounds(10, 45, 293, 32);
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(SystemColor.textHighlightText);
		textField_1.setBackground(SystemColor.textInactiveText);
		textField_1.setBounds(10, 123, 293, 32);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 18));
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("Degree to Radian");
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.setBounds(10, 204, 139, 32);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = (d*3.14)/180;
				String cal = String.format("%.2f",result);
				textField_1.setText(cal);
				textField_2.setText("Degrees");
				textField_3.setText("Radians");
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Degree to Gradian");
		btnNewButton_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.setBounds(159, 204, 147, 32);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d*1.111111;
				String cal = String.format("%.2f",result);
				textField_1.setText(cal);
				textField_2.setText("Degrees");
				textField_3.setText("Gradians");
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Radian to Degree");
		btnNewButton_2.setBackground(new Color(255, 165, 0));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = (d*180)/3.14;
				String cal = String.format("%.2f",result);
				textField_1.setText(cal);
				textField_2.setText("Radians");
				textField_3.setText("Degress");
			}
		});
		btnNewButton_2.setBounds(10, 247, 139, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		btnRadianToGradian = new JButton("Radian to Gradian");
		btnRadianToGradian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d*63.661977;
				String cal = String.format("%.2f",result);
				textField_1.setText(cal);
				textField_2.setText("Radians");
				textField_3.setText("Gradians");
			}
		});
		btnRadianToGradian.setBackground(new Color(255, 165, 0));
		btnRadianToGradian.setFont(new Font("Arial", Font.BOLD, 12));
		btnRadianToGradian.setBounds(156, 247, 147, 32);
		frame.getContentPane().add(btnRadianToGradian);
		
		btnGradianToDegree = new JButton("Gradian to Degree");
		btnGradianToDegree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d/1.111111;
				String cal = String.format("%.2f",result);
				textField_1.setText(cal);
				textField_2.setText("Gradians");
				textField_3.setText("Degrees");
			}
		});
		btnGradianToDegree.setBackground(new Color(255, 165, 0));
		btnGradianToDegree.setFont(new Font("Arial", Font.BOLD, 12));
		btnGradianToDegree.setBounds(10, 290, 139, 38);
		frame.getContentPane().add(btnGradianToDegree);
		
		btnGradianToRadian = new JButton("Gradian to Radian");
		btnGradianToRadian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d =Double.parseDouble(textField.getText());
				double result = d/63.661977;
				String cal = String.format("%.2f",result);
				textField_1.setText(cal);
				textField_2.setText("Gradians");
				textField_3.setText("Radians");
			}
		});
		btnGradianToRadian.setBackground(new Color(255, 165, 0));
		btnGradianToRadian.setFont(new Font("Arial", Font.BOLD, 12));
		btnGradianToRadian.setBounds(156, 290, 147, 38);
		frame.getContentPane().add(btnGradianToRadian);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBackground(new Color(165, 42, 42));
		lblFrom.setFont(new Font("Arial", Font.BOLD, 15));
		lblFrom.setBounds(10, 98, 46, 14);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Arial", Font.BOLD, 15));
		lblTo.setBounds(10, 179, 46, 14);
		frame.getContentPane().add(lblTo);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.inactiveCaption);
		textField_2.setFont(new Font("Arial", Font.BOLD, 15));
		textField_2.setBounds(50, 93, 99, 24);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.inactiveCaption);
		textField_3.setFont(new Font("Arial", Font.BOLD, 15));
		textField_3.setBounds(35, 174, 115, 24);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		btnNewButton_3 = new JButton("CE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				
			}
		});
		btnNewButton_3.setBackground(new Color(255, 165, 0));
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3.setBounds(159, 165, 144, 28);
		frame.getContentPane().add(btnNewButton_3);
		
		lblAngleCalculator = new JLabel("Angle Calculator");
		lblAngleCalculator.setFont(new Font("Calibri Light", Font.BOLD, 17));
		lblAngleCalculator.setBounds(89, 11, 197, 23);
		frame.getContentPane().add(lblAngleCalculator);
	}
}
