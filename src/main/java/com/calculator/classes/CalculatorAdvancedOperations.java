package com.calculator.classes;

import javax.swing.JOptionPane;

import com.calculator.interfaces.CalculatorAdvancedOperationsInterface;
/**
 * interface 
 * This class have eight advanced operations in maths.
 * (procent,power,squareRoot,sine,cosine,tangent,absolute,PiNumber)
 *
 */

public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {

	public double procent(double firstNumber, double secondNumber) {
		double result = firstNumber*(secondNumber/100);
		return result;
	}

	public double power(double firstNumber, double secondNumber) {
		double result= Math.pow(firstNumber, secondNumber);
		if ( Double.isNaN(result) || result < 0){
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
	
}
