package io.github.yuokada.sample.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name = "Player json overview")
public record Player(
    @JsonProperty("id")
    @Schema(description = "The user Id", type = SchemaType.NUMBER, format = "int64")
    Long userId,
    @Schema(minLength = 4, maxLength = 64)
    String name,
    @Schema(description = "The user's age", type = SchemaType.NUMBER, format = "short",
        maximum = "150", minimum = "20"
    )
    Integer age
) {

}
