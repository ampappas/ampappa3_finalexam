
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.Main;
import main.java.Calc;

import static org.junit.Assert.*;

// This test class does not really do anything that makes sense, it just 
// creates one test that passes and one that fails. 
public class Tests {

    //whitebox test
	@Test
    public void wb1() {
        assertEquals(4.0, 4.00, .01);
    }

    //blackbox test to see if negative numbers work as well as positive values
    @Test
    public void bb1() {
        //ans = subtract 1-1, 1-5, 1-3
        int ans = Subtract(new int[]{1, 5, 3});
        assertEquals(-6, ans, .01);
        
        //test positive values
        int ans1 = Subtract(new int[]{10, 5, 3});
        assertEquals(12, ans, .01);
    }


}
