package io.argorf;

import org.apache.camel.builder.endpoint.EndpointRouteBuilder;

public class MainRoute extends EndpointRouteBuilder {
    @Override
    public void configure() {
        from(timer("timer").period("1m"))
                .setBody(constant("message"))
                .convertBodyTo(MyCustomType.class)
                .log("${body}");
    }
}
