package Toplama;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class ToplamaFonksiyonTest {
		
	     
	     public ToplamaFonksiyon ToplaF;
	     int result;
	     
	     int a = 4;
	     int b = 5;
	     
	     
	    @Before
	    public void setUp() throws Exception {
	    ToplaF = new ToplamaFonksiyon();
	    }
	    
	    @After
	    public void tearDown() throws Exception 
	    {
	    }
	    
	    @Test
	    public void ObjectNotNullCheck()
	    {
	    	assertNotNull(ToplaF);
	    }
	    
	    // Test cases for all scenarios
	    
	    @Test
	    public void PositiveAndPositiveSum()
	    {
	    	
	      	result = ToplaF.topla(a,b );		
	    	assertEquals("Wrong Result",Integer.sum(a, b),result);
	    }
	    
	    @Test
	    public void PositiveAndNegativeSum()
	    {
	    	
	    	result = ToplaF.topla(a,-(b));			
	    	assertEquals("Wrong Result",Integer.sum(a, -(b)),result);
	    }
	    
	    @Test
	    public void ZeroAndZeroSum()
	    {
	    	
	    	result =ToplaF.topla(0, 0);
	    	assertEquals("Wrong Result",0, result);
	    	
	    }
	    
	    @Test
	    public void PositiveAndZero()
	    {
	       	result = ToplaF.topla(a, 0);
	    	assertEquals("Wrong Result",Integer.sum(a, 0),result);
	    }
	    
	    
	    @Test
	    public void NegativeAndZeroSum()
	    {
	    result = ToplaF.topla(-(a), 0);			
	    assertEquals("Wrong Result",Integer.sum(-(a), 0),result);  	
	    }
	  		
	}


