package com.artur.utils;

import java.util.function.IntFunction;

public class Crypto {
    private Crypto() {  }

    public static String encode(String text) {
        IntFunction<StringBuilder> addToCharacter =
            intCharacter -> new StringBuilder()
                .appendCodePoint(intCharacter + 4);

        return text.chars()
            .mapToObj(addToCharacter)
            .reduce(new StringBuilder(), StringBuilder::append)
            .toString();
    }

    public static String decode(String code) {
        IntFunction<StringBuilder> addToCharacter =
            intCharacter -> new StringBuilder()
                .appendCodePoint(intCharacter - 4);

        return code.chars()
            .mapToObj(addToCharacter)
            .reduce(new StringBuilder(), StringBuilder::append)
            .toString();
    }
}
