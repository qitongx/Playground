package com.roamdata.mavenHelloWorld.dao.wsapi6;

/**
 * Created by j on 5/13/16.
 * Example:
 *  {"code":"USD","iso":840,"symbol":"$"}
 */
public class Wsapi6Currency {
    String code;
    Integer iso;
    String symbol;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getIso() {
        return iso;
    }

    public void setIso(Integer iso) {
        this.iso = iso;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        StringBuilder toStringBuilder = new StringBuilder();
        toStringBuilder.append("code:" + String.valueOf(code));
        toStringBuilder.append("iso:" + String.valueOf(iso));
        toStringBuilder.append("symbol:" + String.valueOf(symbol));
        return toStringBuilder.toString();
    }
}
