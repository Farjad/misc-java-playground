
import utils.*;
import java.io.IOException;

public class Test {

    @org.junit.Test
    public void Test1() {
        String url = "http://localhost:4567/";

        try {
            String file = File.readFile("data.json");
            HttpClient.post(url, file);
        } catch ( IOException ex ) {
            System.out.println(ex.toString());
        }
    }

}

