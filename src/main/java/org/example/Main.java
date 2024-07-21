package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BuilderAraba araba = BuilderAraba.BuilderArabaBuilder.aBuilderAraba()
                .withMarka("Ford")
                .withModel("Focus")
                .withVitesTipi("Manuel")
                .withFiyat(600000)
                .build();
        System.out.println(araba);

        Singleton arabaSür = Singleton.getInstance();

        // Metodu çağırmak
        arabaSür.arabayıSür();






    }
}