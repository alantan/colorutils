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
package com.alantan.colorutils.classifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.alantan.colorutils.model.ColorClassification;
import com.alantan.colorutils.model.Hsb;
import java.awt.Color;
import org.junit.jupiter.api.Test;

public class ColorClassifierTest {

    @Test
    void testColorHelper_black() {
        Color[] testCases = new Color[] {
                new Color(0, 0, 0),
        };
        testAll(testCases, ColorClassification.BLACK);
    }

    @Test
    void testColorHelper_blue() {
        Color[] testCases = new Color[] {
                new Color(  0, 127, 255),  // Azure
                new Color(  0, 128, 128),  // Teal
                new Color(  0, 135, 189),  // Bondi Blue
                new Color(  0, 153, 204),  // Capri
                new Color(  0, 204, 255),  // Cyan
                new Color(  0, 255, 255),  // Aqua
                new Color( 25, 120, 168),  // Cerulean
                new Color( 77, 122, 189),  // Peacock blue
                new Color( 91, 124, 153),  // Air Force blue
                new Color(100, 149, 237),  // Cornflower blue
                new Color(115, 147, 179),  // Cerulean Frost
                new Color(147, 205, 191),  // Shelduck Blue
                new Color(175, 238, 238),  // Pale blue
                new Color(176, 224, 230),  // Powder blue
                new Color(182, 218, 223),  // Tiffany blue
        };
        testAll(testCases, ColorClassification.BLUE);
    }

    @Test
    void testColorHelper_brown() {
        Color[] testCases = new Color[] {
                new Color( 61,  43,  31),  // Bistre
                new Color( 92,  64,  51),  // Brown
                new Color(111,  78,  55),  // Coffee
                new Color(128,  70,  27),  // Russet Red
                new Color(150,  75,   0),  // Chocolate
                new Color(159, 129, 112),  // Beaver
                new Color(188, 143, 143),  // Rosy Brown
                new Color(222, 184, 135),  // Burly Wood
        };
        testAll(testCases, ColorClassification.BROWN);
    }

    @Test
    void testColorHelper_gray() {
        Color[] testCases = new Color[] {
                new Color(128, 128, 128),  // Gray
                new Color(169, 169, 169),  // Dark Gray
                new Color(176, 196, 202),  // Blue-gray
                new Color(192, 192, 192),  // Silver
        };
        testAll(testCases, ColorClassification.GRAY);
    }

    @Test
    void testColorHelper_green() {
        Color[] testCases = new Color[] {
                new Color(  0, 128,   0),  // Office Green
                new Color(  0, 255,   0),  // Lime
                new Color(  0, 255, 127),  // Mint Green
                new Color( 86, 130,   3),  // Avocado
                new Color(107, 142,  35),  // Olive Drab
                new Color(124, 252,   0),  // Lawn green
                new Color(127, 255,   0),  // Chartreuse
                new Color(127, 255, 212),  // Aquamarine
                new Color(128, 128,   0),  // Olive
                new Color(143, 188, 143),  // Dark Sea Green
                new Color(152, 251, 152),  // Pale green
                new Color(159, 226, 191),  // Sea foam green
                new Color(173, 255,  47),  // Spring green
                new Color(204, 240, 112),  // Light Lime
                new Color(205, 220,  57),  // Pear
        };
        testAll(testCases, ColorClassification.GREEN);
    }

    @Test
    void testColorHelper_orange() {
        Color[] testCases = new Color[] {
                new Color(187, 119,  46),  // Copper Orange
                new Color(195,  82,  20),  // Alloy Orange
                new Color(201, 153,  93),  // Vintage Orange
                new Color(205,  87,   0),  // Tawny Red
                new Color(205, 127,  50),  // Bronze Orange
                new Color(205, 133,  63),  // Copper
                new Color(207,  91,  46),  // Medium Vermilion
                new Color(210, 105,  30),  // Chocolate Orange
                new Color(217, 116,  72),  // Copper Red
                new Color(224, 141,  60),  // Tiger's Eye Orange
                new Color(228,  77, 46),   // Cinnabar Red
                new Color(230, 128,   0),  // Fulvous
                new Color(230, 129,  47),  // Cadmium Orange
                new Color(237, 201, 175),  // Desert Sand Orange
                new Color(240,  97,   5),  // Spanish Orange
                new Color(241, 180,  47),  // Xanthous Orange
                new Color(242, 143,  28),  // Beer Orange
                new Color(242, 202, 133),  // Buff Orange
                new Color(244, 164,  96),  // Sandy Brown
                new Color(247, 127,   0),  // University Of Tennessee Orange
                new Color(250, 186,  95),  // Rajah
                new Color(255,  99,  71),  // Tomato
                new Color(255, 127,  80),  // Coral
                new Color(255, 140,   0),  // Dark Orange
                new Color(255, 153,  51),  // Deep Saffron
                new Color(255, 160, 122),  // Light Salmon
                new Color(255, 203, 164),  // Deep Peach
                new Color(255, 218, 185),  // Peach puff
                new Color(255, 222, 173),  // Navajo White
                new Color(255, 228, 196),  // Bisque
                new Color(255, 239, 213),  // Papaya whip

        };
        testAll(testCases, ColorClassification.ORANGE);
    }

