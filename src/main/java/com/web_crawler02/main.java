package com.web_crawler02;

import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        String path=util.getXml();
        List stock=util.Parser(path);
        stock.stream().forEach(System.out::println);
    }
}
