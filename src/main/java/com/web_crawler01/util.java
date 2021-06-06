package com.web_crawler01;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class util {
    
    public static String getXml()throws Exception{
        String path="https://rate.bot.com.tw/xrt?Lang=zh-TW";//網址
        URL url=new URL(path);
        String Xml=new Scanner(new InputStreamReader(url.openStream(),"UTF-8"))
                .useDelimiter("\\A")
                .next();
        return Xml;
    }
    
    public static List<Currency> Parser(String url){
        List<Currency> listCur=new ArrayList<>();
        String temp = "";
        int start = 0,end = 0, counter=0;
        do{
            Currency currency=new Currency();
            
            start = url.indexOf("<div class=\"visible-phone print_hide\">", end + 1);
            end = url.indexOf("</div>", start + 1);
            temp = url.substring(start + 38, end);
            currency.set幣別(temp);
            
            start = url.indexOf("<td data-table=\"本行現金買入\" class=\"rate-content-cash text-right print_hide\">", end + 1);
            end = url.indexOf("</td>", start + 1);
            temp = url.substring(start + 72, end);
            currency.set本行現金買入(temp);
            
            start = url.indexOf("<td data-table=\"本行現金賣出\" class=\"text-right display_none_print_show print_width\">", end + 1);
            end = url.indexOf("</td>", start + 1);
            temp = url.substring(start + 79, end);
            currency.set本行現金買出(temp);
            
            listCur.add(currency);
            counter++;
        }while(counter < 19);
        return listCur;
    }
}
