package com.artur.utils;

public class Crypto {
    private Crypto() {  }

    public static String encode(String text) {
        var builder = new StringBuilder();

        for(byte i = 0; i < text.length(); i++) {
            var num = (int) text.charAt(i);
            var caractere = (char) (num + 4);

            builder.append(caractere);
        }

        return builder.toString();
    }

    public static String decode(String code) {
        var builder = new StringBuilder();

        for(byte i = 0; i < code.length(); i++) {
            var num = (int) code.charAt(i);
            var caractere = (char) (num - 4);

            builder.append(caractere);
        }

        return builder.toString();
    }
}
