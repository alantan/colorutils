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
                new ColorClassifierTestCase(new Color(  0, 191, 255), "Capri"),
                new ColorClassifierTestCase(new Color(  0, 204, 255), "Vivid Sky Blue"),
        };
        testAll(testCases, ColorClassification.BLUE);
    }

    @Test
    void testColorHelper_gray_blue() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(  1, 103, 149), "Peacock blue"),
                new ColorClassifierTestCase(new Color( 49, 110, 160), "Lochmara"),
                new ColorClassifierTestCase(new Color( 76, 107, 136), "Wedgewood"),
                new ColorClassifierTestCase(new Color( 85, 170, 238), "Cerulean"),
                new ColorClassifierTestCase(new Color( 91, 124, 153), "Slate blue"),
                new ColorClassifierTestCase(new Color( 93, 138, 168), "Air Force blue"),
                new ColorClassifierTestCase(new Color(108, 145, 197), "Cornflower blue"),
                new ColorClassifierTestCase(new Color(109, 155, 195), "Cerulean Frost"),
                new ColorClassifierTestCase(new Color(117, 141, 163), "Blue-gray"),
                new ColorClassifierTestCase(new Color(162, 191, 254), "Pastel blue"),
                new ColorClassifierTestCase(new Color(174, 198, 207), "Roquefort blue"),
                new ColorClassifierTestCase(new Color(176, 224, 230), "Powder blue"),
        };
        testAll(testCases, ColorClassification.GRAY_BLUE);
    }

    @Test
    void testColorHelper_turquoise() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(  0, 128, 128), "Teal"),
                new ColorClassifierTestCase(new Color(  0, 149, 182), "Bondi Blue"),
                new ColorClassifierTestCase(new Color(  0, 153, 204), "Tomb Blue"),
                new ColorClassifierTestCase(new Color(  0, 255, 255), "Aqua"),
                new ColorClassifierTestCase(new Color( 28, 169, 201), "Pacific Blue"),
                new ColorClassifierTestCase(new Color(120, 177, 191), "Glacier"),
                new ColorClassifierTestCase(new Color(170, 212, 209), "Eton Blue"),
                new ColorClassifierTestCase(new Color(175, 238, 238), "Mint macaron"),
                new ColorClassifierTestCase(new Color(123, 242, 218), "Tiffany blue"),
                new ColorClassifierTestCase(new Color(208, 254, 254), "Pale blue"),
                // Not yet in database:
