
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

// This test class does not really do anything that makes sense, it just 
// creates one test that passes and one that fails. 
public class Tests5 {

	@Test
    public void equal1() {
        assertEquals(4.0, 4.00, .01);
    }

    @Test
    public void shouldFail2() {
        assertEquals(4.0, 3.00, .01);
    }


}