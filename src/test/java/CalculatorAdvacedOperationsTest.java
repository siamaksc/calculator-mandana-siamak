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
	public void testPercent() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			
			firstNumber = -100.0 + random.nextDouble()*200;
			secondNumber = -100.0 + random.nextDouble()*200;
			result = firstNumber*(secondNumber/100);
			LOG.info("Testing the percent method with the values " + firstNumber+" and "+ secondNumber +" = " + result);
			assertEquals("The result should be: "+ result, calAdvance.percent(firstNumber, secondNumber),result,0.001);
		}
	}
      @Test 
      public void testPower() {
    	  double firstNumber = 0.0;
			double secondNumber = 0.0;
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				firstNumber = -100.0 + random.nextDouble()*200;
				secondNumber = -100.0 + random.nextDouble()*200;
				result = Math.pow(firstNumber, secondNumber);
				LOG.info("Testing the power method with the values " + firstNumber+" and "+ secondNumber +" = " + result);
				assertEquals("The result should be: "+ result, calAdvance.power(firstNumber, secondNumber),result,0.001);
			}
			secondNumber = 6000;
			firstNumber = 2;
			result = Math.pow(firstNumber, secondNumber);
			LOG.info("Testing the power method with the values " + firstNumber+" and "+ secondNumber +" = " + result);
			assertEquals("The result should be: "+ result, calAdvance.power(firstNumber, secondNumber),-1111.1111,0.001);
			
			secondNumber = -900;
			firstNumber = -10;
			result = Math.pow(firstNumber, secondNumber);
			LOG.info("Testing the power method with the values " + firstNumber+" and "+ secondNumber +" = " + result);
			assertEquals("The result should be: "+ result, calAdvance.power(firstNumber, secondNumber),-1111.1111,0.001);
			
			secondNumber = 0.5;
			firstNumber =-2;
			result = Math.pow(firstNumber, secondNumber);
			LOG.info("Testing the power method with the values " + firstNumber+" and "+ secondNumber +" = " + result);
			assertEquals("The result should be: "+ result, calAdvance.power(firstNumber, secondNumber),Double.NaN,0.001);
      }
      
      @Test
      public void testSquareRoot() {
    	  double firstNumber = 0.0;
    	  double result =0.0;
    	  for (int i = 0; i< 50; i++){
    		  firstNumber = -100.0 + random.nextDouble()*200;
    		  if (firstNumber>= 0){
    		  result = Math.sqrt(firstNumber); 
    		  LOG.info("Testing the SquareRoot method with the values " + firstNumber+ " = " + result);
    		  assertEquals("The result should be: "+ result, calAdvance.squareRoot(firstNumber),result,0.001);
    		  }else{
    			  LOG.info("Testing the SquareRoot method with the values " + firstNumber+ " = NaN");
    			  assertTrue(calAdvance.squareRoot(firstNumber)== -1111.1111);
    		  }
    	  }  
    	  
      }
    	  @Test
    	  public void testSine() {
    		  double firstNumber = 0.0;
    		  double result =0.0;
    		  for (int i = 0; i< 50; i++){
    			  firstNumber = -100.0 + random.nextDouble()*200;
    			  result = Math.sin(Math.toRadians(firstNumber));
    			  LOG.info("Testing the Sine method with the values " + firstNumber+ " = " + result);
    			  assertEquals("The result should be: "+ result, calAdvance.sine(firstNumber),result,0.001);
    		  }
    	  }
    	  @Test
    	  public void testCosine() {
    		  double firstNumber = 0.0;
    		  double result =0.0;
    		  for (int i = 0; i< 50; i++){
    			  firstNumber = -100.0 + random.nextDouble()*200;
    			  result = Math.cos(Math.toRadians(firstNumber));
    			 LOG.info("Testing the Cosine method with the values " + firstNumber+ " = " + result);
    			  assertEquals("The result should be: "+ result, calAdvance.cosine(firstNumber),result,0.001);
    		  }
    	  }
    	  @Test
    	  public void testTangent() {
    		  double firstNumber = 0.0;
    		  double result =0.0;
    		  for (int i = 0; i< 50; i++){
    			  firstNumber = -100.0 + random.nextDouble()*200;
    			  result = Math.tan(Math.toRadians(firstNumber));
    			  LOG.info("Testing the Tangent method with the values " + firstNumber+ " = " + result);
    			  assertEquals("The result should be: "+ result, calAdvance.tangent(firstNumber),result,0.001);
    		  }
    		  firstNumber = 90;
    		  LOG.info("Testing tangent with value " + firstNumber);
    		  assertTrue(calAdvance.tangent(firstNumber)== -1111.1111);
    		  firstNumber = -90;
    		  LOG.info("Testing tangent with value " + firstNumber);
    		  assertTrue(calAdvance.tangent(firstNumber)== -1111.1111);
    	  }
    	  @Test
    	  public void testAbsolute() {
    		  double firstNumber = 0.0;
    		  double result =0.0;
    		  for (int i = 0; i< 50; i++){
    			  firstNumber = -100.0 + random.nextDouble()*200;
    			  result = Math.abs(firstNumber);
    			  LOG.info("Testing the absolute method with the value " + firstNumber+ " = " + result);
    			  assertEquals("The result should be: "+ result, calAdvance.absolute(firstNumber),result,0.001);
    		  }
    	  }
    	  @Test
    	  public void testPiNumber() {
    		  double result =0.0;
    		  result = Math.PI;
    		  LOG.info("Testing the PiNumber method " + " = " + result);
    		  assertEquals("The result should be: "+ result, calAdvance.PiNumber(),result,0.001);
    	  }
    	  
  }
