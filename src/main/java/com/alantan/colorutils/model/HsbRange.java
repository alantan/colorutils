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

public final class HsbRange {

    /**
     * Minimum hue allowed for this range.
     */
    private final int hueMin;
    /**
     * Maximum hue allowed for this range.
     */
    private final int hueMax;
    /**
     * Minimum saturation allowed for this range.
     */
    private final int saturationMin;
    /**
     * Maximum saturation allowed for this range.
     */
    private final int saturationMax;
    /**
     * Minimum brightness allowed for this range.
     */
    private final int brightnessMin;
    /**
     * Maximum brightness allowed for this range.
     */
    private final int brightnessMax;
    /**
     * Color classification for this range.
     */
    private final ColorClassification classification;

    private HsbRange(
            final int hueMin, final int hueMax,
            final int saturationMin, final int saturationMax,
            final int brightnessMin, final int brightnessMax,
            final ColorClassification classification) {
        this.hueMin = hueMin;
        this.hueMax = hueMax;
        this.saturationMin = saturationMin;
        this.saturationMax = saturationMax;
        this.brightnessMin = brightnessMin;
        this.brightnessMax = brightnessMax;
        this.classification = classification;
    }

    /**
     * Determines whether the current color is in the range of this HSB range.
     * @param hsb HSB color to check
     * @return True if the color is in the range, false otherwise
     */
    public boolean isInRange(final Hsb hsb) {
        return hsb.getHue() >= hueMin
                && hsb.getHue() <= hueMax
                && hsb.getSaturation() >= saturationMin
                && hsb.getSaturation() <= saturationMax
                && hsb.getBrightness() >= brightnessMin
                && hsb.getBrightness() <= brightnessMax;
    }

    /**
     * Gets the color classification for this range.
     * @return Color classification
     */
    public ColorClassification getClassification() {
        return classification;
    }

    /**
     * Builder for HSB ranges.
     */
    public static final class HsbRangeBuilder {
        /**
         * Minimum hue allowed for this range.
         */
        private int hueMin;
        /**
         * Maximum hue allowed for this range.
         */
        private int hueMax;
        /**
         * Minimum saturation allowed for this range.
         */
        private int saturationMin;
        /**
         * Maximum saturation allowed for this range.
         */
        private int saturationMax;
        /**
         * Minimum brightness allowed for this range.
         */
        private int brightnessMin;
        /**
         * Maximum brightness allowed for this range.
         */
        private int brightnessMax;
        /**
         * Color classification for this range.
         */
        private ColorClassification classification;

        /**
         * Sets the minimum and maximum hue for this range.
         * @param hueMin Minimum hue
         * @param hueMax Maximum hue
         * @return Builder
         */
        public HsbRangeBuilder hue(final int hueMin, final int hueMax) {
            this.hueMin = hueMin;
            this.hueMax = hueMax;
            return this;
        }

        /**
         * Sets the minimum and maximum saturation for this range.
         * @param saturationMin Minimum saturation
         * @param saturationMax Maximum saturation
         * @return Builder
         */
        public HsbRangeBuilder saturation(
                final int saturationMin, final int saturationMax) {
            this.saturationMin = saturationMin;
            this.saturationMax = saturationMax;
            return this;
        }

        /**
         * Sets the minimum and maximum brightness for this range.
         * @param brightnessMin Minimum brightness
         * @param brightnessMax Maximum brightness
         * @return Builder
         */
        public HsbRangeBuilder brightness(
                final int brightnessMin, final int brightnessMax) {
            this.brightnessMin = brightnessMin;
            this.brightnessMax = brightnessMax;
            return this;
        }

        /**
         * Sets the color classification for this range.
         * @param classification Color classification
         * @return Builder
         */
        public HsbRangeBuilder classification(
                final ColorClassification classification) {
            this.classification = classification;
            return this;
        }

        /**
         * Builds the HSB range.
         * @return HSB range
         */
        public HsbRange build() {
            return new HsbRange(
                    hueMin, hueMax,
                    saturationMin, saturationMax,
                    brightnessMin, brightnessMax,
                    classification);
        }
    }

    @Override
    public String toString() {
        return "HsbRange{" + "hueMin=" + hueMin
                + ", hueMax=" + hueMax
                + ", saturationMin=" + saturationMin
                + ", saturationMax=" + saturationMax
                + ", valueMin=" + brightnessMin
                + ", valueMax=" + brightnessMax + '}';
    }
}
