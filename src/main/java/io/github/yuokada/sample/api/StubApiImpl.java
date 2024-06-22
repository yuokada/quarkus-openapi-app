package io.github.yuokada.sample.api;

import static org.instancio.Select.field;

import io.github.yuokada.sample.api.model.Player;
import io.github.yuokada.sample.util.DummyDataGenerator;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.util.List;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.instancio.Instancio;

@Path("/v1/api/stub/players")
@Tag(name = "Demo App stub API", description = "Demo App Common APIs for development")
@Deprecated
public class StubApiImpl implements SampleApiIf {

    @Override
    public Response getPlayers() {
        List<Player> players = Instancio.ofList(Player.class).size(10)
            .generate(field(Player.class, "age"), gen -> gen.ints().range(15, 85))
            .create();
        return Response.ok(players).build();
    }

    @Override
    public Response getPlayer(Long userId) {
        Player player = Instancio.of(Player.class)
            .set(field("userId"), userId)
            .generate(field("age"), gen -> gen.ints().range(15, 85))
            .create();
        return Response.ok(player).build();
    }
}