//                new ColorClassifierTestCase(new Color(160, 209, 202), "Shelduck blue"),
        };
        testAll(testCases, ColorClassification.TURQUOISE);
    }

    @Test
    void testColorHelper_brown() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color( 53,  40,  30), "Cocoa Brown"),
                new ColorClassifierTestCase(new Color( 61,  43,  31), "Bistre"),
                new ColorClassifierTestCase(new Color( 89,  58,  39), "Weathered bamboo"),
                new ColorClassifierTestCase(new Color(101,  55,   0), "Brown"),
                new ColorClassifierTestCase(new Color(111,  78,  55), "Coffee"),
                new ColorClassifierTestCase(new Color(116,  40,   2), "Chestnut"),
                new ColorClassifierTestCase(new Color(128,  70,  27), "Russet"),
                new ColorClassifierTestCase(new Color(146, 111,  91), "Beaver"),
                new ColorClassifierTestCase(new Color(153, 141, 124), "Light Khaki"),
                new ColorClassifierTestCase(new Color(154, 124,  99), "Tiger's Eye"),
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
        };
        testAll(testCases, ColorClassification.GRAY);
    }

    @Test
    void testColorHelper_gray_light() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(170, 170, 170), "Dhūsar Grey"),
                new ColorClassifierTestCase(new Color(192, 192, 192), "Silver"),
        };
        testAll(testCases, ColorClassification.LIGHT_GRAY);
    }

    @Test
    void testColorHelper_green() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(  0, 128,  15), "Office Green"),
                new ColorClassifierTestCase(new Color(  0, 255,   0), "Green"),
                new ColorClassifierTestCase(new Color(  0, 255, 124), "Spring green"),
                new ColorClassifierTestCase(new Color(  0, 255, 127), "Guppie Green"),
                new ColorClassifierTestCase(new Color( 46, 232, 187), "Aquamarine"),
                new ColorClassifierTestCase(new Color( 72, 125,  74), "Mint Green"),
                new ColorClassifierTestCase(new Color(105, 176, 118), "Pale green"),
                new ColorClassifierTestCase(new Color(127, 255, 212), "Hiroshima Aquamarine"),
                new ColorClassifierTestCase(new Color(143, 188, 143), "Tiki Monster"),
                new ColorClassifierTestCase(new Color(152, 251, 152), "Toxic Frog"),
                new ColorClassifierTestCase(new Color(159, 226, 191), "Bright Sea green"),
                new ColorClassifierTestCase(new Color(206, 240, 204), "Pastel mint"),
        };
        testAll(testCases, ColorClassification.GREEN);
    }

    @Test
    void testColorHelper_green_yellow() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color( 77, 164,   9), "Lawn green"),
                new ColorClassifierTestCase(new Color( 86, 130,   3), "Avocado"),
                new ColorClassifierTestCase(new Color(107, 142,  35), "Scallion"),
                new ColorClassifierTestCase(new Color(111, 118,  50), "Olive Drab"),
                new ColorClassifierTestCase(new Color(124, 252,   0), "Nuclear Waste"),
                new ColorClassifierTestCase(new Color(127, 255,   0), "Radium"),
                new ColorClassifierTestCase(new Color(153, 187, 136), "Sea foam green"),
                new ColorClassifierTestCase(new Color(170, 255,  50), "Lime"),
                new ColorClassifierTestCase(new Color(173, 255,  47), "Chestnut Shell"),
                new ColorClassifierTestCase(new Color(193, 248,  10), "Chartreuse"),
                new ColorClassifierTestCase(new Color(198, 234, 128), "Sulu"),
                new ColorClassifierTestCase(new Color(209, 226,  49), "Pear"),
        };
        testAll(testCases, ColorClassification.GREEN_YELLOW);
    }

    @Test
    void testColorHelper_green_olive() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color( 92,  97,  22), "Kirchner Green"),
                new ColorClassifierTestCase(new Color(102, 102,  85), "Dark Sea Green"),
                new ColorClassifierTestCase(new Color(128, 128,   0), "Heart Gold"),
                new ColorClassifierTestCase(new Color(128, 128,  16), "Olive"),
        };
        testAll(testCases, ColorClassification.OLIVE);
    }

    @Test
    void testColorHelper_orange() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(184, 115,  51), "Copper"),
                new ColorClassifierTestCase(new Color(196,  98,  16), "Alloy Orange"),
                new ColorClassifierTestCase(new Color(198,  81,   2), "Dark Orange"),
                new ColorClassifierTestCase(new Color(203, 104,  67), "Terracotta"),
                new ColorClassifierTestCase(new Color(205,  87,   0), "Tenné"),
                new ColorClassifierTestCase(new Color(205, 127,  50), "Polished Bronze"),
                new ColorClassifierTestCase(new Color(205, 133,  63), "Peru"),
                new ColorClassifierTestCase(new Color(210, 105,  30), "Chocolate"),
                new ColorClassifierTestCase(new Color(219, 147,  81), "Brushed Clay"),
                new ColorClassifierTestCase(new Color(220, 121,  62), "Amberglow"),
                new ColorClassifierTestCase(new Color(224, 141,  60), "Texas Longhorn"),
                new ColorClassifierTestCase(new Color(228, 132,   0), "Fulvous"),
                new ColorClassifierTestCase(new Color(232,  97,   0), "Spanish Orange"),
                new ColorClassifierTestCase(new Color(237, 135,  45), "Cadmium Orange"),
                new ColorClassifierTestCase(new Color(237, 201, 175), "Desert Sand"),
                new ColorClassifierTestCase(new Color(237, 220, 200), "Almond"),
                new ColorClassifierTestCase(new Color(241, 180,  47), "Xanthous"),
                new ColorClassifierTestCase(new Color(242, 154,  57), "Amber Glow"),
                new ColorClassifierTestCase(new Color(244, 164,  96), "Sandy Brown"),
                new ColorClassifierTestCase(new Color(247, 127,   0), "University Of Tennessee Orange"),
                new ColorClassifierTestCase(new Color(251, 171,  96), "Rajah"),
                new ColorClassifierTestCase(new Color(255, 127,  80), "Coral"),
                new ColorClassifierTestCase(new Color(255, 140,   0), "Sun Crete"),
                new ColorClassifierTestCase(new Color(255, 153,  50), "Deep Saffron"),
                new ColorClassifierTestCase(new Color(255, 160, 122), "Dwarven Peaches"),
                new ColorClassifierTestCase(new Color(255, 176,  95), "Vintage Orange"),
                new ColorClassifierTestCase(new Color(255, 187, 124), "Buff Orange"),
                new ColorClassifierTestCase(new Color(255, 203, 164), "Corn Kernel"),
                new ColorClassifierTestCase(new Color(255, 209, 175), "Papaya whip"),
                new ColorClassifierTestCase(new Color(255, 218, 185), "Peach puff"),
                new ColorClassifierTestCase(new Color(255, 222, 173), "Navajo White"),
                new ColorClassifierTestCase(new Color(255, 228, 196), "Bisque"),
                new ColorClassifierTestCase(new Color(255, 239, 213), "Biogenic Sand"),
                // Not yet in database:
