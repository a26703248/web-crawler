
package com.web_crawler01;

public class Currency {
    private String 幣別;
    private String 本行現金買入;
    private String 本行現金買出;

    public String get幣別() {
        return 幣別;
    }

    public void set幣別(String 幣別) {
        this.幣別 = 幣別;
    }

    public String get本行現金買入() {
        return 本行現金買入;
    }

    public void set本行現金買入(String 本行現金買入) {
        this.本行現金買入 = 本行現金買入;
    }

    public String get本行現金買出() {
        return 本行現金買出;
    }

    public void set本行現金買出(String 本行現金買出) {
        this.本行現金買出 = 本行現金買出;
    }

    @Override
    public String toString() {
        return "\u5e63\u5225=" + 幣別.trim() + ", \u672c\u884c\u73fe\u91d1\u8cb7\u5165=" + 本行現金買入.trim()+ ", \u672c\u884c\u73fe\u91d1\u8cb7\u51fa=" + 本行現金買出.trim();
    }
}
