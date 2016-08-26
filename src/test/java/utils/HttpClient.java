package utils;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.IOException;

public class HttpClient {
    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static HttpRequestFactory HTTP_REQUEST = HTTP_TRANSPORT.createRequestFactory();

    private enum REQUEST {
        GET,
        POST
    }
    public static HttpResponse get(String url, String payload) throws IOException {
        return request(REQUEST.GET, url, payload);
    }

    public static HttpResponse post(String url, String payload) throws IOException {
        return request(REQUEST.POST, url, payload);
    }

    private static HttpResponse request(REQUEST req, String url, String payload) throws IOException {
        GenericUrl uri = new GenericUrl(url);

        ByteArrayContent dataBytes = ByteArrayContent.fromString("application/json", payload);
        HttpRequest request = HTTP_REQUEST.buildPostRequest(uri, dataBytes);

        return request.execute();
    }
}
