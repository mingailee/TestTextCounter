package com.example.testtextcounter;

import com.example.testtextcounter.utils.WordsCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordsCalculatorUnitTest {
    // Kai įdedami tik tarpai
    @Test
    public void Given_StringOfMultipleEmptySpaces_When_getWordsCountIsCalled_Then_ReturnZero(){
        final String givenString = "     ";

        final int expectedResult = 0;
        final int actualResult = WordsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    //Kai įvedamas "normalus" tekstas
    @Test
    public void Given_TextString_When_getWordsCountIsCalled_Then_ReturnNumberOfWords(){
        final String givenString = "Hello world!";

        final int expectedResult = 2;
        final int actualResult = WordsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    //Kai įvedami įvairus simbolių ir skaičių grupės su tarpais tarp jų, skaičiuojami kaip žodžiai
    @Test
    public void Given_SymbolsNumbersString_When_getWordsCountIsCalled_Then_ReturnNumberOfSeparateSymbolsGroupsSeparatedBySpacesAsWords(){
        final String givenString = "5+5=10, %&*#?";

        final int expectedResult =2;
        final int actualResult = WordsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    //Kai įvedami tik skaičiai su tarpais skaičiuojama kaip žodžiai
    @Test
    public void Given_Numbers_When_getWordsCountIsCalled_Then_ReturnNumberOfNumberGropusAsWords(){
        final String givenString = "1997 12 05";

        final int expectedResult =3;
        final int actualResult = WordsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
}