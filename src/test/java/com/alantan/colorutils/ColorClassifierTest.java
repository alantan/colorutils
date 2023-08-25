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

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.alantan.colorutils.model.ColorClassification;
import com.alantan.colorutils.model.Hsb;
import java.awt.Color;
import org.junit.jupiter.api.Test;

public class ColorClassifierTest {

    @Test
    void testColorHelper_black() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(0, 0, 0), "Black"),
        };
        testAll(testCases, ColorClassification.BLACK);
    }

    @Test
    void testColorHelper_blue() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(  0, 127, 255), "Azure"),
                new ColorClassifierTestCase(new Color(  0, 128, 128), "Teal"),
                new ColorClassifierTestCase(new Color(  0, 149, 182), "Bondi Blue"),
                new ColorClassifierTestCase(new Color(  0, 153, 204), "Tomb Blue"),
                new ColorClassifierTestCase(new Color(  0, 191, 255), "Capri"),
                new ColorClassifierTestCase(new Color(  0, 204, 255), "Vivid Sky Blue"),
                new ColorClassifierTestCase(new Color(  0, 255, 255), "Aqua"),
                new ColorClassifierTestCase(new Color(  1, 103, 149), "Peacock blue"),
                new ColorClassifierTestCase(new Color( 28, 169, 201), "Pacific Blue"),
                new ColorClassifierTestCase(new Color( 49, 110, 160), "Lochmara"),
                new ColorClassifierTestCase(new Color( 85, 170, 238), "Cerulean"),
                new ColorClassifierTestCase(new Color( 93, 138, 168), "Air Force blue"),
                new ColorClassifierTestCase(new Color(108, 145, 197), "Cornflower blue"),
                new ColorClassifierTestCase(new Color(109, 155, 195), "Cerulean Frost"),
                new ColorClassifierTestCase(new Color(117, 141, 163), "Blue-gray"),
                new ColorClassifierTestCase(new Color(120, 177, 191), "Glacier"),
                new ColorClassifierTestCase(new Color(170, 212, 209), "Eton Blue"),
                new ColorClassifierTestCase(new Color(174, 198, 207), "Pastel blue"),
                new ColorClassifierTestCase(new Color(175, 238, 238), "Mint macaron"),
                new ColorClassifierTestCase(new Color(176, 224, 230), "Powder blue"),
                new ColorClassifierTestCase(new Color(123, 242, 218), "Tiffany blue"),
                new ColorClassifierTestCase(new Color(208, 254, 254), "Pale blue"),
                // Not yet in database:
//                new ColorClassifierTestCase(new Color(160, 209, 202), "Shelduck blue"),
        };
        testAll(testCases, ColorClassification.BLUE);
    }

    @Test
    void testColorHelper_brown() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color( 61,  43,  31), "Bistre"),
                new ColorClassifierTestCase(new Color( 89,  58,  39), "Weathered bamboo"),
                new ColorClassifierTestCase(new Color(101,  55,   0), "Brown"),
                new ColorClassifierTestCase(new Color(111,  78,  55), "Coffee"),
                new ColorClassifierTestCase(new Color(128,  70,  27), "Russet"),
                new ColorClassifierTestCase(new Color(146, 111,  91), "Beaver"),
                new ColorClassifierTestCase(new Color(159, 104,  89), "Russet Red"),
                new ColorClassifierTestCase(new Color(188, 143, 143), "Rosy Brown"),
                new ColorClassifierTestCase(new Color(222, 184, 135), "Burly Wood"),
                // Not yet in database:
