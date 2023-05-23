package projekt.lotto.model;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class LastResult {

    private final String drawDate;
    private final List<Result> results;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
