package com.parisesoftware.comparator;

/**
 * @author  Andrew Parise
 * @since   June 2, 2018
 * @version June 2, 2018
 */
public enum EqualityType {
    greaterThan {
        @Override
        public String toString(){
            return "greater than";
        }
    },
    equalTo {
        @Override
        public String toString(){
            return "equal to";
        }
    },
    lessThan {
        @Override
        public String toString(){
            return "less than";
        }
    }
}
