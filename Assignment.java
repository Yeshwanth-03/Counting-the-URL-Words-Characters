import java.net.*;
import java.io.*;
import java.util.regex.*;
public class Assignment{
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://en.wikipedia.org/wiki/Java_(programming_language)");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;
        StringBuilder content = new StringBuilder();
        
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        String textContent = content.toString();
        int totalChars = textContent.length();
        int totalWords = textContent.split("\\s+").length;

        Pattern urlPattern = Pattern.compile("https?://\\S+");
        Matcher matcher = urlPattern.matcher(textContent);
        int urlCount = 0;
        while (matcher.find()) {
            urlCount++;
        }
        System.out.println("Total URLs: " + urlCount);
        System.out.println("Total Characters: " + totalChars);
        System.out.println("Total Words: " + totalWords);
    }
}