package com.blu4ck.converter.length;

import com.blu4ck.converter.length.model.LengthUnit;

public interface LengthConverter {
    double lengthConvert(double value, LengthUnit from, LengthUnit to);
}
