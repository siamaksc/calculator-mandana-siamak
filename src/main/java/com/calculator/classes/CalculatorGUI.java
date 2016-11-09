package com.calculator.classes;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
 * 
 * This class is the GUI part of the Scientific Calculator program.
 * It has parts containing the whole GUI and actionPerformed 
 * when either of the buttons were clicked.
 * It implements actionListener.
 * 
 */
public class CalculatorGUI implements ActionListener{
	/**
	 * Here are all the attributes.
	 */
	private JFrame frmCalculator;
	private JTextField txfFirstNumber;
	private JTextField txfSecondNumber;
	boolean txfFirstNumber_selected = false;
	boolean txfSecondNumber_selected = false;
	private CalculatorBasicOperations calculator = new CalculatorBasicOperations();
	private CalculatorAdvancedOperations calAdvance = new CalculatorAdvancedOperations();
	private JLabel lblResult_1 = new JLabel("Result:");
	private JLabel lblResult = new JLabel("");
	private JLabel lblFirstNumber = new JLabel("first number");
	private JLabel lblSecondNumber = new JLabel("second number:");
	private JButton btnAdd = new JButton("+");
	private JButton btnSubtract = new JButton("-");
	private JButton btnMultiply = new JButton("\u00D7");
	private JButton btnDivide = new JButton("\u00F7");
	private JButton btnPercent = new JButton("%");
	private JButton btnPower = new JButton("x^y");
	private JButton btnAC = new JButton("AC");
	private JButton btnSquareRoot = new JButton("\u221A");
	private JButton btnZero = new JButton("0");
	private JButton btnOne = new JButton("1");
	private JButton btnTwo = new JButton("2");
	private JButton btnThree = new JButton("3");
	private JButton btnFour = new JButton("4");
	private JButton btnFive = new JButton("5");
	private JButton btnSix = new JButton("6");
	private JButton btnSeven = new JButton("7");
	private JButton btnEight = new JButton("8");
	private JButton btnNine = new JButton("9");
	private JButton btnDecimal = new JButton(".");
	private JButton btnSine = new JButton("sin");
	private JButton btnCosine = new JButton("cos");
	private JButton btnTangent = new JButton("tan");
	private JButton btnAbsolute = new JButton("abs");
	private JButton btnPi = new JButton("\u03C0");
	private JButton btnNegative = new JButton("\u00B1");
	
	/**
	 * Getters and setters for JFrame.
	 * @return frmCalculator
	 */
	public JFrame getFrmCalculator() {
		return frmCalculator;
	}
	
