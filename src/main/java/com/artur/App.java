package com.artur;

import com.artur.utils.Crypto;

public final class App {
    private App() {
        var code = Crypto.encode("text");
        var text = Crypto.decode(code);

        System.out.println(code);
    }

    public static void main(String[] args) {
        new App();
    }
}
