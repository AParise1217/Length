package com.parisesoftware.model.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeraUnitTest {


    @Test
    public void toStringShouldReturnCorrectString(){
        //setup base unit
        TeraUnit testUnit = new TeraUnit();

        assertEquals("terameter", testUnit.toString());
    }

}