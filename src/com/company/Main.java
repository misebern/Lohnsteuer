package com.company;

public class Main {

    public static void main(String[] args) {

        double lohnsteuer = berechneLohnsteuer(1000000);
        System.out.println("Ich muss " + lohnsteuer + " € Lohnsteuer bezahlen.");

    }

    public static double berechneLohnsteuer (int einkommen) {
        double lohnsteuer = 0;

        if (einkommen > 1000000) {
            lohnsteuer = (einkommen - 1000000) * 0.55 + 487880;
        } else if (einkommen > 90000) {
            lohnsteuer = (einkommen - 90000) * 0.50 + 32880;
        } else if (einkommen > 60000) {
            lohnsteuer = (einkommen - 60000) * 0.48 + 18480;
        } else if (einkommen > 31000) {
            lohnsteuer = (einkommen - 31000) * 0.42 + 6300;
        } else if (einkommen > 18000) {
            lohnsteuer = (einkommen - 18000) * 0.35 + 1750;
        } else if (einkommen > 11000) {
            lohnsteuer = (einkommen - 11000) * 0.25;
        }
        return lohnsteuer;

    }
}
