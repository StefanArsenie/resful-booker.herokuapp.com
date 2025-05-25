package responses;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Responses {
    public Response post(RequestSpecification spec, String endpoint, Object body) {
        if (body != null) {
            spec.body(body);
        }
        return spec.post(endpoint);
    }
    public Response get(RequestSpecification spec, String endpoint) {
        return spec.get(endpoint);
    }
    public Response put(RequestSpecification spec, String endpoint, Object body) {
        if (body != null) {
            spec.body(body);
        }
        return spec.put(endpoint);
    }
    public Response delete(RequestSpecification spec, String endpoint) {
        return spec.delete(endpoint);
    }
}
