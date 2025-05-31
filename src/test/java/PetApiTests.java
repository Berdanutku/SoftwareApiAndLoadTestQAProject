import com.example.BaseTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetApiTests extends BaseTest {


    @Test(description = "Get - /pet - Single Pet",priority = 2)
    public void getPetById(){
        Get(URL+"/pet/17");
    }

    @Test(description = "Get - /pet/findByStatus - Pets With Related Status",priority = 4)
    public void getPetsByStatus(){
        Map<String,Object> queryParams=new HashMap<>();
        queryParams.put("status","available");
        Get(URL+"/pet/findByStatus",queryParams);
    }

    @Test(description = "Post - /pet - Create Pet",priority = 1)
    public void createPet(){
        Map<String,Object> bodyPayload=new HashMap<>();
        bodyPayload.put("id",17);

        Map<String, Object> category = new HashMap<>();
        category.put("id", 0);
        category.put("name", "utku-category");
        bodyPayload.put("category", category);

        bodyPayload.put("name", "utku");

        List<String> photoUrls = new ArrayList<>();
        photoUrls.add("string");
        bodyPayload.put("photoUrls", photoUrls);

        Map<String, Object> tag = new HashMap<>();
        tag.put("id", 0);
        tag.put("name", "utku");

        List<Map<String, Object>> tags = new ArrayList<>();
        tags.add(tag);
        bodyPayload.put("tags", tags);
        bodyPayload.put("status", "available");

        Post(URL+"/pet",bodyPayload);
    }

    @Test(description = "Put - /pet - Update Pet",priority = 3)
    public void updatePet(){
        Map<String,Object> bodyPayload=new HashMap<>();
        bodyPayload.put("id",17);

        Map<String, Object> category = new HashMap<>();
        category.put("id", 0);
        category.put("name", "updated category utku");
        bodyPayload.put("category", category);

        bodyPayload.put("name", "Updated Utku");

        List<String> photoUrls = new ArrayList<>();
        photoUrls.add("string");
        bodyPayload.put("photoUrls", photoUrls);

        Map<String, Object> tag = new HashMap<>();
        tag.put("id", 0);
        tag.put("name", "tag");

        List<Map<String, Object>> tags = new ArrayList<>();
        tags.add(tag);
        bodyPayload.put("tags", tags);
        bodyPayload.put("status", "available");

        Put(URL+"/pet",bodyPayload);
    }

    @Test(description = "Delete - /pet - Delete Pet",priority = 5)
    public void deletePet(){
        Delete(URL+"/pet/17");
    }


}
