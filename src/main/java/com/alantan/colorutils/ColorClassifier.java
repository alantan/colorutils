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

import static com.alantan.colorutils.model.ColorClassification.BLACK;
import static com.alantan.colorutils.model.ColorClassification.BLUE;
import static com.alantan.colorutils.model.ColorClassification.BROWN;
import static com.alantan.colorutils.model.ColorClassification.GRAY;
import static com.alantan.colorutils.model.ColorClassification.GREEN;
import static com.alantan.colorutils.model.ColorClassification.ORANGE;
import static com.alantan.colorutils.model.ColorClassification.PINK;
import static com.alantan.colorutils.model.ColorClassification.PURPLE;
import static com.alantan.colorutils.model.ColorClassification.RED;
import static com.alantan.colorutils.model.ColorClassification.WHITE;
import static com.alantan.colorutils.model.ColorClassification.YELLOW;

import com.alantan.colorutils.model.ColorClassification;
import com.alantan.colorutils.model.Hsb;
import com.alantan.colorutils.model.HsbRange;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public final class ColorClassifier {

    /**
     * List of ranges that define the color classification.
     */
    private static final List<HsbRange> HSB_RANGES = createHsbRanges();

    private ColorClassifier() { }

    /**
     * Return classification for given color.
     * @param color Color
     * @return ColorClassification of color
     */
    public static ColorClassification getClassification(final Color color) {
        Hsb hsb = Hsb.from(color);
        for (HsbRange range : HSB_RANGES) {
            if (range.isInRange(hsb)) {
                return range.getClassification();
            }
        }
        return null;
    }

    /**
     * Return classification for given color name.
     * @param colorName Color name
     * @return ColorClassification of color
     */
    public static ColorClassification getClassification(final String colorName) {
        Color color = ColorNameParser.parse(colorName);
        return color == null ? null : getClassification(color);
    }

    private static List<HsbRange> createHsbRanges() {
        List<HsbRange> hsbRanges = new ArrayList<>();
        // Black
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(0, 360)
                .saturation(0, 100)
                .brightness(0, 15)
                .classification(BLACK)
                .build());
        // Brown
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(-15, 15)
                .saturation(15, 40)
                .brightness(15, 100)
                .classification(BROWN)
                .build());
        // Red
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(-15, 8)
                .saturation(40, 100)
                .brightness(15, 100)
                .classification(RED)
                .build());
        // Red
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(8, 15)
                .saturation(40, 100)
                .brightness(15, 80)
                .classification(RED)
                .build());
        // Red
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(8, 15)
                .saturation(40, 65)
                .brightness(80, 100)
                .classification(RED)
                .build());
        // Reddish Orange
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(8, 10)
                .saturation(65, 100)
                .brightness(80, 100)
                .classification(ORANGE)
                .build());
        // Orange Red
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(10, 15)
                .saturation(65, 100)
                .brightness(80, 100)
                .classification(RED)
                .build());
        // Brown
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(15, 45)
                .saturation(15, 50)
                .brightness(15, 90)
                .classification(BROWN)
                .build());
        // Orange
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(15, 45)
                .saturation(15, 50)
                .brightness(90, 100)
                .classification(ORANGE)
                .build());
        // Brown
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(15, 45)
                .saturation(50, 100)
                .brightness(15, 60)
                .classification(BROWN)
                .build());
        // Orange
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(15, 20)
                .saturation(50, 90)
                .brightness(60, 100)
                .classification(ORANGE)
                .build());
        // Orange
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(15, 20)
                .saturation(90, 100)
                .brightness(60, 90)
                .classification(ORANGE)
                .build());
        // Orange-like Red
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(15, 20)
                .saturation(90, 100)
                .brightness(90, 100)
                .classification(RED)
                .build());
        // Orange
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(20, 45)
                .saturation(50, 100)
                .brightness(60, 100)
                .classification(ORANGE)
                .build());
        // Olive
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(45, 65)
                .saturation(15, 100)
                .brightness(15, 88)
                .classification(GREEN)
                .build());
        // Yellow
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(45, 65)
                .saturation(15, 100)
                .brightness(88, 100)
                .classification(YELLOW)
                .build());
        // Light green
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(65, 105)
                .saturation(15, 100)
                .brightness(15, 100)
                .classification(GREEN)
                .build());
        // Green
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(105, 135)
                .saturation(15, 100)
                .brightness(15, 100)
                .classification(GREEN)
                .build());
        // Green
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(135, 165)
                .saturation(15, 100)
                .brightness(15, 100)
                .classification(GREEN)
                .build());
        // Turquoise
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(165, 195)
                .saturation(15, 100)
                .brightness(15, 100)
                .classification(BLUE)
                .build());
        // Light blue
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(195, 225)
                .saturation(15, 100)
                .brightness(15, 100)
                .classification(BLUE)
                .build());
        // blue
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(225, 255)
                .saturation(15, 100)
                .brightness(15, 65)
                .classification(BLUE)
                .build());
        // bluish purple
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(225, 255)
                .saturation(15, 100)
                .brightness(65, 100)
                .classification(PURPLE)
                .build());
        // Purple
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(255, 290)
                .saturation(15, 100)
                .brightness(15, 100)
                .classification(PURPLE)
                .build());
        // Purple
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(290, 315)
                .saturation(15, 100)
                .brightness(15, 70)
                .classification(PURPLE)
                .build());
        // Purplish Pink
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(290, 315)
                .saturation(15, 100)
                .brightness(70, 100)
                .classification(PINK)
                .build());
        // Brown
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(315, 340)
                .saturation(15, 100)
                .brightness(15, 45)
                .classification(BROWN)
                .build());
        // Pink
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(315, 340)
                .saturation(15, 100)
                .brightness(45, 100)
                .classification(PINK)
                .build());
        // Brown
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(340, 360)
                .saturation(15, 100)
                .brightness(15, 30)
                .classification(BROWN)
                .build());
        // Pink
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(340, 360)
                .saturation(15, 45)
                .brightness(30, 100)
                .classification(PINK)
                .build());
        // Red
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(340, 360)
                .saturation(45, 100)
                .brightness(30, 100)
                .classification(RED)
                .build());
        // Gray
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(0, 360)
                .saturation(0, 15)
                .brightness(15, 51)
                .classification(GRAY)
                .build());
        // Light gray
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(0, 360)
                .saturation(0, 15)
                .brightness(51, 82)
                .classification(GRAY)
                .build());
        // White
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(0, 360)
                .saturation(0, 10)
                .brightness(82, 100)
                .classification(WHITE)
                .build());
        // Red (high brightness)
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(-15, 15)
                .saturation(10, 15)
                .brightness(82, 90)
                .classification(RED)
                .build());
        // Orange (high brightness)
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(15, 45)
                .saturation(10, 15)
                .brightness(82, 90)
                .classification(ORANGE)
                .build());
        // Yellow (high brightness)
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(45, 75)
                .saturation(10, 15)
                .brightness(82, 90)
                .classification(YELLOW)
                .build());
        // green (high brightness)
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(75, 165)
                .saturation(10, 15)
                .brightness(82, 90)
                .classification(GREEN)
                .build());
        // blue (high brightness)
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(165, 255)
                .saturation(10, 15)
                .brightness(82, 90)
                .classification(BLUE)
                .build());
        // Purple (high brightness)
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(255, 315)
                .saturation(10, 15)
                .brightness(82, 90)
                .classification(PURPLE)
                .build());
        // Pink (high brightness)
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(315, 360)
                .saturation(10, 15)
                .brightness(82, 90)
                .classification(PINK)
                .build());
        // White (saturated, but extremely high brightness)
        hsbRanges.add(new HsbRange.HsbRangeBuilder()
                .hue(0, 360)
                .saturation(10, 15)
                .brightness(90, 100)
                .classification(WHITE)
                .build());
        return hsbRanges;
    }
}
