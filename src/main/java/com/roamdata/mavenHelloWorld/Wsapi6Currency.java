package com.roamdata.mavenHelloWorld;

/**
 * Created by j on 5/13/16.
 * Example:
 *  {"code":"USD","iso":840,"symbol":"$"}
 */
public class Wsapi6Currency {
    String code;
    Integer iso;
    String symbol;

    @Override
    public String toString() {
        StringBuilder toStringBuilder = new StringBuilder();
        toStringBuilder.append("\ncode:" + String.valueOf(code));
        toStringBuilder.append("\niso:" + String.valueOf(iso));
        toStringBuilder.append("\nsymbol:" + String.valueOf(symbol));
        return toStringBuilder.toString();
    }
}
