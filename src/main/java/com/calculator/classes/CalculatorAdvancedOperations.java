package com.calculator.classes;


import javax.swing.JOptionPane;
import com.calculator.interfaces.CalculatorAdvancedOperationsInterface;

/**
 * This class contains nine operations for advance methods of the Scientific Calculator program.
 * (percent,power,squareRoot,sine,cosine,tangent,absolute,PiNumber,Negative)
 * Each method in this class does the calculation needed for each method.
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
	/**
	 * Calculate firstNumber to power of secondNumber.
	 * It shows error message if the result becomes bigger than
	 * double max value or smaller than double min value or if it
	 * is not a number(NaN).
	 */
	public double power(double firstNumber, double secondNumber) {
		double result= Math.pow(firstNumber, secondNumber);
		if (Double.MAX_VALUE <= result || Double.MIN_VALUE >= result || Double.NaN == result || Double.isInfinite(result)){
			JOptionPane.showMessageDialog(null, "Invalid Input ", "Error message", JOptionPane.ERROR_MESSAGE);			
			return -1111.1111;
		}
		return result;
	}
	/**
	 * Calculates the square root of firstNumber.
	 * It shows an error message if number is negative.
	 */
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
	/**
	 * Calculates tangent of the firstNumber in degree.
	 * Error message will be shown for tangent of 90 or -90 degree,
	 * since it will be infinite.
	 */
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
	/**
	 * @return result which is the negative of the value entered.
	 */
	public double negative (double number){
		double result = number*(-1);
		return result;
	}
}
