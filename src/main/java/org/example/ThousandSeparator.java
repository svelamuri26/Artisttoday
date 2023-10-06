package org.example;

import java.text.DecimalFormat;

public class ThousandSeparator {

    public static String addThousandSeparator(int n) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(n);
    }

    public static void main(String[] args) {
        int n = 1234;
        String result = addThousandSeparator(n);
        System.out.println("Integer with thousand separator: " + result);
    }
}
