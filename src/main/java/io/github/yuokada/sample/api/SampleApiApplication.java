package io.github.yuokada.sample.api;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition(
    info = @Info(
        title = "Demo API Endpoints",
        version = "0.1.0",
        description = "Here is description of Demo API.",
        license = @org.eclipse.microprofile.openapi.annotations.info.License(
            name = "MIT License",
            url = "https://opensource.org/licenses/MIT"
        ),
        contact = @org.eclipse.microprofile.openapi.annotations.info.Contact(
            name = "Demo administrator",
            email = "contact@email.example.com"
        )
    ),
    // Or setting quarkus.smallrye-openapi.auto-add-server to true in application.properties
    servers = {
        @Server(url = "http://localhost:8080", description = "Local server"),
    },
    tags = {
        @Tag(name = "Demo App basic API", description = "Demo App Common APIs"),
        @Tag(name = "Demo App stub API", description = "Demo App Common APIs for development")
    }
)
public class SampleApiApplication extends Application {

}
