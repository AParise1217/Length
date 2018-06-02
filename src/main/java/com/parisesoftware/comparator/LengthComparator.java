package com.parisesoftware.comparator;

import com.parisesoftware.model.Length;

/**
 * @author  Andrew Parise
 * @since   June 2, 2018
 * @version June 2, 2018
 */
public class LengthComparator {

    /**
     * Default Constructor
     */
    public LengthComparator(){}

    /**
     * Compares two length objects
     *
     * @param length1   a Length to be compared
     * @param length2   a Length to be compared
     * @return  a comparison on their equivalence
     */
    public EqualityType compare(Length length1, Length length2){
        double lengthVal1 = length1.getUnit().Convert(length1.getValue());
        double lengthVal2 = length2.getUnit().Convert(length2.getValue());

        if(lengthVal1 < lengthVal2){
            return EqualityType.greaterThan;
        }else if(lengthVal1 > lengthVal2){
            return EqualityType.lessThan;
        }else{
            return EqualityType.equalTo;
        }
    }
}
