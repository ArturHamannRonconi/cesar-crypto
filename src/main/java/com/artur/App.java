package com.artur;

import com.artur.utils.Crypto;

public final class App {
    private App() {
        var code = Crypto.encode("text");
        var text = Crypto.decode(code);

        System.out.println(code);
        System.out.println(text);
    }

    public static void main(String[] args) {
        new App();
    }
}
