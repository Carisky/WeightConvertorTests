package org.example.WeightConverter;

public class WeightConverter {

    public static double convertMilligramsToGrams(double milligrams) {
        return milligrams / 1000.0;
    }

    public static double convertGramsToKilograms(double grams) {
        return grams / 1000.0;
    }

    public static double convertKilogramsToCentners(double kilograms) {
        return kilograms / 100.0;
    }

    public static double convertKilogramsToTons(double kilograms) {
        return kilograms / 1000.0;
    }

    public static double convertTonsToKilograms(double tons) {
        return tons * 1000.0;
    }
}
