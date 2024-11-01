package core;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.support.ClassicRequestBuilder;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HttpClient {

    private static final Logger logger = Logger.getLogger("HttpClient");


    private static Result sendRequest(ClassicHttpRequest httpRequest) {
        Result result = null;
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            result = httpClient.execute(httpRequest, response -> {
                final HttpEntity entity = response.getEntity();
                final String resBody = EntityUtils.toString(entity);
                EntityUtils.consume(entity);
                return Result.builder().statusCode(response.getCode()).resBody(resBody).build();
            });

        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
            System.exit(-1);
        }
        return result;
    }

    public static Result sendGetRequest(String request) {
        ClassicHttpRequest req = ClassicRequestBuilder.get(request).build();
        return sendRequest(req);
    }
}
