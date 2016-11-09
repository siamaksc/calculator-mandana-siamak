package com.calculator.classes;
import javax.swing.JOptionPane;
import com.calculator.interfaces.CalculatorBasicOperationsInterface;
/**
 * 
 *This class contains four fundamental operations of mathematics as basic
 *part of the scientific calculator.
 *(add, subtract, multiply, divide)
 *This class implements the interface for basic operations.
 */
public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface{
	
	public double add(double firstNumber, double secondNumber){
		return  firstNumber + secondNumber;
	}

	public double subtract(double firstNumber, double secondNumber){
		return  firstNumber - secondNumber;
	}
	
	public double multiply(double firstNumber, double secondNumber){
		return  firstNumber * secondNumber;
	}
	/**
	 * Calculate division of two numbers.
	 * Error message will be shown if first number
	 * divides by zero.
	 */
	public double divide(double firstNumber, double secondNumber){
		double result = firstNumber / secondNumber;
		if (Double.isInfinite(result)){
			JOptionPane.showMessageDialog(null, "division by zero!", "Error message", JOptionPane.ERROR_MESSAGE);			
			return -1111.1111;
		}			
		return result;
	}
}
