import java.io.InputStreamReader;
import java.util.Scanner;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/playlist/top-100-nhac-tre-hay-nhat-va.m3liaiy6vVsF.html?utm_source=GoogleAds&utm_medium=Traffic_Top100NhacTre&utm_campaign=Playlist&gclid=CjwKCAjwj6SEBhAOEiwAvFRuKKW4lre-D_0hNRHRZHXCE3HLPM9QyRPTyqy1EWZ0eDAfaPI7r2Ie1BoCdaMQAvD_BwE");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
