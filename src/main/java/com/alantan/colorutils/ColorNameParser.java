/*
 * MIT License
 *
 * Copyright 2023 Alan Tanaman
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the “Software”), to deal in
 * the Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the
 * Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
package com.alantan.colorutils;

import com.alantan.colorutils.util.CsvHelper;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public final class ColorNameParser {

    private static final Map<String, String> COLOR_NAME_MAP = new HashMap<>();

    static {
        try {
            try (InputStream inputStream =
                         ColorNameParser.class.getResourceAsStream(
                                 "/colornames.csv")) {
                CsvHelper.fromCsv(inputStream, ",")
                        .forEach((row) -> {
                            // Store both lowercase and compressed color names to support
                            // colors that have different hex values but the same name.
                            // For example, "Amber Glow" and "Amberglow" are different colors.
                            COLOR_NAME_MAP.put(compressColorName(row.get(0)), row.get(1));
                            COLOR_NAME_MAP.put(normalizeColorName(row.get(0)), row.get(1));
                        });
            }
        } catch (IOException ignored) {
        }
    }

    private ColorNameParser() {
        // Prevent instantiation
    }

    public static Color parse(final String colorName) {
        // Priority is for the more accurate version
        String hex = COLOR_NAME_MAP.get(normalizeColorName(colorName));
        if (hex == null) {
            hex = COLOR_NAME_MAP.get(compressColorName(colorName));
        }
        return hex == null ? null : Color.decode(hex);
    }

    private static String compressColorName(final String colorName) {
        return normalizeColorName(colorName)
                .replaceAll("[^a-zA-Z0-9]", "");
    }

    private static String normalizeColorName(final String colorName) {
        return colorName.toLowerCase()
                .replace("grey", "gray");
    }
}
