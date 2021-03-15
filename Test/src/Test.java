import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 0; i < 5000; i++){
            String url = "https://arbeidsplassen.nav.no/kandidatmatch";
            URL obj = null;
            try {
                obj = new URL(url);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            HttpURLConnection con = null;
            try {
                con = (HttpURLConnection) obj.openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                con.setRequestMethod("GET");
            } catch (ProtocolException e) {
                e.printStackTrace();
            }
            //add request header
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            int responseCode = 0;
            try {
                for (int j = 0; j < 10; j++) {
                    responseCode = con.getResponseCode();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (responseCode == 200) {
                System.out.println(i + " Done!!");
            }
        }
        System.out.println("Really done!");
    }
}
