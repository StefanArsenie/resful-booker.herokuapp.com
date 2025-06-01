package api_pom.login_user;

public class LoginUserResponseDto {
    private String token;
    private String reason;

    public String getToken() {
        return token;
    }
    public String getReason() {
        return reason;
    }
    public void setToken(String token){
        this.token = token;
    }
}
