package com.blu4ck.converter.length.service;

import com.blu4ck.converter.length.LengthConverter;
import com.blu4ck.converter.length.model.LengthUnit;

public class LConverter implements LengthConverter {
    @Override
    public double lengthConvert(double value, LengthUnit from, LengthUnit to) {
        if (from == null || to == null) {
            throw new IllegalArgumentException("Invalid units for length conversion.");
        }


                double meters = value;

                // Geleneksel switch-case yerine if-else kullanımı
                if (from == LengthUnit.KILOMETER) {
                    meters = value * 1000;
                } else if (from == LengthUnit.CENTIMETER) {
                    meters = value / 100;
                } else if (from == LengthUnit.MILLIMETER) {
                    meters = value / 1000;
                } else if (from == LengthUnit.MILE) {
                    meters = value * 1609.34;
                } else if (from == LengthUnit.YARD) {
                    meters = value * 0.9144;
                } else if (from == LengthUnit.FOOT) {
                    meters = value * 0.3048;
                } else if (from == LengthUnit.INCH) {
                    meters = value * 0.0254;
                }

                // Geleneksel switch-case yerine if-else kullanımı
                if (to == LengthUnit.KILOMETER) {
                    return meters / 1000;
                } else if (to == LengthUnit.CENTIMETER) {
                    return meters * 100;
                } else if (to == LengthUnit.MILLIMETER) {
                    return meters * 1000;
                } else if (to == LengthUnit.MILE) {
                    return meters / 1609.34;
                } else if (to == LengthUnit.YARD) {
                    return meters / 0.9144;
                } else if (to == LengthUnit.FOOT) {
                    return meters / 0.3048;
                } else if (to == LengthUnit.INCH) {
                    return meters / 0.0254;
                } else {
                    return meters; // Default case
                }
            }
        }

