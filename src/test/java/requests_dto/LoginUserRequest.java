package requests_dto;

import api_pom.login_user.LoginUserDto;
import api_pom.login_user.LoginUserResponseDto;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import requests.Requests;
import utils.UrlResources;
import responses.Responses;

public class LoginUserRequest {
    private final Requests requests = new Requests();
    private final Responses responses = new Responses();
    public Response loginResponse(String username, String password) {
        RequestSpecification spec = requests.buildRequest(UrlResources.AUTHORIZATION.getUrl());
        LoginUserDto auth = new LoginUserDto(username, password);
        return responses.post(spec, "/auth", auth);
    }
    public LoginUserResponseDto login(String username, String password) {
        Response response = loginResponse(username, password);
        return response.as(LoginUserResponseDto.class);
    }
}
