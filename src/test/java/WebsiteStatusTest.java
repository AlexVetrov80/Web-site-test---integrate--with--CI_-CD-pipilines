import org.junit.jupiter.api.Test;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebsiteStatusTest {

    @Test
    void homepageShouldReturnStatus200() throws Exception {
        URL url = new URL("https://artfishing.club/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int statusCode = connection.getResponseCode();

        assertEquals(200, statusCode);
    }
    @Test
    void nonExistingPageShouldReturn404() throws Exception {
        URL url = new URL("https://artfishing.club/unknown-page-12345");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int statusCode = connection.getResponseCode();

        assertEquals(404, statusCode);
      }  
}
