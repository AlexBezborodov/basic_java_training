package com.intensive.java;

public class WordWrap {
    public static String wrap(String content, int length) throws TooShortLengthException {
        if (length < 1) {
            throw new IllegalArgumentException("Length should be at least 1");
        }

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        int currentLength = 0;

        for (char c : content.toCharArray()) {
            if (Character.isWhitespace(c)) {
                if (currentLength + word.length() > length) {
                    throw new TooShortLengthException("First word in current line is longer than desired length");
                }
                if (currentLength + word.length() == length) {
                    result.append(word).append("\n");
                    word.setLength(0);
                    currentLength = 0;
                } else if (currentLength + word.length() + 1 > length) {
                    result.append("\n").append(word);
                    currentLength = word.length();
                    word.setLength(0);
                } else {
                    if (currentLength > 0) {
                        result.append(" ");
                        currentLength++;
                    }
                    result.append(word);
                    currentLength += word.length();
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }

        if (currentLength + word.length() > length) {
            throw new TooShortLengthException("First word in current line is longer than desired length");
        }

        if (currentLength + word.length() <= length) {
            result.append(word);
        } else {
            result.append("\n").append(word);
        }

        return result.toString();
    }
}

