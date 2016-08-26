
import utils.*;
import java.io.IOException;

public class Test {

    @org.junit.Test
    public void Test1() {
        String url = "http://corws18409.chicago.savogroup.net:58981/solr/classic_bt/update?commit=true";

        try {
            String file = File.readFile("data.json");
            HttpClient.post(url, file);
        } catch ( IOException ex ) {
            System.out.println(ex.toString());
        }
    }

}

