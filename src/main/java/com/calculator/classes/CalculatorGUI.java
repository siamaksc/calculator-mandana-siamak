package com.calculator.classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalculatorGUI implements ActionListener{
	private JFrame frmCalculator;
	private JTextField txfFirstNumber;
	private JTextField txfSecondNumber;
	private CalculatorBasicOperations calculator = new CalculatorBasicOperations();
	private JLabel lblResult = new JLabel("Result:");
	
	private JLabel lblFirstNumber = new JLabel("first number");
	private JLabel lblSecondNumber = new JLabel("second number:");
	private JButton btnAdd = new JButton("+");
	private JButton btnSubtract = new JButton("-");
	private JButton btnMultiply = new JButton("*");
	private JButton btnDivide = new JButton("/");

	
	
	public JFrame getFrmCalculator() {
		return frmCalculator;
	}

	public void setFrmCalculator(JFrame frmCalculator) {
		this.frmCalculator = frmCalculator;
	}

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		createAndShowGUI();
		addComponentsToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void createAndShowGUI() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setBackground(Color.CYAN);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 255, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		txfFirstNumber = new JTextField();
		txfFirstNumber.setBounds(116, 27, 108, 20);
		frmCalculator.getContentPane().add(txfFirstNumber);
		txfFirstNumber.setColumns(10);
		
		txfSecondNumber = new JTextField();
		txfSecondNumber.setBounds(116, 58, 108, 20);
		frmCalculator.getContentPane().add(txfSecondNumber);
		txfSecondNumber.setColumns(10);	
		
		lblFirstNumber.setBounds(10, 30, 96, 14);
		lblSecondNumber.setBounds(10, 61, 96, 14);
		lblResult.setBounds(10, 86, 223, 14);

		btnAdd.setBounds(10, 139, 47, 23);
		btnSubtract.setBounds(67, 139, 48, 23);	
		btnMultiply.setBounds(125, 139, 47, 23);	
		btnDivide.setBounds(182, 139, 37, 23);	
	}
	
	/**
	 * Adding components to frame.
	 * @param none
	 * @return none
	 */
	public void addComponentsToFrame(){
		frmCalculator.getContentPane().add(lblFirstNumber);
		frmCalculator.getContentPane().add(lblSecondNumber);
		frmCalculator.getContentPane().add(lblResult);
		frmCalculator.getContentPane().add(btnAdd);
		frmCalculator.getContentPane().add(btnSubtract);
		frmCalculator.getContentPane().add(btnMultiply);
		frmCalculator.getContentPane().add(btnDivide);
	}
		
	
	public void addActionListeners(){
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
	}

	
	/**
	 *
	 * get value from text field
	 * 
	 * @return firstNUmber - Number that is written in the textfield
	 **/
	public double getValueFromTextField1(){		
		double firstNumber = 0.0;						
		firstNumber = Double.valueOf(txfFirstNumber.getText());		
		return firstNumber;		
	}
	
	public double getValueFromTextField2(){		
		double secondNumber = 0.0;						
		secondNumber = Double.valueOf(txfSecondNumber.getText());		
		return secondNumber;		
	}	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd){
			double result = calculator.add(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);
		}		
		
		if (e.getSource() == btnSubtract){
			double result = calculator.subtract(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);
		}
		
		if (e.getSource() == btnMultiply){
			double result = calculator.multiply(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);
		}
		
		if (e.getSource() == btnDivide){
			double result = calculator.divide(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);		
		}		
	}	
}
