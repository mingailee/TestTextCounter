package com.example.testtextcounter;

import com.example.testtextcounter.utils.ElementsCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ElementsCalculatorUnitTest {

    // Kai neįvedamas joks tekstas
    @Test
    public void Given_EmptyString_When_getCharsCountIsCalled_Then_ReturnZero(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    // Kai įdedami tik tarpai
    @Test
    public void Given_StringOfMultipleEmptySpaces_When_getCharsCountIsCalled_Then_ReturnNumberOfSpaces(){
        final String givenString = "   ";

        final int expectedResult = 3;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    //Kai įvedamas "normalus" tekstas
    @Test
    public void Given_TextString_When_getCharsCountIsCalled_Then_ReturnNumberOfElements(){
        final String givenString = "How many elements are?";

        final int expectedResult = 22;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    //Kai įvedami įvairus simboliai, skaičiai ir pan.
    @Test
    public void Given_SymbolsNumbersString_When_getCharsCountIsCalled_Then_ReturnNumberOfSymbols(){
        final String givenString = "5+5=10, %&*#?";

        final int expectedResult =13;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
}