package com.example.testtextcounter.utils;

public class ElementsCalculator {
    public static int getCharsCount(String inputText) {
        if (inputText != null) {
            return inputText.length();
        }
        return 0;
    }
}
