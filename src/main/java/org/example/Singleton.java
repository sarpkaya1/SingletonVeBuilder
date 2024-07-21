package org.example;

public class Singleton {
    private static Singleton instance;


    private Singleton() {
        // Örneğin başlatılmasını önlemek için boş bırakıldı
    }


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Singleton sınıfına ait diğer metodlar
    public void arabayıSür() {
        System.out.println("Araba Sürüldü");
    }











}
