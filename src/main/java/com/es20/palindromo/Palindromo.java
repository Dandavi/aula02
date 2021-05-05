package com.es20.palindromo;

public class Palindromo {

    public boolean LogicaPalindromo(String frase) {

        String replace = frase.replace("!", "").replace(" ", "").replace(",", "").replace("’", "").replace(".", "")
                .replace(" . ", "").replace("/", "").replace("-", "");

        String reversa2 = new StringBuffer(replace).reverse().toString();

        if (reversa2.toLowerCase().equals(replace.toLowerCase())) {
            System.out.println("Verdadeiro " + frase);
        } else {
            System.out.println("Falso " + frase);
        }
        return false;

    }

}
