import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.classes.CalculatorAdvancedOperations;

import java.util.Random;
import java.util.logging.Logger;
public class CalculatorAdvacedOperationsTest {
	CalculatorAdvancedOperations calAdvance = new CalculatorAdvancedOperations();
	public static final Logger LOG = Logger.getLogger(CalculatorAdvancedOperations.class.getName());
	Random random = new Random();
	@Test
	public void testProcent() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			
			firstNumber = -100.0 + random.nextDouble()*200;
			secondNumber = -100.0 + random.nextDouble()*200;
			result = firstNumber*(secondNumber/100);
			LOG.info("Testing the procent method with the values " + firstNumber+" and "+ secondNumber +" = " + result);
			assertEquals("The result should be: "+ result, calAdvance.procent(firstNumber, secondNumber),result,0.001);
		}
	}

}
