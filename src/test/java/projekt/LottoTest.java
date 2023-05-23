package projekt;

import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import projekt.lotto.GameType;
import projekt.lotto.LottoClient;
import projekt.lotto.model.LastResult;

import java.util.Arrays;

public class LottoTest {

    @Test
    public void ostatniWynikMiniLottoTest() {
        //pobieranie odpowiedzi
        LottoClient lotto = new LottoClient();
        ValidatableResponse response = lotto.ostatniWynik(GameType.MINI_LOTTO);

        //drukowanie ciała odpowiedzi do konsoli
        response.extract().response().getBody().print();

        //mapowanie odpowiedzi do modelu
        LastResult[] lastResults = response.extract().response().getBody().as(LastResult[].class);
        System.out.println(Arrays.toString(lastResults));

        //coś żeby była assercja, bo to test :D
        Assert.assertEquals(Arrays.asList(lastResults).size(), 1);
    }
}
