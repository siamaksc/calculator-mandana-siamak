package com.calculator.classes;

import javax.swing.JOptionPane;

import com.calculator.interfaces.CalculatorAdvancedOperationsInterface;

/**
 * 
 * This class contains operations for advance methods of the Scientific Calculator program.
 * This class does the calculation needed for each method.
 * This class implements from the interface for advance operations.
 * 
 */
public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {
	/**
	 * Calculate percent of two numbers.
	 */
	public double percent(double firstNumber, double secondNumber) {
		double result = firstNumber*(secondNumber/100);
		return result;
	}

	public double power(double firstNumber, double secondNumber) {
		double result= Math.pow(firstNumber, secondNumber);
		if (Double.MAX_VALUE <= result || Double.MIN_VALUE >= result || Double.NaN == result || Double.isInfinite(result)){
			JOptionPane.showMessageDialog(null, "Invalid Input ", "Error message", JOptionPane.ERROR_MESSAGE);			
			return -1111.1111;
		}
		return result;
	}
	
	public double squareRoot (double firstNumber){
		if (firstNumber < 0) {
			JOptionPane.showMessageDialog(null, "Invalid Input ", "Error message", JOptionPane.ERROR_MESSAGE);
			return -1111.1111;
		}
		double result = Math.sqrt(firstNumber);
		return result;
	}
	
	public double sine (double firstNumber){
		double result = Math.sin(Math.toRadians(firstNumber));
		return result;
	}
	
	public double cosine (double firstNumber){
		double result = Math.cos(Math.toRadians(firstNumber));
		return result;
	}
	
	public double tangent (double firstNumber){
		double result = Math.tan(Math.toRadians(firstNumber));
		if (firstNumber == 90 || firstNumber == -90){
			JOptionPane.showMessageDialog(null, "Invalid Input ", "Error message", JOptionPane.ERROR_MESSAGE);		
			return -1111.1111;
		}
		return result;
	}
	
	public double absolute (double firstNumber){
		double result = Math.abs(firstNumber);
		return result;
	}
	
	public double PiNumber(){
		double result  = Math.PI;
		return result;
	}
	
	public double negative (double number){
		double result = number*(-1);
		return result;
	}
}
