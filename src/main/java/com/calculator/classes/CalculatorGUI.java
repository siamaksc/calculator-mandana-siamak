package com.calculator.classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalculatorGUI implements ActionListener{
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
	private JButton btnMultiply = new JButton("*");
	private JButton btnDivide = new JButton("÷");
	private JButton btnProcent = new JButton("%");
	private JButton btnPower = new JButton("x^y");
	private JButton btnAC = new JButton("AC");
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
		frmCalculator.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 544, 344);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		txfFirstNumber = new JTextField();
		txfFirstNumber.setBounds(116, 27, 329, 20);
		frmCalculator.getContentPane().add(txfFirstNumber);
		txfFirstNumber.setColumns(10);
		
		txfSecondNumber = new JTextField();
		txfSecondNumber.setBounds(116, 58, 329, 20);
		frmCalculator.getContentPane().add(txfSecondNumber);
		txfSecondNumber.setColumns(10);
	}
	
	/**
	 * Adding components to frame.
	 * @param none
	 * @return none
	 */
	public void addComponentsToFrame(){
		lblFirstNumber.setBounds(10, 30, 96, 14);
		frmCalculator.getContentPane().add(lblFirstNumber);
		lblSecondNumber.setBounds(10, 61, 96, 14);
		frmCalculator.getContentPane().add(lblSecondNumber);
		lblResult.setBounds(67, 89, 378, 20);
		frmCalculator.getContentPane().add(lblResult);
		lblResult_1.setBounds(10, 89, 46, 20);
		frmCalculator.getContentPane().add(lblResult_1);
		btnAdd.setBounds(446, 258, 60, 25);
		frmCalculator.getContentPane().add(btnAdd);
		btnSubtract.setBounds(446, 228, 60, 25);
		frmCalculator.getContentPane().add(btnSubtract);
		btnMultiply.setBounds(446, 198, 60, 25);
		frmCalculator.getContentPane().add(btnMultiply);
		btnDivide.setBounds(446, 168, 60, 25);
		frmCalculator.getContentPane().add(btnDivide);
		btnProcent.setBounds(376, 138, 60, 25);
		frmCalculator.getContentPane().add(btnProcent);
		btnPower.setBounds(166, 258, 60, 25);
		frmCalculator.getContentPane().add(btnPower);
		btnAC.setBounds(446, 138, 60, 25);
		frmCalculator.getContentPane().add(btnAC);
		
		btnZero.setBounds(236, 258, 60, 25);
		frmCalculator.getContentPane().add(btnZero);
		btnOne.setBounds(236, 228, 60, 25);
		frmCalculator.getContentPane().add(btnOne);
		btnTwo.setBounds(306, 228, 60, 25);
		frmCalculator.getContentPane().add(btnTwo);
		btnThree.setBounds(376, 228, 60, 25);
		frmCalculator.getContentPane().add(btnThree);
		btnFour.setBounds(236, 198, 60, 25);
		frmCalculator.getContentPane().add(btnFour);
		btnFive.setBounds(306, 198, 60, 25);
		frmCalculator.getContentPane().add(btnFive);
		btnSix.setBounds(376, 198, 60, 25);
		frmCalculator.getContentPane().add(btnSix);
		btnSeven.setBounds(236, 168, 60, 25);
		frmCalculator.getContentPane().add(btnSeven);
		btnEight.setBounds(306, 168, 60, 25);
		frmCalculator.getContentPane().add(btnEight);
		btnNine.setBounds(376, 168, 60, 25);
		frmCalculator.getContentPane().add(btnNine);
		
		btnDecimal.setBounds(306, 258, 60, 25);
		frmCalculator.getContentPane().add(btnDecimal);
	}
		
	public void addActionListeners(){
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnProcent.addActionListener(this);
		btnPower.addActionListener(this);
		btnAC.addActionListener(this);
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
		if (e.getSource() == btnProcent){
			double result = calAdvance.procent(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);
		}
		if (e.getSource() == btnPower){
			double result = calAdvance.power(getValueFromTextField1(), getValueFromTextField2());
			lblResult.setText("Result: "+result);
		}
		if (e.getSource() == btnAC){
			txfFirstNumber.setText(null);
			txfSecondNumber.setText(null);
			lblResult.setText(null);
		}
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
		
		
		
	}

}
