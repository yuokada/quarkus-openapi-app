package io.github.yuokada.sample.api;

import io.github.yuokada.sample.api.annotation.BasicApi;
import io.github.yuokada.sample.api.model.Player;
import io.github.yuokada.sample.util.DummyDataGenerator;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/v1/api/players")
@BasicApi
public class SampleApiImpl implements SampleApiIf {

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
