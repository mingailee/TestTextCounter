package com.example.testtextcounter;

import com.example.testtextcounter.utils.NumbersCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NumberCalculatorUnitTset {

    // Kai įdedami tik tarpai ir skaičiai
    @Test
    public void Given_StringOfMultipleEmptySpacesWithNumbers_When_getNumbersCountIsCalled_Then_ReturnNumberOfOnlyNumbers(){
        final String givenString = " 2 3 6 5";

        final int expectedResult = 4;
        final int actualResult = NumbersCalculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    //Kai įvedamas "normalus" tekstas be skaičių
    @Test
    public void Given_TextString_When_getNumbersCountIsCalled_Then_ReturnZeroOfNumbers(){
        final String givenString = "How many elements are?";

        final int expectedResult = 0;
        final int actualResult = NumbersCalculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    //Kai įvedami įvairus simboliai su skaičiais ir pan.
    @Test
    public void Given_SymbolsNumbersString_When_getNumbersCountIsCalled_Then_ReturnNumberOfOnlyNumbers(){
        final String givenString = "5+5=10, %&*#?";

        final int expectedResult =4;
        final int actualResult = NumbersCalculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    //Kai įvedami tik skaičiai
    @Test
    public void Given_Numbers_When_getNumbersCountIsCalled_Then_ReturnNumberOfNumbers(){
        final String givenString = "1997 05 12";

        final int expectedResult =8;
        final int actualResult = NumbersCalculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
}