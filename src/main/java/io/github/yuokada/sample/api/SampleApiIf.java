package io.github.yuokada.sample.api;

import io.github.yuokada.sample.api.model.Player;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

@Produces(MediaType.APPLICATION_JSON)
public interface SampleApiIf {

    @GET
    @Path("/")
    @Operation(
        summary = "Return a list of players",
        description = "Return a list of players"
    )
    @APIResponses({
        @APIResponse(
            responseCode = "200",
            description = "Returns a list of players",
            content = @Content(
                mediaType = "application/json",
                schema = @Schema(type = SchemaType.ARRAY, implementation = Player.class)
            )
        ),
    })
    Response getPlayers();

    @GET
    @Path("/{id}")
    @Operation(
        summary = "Return the detail of a player",
        description = "Return the detail of a player"
    )
    @APIResponses({
        @APIResponse(
            responseCode = "200",
            description = "Returns the detail of a player",
            content = @Content(
                mediaType = "application/json",
                schema = @Schema(type = SchemaType.OBJECT, implementation = Player.class)
            )
        ),
    })
    Response getPlayer(@PathParam("id") Long userId);
}
