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

import java.awt.Color;

public final class Hsb {

    /**
     * Hue value in degrees (0 to 360).
     */
    private final int hue;

    /**
     * Saturation value in percentage (0 to 100).
     */
    private final int saturation;

    /**
     * Brightness value in percentage (0 to 100).
     */
    private final int brightness;

    private Hsb(final int hue, final int saturation, final int brightness) {
        this.hue = hue;
        this.saturation = saturation;
        this.brightness = brightness;
    }

    int getHue() {
        return hue;
    }

    int getSaturation() {
        return saturation;
    }

    int getBrightness() {
        return brightness;
    }

    /**
     * Create a new Hsb instance from a Color instance.
     * @param color The color to convert
     * @return A new Hsb instance
     */
    public static Hsb from(final Color color) {
        final float[] hsb = new float[3];
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), hsb);
        return new Hsb(
                Math.round(hsb[0] * 360),
                Math.round(hsb[1] * 100),
                Math.round(hsb[2] * 100));
    }

    @Override
    public String toString() {
        return "Hsb{" + "hue=" + hue
                + ", saturation=" + saturation
                + ", brightness=" + brightness + '}';
    }
}
