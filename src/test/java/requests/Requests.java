package requests;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import utils.Constants;

public class Requests {
    public RequestSpecification buildRequest(String url) {
        return RestAssured.with()
                .baseUri(url)
                .header("Content-Type", Constants.CONTENT_TYPE);
    }
}
