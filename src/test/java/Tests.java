
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

// This test class does not really do anything that makes sense, it just 
// creates one test that passes and one that fails. 
public class Tests {

	@Test
    public void equal() {
        assertEquals(4.0, 4.00, .01);
    }

    @Test
    public void equal2() {
        assertEquals(5, 5, .01);
    }


}