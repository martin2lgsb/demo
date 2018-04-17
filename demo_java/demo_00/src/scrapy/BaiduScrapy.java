package scrapy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by m2lgsb on 17/04/2018
 */
public class BaiduScrapy {

    static String SendGet(String url)
    {
        String result = "";
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url);
            URLConnection connection = realUrl.openConnection();
            connection.connect();
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = in.readLine()) != null)
            {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
//        System.out.println(result);
        return result;
    }

    static String RegexString(String targetStr, String patternStr)
    {
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(targetStr);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "Nothing";
    }

    public static void main(String[] args)
    {
        String url = "http://www.baidu.com";
        String result = SendGet(url);
        String imgSrc = RegexString(result, "src=\"(.+?)\"");
        System.out.println(imgSrc);
    }

}
