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
package com.alantan.colorutils.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CsvHelper {

    private CsvHelper() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Reads a CSV file and returns a list of lists.
     * Does not support CSVs with quoted values.
     * @param filePath Path to CSV file
     * @param delimiter Delimiter used in CSV file
     * @return List of lists, where each inner list is a row in the CSV file
     * @throws IOException If file is not found
     */
    public static List<List<String>> fromCsv(
            final String filePath, final String delimiter)
            throws IOException {
        return fromCsv(new FileReader(filePath), delimiter);
    }

    public static List<List<String>> fromCsv(
            final InputStream inputStream, final String delimiter)
            throws IOException {
        return fromCsv(new InputStreamReader(inputStream), delimiter);
    }

    public static List<List<String>> fromCsv(
            final Reader reader, final String delimiter)
            throws IOException {
        List<List<String>> records = new ArrayList<>();
        boolean skipHeader = true;
        try (BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }
                String[] values = line.split(delimiter);
                records.add(Arrays.asList(values));
            }
        }
        return records;
    }
}
