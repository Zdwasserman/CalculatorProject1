package mccann.kurt.calculator;

import org.junit.Test;
import static org.junit.Assert.*;


public class mathTest {
    @Test
    public void addTest(){
        CoreMath math = new CoreMath();
        double expected = math.add(5.0, 5.0);
        double actual = 10.0;
        assertEquals(expected, actual, 0);
    }
    @Test
    public void subtractTest(){
        CoreMath math = new CoreMath();
        double expected = math.subtract(5.0, 5.0);
        double actual = 0.0;
        assertEquals(expected, actual, 0);
    }
    @Test
    public void multiplyTest(){
        CoreMath math = new CoreMath();
        double expected = math.multiply(5.0, 5.0);
        double actual = 25.0;
        assertEquals(expected, actual, 0);
    }
    @Test
    public void divideTest(){
        CoreMath math = new CoreMath();
        double expected = math.divide(25.0, 5.0);
        double actual = 5.0;
        assertEquals(expected, actual, 0);
    }
    @Test
    public void squarertTest(){
        CoreMath math = new CoreMath();
        double expected = math.squareroot(25.0);
        double actual = 5.0;
        assertEquals(expected, actual, 0);
    }
    @Test
    public void squareTest(){
        CoreMath math = new CoreMath();
        double expected = math.square(5.0);
        double actual = 25.0;
        assertEquals(expected, actual, 0);
    }
    @Test
    public void exponentTest(){
        CoreMath math = new CoreMath();
        double expected = math.exponent(5, 2);
        double actual = 25.0;
        assertEquals(expected, actual, 0);
    }
    @Test
    public void invertTest(){
        CoreMath math = new CoreMath();
        double expected = math.invert(5);
        double actual = -5;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void logTest(){
        CoreMath math = new CoreMath();
        double expected = math.log(5);
        double actual = Math.log10(5);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void tenExpTest(){
        CoreMath math = new CoreMath();
        double expected = math.tenExp(5);
        double actual = Math.pow(10, 5);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void lnTest(){
        CoreMath math = new CoreMath();
        double expected = math.ln(5);
        double actual = Math.log(5);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void eToTheXGonGiveItToYaTest(){
        CoreMath math = new CoreMath();
        double expected = math.eToTheX(5);
        double actual = Math.exp(5);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void FactorialTest(){
        CoreMath math = new CoreMath();
        double expected = 120;
        double actual = math.factorial(5);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void cbrtTest(){
        CoreMath math = new CoreMath();
        double expected = Math.cbrt(5);
        double actual = math.cbrt(5);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void avgTestTest(){
        CoreMath math = new CoreMath();
        double expected = 10;
        double actual = math.avg(10, 10);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void sinTest(){
        TrigFunctions math = new TrigFunctions();
        boolean radians = true;
        double expected = Math.sin(10);
        double actual = math.sin(10, radians);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void cosTest(){
        TrigFunctions math = new TrigFunctions();
        boolean radians = true;
        double expected = Math.cos(10);
        double actual = math.cos(10, radians);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void tanTest(){
        TrigFunctions math = new TrigFunctions();
        boolean radians = true;
        double expected = Math.tan(10);
        double actual = math.tan(10, radians);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void insinTest(){
        TrigFunctions math = new TrigFunctions();
        double expected = 1.3420780265868293;
        double actual = math.insin(40.0);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void incosTest(){
        TrigFunctions math = new TrigFunctions();
        double expected = -1.4993896097676833 ;
        double actual = math.incos(40.0);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void incTanTest(){
        TrigFunctions math = new TrigFunctions();
        double expected = 0.6469135775440834;
        double actual = math.intan(40.0);
        assertEquals(expected, actual, 0);
    }
    @Test
    public void toggleRadsDegTest(){
        TrigFunctions math = new TrigFunctions();
        boolean radians = true;
        double expected =572.9577951308232;
        double actual = math.toggleRadsDeg(10.0, true);
        assertEquals(expected, actual, 0);
    }
}
