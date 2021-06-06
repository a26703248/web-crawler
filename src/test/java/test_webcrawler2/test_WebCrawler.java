package test_webcrawler2;

import com.web_crawler02.util;
import org.junit.Test;

public class test_WebCrawler {
    @Test
    public void testWebCrawler() throws Exception{
        String Xml =util.getXml();
        System.out.println(Xml);
    }
}
