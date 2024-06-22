package io.github.yuokada.sample.util;

import static org.instancio.Select.field;

import io.github.yuokada.sample.api.model.Player;
import java.util.List;
import org.instancio.Instancio;

public class DummyDataGenerator {

    public static Player generatePlayer(Long id) {
        return Instancio.of(Player.class)
            .set(field("userId"), id)
            .generate(field("age"), gen -> gen.ints().range(15, 85))
            .create();
    }

    public static List<Player> generatePlayers(int size) {
        return Instancio.ofList(Player.class).size(size)
            .generate(field(Player.class, "age"), gen -> gen.ints().range(15, 85))
            .create();
    }
}
