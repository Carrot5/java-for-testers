package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Nas {
    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void weightInPounds() {
        int weightInKilograms = 50;
        double weightInPounds = 0;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds

        weightInPounds = weightInKilograms * 2.20462;

        assertThat(weightInPounds, equalTo(110.231));

    }
@Test
    public void workingWithStrings () {
        String firstName = "Stefan";

        String upperCaseFirstName = firstName.toUpperCase();

        System.out.println(upperCaseFirstName);

    }

}
