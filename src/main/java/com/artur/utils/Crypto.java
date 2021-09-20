package com.artur.utils;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;

public class Crypto {
    private Crypto() {  }

    public static String encode(String text) {
        IntFunction<Character> intToChars =
        intCharacter -> (char) (intCharacter + 4);

        BiFunction<StringBuilder, Character, StringBuilder> concatenate =
            (stringBuilder, character) -> stringBuilder.append(character);

        BinaryOperator<StringBuilder> create =
            (str1, str2) -> str1.append(str2);

        return text.chars()
            .mapToObj(intToChars)
            .reduce(new StringBuilder(), concatenate, create)
            .toString();
    }

    public static String decode(String code) {
        IntFunction<Character> intToChars =
        intCharacter -> (char) (intCharacter - 4);

        BiFunction<StringBuilder, Character, StringBuilder> concatenate =
            (stringBuilder, character) -> stringBuilder.append(character);

        BinaryOperator<StringBuilder> create =
            (str1, str2) -> str1.append(str2);

        return code.chars()
            .mapToObj(intToChars)
            .reduce(new StringBuilder(), concatenate, create)
            .toString();

    }
}
