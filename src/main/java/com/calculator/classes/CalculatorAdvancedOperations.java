package com.calculator.classes;

import javax.swing.JOptionPane;

import com.calculator.interfaces.CalculatorAdvancedOperationsInterface;

public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {

	public double procent(double firstNumber, double secondNumber) {
	
		double result = firstNumber*(secondNumber/100);
		return result;
	}

	public double power(double firstNumber, double secondNumber) {
		double result= Math.pow(firstNumber, secondNumber);
		if (Double.isInfinite(result)){
			JOptionPane.showMessageDialog(null, "Invalid input ", "Error message", JOptionPane.ERROR_MESSAGE);			
			return -1111.1111;
		
	}
		return result;
}
	
}
