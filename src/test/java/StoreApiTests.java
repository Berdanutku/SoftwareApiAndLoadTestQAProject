import com.example.BaseTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class StoreApiTests extends BaseTest {


    @Test(description = "Get - /store/order - Get Order By Id",priority = 2)
    public void getOrderById(){
        Get(URL+"/store/order/17");
    }

    @Test(description = "Get - /store/inventory - Get Pet Inventory By Status",priority = 3)
    public void getPetInventoryByStatus(){
        Get(URL+"/store/inventory");
    }

    @Test(description = "Post - /store/order - Create Order For Pet",priority = 1)
    public void createOrderForPet(){
        Map<String,Object> bodyPayload=new HashMap<>();
        bodyPayload.put("id",17);
        bodyPayload.put("petId",17);
        bodyPayload.put("quantity",1);
        bodyPayload.put("shipDate","2025-05-31T14:23:14.956Z");
        bodyPayload.put("status","placed");
        bodyPayload.put("complete","true");
        Post(URL+"/store/order",bodyPayload);
    }

    @Test(description = "Delete - /store/order - Delete Order",priority = 4)
    public void deleteOrder(){
        Delete(URL+"/store/order/17");
    }
}