    @Test
    void testColorHelper_pink() {
        Color[] testCases = new Color[] {
                new Color(204,   0, 204),  // Deep magenta
                new Color(221, 160, 221),  // Plum
                new Color(238, 130, 238),  // Violet
                new Color(255,   0, 255),  // Fuchsia/Magenta
                new Color(255,  20, 147),  // Deep Pink
                new Color(255, 105, 180),  // Hot Pink
                new Color(255, 119, 255),  // Fuchsia pink
                new Color(255, 182, 193),  // Light Pink
                new Color(255, 183, 197),  // Cherry blossom pink
                new Color(255, 192, 203),  // Pink
        };
        testAll(testCases, ColorClassification.PINK);
    }

    @Test
    void testColorHelper_purple() {
        Color[] testCases = new Color[] {
                new Color( 48,  25,  52),  // Dark purple
                new Color(106,  90, 205),  // Slate blue
                new Color(128,   0, 128),  // Purple
                new Color(138,  43, 226),  // Blue violet
                new Color(138, 130, 220),  // Wedgwood blue
                new Color(139,   0, 139),  // Dark magenta
                new Color(147, 112, 219),  // Medium purple
                new Color(148,   0, 211),  // Dark violet
                new Color(153,  50, 204),  // Dark orchid
                new Color(153, 102, 204),  // Amethyst
                new Color(155,  48, 255),  // Veronica blue
                new Color(160,  32, 240),  // Veronica red
                new Color(172, 172, 230),  // Max blue purple
                new Color(173, 186, 227),  // French Lilac blue
                new Color(192, 192, 255),  // Lavender blue
                new Color(216, 122, 240),  // Medium orchid
                new Color(216, 191, 216),  // Thistle
                new Color(218, 112, 214),  // Orchid
        };
        testAll(testCases, ColorClassification.PURPLE);
    }

    @Test
    void testColorHelper_red() {
        Color[] testCases = new Color[] {
                new Color( 78,  22,  9),  // French Puce Red
                new Color( 80,  20, 22),  // Burgundy
                new Color( 88,  17, 26),  // Chocolate Cosmos Red
                new Color( 94,  25, 20),  // Sangria
                new Color(124,  10,  2),  // Barn Red
                new Color(124,  28,  5),  // Kenyan Copper Red
                new Color(124,  48, 48),  // Tuscan Red
                new Color(126,  40, 17),  // Brick
                new Color(128,   0, 32),  // Oxblood Red
                new Color(137,  63, 69),  // Cordovan Red
                new Color(138,  51, 36),  // Burnt Umber
                new Color(157,  41, 51),  // Japanese Carmine
                new Color(165,  42, 42),  // Auburn / Chestnut
                new Color(169,  17,  1),  // Turkey Red
                new Color(178,  34, 34),  // Fire Brick
                new Color(184,  15, 10),  // Crimson
                new Color(194,  24,  7),  // Chili Red
                new Color(205,  92, 92),  // Indian Red
                new Color(226, 114, 91),  // Terracotta
                new Color(233, 116, 81),  // Light Red Ochre
                new Color(255,  36,  0),  // Coquelicot
                new Color(255,  36,  0),  // Lust Red
                new Color(255,  69,  0),  // Orange Red
                new Color(255,  83, 73),  // Red Orange
        };
        testAll(testCases, ColorClassification.RED);
    }

    @Test
    void testColorHelper_white() {
        Color[] testCases = new Color[] {
                new Color(211, 211, 211),  // Light Gray
                new Color(220, 220, 220),  // Gainsboro
                new Color(224, 255, 224),  // Pastel mint
                new Color(230, 230, 250),  // Lavender Mist
                new Color(239, 222, 205),  // Almond
                new Color(239, 224, 205),  // Buttercream
                new Color(240, 248, 255),  // Alice blue
                new Color(245, 245, 220),  // Beige
                new Color(245, 245, 245),  // White Smoke
                new Color(245, 255, 250),  // Mint Cream
                new Color(248, 248, 255),  // Ghost White
                new Color(250, 235, 215),  // Antique white
                new Color(250, 240, 230),  // Linen
                new Color(255, 228, 225),  // Misty Rose
                new Color(255, 240, 245),  // Lavender Blush
                new Color(255, 248, 220),  // Cornsilk
                new Color(255, 250, 240),  // Floral white
                new Color(255, 250, 250),  // Snow
                new Color(255, 255, 255),  // White
                new Color(255, 255, 224),  // Light Yellow
                new Color(255, 255, 240),  // Ivory
        };
        testAll(testCases, ColorClassification.WHITE);
    }

    @Test
    void testColorHelper_yellow() {
        Color[] testCases = new Color[] {
                new Color(238, 232, 170),  // Pale Goldenrod
                new Color(240, 230, 140),  // Light Khaki
                new Color(255, 250, 205),  // Lemon Chiffon
                new Color(255, 255,   0),  // Yellow
                new Color(255, 255, 102),  // Laser Lemon
                new Color(255, 255, 153),  // Canary
                new Color(255, 255, 204),  // Cream
                new Color(238, 220, 130),  // Flax
                new Color(228, 220, 130),  // Greenish Flax
        };
        testAll(testCases, ColorClassification.YELLOW);
    }

    private void testAll(final Color[] testCases, final ColorClassification expectedClassification) {
        for (Color color : testCases) {
            ColorClassification actualClassification =
                    ColorClassifier.getClassification(color);
            assertEquals(
                    expectedClassification,
                    actualClassification,
                    "Color=" + color + ", HSB=" + Hsb.from(color));
        }
    }
}