//                new ColorClassifierTestCase(new Color(255, 160, 122), "Light Salmon"),
//                new ColorClassifierTestCase(new Color(255, 203, 164), "Deep Peach"),
        };
        testAll(testCases, ColorClassification.ORANGE);
    }

    @Test
    void testColorHelper_orange_red() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(255,  99,  71), "Bruschetta Tomato"),
        };
        testAll(testCases, ColorClassification.ORANGE_RED);
    }

    @Test
    void testColorHelper_pink() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(160,   2,  92), "Deep magenta"),
                new ColorClassifierTestCase(new Color(255,   2, 141), "Hot Pink"),
                new ColorClassifierTestCase(new Color(255,  20, 147), "Secret Story"),
                new ColorClassifierTestCase(new Color(255, 105, 180), "Girls Night Out"),
                new ColorClassifierTestCase(new Color(255, 182, 193), "Matt Pink"),
                new ColorClassifierTestCase(new Color(255, 183, 197), "Cherry blossom pink"),
                new ColorClassifierTestCase(new Color(255, 192, 203), "Pink"),
                new ColorClassifierTestCase(new Color(255, 209, 223), "Light Pink"),
        };
        testAll(testCases, ColorClassification.PINK_RED);
    }


    @Test
    void testColorHelper_pink_dark() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(204,   0, 204), "Screaming magenta"),
                new ColorClassifierTestCase(new Color(218, 112, 214), "Pink Orchid"),
                new ColorClassifierTestCase(new Color(221, 160, 221), "Damson Plum"),
                new ColorClassifierTestCase(new Color(237,  13, 217), "Fuchsia"),
                new ColorClassifierTestCase(new Color(238, 130, 238), "Mamie Pink"),
                new ColorClassifierTestCase(new Color(255,   0, 255), "Magenta"),
                new ColorClassifierTestCase(new Color(255, 119, 255), "Fuchsia pink"),
        };
        testAll(testCases, ColorClassification.PINK_PURPLE);
    }

    @Test
    void testColorHelper_purple() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color( 52,   1,  63), "Dark violet"),
                new ColorClassifierTestCase(new Color( 53,   6,  62), "Dark purple"),
                new ColorClassifierTestCase(new Color(102,  56, 106), "Plum"),
                new ColorClassifierTestCase(new Color(126,  48, 117), "Veronica purple"),
                new ColorClassifierTestCase(new Color(128,   0, 128), "Purple"),
                new ColorClassifierTestCase(new Color(138,  43, 226), "Bright Blue violet"),
                new ColorClassifierTestCase(new Color(139,   0, 139), "Dark magenta"),
                new ColorClassifierTestCase(new Color(147, 112, 219), "Matt purple"),
                new ColorClassifierTestCase(new Color(148,   0, 211), "Violet ink"),
                new ColorClassifierTestCase(new Color(153,  50, 204), "Purple vanity"),
                new ColorClassifierTestCase(new Color(153, 102, 204), "Amethyst"),
                new ColorClassifierTestCase(new Color(154,  14, 234), "Violet"),
                new ColorClassifierTestCase(new Color(158,  67, 162), "Medium purple"),
                new ColorClassifierTestCase(new Color(160,  32, 255), "Veronica"),
                new ColorClassifierTestCase(new Color(186,  85, 211), "Medium orchid"),
                new ColorClassifierTestCase(new Color(216, 191, 216), "Thistle"),
        };
        testAll(testCases, ColorClassification.PURPLE);
    }

    @Test
    void testColorHelper_purple_mauve() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color( 78,  50, 178), "Blue violet"),
                new ColorClassifierTestCase(new Color(106,  90, 205), "Ameixa"),
                new ColorClassifierTestCase(new Color(122, 129, 255), "Orchid"),
                new ColorClassifierTestCase(new Color(172, 172, 230), "Maximum Blue Purple"),
                new ColorClassifierTestCase(new Color(173, 186, 227), "French Lilac blue"),
                new ColorClassifierTestCase(new Color(204, 204, 255), "Lavender blue"),
        };
        testAll(testCases, ColorClassification.PURPLE_MAUVE);
    }

    @Test
    void testColorHelper_red() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color( 78,  22,   9), "French Puce"),
                new ColorClassifierTestCase(new Color( 88,  17,  26), "Chocolate Cosmos"),
                new ColorClassifierTestCase(new Color( 93,  31,  30), "Red Oxide"),
                new ColorClassifierTestCase(new Color(108,  50,  46), "Kenyan Copper"),
                new ColorClassifierTestCase(new Color(113,  47,  44), "Auburn"),
                new ColorClassifierTestCase(new Color(113,  56,  63), "Oxblood Red"),
                new ColorClassifierTestCase(new Color(124,  10,   2), "Demonic Presence"),
                new ColorClassifierTestCase(new Color(124,  28,   5), "New Kenyan Copper"),
                new ColorClassifierTestCase(new Color(124,  72,  72), "Tuscan Red"),
                new ColorClassifierTestCase(new Color(128,   0,  32), "Oxblood"),
                new ColorClassifierTestCase(new Color(128,  24,  24), "Falu Red"),
                new ColorClassifierTestCase(new Color(133,  14,   4), "Indian Red"),
                new ColorClassifierTestCase(new Color(137,  63,  69), "Cordovan"),
                new ColorClassifierTestCase(new Color(138,  51,  36), "Burnt Umber"),
                new ColorClassifierTestCase(new Color(139,  64,  68), "Barn Red"),
                new ColorClassifierTestCase(new Color(140,   0,  15), "Crimson"),
                new ColorClassifierTestCase(new Color(144,   0,  32), "Burgundy"),
                new ColorClassifierTestCase(new Color(157,  41,  51), "Cochineal Red"),
                new ColorClassifierTestCase(new Color(159,  40,  50), "Japanese Carmine"),
                new ColorClassifierTestCase(new Color(159, 104,  89), "Russet Red"),
                new ColorClassifierTestCase(new Color(160,  54,  35), "Brick"),
                new ColorClassifierTestCase(new Color(165,  42,  42), "Harissa Red"),
                new ColorClassifierTestCase(new Color(177,  69, 102), "Sangria"),
                new ColorClassifierTestCase(new Color(178,  34,  34), "Fire Brick"),
                new ColorClassifierTestCase(new Color(203, 109,  81), "Copper Red"),
                new ColorClassifierTestCase(new Color(205,  92,  92), "Common Chestnut"),
                new ColorClassifierTestCase(new Color(226, 114,  91), "Phoenix Red"),
                new ColorClassifierTestCase(new Color(227,  66,  68), "Vermilion Cinnabar"),
                new ColorClassifierTestCase(new Color(233, 116,  81), "Bloodletter"),
        };
        testAll(testCases, ColorClassification.RED);
    }

    @Test
    void testColorHelper_red_orange() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(217,  96,  59), "Medium Vermilion"),
                new ColorClassifierTestCase(new Color(239,  64,  38), "Tomato"),
                new ColorClassifierTestCase(new Color(254,  68,   1), "Orange Red"),
                new ColorClassifierTestCase(new Color(255,  36,   0), "Scarlet"),
                new ColorClassifierTestCase(new Color(255,  56,   0), "Coquelicot"),
                new ColorClassifierTestCase(new Color(255,  63,  52), "Red Orange"),
                new ColorClassifierTestCase(new Color(255,  83,  73), "Red Orange Juice"),
        };
        testAll(testCases, ColorClassification.RED_ORANGE);
    }

    @Test
    void testColorHelper_white() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(211, 211, 211), "Pinball"),
                new ColorClassifierTestCase(new Color(216, 220, 214), "Light Gray"),
                new ColorClassifierTestCase(new Color(220, 220, 220), "Gainsboro"),
                new ColorClassifierTestCase(new Color(229, 229, 250), "Lavender Mist"),
                new ColorClassifierTestCase(new Color(236, 230, 213), "Antique white"),
                new ColorClassifierTestCase(new Color(239, 224, 205), "Buttercream"),
                new ColorClassifierTestCase(new Color(240, 248, 255), "Alice blue"),
                new ColorClassifierTestCase(new Color(245, 245, 245), "White Smoke"),
                new ColorClassifierTestCase(new Color(245, 255, 250), "Mint Cream"),
                new ColorClassifierTestCase(new Color(248, 248, 255), "Ghost White"),
                new ColorClassifierTestCase(new Color(250, 240, 230), "Linen"),
                new ColorClassifierTestCase(new Color(255, 228, 225), "Misty Rose"),
                new ColorClassifierTestCase(new Color(255, 240, 245), "Lavender Blush"),
                new ColorClassifierTestCase(new Color(255, 248, 220), "Cornsilk"),
                new ColorClassifierTestCase(new Color(255, 250, 240), "Floral white"),
                new ColorClassifierTestCase(new Color(255, 250, 250), "Snow"),
                new ColorClassifierTestCase(new Color(255, 255, 255), "White"),
                new ColorClassifierTestCase(new Color(255, 255, 224), "Winter Duvet"),
                new ColorClassifierTestCase(new Color(255, 255, 240), "Ivory"),
        };
        testAll(testCases, ColorClassification.WHITE);
    }

    @Test
    void testColorHelper_yellow() {
        ColorClassifierTestCase[] testCases = new ColorClassifierTestCase[] {
                new ColorClassifierTestCase(new Color(230, 218, 166), "Beige"),
                new ColorClassifierTestCase(new Color(238, 232, 170), "Yellow Jasmine"),
                new ColorClassifierTestCase(new Color(240, 230, 140), "Cornflake"),
                new ColorClassifierTestCase(new Color(253, 255,  99), "Canary"),
                new ColorClassifierTestCase(new Color(255, 250, 205), "Lemon Chiffon"),
                new ColorClassifierTestCase(new Color(255, 254, 122), "Light Yellow"),
                new ColorClassifierTestCase(new Color(255, 255,   0), "Yellow"),
                new ColorClassifierTestCase(new Color(255, 255, 102), "Laser Lemon"),
                new ColorClassifierTestCase(new Color(255, 255, 153), "Sunburst Yellow"),
                new ColorClassifierTestCase(new Color(255, 255, 194), "Cream"),
                new ColorClassifierTestCase(new Color(255, 255, 204), "Conditioner"),
                new ColorClassifierTestCase(new Color(238, 220, 130), "Flax"),
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
