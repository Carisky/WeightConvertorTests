package org.example;

import org.example.WeightConverter.WeightConverter;

public class Main {
    public static void main(String[] args) {
        // Example weight in milligrams
        double weightInMilligrams = 2500.0;

        // Convert milligrams to grams
        double weightInGrams = WeightConverter.convertMilligramsToGrams(weightInMilligrams);
        System.out.println("Weight in grams: " + weightInGrams);

        // Convert grams to kilograms
        double weightInKilograms = WeightConverter.convertGramsToKilograms(weightInGrams);
        System.out.println("Weight in kilograms: " + weightInKilograms);

        // Convert kilograms to centners
        double weightInCentners = WeightConverter.convertKilogramsToCentners(weightInKilograms);
        System.out.println("Weight in centners: " + weightInCentners);

        // Convert kilograms to tons
        double weightInTons = WeightConverter.convertKilogramsToTons(weightInKilograms);
        System.out.println("Weight in tons: " + weightInTons);

        // Convert tons to kilograms
        double weightInKilogramsFromTons = WeightConverter.convertTonsToKilograms(weightInTons);
        System.out.println("Weight in kilograms from tons: " + weightInKilogramsFromTons);
    }
}
