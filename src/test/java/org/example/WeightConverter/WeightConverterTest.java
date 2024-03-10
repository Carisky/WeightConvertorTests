package org.example.WeightConverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeightConverterTest {

    @Test
    void convertMilligramsToGrams() {
        assertEquals(2.5, WeightConverter.convertMilligramsToGrams(2500.0), 0.0001);
        assertEquals(0.0, WeightConverter.convertMilligramsToGrams(0.0), 0.0001);
    }

    @Test
    void convertGramsToKilograms() {
        assertEquals(2.5, WeightConverter.convertGramsToKilograms(2500.0), 0.0001);
        assertEquals(0.0, WeightConverter.convertGramsToKilograms(0.0), 0.0001);
    }

    @Test
    void convertKilogramsToCentners() {
        assertEquals(0.025, WeightConverter.convertKilogramsToCentners(2.5), 0.0001);
        assertEquals(0.0, WeightConverter.convertKilogramsToCentners(0.0), 0.0001);
    }

    @Test
    void convertKilogramsToTons() {
        assertEquals(2.5, WeightConverter.convertKilogramsToTons(2500.0), 0.0001);
        assertEquals(0.0, WeightConverter.convertKilogramsToTons(0.0), 0.0001);
    }

    @Test
    void convertTonsToKilograms() {
        assertEquals(2500.0, WeightConverter.convertTonsToKilograms(2.5), 0.0001);
        assertEquals(0.0, WeightConverter.convertTonsToKilograms(0.0), 0.0001);
    }
}
