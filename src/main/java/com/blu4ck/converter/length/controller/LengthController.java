package com.blu4ck.converter.length.controller;

import com.blu4ck.converter.length.LengthConverter;
import com.blu4ck.converter.length.model.LengthUnit;
import com.blu4ck.converter.length.service.LConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LengthController {

    private final LengthConverter lConverter = new LConverter();

    @GetMapping("/index/length")
    public double convertLength(@RequestParam double value,
                                @RequestParam LengthUnit from,
                                @RequestParam LengthUnit to) {
        return lConverter.lengthConvert(value, from, to);
    }
}