	/**
	 * 
	 * @param frmCalculator
	 */
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
		frmCalculator.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 466, 318);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		txfFirstNumber = new JTextField();
		txfFirstNumber.setBounds(116, 27, 314, 20);
		frmCalculator.getContentPane().add(txfFirstNumber);
		txfFirstNumber.setColumns(10);
		txfSecondNumber = new JTextField();
		txfSecondNumber.setBounds(116, 58, 314, 20);
		frmCalculator.getContentPane().add(txfSecondNumber);
		txfSecondNumber.setColumns(10);
	}
	
	/**
	 * Adding components to frame.
	 * All buttons were added.
	 */
	public void addComponentsToFrame(){
		lblFirstNumber.setBounds(10, 30, 96, 14);
		frmCalculator.getContentPane().add(lblFirstNumber);
		lblSecondNumber.setBounds(10, 61, 96, 14);
		frmCalculator.getContentPane().add(lblSecondNumber);
		lblResult.setBounds(66, 89, 364, 20);
		frmCalculator.getContentPane().add(lblResult);
		lblResult_1.setBounds(10, 89, 46, 20);
		frmCalculator.getContentPane().add(lblResult_1);
		btnAdd.setBounds(370, 240, 60, 25);
		frmCalculator.getContentPane().add(btnAdd);
		btnSubtract.setBounds(370, 210, 60, 25);
		frmCalculator.getContentPane().add(btnSubtract);
		btnMultiply.setBounds(370, 180, 60, 25);
		frmCalculator.getContentPane().add(btnMultiply);
		btnDivide.setBounds(370, 150, 60, 25);
		frmCalculator.getContentPane().add(btnDivide);
		btnPercent.setBounds(300, 240, 60, 25);
		frmCalculator.getContentPane().add(btnPercent);
		btnPower.setBounds(90, 240, 60, 25);
		frmCalculator.getContentPane().add(btnPower);
		btnAC.setBounds(370, 120, 60, 25);
		frmCalculator.getContentPane().add(btnAC);
		btnSquareRoot.setBounds(90, 210, 60, 25);
		frmCalculator.getContentPane().add(btnSquareRoot);
		btnSine.setBounds(90, 150, 60, 25);
		frmCalculator.getContentPane().add(btnSine);
		btnCosine.setBounds(90, 180, 60, 25);
		frmCalculator.getContentPane().add(btnCosine);
		btnTangent.setBounds(20, 150, 60, 25);
		frmCalculator.getContentPane().add(btnTangent);
		btnAbsolute.setBounds(20, 180, 60, 25);
		frmCalculator.getContentPane().add(btnAbsolute);
		btnPi.setBounds(20, 210, 60, 25);
		frmCalculator.getContentPane().add(btnPi);
		
		btnZero.setBounds(160, 240, 60, 25);
		frmCalculator.getContentPane().add(btnZero);
		btnOne.setBounds(160, 210, 60, 25);
		frmCalculator.getContentPane().add(btnOne);
		btnTwo.setBounds(230, 210, 60, 25);
		frmCalculator.getContentPane().add(btnTwo);
		btnThree.setBounds(300, 210, 60, 25);
		frmCalculator.getContentPane().add(btnThree);
		btnFour.setBounds(160, 180, 60, 25);
		frmCalculator.getContentPane().add(btnFour);
		btnFive.setBounds(230, 180, 60, 25);
		frmCalculator.getContentPane().add(btnFive);
		btnSix.setBounds(300, 180, 60, 25);
		frmCalculator.getContentPane().add(btnSix);
		btnSeven.setBounds(160, 150, 60, 25);
		frmCalculator.getContentPane().add(btnSeven);
		btnEight.setBounds(230, 150, 60, 25);
		frmCalculator.getContentPane().add(btnEight);
		btnNine.setBounds(300, 150, 60, 25);
		frmCalculator.getContentPane().add(btnNine);
		
		btnDecimal.setBounds(230, 240, 60, 25);
		frmCalculator.getContentPane().add(btnDecimal);
		btnNegative.setBounds(20, 240, 60, 25);
		frmCalculator.getContentPane().add(btnNegative);
	}
	
	/**
	 * Adding actionListeners for buttons	
	 */
	public void addActionListeners(){
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnPercent.addActionListener(this);
		btnPower.addActionListener(this);
		btnAC.addActionListener(this);
		btnSquareRoot.addActionListener(this);
		btnSine.addActionListener(this);
		btnCosine.addActionListener(this);
		btnTangent.addActionListener(this);
		btnAbsolute.addActionListener(this);
		btnPi.addActionListener(this);
		btnZero.addActionListener(this);
		btnOne.addActionListener(this);
		btnTwo.addActionListener(this);
		btnThree.addActionListener(this);
		btnFour.addActionListener(this);
		btnFive.addActionListener(this);
		btnSix.addActionListener(this);
		btnSeven.addActionListener(this);
		btnEight.addActionListener(this);
		btnNine.addActionListener(this);
		btnDecimal.addActionListener(this);
		btnNegative.addActionListener(this);
	}

	/**
	 * get value from text field1
	 * @return firstNumber - Number that is written in the text field1
	 **/
	public double getValueFromTextField1(){		
		double firstNumber = 0.0;						
		firstNumber = Double.valueOf(txfFirstNumber.getText());		
		return firstNumber;		
	}
	
	/**
	 * get value from text field2
	 * @return secondNumber - Number that is written in the text field2
	 */
	public double getValueFromTextField2(){		
		double secondNumber = 0.0;						
		secondNumber = Double.valueOf(txfSecondNumber.getText());		
		return secondNumber;		
	}	
	
	/**
	 * ActionPerformed for all buttons
	 * when they were clicked
	 */
	public void actionPerformed(ActionEvent e) {
		/**
		 * Defining methods for FocusGained
		 */
		txfFirstNumber.addFocusListener(new FocusListener() {
	        public void focusLost(FocusEvent arg0) {
	            // TODO Auto-generated method stub
	        }
	        public void focusGained(FocusEvent arg0) {
	            txfFirstNumber_selected = true;
	            txfSecondNumber_selected = false;
	        }
	    });
	    txfSecondNumber.addFocusListener(new FocusListener() {
	        public void focusLost(FocusEvent e) {
	            // TODO Auto-generated method stub
	        }
	        public void focusGained(FocusEvent e) {
	            txfFirstNumber_selected = false;
	            txfSecondNumber_selected = true;
	        }
	    });
	    /**
	     * Action performed for button add
	     * It shows an error message if the button is clicked
	     * but either of the text fields is empty.
	     * This Error massage was used for all methods.
	     */
		if (e.getSource() == btnAdd){
			if (txfFirstNumber.getText().isEmpty() || txfSecondNumber.getText().isEmpty()){
				JOptionPane.showMessageDialog(frmCalculator, "Enter numbers in both boxes", "Error message", JOptionPane.ERROR_MESSAGE);
			}else{
			double result = calculator.add(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText(String.valueOf(result));
			}
		}		
		
		if (e.getSource() == btnSubtract){
			if (txfFirstNumber.getText().isEmpty() || txfSecondNumber.getText().isEmpty()){
				JOptionPane.showMessageDialog(frmCalculator, "Enter numbers in both boxes", "Error message", JOptionPane.ERROR_MESSAGE);
			}else{
			double result = calculator.subtract(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText(String.valueOf(result));
			}
		}
		
		if (e.getSource() == btnMultiply){
			if (txfFirstNumber.getText().isEmpty() || txfSecondNumber.getText().isEmpty()){
				JOptionPane.showMessageDialog(frmCalculator, "Enter numbers in both boxes", "Error message", JOptionPane.ERROR_MESSAGE);
			}else{
			double result = calculator.multiply(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText(String.valueOf(result));
			}
		}
		
		if (e.getSource() == btnDivide){
			if (txfFirstNumber.getText().isEmpty() || txfSecondNumber.getText().isEmpty()){
				JOptionPane.showMessageDialog(frmCalculator, "Enter numbers in both boxes", "Error message", JOptionPane.ERROR_MESSAGE);
			}else{
			double result = calculator.divide(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText(String.valueOf(result));	
			}
		}	
		if (e.getSource() == btnPercent){
			if (txfFirstNumber.getText().isEmpty() || txfSecondNumber.getText().isEmpty()){
				JOptionPane.showMessageDialog(frmCalculator, "Enter numbers in both boxes", "Error message", JOptionPane.ERROR_MESSAGE);
			}else{
			double result = calAdvance.percent(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText(String.valueOf(result));
			}
		}
		if (e.getSource() == btnPower){
			if (txfFirstNumber.getText().isEmpty() || txfSecondNumber.getText().isEmpty()){
				JOptionPane.showMessageDialog(frmCalculator, "Enter numbers in both boxes", "Error message", JOptionPane.ERROR_MESSAGE);
			}else{
			double result = calAdvance.power(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText(String.valueOf(result));
			}
		}
		if (e.getSource() == btnAC){
			txfFirstNumber.setText(null);
			txfSecondNumber.setText(null);
			lblResult.setText(null);
		}
		/**
		 * The value will be taken from the first box,
		 * for the methods that need only one value.
		 * Error message will be shown if first box is empty.
		 */
		if (e.getSource() == btnSquareRoot){
			if (txfFirstNumber.getText().isEmpty()){
				JOptionPane.showMessageDialog(frmCalculator, "Enter a number in the first box", "Error message", JOptionPane.ERROR_MESSAGE);
			}else{
			double result = calAdvance.squareRoot(getValueFromTextField1());
			lblResult.setText(String.valueOf(result));
			}
		}
		if (e.getSource() == btnSine){
			if (txfFirstNumber.getText().isEmpty()){
				JOptionPane.showMessageDialog(frmCalculator, "Enter a number in the first box", "Error message", JOptionPane.ERROR_MESSAGE);
			}else{
				double result  = calAdvance.sine(getValueFromTextField1());
				lblResult.setText(String.valueOf(result));
				}
			}
		if (e.getSource() == btnCosine){
			if (txfFirstNumber.getText().isEmpty()){
				JOptionPane.showMessageDialog(frmCalculator, "Enter a number in the first box", "Error message", JOptionPane.ERROR_MESSAGE);
			}else{
			double result  = calAdvance.cosine(getValueFromTextField1());
			lblResult.setText(String.valueOf(result));
			}
		}
		if (e.getSource() == btnTangent){
			if (txfFirstNumber.getText().isEmpty()){
				JOptionPane.showMessageDialog(frmCalculator, "Enter a number in the first box", "Error message", JOptionPane.ERROR_MESSAGE);
			}else{
			double result  = calAdvance.tangent(getValueFromTextField1());
			lblResult.setText(String.valueOf(result));
			}
		}
		if (e.getSource() == btnAbsolute){
			if (txfFirstNumber.getText().isEmpty()){
				JOptionPane.showMessageDialog(frmCalculator, "Enter a number in the first box", "Error message", JOptionPane.ERROR_MESSAGE);
			}else{
			double result  = calAdvance.absolute(getValueFromTextField1());
			lblResult.setText(String.valueOf(result));
			}
		}
		/**
		 * Pi will be shown in either of the text fields.
		 */
		if (e.getSource() == btnPi){
			double result  = calAdvance.PiNumber();
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(String.valueOf(result));
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(String.valueOf(result));
			}
		}
		/**
		 * Action performed for the number-pad.
		 */
		if (e.getSource() == btnZero){
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(txfFirstNumber.getText()+"0");
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(txfSecondNumber.getText()+"0");
			}
		}
		if (e.getSource() == btnOne){
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(txfFirstNumber.getText()+"1");
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(txfSecondNumber.getText()+"1");
			}
		}
		if (e.getSource() == btnTwo){
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(txfFirstNumber.getText()+"2");
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(txfSecondNumber.getText()+"2");
			}
		}
		if (e.getSource() == btnThree){
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(txfFirstNumber.getText()+"3");
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(txfSecondNumber.getText()+"3");
			}
		}
		if (e.getSource() == btnFour){
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(txfFirstNumber.getText()+"4");
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(txfSecondNumber.getText()+"4");
			}
		}
		if (e.getSource() == btnFive){
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(txfFirstNumber.getText()+"5");
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(txfSecondNumber.getText()+"5");
			}
		}
		if (e.getSource() == btnSix){
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(txfFirstNumber.getText()+"6");
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(txfSecondNumber.getText()+"6");
			}
		}
		if (e.getSource() == btnSeven){
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(txfFirstNumber.getText()+"7");
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(txfSecondNumber.getText()+"7");
			}
		}
		if (e.getSource() == btnEight){
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(txfFirstNumber.getText()+"8");
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(txfSecondNumber.getText()+"8");
			}
		}
		if (e.getSource() == btnNine){
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(txfFirstNumber.getText()+"9");
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(txfSecondNumber.getText()+"9");
			}
		}
		if (e.getSource() == btnDecimal){
			if (txfFirstNumber_selected){
				txfFirstNumber.setText(txfFirstNumber.getText()+".");
			}
			if (txfSecondNumber_selected){
				txfSecondNumber.setText(txfSecondNumber.getText()+".");
			}
		}
		/**
		 * If negative button was clicked.
		 * Error message will be shown if no value entered.
		 */
		if (e.getSource() == btnNegative){
			if (txfFirstNumber_selected){
				if (txfFirstNumber.getText().isEmpty()){
					JOptionPane.showMessageDialog(frmCalculator, "Enter a number in box", "Error message", JOptionPane.ERROR_MESSAGE);
				}else{
				txfFirstNumber.setText(String.valueOf(calAdvance.negative(getValueFromTextField1())));
				}
			}
			if (txfSecondNumber_selected){
				if (txfSecondNumber.getText().isEmpty()){
					JOptionPane.showMessageDialog(frmCalculator, "Enter a number in box", "Error message", JOptionPane.ERROR_MESSAGE);
				}else{
				txfSecondNumber.setText(String.valueOf(calAdvance.negative(getValueFromTextField2())));
				}
			}
		}
	}
}
