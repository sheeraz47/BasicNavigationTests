package com.cbt.utilities;

public class StringUtilities {

    public static void verifyEquals(String expected, String actual){

        if(expected.equals(actual)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Expected is "+ expected);
            System.out.println("Actual is "+actual);
        }

    }


}
