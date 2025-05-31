import com.example.BaseTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class UserApiTests extends BaseTest {


    @Test(description = "Get - /user - Get User By Username",priority = 2)
    public void getUserByUsername(){
        Get(URL+"/user/utku");
    }

    @Test(description = "Get - /user/login - Login User",priority = 3)
    public void loginUser(){
        Map<String,Object> queryParams=new HashMap<>();
        queryParams.put("username","utku");
        queryParams.put("password","1234");
        Get(URL+"/user/login",queryParams);
    }

    @Test(description = "Get - /user/logout - Logout User",priority = 4)
    public void logoutUser(){
        Get(URL+"/user/logout");
    }

    @Test(description = "Post - /user - Create User",priority = 1)
    public void createUser(){
        Map<String,Object> bodyPayload=new HashMap<>();
        bodyPayload.put("id",17);
        bodyPayload.put("username","utku");
        bodyPayload.put("firstname","utku");
        bodyPayload.put("lastname","turk");
        bodyPayload.put("email","utku@gmail.com");
        bodyPayload.put("password","1234");
        bodyPayload.put("phone","5555555555");
        bodyPayload.put("userStatus",0);

        Post(URL+"/user",bodyPayload);
    }

    @Test(description = "Put - /user - Update User",priority = 5)
    public void updateUser(){
        Map<String,Object> bodyPayload=new HashMap<>();
        bodyPayload.put("id",18);
        bodyPayload.put("username","utku2");
        bodyPayload.put("firstname","utku2");
        bodyPayload.put("lastname","turk2");
        bodyPayload.put("email","utku2@gmail.com");
        bodyPayload.put("password","1234");
        bodyPayload.put("phone","5555555555");
        bodyPayload.put("userStatus",0);

        Put(URL+"/user/utku",bodyPayload);
    }

    @Test(description = "Delete - /user - Delete User",priority = 6)
    public void deleteUser(){
        Delete(URL+"/user/utku");
    }
}
