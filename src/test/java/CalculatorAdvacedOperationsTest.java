import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.classes.CalculatorAdvancedOperations;
/**
 * This class testing all methods from 2 interfaces
 * Test uses random input values and also testing zero, positive and
 *  negative values i 50 times to each test method
 */

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
				assertTrue( calAdvance.power(firstNumber, secondNumber) == result);
			}
      }
      @Test
      public void testPower1(){
			double secondNumber = 3500;
			double firstNumber = 2;
			LOG.info("Testing with values firstnumber and secondNumber to power  " + firstNumber+" and "+ secondNumber );
			assertTrue(calAdvance.power(firstNumber, secondNumber)== -1111.1111);
      }
      @Test
      public void testPower2(){
		double	secondNumber = 0.5;
			double firstNumber =-2;
			LOG.info("Testing negative number to power of 0.5 " + firstNumber+" and "+ secondNumber );
			assertTrue(calAdvance.power(firstNumber, secondNumber)== -1111.1111);
      }
      @Test
      public void testSquareRoot() {
    	  double firstNumber = 0.0;
    	  double result =0.0;
    	  for (int i = 0; i< 5; i++){
    		  firstNumber = -100.0 + random.nextDouble()*200;
    		  if (firstNumber>= 0){
    		  result = Math.sqrt(firstNumber); 
    		  LOG.info("Testing the SquareRoot method with the values " + firstNumber+ " = " + result);
    		  assertEquals("The result should be: "+ result, calAdvance.squareRoot(firstNumber),result,0.001);
    		  }else{
    			  LOG.info("Testing the SquareRoot method with the values " + firstNumber+ " = " + result);
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
    		  LOG.info("Testing number 90 to Tangent " + firstNumber);
    		  assertTrue(calAdvance.tangent(firstNumber)== -1111.1111);

    		  firstNumber = -90;
    		  LOG.info("Testing number 90 to Tangent " + firstNumber);
    		  assertTrue(calAdvance.tangent(firstNumber)== -1111.1111);
    		  
      }
    	  @Test
    	  public void testAbsolute() {
    		  double firstNumber = 0.0;
    		  double result =0.0;
    		  for (int i = 0; i< 50; i++){
    			  firstNumber = -100.0 + random.nextDouble()*200;
    		      result = Math.abs(firstNumber);
    		      LOG.info("Testing the Absolute method with the values" + firstNumber + " = " + result);
    		      assertEquals ("The result should be: " + result, calAdvance.absolute(firstNumber), result,0.001);
    	  }  
        }
    	  @Test
    	  public void testPiNumber(){
    		  double firstNumber = 0.0;
    		  double result = 0.0;
    		  for (int i = 0; i< 50 ; i++){
    			  firstNumber = -100.0 + random.nextDouble()*200.0;
    			  result = Math.PI;
    			  LOG.info("Testing the PiNumber method with the values" + firstNumber + " = " + result);
    		      assertEquals ("The result should be: " + result, calAdvance.PiNumber(), result,0.001);
    			  
    		  }
    	  }
}
