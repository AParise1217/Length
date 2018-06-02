package com.parisesoftware.model.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CentiUnitTest {


    @Test
    public void toStringShouldReturnCorrectString(){
        //setup base unit
        CentiUnit testUnit = new CentiUnit();

        assertEquals("centimeter", testUnit.toString());
    }

}