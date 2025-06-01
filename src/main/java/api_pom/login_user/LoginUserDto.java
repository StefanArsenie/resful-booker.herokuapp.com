package api_pom.login_user;

public class LoginUserDto {
    private String username;
    private String password;
    public LoginUserDto(){

    }
    public LoginUserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
}
