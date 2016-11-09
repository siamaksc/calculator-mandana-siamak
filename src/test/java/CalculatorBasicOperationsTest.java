import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.calculator.classes.CalculatorBasicOperations;
/**
 * 
 * This class tests all four fundamental methods used in CalculatorBasicOperations.
 * Each test uses random input values including zero, positive and
 * negative values. Each test repeats for 50 times.
 * For some methods, manual values were used in order to get
 * hundred percent coverage. 
 *
 */
public class CalculatorBasicOperationsTest {
	/**
	 * Attributes
	 */
	CalculatorBasicOperations calBasic = new CalculatorBasicOperations();
	public static final Logger LOG = Logger.getLogger(CalculatorBasicOperations.class.getName());
	Random random = new Random();

	@Test
	public void testAdd() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = -100.0 + random.nextDouble()*200;
			secondNumber = -100.0 + random.nextDouble()*200;
			result = firstNumber + secondNumber;	
			LOG.info("Testing the add method with the values: "+ firstNumber+ " and " + secondNumber);
			assertEquals("The result should be: "+result,calBasic.add(firstNumber, secondNumber), result, 0.0001);
		}
	}

	@Test
	public void testSubtract() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = -100.0 + random.nextDouble()*200;
			secondNumber = -100.0 + random.nextDouble()*200;
			result = firstNumber - secondNumber;
			LOG.info("Testing the subtract method with the values " + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result, calBasic.subtract(firstNumber, secondNumber),result,0.0001);
		}
	}

	@Test
	public void testMultiply() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = -100.0 + random.nextDouble()*200;
			secondNumber = -100.0 + random.nextDouble()*200;
			result = firstNumber * secondNumber;
			LOG.info("Testing the multiply method with the values " + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result, calBasic.multiply(firstNumber, secondNumber),result,0.0001);
		}
	}

	@Test
	public void testDivide() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = -100.0 + random.nextDouble()*200;
			secondNumber = -100.0 + random.nextDouble()*200;
			result = firstNumber / secondNumber;
			LOG.info("Testing the divide method with the values " + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result, calBasic.divide(firstNumber, secondNumber),result,0.0001);
		}
		secondNumber = 0.0;
		result = firstNumber / secondNumber;
		LOG.info("Testing the divide method with values " + firstNumber + " and 0.0");
		assertEquals("The result should be: "+ result, calBasic.divide(firstNumber, secondNumber),-1111.1111,0.001);
	}
}
