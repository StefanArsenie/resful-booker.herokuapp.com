package tests;

import api_pom.login_user.LoginUserResponseDto;
import io.qameta.allure.Description;
import io.qameta.allure.junit5.AllureJunit5;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import requests_dto.LoginUserRequest;
import utils.Constants;

@Log4j2
@ExtendWith(AllureJunit5.class)
class LoginUserTest {
    LoginUserResponseDto loginUserResponseDto;
    LoginUserRequest loginUserRequest;
    Response response;
    @BeforeEach
    public void setUp() {
        loginUserRequest = new LoginUserRequest();
    }
    @Description("Verify login with valid credentials")
    @Test
    void loginUserWithCorrectCredentials() {
        response = loginUserRequest.loginResponse(Constants.USER_NAME,Constants.PASSWORD);
        loginUserResponseDto = response.as(LoginUserResponseDto.class);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertFalse(loginUserResponseDto.getToken().isEmpty(), "Token should not be empty");
    }
    @Description("Verify login with invalid credentials")
    @Test
    void loginUserWithWrongAdminName() {
        response = loginUserRequest.loginResponse("close",Constants.PASSWORD);
        loginUserResponseDto = response.as(LoginUserResponseDto.class);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("Bad credentials", loginUserResponseDto.getReason());
    }
}