//                new ColorClassifierTestCase(new Color(106,  67,  45), "Aloewood-color"),
//                new ColorClassifierTestCase(new Color(150,  75,   0), "Brown (traditional)"),
        };
        testAll(testCases, ColorClassification.BROWN);
    }

    @Test
    void testColorHelper_gray() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(54,   55,  55), "Dark Gray"),
                new ColorClassifierTestCase(new Color(128, 128, 128), "Gray"),
                new ColorClassifierTestCase(new Color(170, 170, 170), "Dhūsar Grey"),
                new ColorClassifierTestCase(new Color(192, 192, 192), "Silver"),
        };
        testAll(testCases, ColorClassification.GRAY);
    }

    @Test
    void testColorHelper_green() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(  0, 128,   0), "Office Green"),
                new ColorClassifierTestCase(new Color(  0, 255,   0), "Lime"),
                new ColorClassifierTestCase(new Color(  0, 255, 127), "Mint Green"),
                new ColorClassifierTestCase(new Color( 86, 130,   3), "Avocado"),
                new ColorClassifierTestCase(new Color(107, 142,  35), "Olive Drab"),
                new ColorClassifierTestCase(new Color(124, 252,   0), "Lawn green"),
                new ColorClassifierTestCase(new Color(127, 255,   0), "Chartreuse"),
                new ColorClassifierTestCase(new Color(127, 255, 212), "Aquamarine"),
                new ColorClassifierTestCase(new Color(128, 128,   0), "Olive"),
                new ColorClassifierTestCase(new Color(143, 188, 143), "Dark Sea Green"),
                new ColorClassifierTestCase(new Color(152, 251, 152), "Pale green"),
                new ColorClassifierTestCase(new Color(159, 226, 191), "Sea foam green"),
                new ColorClassifierTestCase(new Color(173, 255,  47), "Spring green"),
                new ColorClassifierTestCase(new Color(204, 240, 112), "Light Lime"),
                new ColorClassifierTestCase(new Color(205, 220,  57), "Pear"),
        };
        testAll(testCases, ColorClassification.GREEN);
    }

    @Test
    void testColorHelper_orange() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(187, 119,  46), "Copper Orange"),
                new ColorClassifierTestCase(new Color(195,  82,  20), "Alloy Orange"),
                new ColorClassifierTestCase(new Color(201, 153,  93), "Vintage Orange"),
                new ColorClassifierTestCase(new Color(205,  87,   0), "Tawny Red"),
                new ColorClassifierTestCase(new Color(205, 127,  50), "Bronze Orange"),
                new ColorClassifierTestCase(new Color(205, 133,  63), "Copper"),
                new ColorClassifierTestCase(new Color(207,  91,  46), "Medium Vermilion"),
                new ColorClassifierTestCase(new Color(210, 105,  30), "Chocolate Orange"),
                new ColorClassifierTestCase(new Color(210, 105,  30), "Chocolate"),
                new ColorClassifierTestCase(new Color(210, 105,  30), "Cocoa Brown"),
                new ColorClassifierTestCase(new Color(217, 116,  72), "Copper Red"),
                new ColorClassifierTestCase(new Color(224, 141,  60), "Tiger's Eye Orange"),
                new ColorClassifierTestCase(new Color(228,  77,  46), "Cinnabar Red"),
                new ColorClassifierTestCase(new Color(230, 128,   0), "Fulvous"),
                new ColorClassifierTestCase(new Color(230, 129,  47), "Cadmium Orange"),
                new ColorClassifierTestCase(new Color(237, 201, 175), "Desert Sand Orange"),
                new ColorClassifierTestCase(new Color(240,  97,   5), "Spanish Orange"),
                new ColorClassifierTestCase(new Color(241, 180,  47), "Xanthous Orange"),
                new ColorClassifierTestCase(new Color(242, 143,  28), "Beer Orange"),
                new ColorClassifierTestCase(new Color(242, 202, 133), "Buff Orange"),
                new ColorClassifierTestCase(new Color(244, 164,  96), "Sandy Brown"),
                new ColorClassifierTestCase(new Color(247, 127,   0), "University Of Tennessee Orange"),
                new ColorClassifierTestCase(new Color(250, 186,  95), "Rajah"),
                new ColorClassifierTestCase(new Color(255,  99,  71), "Tomato"),
                new ColorClassifierTestCase(new Color(255, 127,  80), "Coral"),
                new ColorClassifierTestCase(new Color(255, 140,   0), "Dark Orange"),
                new ColorClassifierTestCase(new Color(255, 153,  51), "Deep Saffron"),
                new ColorClassifierTestCase(new Color(255, 160, 122), "Light Salmon"),
                new ColorClassifierTestCase(new Color(255, 203, 164), "Deep Peach"),
                new ColorClassifierTestCase(new Color(255, 218, 185), "Peach puff"),
                new ColorClassifierTestCase(new Color(255, 222, 173), "Navajo White"),
                new ColorClassifierTestCase(new Color(255, 228, 196), "Bisque"),
                new ColorClassifierTestCase(new Color(255, 239, 213), "Papaya whip"),
        };
        testAll(testCases, ColorClassification.ORANGE);
    }

    @Test
    void testColorHelper_pink() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(204,   0, 204), "Deep magenta"),
                new ColorClassifierTestCase(new Color(221, 160, 221), "Plum"),
                new ColorClassifierTestCase(new Color(238, 130, 238), "Violet"),
                new ColorClassifierTestCase(new Color(255,   0, 255), "Fuchsia/Magenta"),
                new ColorClassifierTestCase(new Color(255,  20, 147), "Deep Pink"),
                new ColorClassifierTestCase(new Color(255, 105, 180), "Hot Pink"),
                new ColorClassifierTestCase(new Color(255, 119, 255), "Fuchsia pink"),
                new ColorClassifierTestCase(new Color(255, 182, 193), "Light Pink"),
                new ColorClassifierTestCase(new Color(255, 183, 197), "Cherry blossom pink"),
                new ColorClassifierTestCase(new Color(255, 192, 203), "Pink"),
        };
        testAll(testCases, ColorClassification.PINK);
    }

    @Test
    void testColorHelper_purple() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color( 48,  25,  52), "Dark purple"),
                new ColorClassifierTestCase(new Color(106,  90, 205), "Slate blue"),
                new ColorClassifierTestCase(new Color(128,   0, 128), "Purple"),
                new ColorClassifierTestCase(new Color(138,  43, 226), "Blue violet"),
                new ColorClassifierTestCase(new Color(138, 130, 220), "Wedgwood blue"),
                new ColorClassifierTestCase(new Color(139,   0, 139), "Dark magenta"),
                new ColorClassifierTestCase(new Color(147, 112, 219), "Medium purple"),
                new ColorClassifierTestCase(new Color(148,   0, 211), "Dark violet"),
                new ColorClassifierTestCase(new Color(153,  50, 204), "Dark orchid"),
                new ColorClassifierTestCase(new Color(153, 102, 204), "Amethyst"),
                new ColorClassifierTestCase(new Color(155,  48, 255), "Veronica blue"),
                new ColorClassifierTestCase(new Color(160,  32, 240), "Veronica red"),
                new ColorClassifierTestCase(new Color(172, 172, 230), "Max blue purple"),
                new ColorClassifierTestCase(new Color(173, 186, 227), "French Lilac blue"),
                new ColorClassifierTestCase(new Color(192, 192, 255), "Lavender blue"),
                new ColorClassifierTestCase(new Color(216, 122, 240), "Medium orchid"),
                new ColorClassifierTestCase(new Color(216, 191, 216), "Thistle"),
                new ColorClassifierTestCase(new Color(218, 112, 214), "Orchid"),
        };
        testAll(testCases, ColorClassification.PURPLE);
    }

    @Test
    void testColorHelper_red() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color( 78,  22,  9), "French Puce Red"),
                new ColorClassifierTestCase(new Color( 80,  20, 22), "Burgundy"),
                new ColorClassifierTestCase(new Color( 88,  17, 26), "Chocolate Cosmos Red"),
                new ColorClassifierTestCase(new Color( 94,  25, 20), "Sangria"),
                new ColorClassifierTestCase(new Color(124,  10,  2), "Barn Red"),
                new ColorClassifierTestCase(new Color(124,  28,  5), "Kenyan Copper Red"),
                new ColorClassifierTestCase(new Color(124,  48, 48), "Tuscan Red"),
                new ColorClassifierTestCase(new Color(126,  40, 17), "Brick"),
                new ColorClassifierTestCase(new Color(128,   0, 32), "Oxblood Red"),
                new ColorClassifierTestCase(new Color(137,  63, 69), "Cordovan Red"),
                new ColorClassifierTestCase(new Color(138,  51, 36), "Burnt Umber"),
                new ColorClassifierTestCase(new Color(157,  41, 51), "Japanese Carmine"),
                new ColorClassifierTestCase(new Color(165,  42, 42), "Auburn / Chestnut"),
                new ColorClassifierTestCase(new Color(169,  17,  1), "Turkey Red"),
                new ColorClassifierTestCase(new Color(178,  34, 34), "Fire Brick"),
                new ColorClassifierTestCase(new Color(184,  15, 10), "Crimson"),
                new ColorClassifierTestCase(new Color(194,  24,  7), "Chili Red"),
                new ColorClassifierTestCase(new Color(205,  92, 92), "Indian Red"),
                new ColorClassifierTestCase(new Color(226, 114, 91), "Terracotta"),
                new ColorClassifierTestCase(new Color(233, 116, 81), "Light Red Ochre"),
                new ColorClassifierTestCase(new Color(255,  36,  0), "Coquelicot"),
                new ColorClassifierTestCase(new Color(255,  36,  0), "Lust Red"),
                new ColorClassifierTestCase(new Color(255,  69,  0), "Orange Red"),
                new ColorClassifierTestCase(new Color(255,  83, 73), "Red Orange"),
        };
        testAll(testCases, ColorClassification.RED);
    }

    @Test
    void testColorHelper_white() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(211, 211, 211), "Light Gray"),
                new ColorClassifierTestCase(new Color(220, 220, 220), "Gainsboro"),
                new ColorClassifierTestCase(new Color(224, 255, 224), "Pastel mint"),
                new ColorClassifierTestCase(new Color(230, 230, 250), "Lavender Mist"),
                new ColorClassifierTestCase(new Color(239, 222, 205), "Almond"),
                new ColorClassifierTestCase(new Color(239, 224, 205), "Buttercream"),
                new ColorClassifierTestCase(new Color(240, 248, 255), "Alice blue"),
                new ColorClassifierTestCase(new Color(245, 245, 220), "Beige"),
                new ColorClassifierTestCase(new Color(245, 245, 245), "White Smoke"),
                new ColorClassifierTestCase(new Color(245, 255, 250), "Mint Cream"),
                new ColorClassifierTestCase(new Color(248, 248, 255), "Ghost White"),
                new ColorClassifierTestCase(new Color(250, 235, 215), "Antique white"),
                new ColorClassifierTestCase(new Color(250, 240, 230), "Linen"),
                new ColorClassifierTestCase(new Color(255, 228, 225), "Misty Rose"),
                new ColorClassifierTestCase(new Color(255, 240, 245), "Lavender Blush"),
                new ColorClassifierTestCase(new Color(255, 248, 220), "Cornsilk"),
                new ColorClassifierTestCase(new Color(255, 250, 240), "Floral white"),
                new ColorClassifierTestCase(new Color(255, 250, 250), "Snow"),
                new ColorClassifierTestCase(new Color(255, 255, 255), "White"),
                new ColorClassifierTestCase(new Color(255, 255, 224), "Light Yellow"),
                new ColorClassifierTestCase(new Color(255, 255, 240), "Ivory"),
        };
        testAll(testCases, ColorClassification.WHITE);
    }

    @Test
    void testColorHelper_yellow() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(238, 232, 170), "Pale Goldenrod"),
                new ColorClassifierTestCase(new Color(240, 230, 140), "Light Khaki"),
                new ColorClassifierTestCase(new Color(255, 250, 205), "Lemon Chiffon"),
                new ColorClassifierTestCase(new Color(255, 255,   0), "Yellow"),
                new ColorClassifierTestCase(new Color(255, 255, 102), "Laser Lemon"),
                new ColorClassifierTestCase(new Color(255, 255, 153), "Canary"),
                new ColorClassifierTestCase(new Color(255, 255, 204), "Cream"),
                new ColorClassifierTestCase(new Color(238, 220, 130), "Flax"),
                new ColorClassifierTestCase(new Color(228, 220, 130), "Greenish Flax"),
        };
        testAll(testCases, ColorClassification.YELLOW);
    }

    private void testAll(
            final ColorClassifierTestCase[] testCases,
            final ColorClassification expectedClassification) {
        for (ColorClassifierTestCase testCase : testCases) {
            ColorClassification actualClassification =
                    ColorClassifier.getClassification(testCase.color);
            assertEquals(
                    expectedClassification,
                    actualClassification,
                    "Color=" + testCase.color
                            + ", HSB=" + Hsb.from(testCase.color));
            assertEquals(
                    testCase.color,
                    ColorNameParser.parse(testCase.name));
        }
    }

    private static final class ColorClassifierTestCase {
        private final Color color;
        private final String name;

        private ColorClassifierTestCase(
                final Color color, final String name) {
            this.color = color;
            this.name = name;
        }
    }
}
