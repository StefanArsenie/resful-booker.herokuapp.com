package tests;

import api_pom.login_user.LoginUserResponseDto;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import requests_dto.LoginUserRequest;
import utils.Constants;

public class LoginUserTests {
    LoginUserResponseDto loginUserResponseDto;
    LoginUserRequest loginUserRequest;
    Response response;
    @BeforeClass
    public void setUp() {
        loginUserRequest = new LoginUserRequest();
    }
    @Test
    public void loginUserWithCorrectCredentials() {
        loginUserResponseDto = loginUserRequest.login(Constants.USER_NAME, Constants.PASSWORD);
        response = loginUserRequest.loginResponse(Constants.USER_NAME,Constants.PASSWORD);
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertFalse(loginUserResponseDto.getToken().isEmpty(), "Token should not be empty");
    }
    @Test
    public void loginUserWithWrongAdminName() {
        loginUserResponseDto = loginUserRequest.login("addmin", Constants.PASSWORD);
        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(loginUserResponseDto.getReason(), "Bad credentials");
    }
}
