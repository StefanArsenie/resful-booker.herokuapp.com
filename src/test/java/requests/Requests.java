package requests;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import utils.Constants;

import java.util.Map;

public class Requests {
    public RequestSpecification buildRequest(String url, Map<String, String> headers) {
        return RestAssured.with()
                .baseUri(url)
                .header("Content-Type", Constants.CONTENT_TYPE);
    }
}
