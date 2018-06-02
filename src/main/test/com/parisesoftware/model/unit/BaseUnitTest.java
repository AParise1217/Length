package com.parisesoftware.model.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseUnitTest {


    @Test
    public void toStringShouldReturnMeter(){
        //setup base unit
        BaseUnit testUnit = new BaseUnit();

        assertEquals(testUnit.toString(), "meter");
    }

}