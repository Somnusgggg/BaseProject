package Somnusgggg;

import org.junit.Test;

import static org.junit.Assert.*;

public class OPOPTest {
    @Test
    public void getType() throws Exception {
        double a=10,b=4,c=5;

        OPOP triangle = new OPOP(a,b,c);

        String test = triangle.getType();


    }

}
