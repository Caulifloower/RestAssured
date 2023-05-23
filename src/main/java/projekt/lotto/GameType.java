package projekt.lotto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GameType {

    MINI_LOTTO("MiniLotto");

    private final String type;
}
