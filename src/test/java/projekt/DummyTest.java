package projekt;

import com.google.gson.Gson;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;
import projekt.dummy.DummyClient;
import projekt.dummy.model.Employee;

public class DummyTest {

    @Test
    public void createTest() {
        Employee employee = new Employee(
                "Elon",
                "10000000",
                "33"
        );

        DummyClient dummy = new DummyClient();
        ValidatableResponse response = dummy.create(new Gson().toJson(employee));
        response.extract().response().getBody().print();
    }
}
