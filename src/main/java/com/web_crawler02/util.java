package com.web_crawler02;



import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class util {

    public static String getXml() throws Exception {
        String path = "https://tw.stock.yahoo.com/q/bc?s=2330";
        URL url = new URL(path);
        String Xml = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"))
                            .useDelimiter("\\A")
                            .next();
        return Xml;
    }

    public static List Parser(String url) {

        List o = new ArrayList<>();
        int counter = 0;
        

        return o;
    }
}
//<td><a href="/twstock/profile/2342.htm">茂矽</a></td><td class=" r rt">33</td><td>0.1</td><td>0.3</td><td>1703.124</td><td>32.95</td><td>33.45</td><td>32.45</td><td>32.9</td></tr>



