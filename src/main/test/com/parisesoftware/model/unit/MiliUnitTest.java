package com.parisesoftware.model.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiliUnitTest {


    @Test
    public void toStringShouldReturnCorrectString(){
        //setup base unit
        MiliUnit testUnit = new MiliUnit();

        assertEquals("milimeter", testUnit.toString());
    }

}