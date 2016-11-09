package com.calculator.classes;
/**
 * @author Siamak and Mandana
 * 
 * Main class for running the program.
 * This program is a Scientific calculator which 
 * uses a GUI class for interaction with the user.
 * This program has 2 interfaces and 2 class methods
 * beside the GUI class.
 */
public class Main {

	public static void main(String[] args) {
		CalculatorGUI window = new CalculatorGUI();
		window.getFrmCalculator().setVisible(true);
	}
}
