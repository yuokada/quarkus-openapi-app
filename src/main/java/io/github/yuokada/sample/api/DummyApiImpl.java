package io.github.yuokada.sample.api;

import io.github.yuokada.sample.api.annotation.DummyApi;
import io.github.yuokada.sample.api.model.Player;
import io.github.yuokada.sample.util.DummyDataGenerator;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/v1/api/stub/players")
@DummyApi
@Deprecated
public class DummyApiImpl implements SampleApiIf {

    @Override
    public Response getPlayers() {
        List<Player> players = DummyDataGenerator.generatePlayers(10);
        return Response.ok(players).build();
    }

    @Override
    public Response getPlayer(Long userId) {
        Player player = DummyDataGenerator.generatePlayer(userId);
        return Response.ok(player).build();
    }
}
