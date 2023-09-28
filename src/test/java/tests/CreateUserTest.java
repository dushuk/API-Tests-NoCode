package tests;

import dto.ValidUserRequest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class CreateUserTest extends BaseTest{
    String endpoint = "/users";
    @Test
    public void successCreateUser(){
        ValidUserRequest requestBody = ValidUserRequest.builder()
                .email("rafael@gmail.com")
                .full_name("Rafael")
                .password("123456789")
                .generate_magic_link(false)
                .build();

        Response response = postRequest(endpoint, requestBody);
    }


}
