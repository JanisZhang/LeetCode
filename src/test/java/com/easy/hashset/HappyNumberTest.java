package com.easy.hashset;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HappyNumberTest {

    private HappyNumber happyNumber = new HappyNumber();

    @Test
    public void testHappyNumber(){
        assertTrue(happyNumber.isHappy(19));
        assertTrue(happyNumber.isHappy(7));
    }

    @Test
    public void testNotHappy(){
        assertFalse(happyNumber.isHappy(4));
        assertFalse(happyNumber.isHappy(2));
    }

}
