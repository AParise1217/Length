package com.parisesoftware.model;

import com.parisesoftware.model.unit.IUnit;
import com.parisesoftware.model.unit.MegaUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {

    @Test
    public void getUnitShouldReturnIUnitInstance(){
        //test data
        IUnit testUnit = new MegaUnit();

        //setup length object
        Length testLength = new Length();
        testLength.setUnit(testUnit);

        //assert
        assertEquals(testLength.getUnit(), testUnit);
    }

    @Test
    public void getValueShouldReturnCorrectNumber(){
        //test data
        int testValue = 55;

        //setup length object
        Length testLength = new Length();
        testLength.setValue(testValue);

        //assert
        assertEquals(testLength.getValue(), testValue, .1);
    }


}
