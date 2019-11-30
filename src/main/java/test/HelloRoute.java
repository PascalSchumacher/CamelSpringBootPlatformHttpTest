package test;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("platform-http:/hello")
            .setBody(constant("hello"));
    }
}
