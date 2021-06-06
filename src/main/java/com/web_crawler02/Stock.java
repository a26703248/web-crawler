package com.web_crawler02;

public class Stock {
    private String 名稱;
    private String 成交價;
    private String 漲跌價;
    private String 漲跌幅;
    private String 成交量;
    private String 開盤;
    private String 最高;
    private String 最低;
    private String 昨收;

    public String get名稱() {
        return 名稱;
    }

    public void set名稱(String 名稱) {
        this.名稱 = 名稱;
    }

    public String get成交價() {
        return 成交價;
    }

    public void set成交價(String 成交價) {
        this.成交價 = 成交價;
    }

    public String get漲跌價() {
        return 漲跌價;
    }

    public void set漲跌價(String 漲跌價) {
        this.漲跌價 = 漲跌價;
    }

    public String get漲跌幅() {
        return 漲跌幅;
    }

    public void set漲跌幅(String 漲跌幅) {
        this.漲跌幅 = 漲跌幅;
    }

    public String get成交量() {
        return 成交量;
    }

    public void set成交量(String 成交量) {
        this.成交量 = 成交量;
    }

    public String get開盤() {
        return 開盤;
    }

    public void set開盤(String 開盤) {
        this.開盤 = 開盤;
    }

    public String get最高() {
        return 最高;
    }

    public void set最高(String 最高) {
        this.最高 = 最高;
    }

    public String get最低() {
        return 最低;
    }

    public void set最低(String 最低) {
        this.最低 = 最低;
    }

    public String get昨收() {
        return 昨收;
    }

    public void set昨收(String 昨收) {
        this.昨收 = 昨收;
    }

    @Override
    public String toString() {
        return "Stock{" + "\u540d\u7a31=" + 名稱 + ", \u6210\u4ea4\u50f9=" + 成交價 + ", \u6f32\u8dcc\u50f9=" + 漲跌價 + ", \u6f32\u8dcc\u5e45=" + 漲跌幅 + ", \u6210\u4ea4\u91cf=" + 成交量 + ", \u958b\u76e4=" + 開盤 + ", \u6700\u9ad8=" + 最高 + ", \u6700\u4f4e=" + 最低 + ", \u6628\u6536=" + 昨收 + '}';
    }


}
