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
package com.alantan.colorutils.model;

/**
 * List of general color classifications.
 */
public enum ColorClassification {
    BLACK(ColorFamily.BLACK),
    LIGHT_GRAY(ColorFamily.GRAY),
    GRAY(ColorFamily.GRAY),
    WHITE(ColorFamily.WHITE),
    RED(ColorFamily.RED),
    RED_ORANGE(ColorFamily.RED),
    ORANGE_RED(ColorFamily.ORANGE),
    ORANGE(ColorFamily.ORANGE),
    YELLOW(ColorFamily.YELLOW),
    OLIVE(ColorFamily.GREEN),
    GREEN_YELLOW(ColorFamily.GREEN),
    GREEN(ColorFamily.GREEN),
    TURQUOISE(ColorFamily.BLUE),
    GRAY_BLUE(ColorFamily.BLUE),
    BLUE(ColorFamily.BLUE),
    PURPLE_MAUVE(ColorFamily.PURPLE),
    PURPLE(ColorFamily.PURPLE),
    PINK_PURPLE(ColorFamily.PINK),
    PINK_RED(ColorFamily.PINK),
    BROWN(ColorFamily.BROWN);

    private final ColorFamily family;

    ColorClassification(final ColorFamily family) {
        this.family = family;
    }

    public ColorFamily getFamily() {
        return family;
    }
}
