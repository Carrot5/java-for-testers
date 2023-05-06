package com.serenitydojo.datatypes;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStrings {

    @Test
    public void convertToLowerCase() {
        String bookTitle = "The Cat In The Hat";

        String lowerCaseTitle = bookTitle.toLowerCase();
        // TODO: Convert the book title to lower case and assign it to the lowerCaseTitle variable


        System.out.println(lowerCaseTitle);


        assertThat(lowerCaseTitle, equalTo("the cat in the hat"));

    }


    @Test
    public void convertToUpperCase() {
        String bookTitle = "The Cat In The Hat";

        String upperCaseTitle = bookTitle.toUpperCase();
        // TODO: Convert the book title to upper case and assign it to the upperCaseTitle variable

        System.out.println(upperCaseTitle);

        assertThat(upperCaseTitle, equalTo("THE CAT IN THE HAT"));
    }

    @Test
    public void trimExtraSpaces() {
        String bookTitle = "  The Cat In The Hat    ";

        String trimmedTitle = bookTitle.trim();
        // TODO: Trim the spaces before and after the title text

        System.out.println(trimmedTitle);

        assertThat(trimmedTitle, equalTo("The Cat In The Hat"));
    }

    @Test
    public void findTheLengthOfAString() {
        String bookTitle = "The Cat In The Hat";

        int length = 0;
        // TODO: Find the number of characters in the string

        length = bookTitle.length();
        System.out.println(length);

        assertThat(length, equalTo(18));
    }

    @Test
    public void replacingAText() {
        String bookTitle = "The Cat In The Hat";

        String updatedTitle = bookTitle.replace("Cat", "Dog");
        // TODO: Replace the word "Cat" with "Dog

        System.out.println(updatedTitle);

        assertThat(updatedTitle, equalTo("The Dog In The Hat"));
    }
}
