package com.poly.testmaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    
    @Test
    public void testSum() {
        Caculator cal = new Caculator();
        // Mong đợi: 2 + 3 = 5
        Assert.assertEquals(cal.sum(2, 3), 5);
    }

    @Test
    public void testSub() {
        Caculator cal = new Caculator();
        // Mong đợi: 5 - 2 = 3
        Assert.assertEquals(cal.sub(5, 2), 3);
    }
}