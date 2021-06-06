
package com.web_crawler01;

import java.util.List;

public class main {
    public static void main(String[] args)throws Exception{
        String path=util.getXml();
        List<Currency> currencys=util.Parser(path);
        currencys.stream().forEach(System.out::println);
    }
}
